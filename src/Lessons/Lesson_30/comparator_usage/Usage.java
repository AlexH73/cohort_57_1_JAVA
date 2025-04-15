package Lessons.Lesson_30.comparator_usage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        House30 House301 = new House30(2, 3, 1990, 63.49999998);
        House30 House302 = new House30(5, 1, 2003, 35);
        House30 House303 = new House30(1, 2, 2025, 80);
        House30 House304 = new House30(2, 3, 2020, 63.49999999);
        House30 House305 = new House30(11, 5, 2000, 110);
        House30 House306 = new House30(11, 5, 2000, 110);

        House301.setPricePerM(2000);
        House302.setPricePerM(2300);
        House303.setPricePerM(1700);
        House304.setPricePerM(1500);
        House305.setPricePerM(2100);

        List<House30> list = new LinkedList<>();

        list.add(House301);
        list.add(House302);
        list.add(House303);
        list.add(House304);
        list.add(House305);

        show(list);

        list.sort(new HouseSquareComparator());
        show(list);

        // встроенный метод интерфейса Comparator.reversed() позволяет отсортировать
        // в обратном порядке без написания отдельной реализации.
        list.sort(new HouseSquareComparator().reversed());
        show(list);

        list.sort(new HouseYearOfBuildComparator());
        show(list);

        list.sort(new HouseSquareComparator());
        show(list);


        System.out.println("House301.hashCode() = " + House301.hashCode());
        System.out.println("House302.hashCode() = " + House302.hashCode());
        System.out.println("House303.hashCode() = " + House303.hashCode());
        System.out.println("House304.hashCode() = " + House304.hashCode());
        System.out.println("House305.hashCode() = " + House305.hashCode());
    }

    private static void show(List<House30> list) {
        for (House30 House30 : list) {
            System.out.println(House30.toString());
        }
        System.out.println("=================================================");
    }
}
