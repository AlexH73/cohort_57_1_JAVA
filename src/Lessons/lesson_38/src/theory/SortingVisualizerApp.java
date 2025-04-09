package Lessons.lesson_38.src.theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SortingVisualizerApp {
    private static int[] array;  // Массив для сортировки
    private static int[] highlightedIndices = new int[2];  // Для хранения индексов подсвеченных элементов
    private static int highlightIndex1 = -1;
    private static int highlightIndex2 = -1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sorting Algorithms Visualizer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Создаем корневую панель
            JPanel rootPanel = new JPanel(new BorderLayout());

            // Создаем панель управления
            JPanel controlPanel = new JPanel(new FlowLayout());

            // Добавляем поле для ввода размера массива
            JTextField arraySizeField = new JTextField(8);
            controlPanel.add(new JLabel("Array Size:"));
            controlPanel.add(arraySizeField);

            // Добавляем кнопку для начала сортировки
            JButton startButton = new JButton("Create new Array");
            JButton bubbleSort = new JButton("Start bubble sorting");
            JButton mergeSort = new JButton("Start Merge sorting");
            JButton quickSort = new JButton("Start Quick sorting");
            controlPanel.add(startButton);
            controlPanel.add(bubbleSort);
            controlPanel.add(mergeSort);
            controlPanel.add(quickSort);

            // Добавляем панель управления на корневую панель
            rootPanel.add(controlPanel, BorderLayout.NORTH);

            // Создаем панель для визуализации
            JPanel visualizationPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (array != null) {
                        int panelWidth = getWidth();
                        int panelHeight = getHeight();

                        int arrayLength = array.length;
                        int barWidth = 10;
                        int padding = 10;  // отступ с каждой стороны

                        // Вычисляем начальную и конечную точки по оси X
                        int totalWidth = arrayLength * barWidth + (arrayLength - 1) * padding;
                        int startX = (panelWidth - totalWidth) / 2;
                        int endX = startX + totalWidth;

                        // Отрисовываем рамку
                        g.drawRect(startX - padding, 0 + padding, endX - startX + padding, panelHeight - 2 * padding);


                        // Отрисовываем столбцы
                        int x = startX;
                        for (int i = 0; i < array.length; i++) {
                            if (i == highlightedIndices[0] || i == highlightedIndices[1]) {
                                g.setColor(Color.RED);  // меняем цвет на красный для подсветки
                            }
                            int height = array[i];
                            g.fillRect(x, panelHeight - height - padding, barWidth, height);
                            g.setColor(Color.BLACK);  // возвращаем цвет обратно на черный
                            x += barWidth + padding;
                        }
                    }
                }
            };


            visualizationPanel.setBackground(Color.WHITE);

            // Добавляем панель для визуализации на корневую панель
            rootPanel.add(visualizationPanel, BorderLayout.CENTER);

            // Обработка клика по кнопке
            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int size = Integer.parseInt(arraySizeField.getText());
                    array = generateArray(size);
                    visualizationPanel.repaint();
                }
            });

            bubbleSort.addActionListener(e -> {
                Thread sortingThread = new Thread(() -> {
                    bubbleSort(array, visualizationPanel);
                });
                sortingThread.start();
            });

            mergeSort.addActionListener(e -> {
                Thread sortingThread = new Thread(() -> {
                    mergeSort(array, 0, array.length - 1, visualizationPanel);
                });
                sortingThread.start();
            });

            quickSort.addActionListener(e -> {
                Thread sortingThread = new Thread(() -> {
                    quickSort(array, 0, array.length - 1, visualizationPanel);
                });
                sortingThread.start();
            });


            // Добавляем корневую панель на фрейм
            frame.add(rootPanel);

            // Устанавливаем размер окна
            frame.setSize(800, 600);

            // Показываем окно
            frame.setVisible(true);
        });
    }

    // Генерирует массив случайных чисел
    private static int[] generateArray(int size) {
        int[] newArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            newArray[i] = random.nextInt(500);  // Максимальная высота столбца
        }
        return newArray;
    }

    private static void swapAndHighlight(int[] array, int i, int j, JPanel panel) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        highlightedIndices[0] = i;
        highlightedIndices[1] = j;

        panel.repaint();
        sleepForVisualization();

        // очистка после подсветки
        highlightedIndices[0] = -1;
        highlightedIndices[1] = -1;
    }

    private static void bubbleSort(int[] array, JPanel panel) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapAndHighlight(array, j, j + 1, panel);
                }
            }
        }
    }


    private static void quickSort(int[] array, int low, int high, JPanel panel) {
        if (low < high) {
            int pi = partition(array, low, high, panel);
            quickSort(array, low, pi - 1, panel);
            quickSort(array, pi + 1, high, panel);
        }
    }

    private static int partition(int[] array, int low, int high, JPanel panel) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                panel.repaint();
                sleepForVisualization();
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        panel.repaint();
        sleepForVisualization();

        return i + 1;
    }

    private static void sleepForVisualization() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void mergeSort(int[] array, int left, int right, JPanel panel) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle, panel);
            mergeSort(array, middle + 1, right, panel);
            merge(array, left, middle, right, panel);
        }
    }

    private static void merge(int[] array, int left, int middle, int right, JPanel panel) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[middle + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;

            panel.repaint();
            sleepForVisualization();
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;

            panel.repaint();
            sleepForVisualization();
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;

            panel.repaint();
            sleepForVisualization();
        }
    }
}
