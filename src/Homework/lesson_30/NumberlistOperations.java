package Homework.lesson_30;
//Задача 1: Основные операции с числовым списком

import java.util.ArrayList;
import java.util.List;

public class NumberlistOperations {
    public static void main(String[] args) {
        //Создаем список чисел List<Integer>(используем ArrayList<>)
        List<Integer> numbers = new ArrayList<>();

        //Добавляем несколько элементов в список с помощью метода .add()
        numbers.add(5);
        numbers.add(78);
        numbers.add(19);
        numbers.add(11);
        numbers.add(65);

        //Выводим список на экран.
        System.out.println("Список чисел: " + numbers);

        //Удаляем один из элементов(например, по индексу 1).
        numbers.remove(2);
        System.out.println("После удаления элемента с индексом 2: " + numbers);

        //Обновляем значение элемента по индексу(например, индекс 1 на 20)
        numbers.set(1, 20);
        System.out.println("После обновления элемента с индексом 1: " + numbers);

        //Проверяем, содержит ли список определённое число (например 20)
        int searchNumber = 20;
        boolean contains = numbers.contains(searchNumber);
        System.out.println("Список содержит " + searchNumber + ": " + contains);

        //Выводим размер списка.
        System.out.println("Размер списка: " + numbers.size());

        //Очищаем список и выводим его окончательное состояние
        numbers.clear();
        System.out.println("После очистки списка: " + numbers);
    }
}
