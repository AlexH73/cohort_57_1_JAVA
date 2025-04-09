## Примеры поиска и сортировки в массиве

---

<details>
<summary><strong>1. Поиск в массиве</strong></summary>

### Линейный поиск (Linear Search)
Простой способ найти элемент в массиве.

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // возвращаем индекс элемента
            }
        }
        return -1; // если не найден
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9, 11};
        int index = linearSearch(numbers, 9);
        System.out.println("Индекс: " + index); // 3
    }
}
```

### Бинарный поиск (Binary Search)
Работает **только с отсортированным массивом**.

```java
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9, 11};
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("Индекс: " + index); // 3
    }
}
```

</details>

---

<details>
<summary><strong>2. Сортировка</strong></summary>

### Пузырьковая сортировка (Bubble Sort)
Простой, но неэффективный метод.

```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        bubbleSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```

### Быстрая сортировка (QuickSort)
Более эффективный метод.

```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // меняем местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // ставим pivot на правильное место
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        quickSort(numbers, 0, numbers.length - 1);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```

</details>

---

<details>
<summary><strong>3. Встроенные методы сортировки</strong></summary>

### Arrays.sort()
Java уже предоставляет удобные методы.

```java
import java.util.Arrays;

public class BuiltInSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers); // по возрастанию
        System.out.println(Arrays.toString(numbers));
    }
}
```

Для строк и объектов можно использовать компаратор:

```java
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] names = {"Anna", "John", "Mike", "Bella"};
        Arrays.sort(names); // по алфавиту
        System.out.println(Arrays.toString(names));
    }
}
```

</details>

---
