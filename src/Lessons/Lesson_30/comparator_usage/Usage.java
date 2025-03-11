package Lessons.Lesson_30.comparator_usage;

import java.util.ArrayList;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        House house1 = new House(2, 3, 1990, 63.49999998);
        House house2 = new House(5, 1, 2003, 35);
        House house3 = new House(1, 2, 2025, 80);
        House house4 = new House(2, 3, 2020, 63.49999999);
        House house5 = new House(10, 5, 2000, 110);

        house1.setPricePerM(2000);
        house2.setPricePerM(2300);
        house3.setPricePerM(1700);
        house4.setPricePerM(1500);
        house5.setPricePerM(2100);

        List<House> list = new ArrayList<>();

        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        list.add(house5);

        show(list);

        list.sort(new HouseSquareComparator());
        show(list);

        list.sort(new HouseSquareComparator().reversed());
        show(list);

        list.sort(new HouseYearOfBuildComparator());
        show(list);

        list.sort(new HouseSquareComparator());
        show(list);

    }

    private static void show(List<House> list) {
        for (House house : list) {
            System.out.println(house.toString());
        }
        System.out.println("=================================================");
    }
}
