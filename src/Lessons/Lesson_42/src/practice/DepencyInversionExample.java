package Lessons.Lesson_42.src.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepencyInversionExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(summList(list));
    }


    // этот метод не соответствует принципу Dependency Inversion,
    // тк может работать исключительно с ArrayList - это плохо!
    private static int summ(ArrayList<Integer> arrayList){
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        return sum;
    }

    // этот метод соответствует принципу Dependency Inversion,
    // тк может работать с любыми листами!
    private static int summList(List<Integer> arrayList){
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        return sum;
    }
}
