package Lessons.lesson_38.src.theory;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class SortingVisualizerApp {
    private static int[] array;
    private static int[] highlightedIndices = {-1, -1};
    private static int stepCounter = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sorting Algorithms Visualizer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JPanel controlPanel = new JPanel(new FlowLayout());
            JTextField arraySizeField = new JTextField(8);
            JLabel stepLabel = new JLabel("Steps: 0");

            controlPanel.add(new JLabel("Array Size:"));
            controlPanel.add(arraySizeField);

            JButton startButton = new JButton("Create new Array");
            JButton startSortButton = new JButton("Start Sorting");

            String[] sortMethods = {"Bubble Sort", "Merge Sort", "Quick Sort", "Heap Sort", "Hybrid Sort"};
            JComboBox<String> sortSelection = new JComboBox<>(sortMethods);

            controlPanel.add(startButton);
            controlPanel.add(sortSelection);
            controlPanel.add(startSortButton);
            controlPanel.add(stepLabel);

            JPanel visualizationPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (array != null) {
                        int panelWidth = getWidth();
                        int panelHeight = getHeight();
                        int barWidth = Math.max(2, panelWidth / array.length);
                        int padding = 2;

                        for (int i = 0; i < array.length; i++) {
                            g.setColor((i == highlightedIndices[0] || i == highlightedIndices[1]) ? Color.RED : Color.BLACK);
                            int height = array[i];
                            g.fillRect(i * (barWidth + padding), panelHeight - height - padding, barWidth, height);
                        }
                    }
                }
            };

            visualizationPanel.setBackground(Color.WHITE);
            startButton.addActionListener(e -> {
                int size = Integer.parseInt(arraySizeField.getText());
                array = generateArray(size);
                stepCounter = 0;
                stepLabel.setText("Steps: " + stepCounter);
                visualizationPanel.repaint();
            });

            startSortButton.addActionListener(e -> new Thread(() -> {
                String selectedSort = (String) sortSelection.getSelectedItem();
                switch (selectedSort) {
                    case "Bubble Sort" -> bubbleSort(array, visualizationPanel, stepLabel);
                    case "Merge Sort" -> mergeSort(array, 0, array.length - 1, visualizationPanel, stepLabel);
                    case "Quick Sort" -> quickSort(array, 0, array.length - 1, visualizationPanel, stepLabel);
                    case "Heap Sort" -> heapSort(array, visualizationPanel, stepLabel);
                    case "Hybrid Sort" -> hybridSort(array, visualizationPanel, stepLabel);
                }
            }).start());

            frame.add(controlPanel, BorderLayout.NORTH);
            frame.add(visualizationPanel, BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }

    private static void heapSort(int[] arr, JPanel panel, JLabel stepLabel) {
        int n = arr.length;

        // Heap aufbauen (Max-Heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, panel, stepLabel);
        }

        // Elemente extrahieren und Heap anpassen
        for (int i = n - 1; i > 0; i--) {
            swapAndHighlight(arr, 0, i, panel, stepLabel);
            heapify(arr, i, 0, panel, stepLabel);
        }
    }

    private static void heapify(int[] arr, int n, int i, JPanel panel, JLabel stepLabel) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            swapAndHighlight(arr, i, largest, panel, stepLabel);
            heapify(arr, n, largest, panel, stepLabel);
        }
    }

    private static void hybridSort(int[] arr, JPanel panel, JLabel stepLabel) {
        heapSort(arr, panel, stepLabel);  // Erst Heap Sort zur groben Vorsortierung
        mergeQuickSort(arr, 0, arr.length - 1, panel, stepLabel);  // Dann Merge + Quick Sort anwenden
    }

    private static void mergeQuickSort(int[] arr, int left, int right, JPanel panel, JLabel stepLabel) {
        if (right - left < 10) {
            quickSort(arr, left, right, panel, stepLabel);
            return;
        }

        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeQuickSort(arr, left, mid, panel, stepLabel);
        mergeQuickSort(arr, mid + 1, right, panel, stepLabel);
        merge(arr, left, mid, right, panel, stepLabel);
    }


    private static int[] generateArray(int size) {
        int[] newArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            newArray[i] = random.nextInt(500);
        }
        return newArray;
    }

    private static void bubbleSort(int[] array, JPanel panel, JLabel stepLabel) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapAndHighlight(array, j, j + 1, panel, stepLabel);
                }
            }
        }
    }

    private static void mergeSort(int[] array, int left, int right, JPanel panel, JLabel stepLabel) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle, panel, stepLabel);
            mergeSort(array, middle + 1, right, panel, stepLabel);
            merge(array, left, middle, right, panel, stepLabel);
        }
    }

    private static void merge(int[] array, int left, int middle, int right, JPanel panel, JLabel stepLabel) {
        int[] temp = Arrays.copyOfRange(array, left, right + 1);
        int i = left, j = middle + 1, k = left;

        while (i <= middle && j <= right) {
            array[k++] = temp[i - left] <= temp[j - left] ? temp[i++ - left] : temp[j++ - left];
            updateStepCounter(stepLabel);
            SwingUtilities.invokeLater(panel::repaint);
            sleepForVisualization();
        }

        while (i <= middle) {
            array[k++] = temp[i++ - left];
            updateStepCounter(stepLabel);
            SwingUtilities.invokeLater(panel::repaint);
            sleepForVisualization();
        }

        while (j <= right) {
            array[k++] = temp[j++ - left];
            updateStepCounter(stepLabel);
            SwingUtilities.invokeLater(panel::repaint);
            sleepForVisualization();
        }
    }

    private static void quickSort(int[] arr, int low, int high, JPanel panel, JLabel stepLabel) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, panel, stepLabel);
            quickSort(arr, low, pivotIndex - 1, panel, stepLabel);
            quickSort(arr, pivotIndex + 1, high, panel, stepLabel);
        }
    }

    private static int partition(int[] arr, int low, int high, JPanel panel, JLabel stepLabel) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) swapAndHighlight(arr, ++i, j, panel, stepLabel);
        }
        swapAndHighlight(arr, i + 1, high, panel, stepLabel);
        return i + 1;
    }

    private static void swapAndHighlight(int[] array, int i, int j, JPanel panel, JLabel stepLabel) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        highlightedIndices[0] = i;
        highlightedIndices[1] = j;
        updateStepCounter(stepLabel);
        SwingUtilities.invokeLater(panel::repaint);
        sleepForVisualization();
        highlightedIndices[0] = -1;
        highlightedIndices[1] = -1;
    }

    private static void updateStepCounter(JLabel stepLabel) {
        stepCounter++;
        SwingUtilities.invokeLater(() -> stepLabel.setText("Steps: " + stepCounter));
    }

    private static void sleepForVisualization() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

