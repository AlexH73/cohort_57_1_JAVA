package Lessons.Lesson_31.classwork;

import Lessons.Lesson_30.comparator_usage.House30;

import java.util.*;

public class Classwork {
    public static void main(String[] args) {
        House30 house305 = new House30(11, 5, 2000, 110);
        House30 house306 = new House30(11, 90, 2000, 110);

        System.out.println("house5.hashCode() = " + house305.hashCode());
        System.out.println("house6.hashCode() = " + house306.hashCode());

        System.out.println("house5 == house6 = " + (house305 == house306));
        System.out.println("house5.equals(house6) = " + house305.equals(house306));

        List<House30> house30s = new ArrayList<>();
        house30s.add(house305);
        house30s.add(house306);
        System.out.println("houses.size() = " + house30s.size());

        Set<House30> house30Set = new HashSet<>();

        house30Set.add(house305);
        house30Set.add(house306);
        System.out.println("houseSet.size() = " + house30Set.size());


    }
}
