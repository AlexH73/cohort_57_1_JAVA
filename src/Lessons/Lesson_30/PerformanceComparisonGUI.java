package Lessons.Lesson_30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PerformanceComparisonGUI extends JFrame {
    private JTextField elementsField;
    private JButton runTestsButton;
    private JPanel resultsPanel;
    private final int iterations = 1000;    // Количество итераций для тестов вставки и удаления
    private final int accessCount = 10000;  // Количество обращений для теста случайного доступа

    // Названия тестов для каждой операции
    private final String[] testNames = {
            "Добавление в конец (ArrayList)",
            "Добавление в конец (LinkedList)",
            "Вставка в середину (ArrayList)",
            "Вставка в середину (LinkedList)",
            "Случайный доступ (ArrayList)",
            "Случайный доступ (LinkedList)",
            "Удаление из середины (ArrayList)",
            "Удаление из середины (LinkedList)"
    };

    // Массивы для хранения меток и индикаторов прогресса для каждого теста
    private JLabel[] testLabels = new JLabel[testNames.length];
    private JProgressBar[] progressBars = new JProgressBar[testNames.length];

    public PerformanceComparisonGUI() {
        setTitle("Сравнение производительности: ArrayList vs LinkedList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Верхняя панель с полем ввода и кнопкой запуска тестов
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Количество элементов:"));
        elementsField = new JTextField("100000", 10);
        topPanel.add(elementsField);
        runTestsButton = new JButton("Запустить тесты");
        topPanel.add(runTestsButton);
        add(topPanel, BorderLayout.NORTH);

        // Панель для отображения результатов тестов в виде горизонтальных шкал
        resultsPanel = new JPanel(new GridLayout(testNames.length, 1, 5, 5));
        for (int i = 0; i < testNames.length; i++) {
            JPanel panel = new JPanel(new BorderLayout());
            testLabels[i] = new JLabel(testNames[i] + ": ");
            progressBars[i] = new JProgressBar(0, 100);
            progressBars[i].setStringPainted(true);
            panel.add(testLabels[i], BorderLayout.WEST);
            panel.add(progressBars[i], BorderLayout.CENTER);
            resultsPanel.add(panel);
        }
        add(resultsPanel, BorderLayout.CENTER);

        // Обработчик нажатия кнопки для запуска тестов
        runTestsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runPerformanceTests();
            }
        });

        setVisible(true);
    }

    private void runPerformanceTests() {
        int n;
        try {
            n = Integer.parseInt(elementsField.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректное число элементов.");
            return;
        }
        long[] testTimes = new long[testNames.length];

        // Тест 1: Добавление элементов в конец для ArrayList
        // Создаем ArrayList и добавляем n элементов в конец
        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        testTimes[0] = end - start;

        // Тест 2: Добавление элементов в конец для LinkedList
        // Создаем LinkedList и добавляем n элементов в конец
        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        testTimes[1] = end - start;

        // Тест 3: Вставка элемента в середину для ArrayList
        // Заполняем ArrayList, затем вставляем элемент в середину iterations раз
        arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(arrayList.size() / 2, -1);
        }
        end = System.nanoTime();
        testTimes[2] = end - start;

        // Тест 4: Вставка элемента в середину для LinkedList
        // Заполняем LinkedList, затем вставляем элемент в середину iterations раз
        linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(linkedList.size() / 2, -1);
        }
        end = System.nanoTime();
        testTimes[3] = end - start;

        // Тест 5: Случайный доступ для ArrayList
        // Выполняем accessCount обращений к случайным элементам ArrayList
        start = System.nanoTime();
        for (int i = 0; i < accessCount; i++) {
            int index = (int)(Math.random() * arrayList.size());
            int value = arrayList.get(index);
        }
        end = System.nanoTime();
        testTimes[4] = end - start;

        // Тест 6: Случайный доступ для LinkedList
        // Выполняем accessCount обращений к случайным элементам LinkedList
        start = System.nanoTime();
        for (int i = 0; i < accessCount; i++) {
            int index = (int)(Math.random() * linkedList.size());
            int value = linkedList.get(index);
        }
        end = System.nanoTime();
        testTimes[5] = end - start;

        // Тест 7: Удаление элемента из середины для ArrayList
        // Заполняем ArrayList и удаляем элемент из середины iterations раз
        arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        start = System.nanoTime();
        for (int i = 0; i < iterations && !arrayList.isEmpty(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        end = System.nanoTime();
        testTimes[6] = end - start;

        // Тест 8: Удаление элемента из середины для LinkedList
        // Заполняем LinkedList и удаляем элемент из середины iterations раз
        linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        start = System.nanoTime();
        for (int i = 0; i < iterations && !linkedList.isEmpty(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        end = System.nanoTime();
        testTimes[7] = end - start;

        // Определяем максимальное время для масштабирования результатов
        long maxTime = Arrays.stream(testTimes).max().orElse(1);

        // Обновляем индикаторы прогресса и метки с пояснениями
        for (int i = 0; i < testNames.length; i++) {
            int percentage = (int) ((double) testTimes[i] / maxTime * 100);
            progressBars[i].setValue(percentage);
            progressBars[i].setString(String.format("%.2f ms", testTimes[i] / 1_000_000.0));
            testLabels[i].setText(testNames[i] + ": ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PerformanceComparisonGUI());
    }
}