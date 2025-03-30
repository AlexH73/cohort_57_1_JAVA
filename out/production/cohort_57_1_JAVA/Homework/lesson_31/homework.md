<details style="padding-top: 18px">
  <summary><b>Additional Tasks: Basic List Operations</b></summary>

```java
import java.util.List;

/**
 * Interface for performing operations on Set and List collections.
 * Students are required to implement this interface using basic operations (e.g., add, addAll)
 * to solve tasks related to duplicates and set operations.
 *
 * Example test data:
 * - Strings: "Apple", "Banana", "Cherry".
 * - Numbers: 1, 2, 3, 4.
 */
public interface CollectionOperationsHomework {

    // Methods for working with lists of integers

    /**
     * Determines the number of duplicate elements in a list of integers.
     * The method should use a Set to remove duplicates and compute the difference between the size of the original list
     * and the size of the set of unique elements.
     *
     * @param list a list of integers
     * @return the number of duplicate occurrences in the list
     */
    int countDuplicatesInteger(List<Integer> list);

    /**
     * Returns the union of two lists of integers containing only unique elements.
     *
     * @param list1 the first list of integers
     * @param list2 the second list of integers
     * @return a new list representing the union of list1 and list2
     */
    List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Returns the intersection of two lists of integers.
     *
     * @param list1 the first list of integers
     * @param list2 the second list of integers
     * @return a new list representing the intersection of list1 and list2
     */
    List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Returns the difference between two lists of integers (elements from list1 that are not in list2).
     *
     * @param list1 the first list of integers
     * @param list2 the second list of integers
     * @return a new list representing the difference between list1 and list2
     */
    List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Checks whether a list of integers contains only unique elements.
     *
     * @param list a list of integers
     * @return true if all elements are unique, otherwise false
     */
    boolean areIntegerElementsUnique(List<Integer> list);

    // Methods for working with lists of strings

    /**
     * Determines the number of duplicate elements in a list of strings.
     *
     * @param list a list of strings
     * @return the number of duplicate occurrences in the list
     */
    int countDuplicatesString(List<String> list);

    /**
     * Returns the union of two lists of strings containing only unique elements.
     *
     * @param list1 the first list of strings
     * @param list2 the second list of strings
     * @return a new list representing the union of list1 and list2
     */
    List<String> unionOfStringLists(List<String> list1, List<String> list2);

    /**
     * Returns the intersection of two lists of strings.
     *
     * @param list1 the first list of strings
     * @param list2 the second list of strings
     * @return a new list representing the intersection of list1 and list2
     */
    List<String> intersectionOfStringLists(List<String> list1, List<String> list2);

    /**
     * Returns the difference between two lists of strings (elements from list1 that are not in list2).
     *
     * @param list1 the first list of strings
     * @param list2 the second list of strings
     * @return a new list representing the difference between list1 and list2
     */
    List<String> differenceOfStringLists(List<String> list1, List<String> list2);

    /**
     * Checks whether a list of strings contains only unique elements.
     *
     * @param list a list of strings
     * @return true if all elements are unique, otherwise false
     */
    boolean areStringElementsUnique(List<String> list);
}
```
</details>

<details style="padding-top: 18px">
  <summary><b>Урок 31. Домашняя работа.</b></summary>

```java
import java.util.List;

/**
 * Интерфейс для выполнения операций над коллекциями Set и List.
 * Студенты должны реализовать этот интерфейс, используя базовые операции (например, add, addAll)
 * для решения задач, связанных с дубликатами и операциями над множествами.
 *
 * Примеры тестовых данных:
 * - Строки: "Apple", "Banana", "Cherry".
 * - Числа: 1, 2, 3, 4.
 */
public interface CollectionOperationsHomework {

    // Методы для работы со списками целых чисел

    /**
     * Определяет количество дубликатов в списке целых чисел.
     * Метод должен использовать Set для удаления дубликатов и вычислять разницу между размером исходного списка
     * и размером множества уникальных элементов.
     *
     * @param list список целых чисел
     * @return количество дубликатов в списке
     */
    int countDuplicatesInteger(List<Integer> list);

    /**
     * Возвращает объединение двух списков целых чисел, содержащее только уникальные элементы.
     *
     * @param list1 первый список целых чисел
     * @param list2 второй список целых чисел
     * @return новый список, содержащий объединение list1 и list2
     */
    List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Возвращает пересечение двух списков целых чисел.
     *
     * @param list1 первый список целых чисел
     * @param list2 второй список целых чисел
     * @return новый список, содержащий пересечение list1 и list2
     */
    List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Возвращает разность двух списков целых чисел (элементы из list1, которых нет в list2).
     *
     * @param list1 первый список целых чисел
     * @param list2 второй список целых чисел
     * @return новый список, содержащий разность list1 и list2
     */
    List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2);

    /**
     * Проверяет, содержатся ли в списке целых чисел только уникальные элементы.
     *
     * @param list список целых чисел
     * @return true, если все элементы уникальны, иначе false
     */
    boolean areIntegerElementsUnique(List<Integer> list);


    // Методы для работы со списками строк

    /**
     * Определяет количество дубликатов в списке строк.
     *
     * @param list список строк
     * @return количество дубликатов в списке
     */
    int countDuplicatesString(List<String> list);

    /**
     * Возвращает объединение двух списков строк, содержащее только уникальные элементы.
     *
     * @param list1 первый список строк
     * @param list2 второй список строк
     * @return новый список, содержащий объединение list1 и list2
     */
    List<String> unionOfStringLists(List<String> list1, List<String> list2);

    /**
     * Возвращает пересечение двух списков строк.
     *
     * @param list1 первый список строк
     * @param list2 второй список строк
     * @return новый список, содержащий пересечение list1 и list2
     */
    List<String> intersectionOfStringLists(List<String> list1, List<String> list2);

    /**
     * Возвращает разность двух списков строк (элементы из list1, которых нет в list2).
     *
     * @param list1 первый список строк
     * @param list2 второй список строк
     * @return новый список, содержащий разность list1 и list2
     */
    List<String> differenceOfStringLists(List<String> list1, List<String> list2);

    /**
     * Проверяет, содержатся ли в списке строк только уникальные элементы.
     *
     * @param list список строк
     * @return true, если все элементы уникальны, иначе false
     */
    boolean areStringElementsUnique(List<String> list);
}
```
</details>