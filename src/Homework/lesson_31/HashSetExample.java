package Homework.lesson_31;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("Яблоко");
        set.add("Груша");
        set.add("Банан");
        set.add("Яблоко"); // Дубликат, не добавится

        System.out.println(set); // Порядок не гарантирован
    }
}
