package Lessons.Lesson_31.classwork;

import Lessons.Lesson_30.comparator_usage.House;

import java.util.*;

public class Classwork {
    public static void main(String[] args) {
        House house5 = new House(11, 5, 2000, 110);
        House house6 = new House(11, 90, 2000, 110);

        System.out.println("house5.hashCode() = " + house5.hashCode());
        System.out.println("house6.hashCode() = " + house6.hashCode());

        System.out.println("house5 == house6 = " + (house5 == house6));
        System.out.println("house5.equals(house6) = " + house5.equals(house6));

        List<House> houses = new ArrayList<>();
        houses.add(house5);
        houses.add(house6);
        System.out.println("houses.size() = " + houses.size());

        Set<House> houseSet = new HashSet<>();

        houseSet.add(house5);
        houseSet.add(house6);
        System.out.println("houseSet.size() = " + houseSet.size());


    }
}
