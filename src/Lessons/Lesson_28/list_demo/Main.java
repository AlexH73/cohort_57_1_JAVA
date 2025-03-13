package Lessons.Lesson_28.list_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("qwe1");
        stringList.add("qwe2");
        stringList.add("qwe3");
        System.out.println(stringList);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("jack",30));
        people.add(new Person("olga",32));
        people.add(new Person("oleg",29));
        System.out.println(people);

        System.out.println(people.size()); // количество элементов
        Person person = people.get(0);// получить элемент с индексом 0

        // перебор
        System.out.println("----------- перебор 1");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        // перебор 2
        System.out.println("----------- перебор 2");
        for (Person p:people){
            System.out.println(p);
        }

        people.remove(0); // удалит элемент
        System.out.println(people);


        System.out.println(stringList.contains("qwe1")); // есть ли заданная строка в листе
        System.out.println(stringList.indexOf("qwe2")); // индекс заданного элемента или -1
        System.out.println("-------------- set -------------------");
        System.out.println(stringList);
        stringList.set(0, "qwerty");
        System.out.println(stringList);
    }
}