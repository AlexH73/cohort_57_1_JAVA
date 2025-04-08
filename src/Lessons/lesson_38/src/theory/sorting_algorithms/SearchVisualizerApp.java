package Lessons.lesson_38.src.theory.sorting_algorithms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Random;

public class SearchVisualizerApp {

    // Массив для поиска
    private static int[] array;
    // Индекс, который в данный момент обрабатывается (для визуализации)
    private static int currentIndex = -1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Создаем главное окно
            JFrame frame = new JFrame("Визуализация работы алгоритмов поиска");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Панель управления
            JPanel controlPanel = new JPanel(new FlowLayout());

            JTextField arraySizeField = new JTextField(8);
            controlPanel.add(new JLabel("Размер массива:"));
            controlPanel.add(arraySizeField);

            JButton generateButton = new JButton("Создать массив");
            controlPanel.add(generateButton);

            JButton linearSearchButton = new JButton("Линейный поиск");
            controlPanel.add(linearSearchButton);

            JButton binarySearchButton = new JButton("Бинарный поиск");
            controlPanel.add(binarySearchButton);

            JLabel resultLabel = new JLabel("Результат:");
            controlPanel.add(resultLabel);

            frame.add(controlPanel, BorderLayout.NORTH);

            // Панель визуализации
            JPanel visualizationPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (array != null) {
                        int panelWidth = getWidth();
                        int panelHeight = getHeight();
                        int arrayLength = array.length;
                        // Вычисляем ширину столбика так, чтобы они помещались в окне
                        int barWidth = Math.max(2, panelWidth / arrayLength);
                        for (int i = 0; i < arrayLength; i++) {
                            // Если этот индекс активный (например, проверяется), то выделяем красным
                            if (i == currentIndex) {
                                g.setColor(Color.RED);
                            } else {
                                g.setColor(Color.BLUE);
                            }
                            // Для визуализации масштабируем высоту (числа от 1 до 500)
                            int scaledHeight = (int) (((double) array[i] / 500) * (panelHeight - 20));
                            int x = i * barWidth;
                            int y = panelHeight - scaledHeight;
                            g.fillRect(x, y, barWidth, scaledHeight);
                        }
                    }
                }
            };

            visualizationPanel.setBackground(Color.WHITE);
            frame.add(visualizationPanel, BorderLayout.CENTER);

            // Обработка нажатия кнопки "Создать массив"
            generateButton.addActionListener((ActionEvent e) -> {
                try {
                    int size = Integer.parseInt(arraySizeField.getText());
                    array = generateArray(size);
                    currentIndex = -1;
                    resultLabel.setText("Сгенерирован массив из " + size + " элементов.");
                    visualizationPanel.repaint();
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Неверный размер массива.");
                }
            });

            // Линейный поиск: перебираем элементы и ищем число, которого нет (например, -1)
            linearSearchButton.addActionListener((ActionEvent e) -> {
                if (array == null) {
                    resultLabel.setText("Сначала сгенерируйте массив.");
                    return;
                }
                new Thread(() -> {
                    int target = -1;  // Элемент, которого точно нет в массиве
                    long startTime = System.currentTimeMillis();
                    boolean found = false;
                    // Выполняем линейный перебор
                    for (int i = 0; i < array.length; i++) {
                        currentIndex = i;
                        visualizationPanel.repaint();
                        try {
                            Thread.sleep(50);  // задержка для визуализации
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        if (array[i] == target) { // Хотя в данном случае это условие никогда не выполнится
                            found = true;
                            break;
                        }
                    }
                    long endTime = System.currentTimeMillis();
                    currentIndex = -1;
                    visualizationPanel.repaint();
                    boolean finalFound = found;
                    SwingUtilities.invokeLater(() ->
                            resultLabel.setText("Линейный поиск " + (finalFound ? "нашел" : "не нашел") +
                                    " элемент за " + (endTime - startTime) + " ms")
                    );
                }).start();
            });

            // Бинарный поиск: для этого сортируем массив и затем ищем число -1
            binarySearchButton.addActionListener((ActionEvent e) -> {
                if (array == null) {
                    resultLabel.setText("Сначала сгенерируйте массив.");
                    return;
                }
                // Сортировка массива для бинарного поиска
                int[] sortedArray = array.clone();
                Arrays.sort(sortedArray);
                array = sortedArray;  // обновляем визуальное отображение
                visualizationPanel.repaint();

                new Thread(() -> {
                    int target = -1;
                    long startTime = System.currentTimeMillis();
                    boolean found = binarySearchVisual(sortedArray, target, visualizationPanel);
                    long endTime = System.currentTimeMillis();
                    currentIndex = -1;
                    visualizationPanel.repaint();
                    SwingUtilities.invokeLater(() ->
                            resultLabel.setText("Бинарный поиск " + (found ? "нашел" : "не нашел") +
                                    " элемент за " + (endTime - startTime) + " ms")
                    );
                }).start();
            });

            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }

    // Генерация массива случайных чисел от 1 до 500
    private static int[] generateArray(int size) {
        int[] newArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            newArray[i] = random.nextInt(500) + 1;
        }
        return newArray;
    }

    // Бинарный поиск с визуализацией (используется рекурсия)
    private static boolean binarySearchVisual(int[] sortedArray, int target, JPanel panel) {
        return binarySearchVisualHelper(sortedArray, target, 0, sortedArray.length - 1, panel);
    }

    private static boolean binarySearchVisualHelper(int[] a, int target, int low, int high, JPanel panel) {
        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        currentIndex = mid;
        panel.repaint();
        try {
            Thread.sleep(150);  // задержка для визуализации
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (a[mid] == target) {
            return true;
        } else if (a[mid] < target) {
            return binarySearchVisualHelper(a, target, mid + 1, high, panel);
        } else {
            return binarySearchVisualHelper(a, target, low, mid - 1, panel);
        }
    }
}
