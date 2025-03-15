package Homework.lesson_30;

import java.util.ArrayList;
import java.util.LinkedList;
/*
Как создавать и заполнять списки.
Как получать, вставлять и удалять элементы.
Как списки ведут себя при одинаковых операциях.

 */

public class ListExample {
    public static void main(String[] args) {

         // Создание списков
        ArrayList<String> arrayList = new  ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавляем элементы
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Mercedes");

        linkedList.add("Audi");
        linkedList.add("BMW");
        linkedList.add("Mercedes");

        //Выводим на экран
        System.out.println("-------------------------------");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LInkedList: " + linkedList);

        System.out.println("---------------------------------");

        //Получение элементов по индексу
        System.out.println("ArrayList второй элемент: " + arrayList.get(1));
        System.out.println("LInkedList второй элемент: " + linkedList.get(1));

        System.out.println("---------------------------------");

        //Добавление элемента
        arrayList.add(1, "Volkswagen");
        linkedList.add(1, "Volkswagen");

        System.out.println("---------------------------------");

        System.out.println("ArrayList после вставки: " + arrayList);
        System.out.println("LinkedList после вставки: " + linkedList);

        //Удаление из середины
        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("---------------------------------");

        System.out.println("ArrayList после удаления: " + arrayList);
        System.out.println("LinkedList после удаления: " + linkedList);




    }
}
