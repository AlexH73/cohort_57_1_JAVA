package Other;

import java.util.ArrayList;
import java.util.Collections;

public class ListMethods {
    public static void main(String[] args) {
        // 1. Создание списка
        // Создаем новый пустой список типа ArrayList и добавляем в него элементы 1, 2 и 3
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        System.out.println("Начальный список: " + lst);  // Вывод: [1, 2, 3]

        // 2. add(x): Добавляет элемент x в конец списка
        // Добавляем элемент 4 в конец списка
        lst.add(4);
        System.out.println("После добавления 4 в список: " + lst);  // Вывод: [1, 2, 3, 4]

        // 3. addAll(Collection): Расширяет список, добавляя все элементы из переданной коллекции
        // Создаем новый список и добавляем в него элементы 5 и 6, затем расширяем основной список
        ArrayList<Integer> additionalElements = new ArrayList<>();
        additionalElements.add(5);
        additionalElements.add(6);
        lst.addAll(additionalElements);
        System.out.println("После добавления [5, 6] в список: " + lst);  // Вывод: [1, 2, 3, 4, 5, 6]

        // 4. add(index, x): Вставляет элемент x на позицию index
        // Вставляем элемент 7 на позицию с индексом 1
        lst.add(1, 7);
        System.out.println("После вставки 7 на позицию 1: " + lst);  // Вывод: [1, 7, 2, 3, 4, 5, 6]

        // 5. remove(Object): Удаляет первый элемент в списке, значение которого равно x
        // Удаляем первый элемент, равный 7
        lst.remove(Integer.valueOf(7));
        System.out.println("После удаления первого вхождения 7: " + lst);  // Вывод: [1, 2, 3, 4, 5, 6]

        // 6. remove(index): Удаляет элемент на позиции index и возвращает его.
        // Удаляем элемент на последней позиции (индекс size - 1)
        lst.remove(lst.size() - 1);
        System.out.println("После удаления элемента на последней позиции: " + lst);  // Вывод: [1, 2, 3, 4, 5]

        // 7. clear(): Удаляет все элементы из списка
        // Очищаем список, удаляя все элементы
        lst.clear();
        System.out.println("После очистки списка: " + lst);  // Вывод: []

        // 8. indexOf(x): Возвращает индекс первого элемента, значение которого равно x.
        // Добавляем элементы 1, 2, 3, 2 и находим индекс первого вхождения элемента 2
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(2);
        System.out.println("Индекс первого вхождения 2: " + lst.indexOf(2));  // Вывод: 1

        // 9. Collections.frequency(collection, x): Возвращает количество элементов в списке, значение которых равно x
        // Подсчитываем количество вхождений элемента 2 в списке
        System.out.println("Количество вхождений 2: " + Collections.frequency(lst, 2));  // Вывод: 2

        // 10. sort(): Сортирует элементы списка на месте
        // Сортируем элементы списка в порядке возрастания
        Collections.sort(lst);
        System.out.println("После сортировки списка: " + lst);  // Вывод: [1, 2, 2, 3]

        // 11. reverse(): Разворачивает элементы списка на месте
        // Разворачиваем элементы списка
        Collections.reverse(lst);
        System.out.println("После разворота списка: " + lst);  // Вывод: [3, 2, 2, 1]

        // 12. clone(): Возвращает поверхностную копию списка
        // Создаем поверхностную копию списка
        ArrayList<Integer> lstCopy = (ArrayList<Integer>) lst.clone();
        System.out.println("Копия списка: " + lstCopy);  // Вывод: [3, 2, 2, 1]
    }
}