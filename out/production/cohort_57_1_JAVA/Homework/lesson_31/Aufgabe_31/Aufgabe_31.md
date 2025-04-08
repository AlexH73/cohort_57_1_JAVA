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
}import java.util.List;

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
} return new HashSet<>(list).size() == list.size();
