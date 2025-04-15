package Lessons.Lesson_40.src.teacher_sandbox;

import java.util.ArrayList;
import java.util.TreeSet;

public class House implements Comparable<House> {
    private double area;
    private String address;

    public House(double area, String address) {
        this.area = area;
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", address='" + address + '\'' +
                '}';
    }

    // метод compareTo используется для оценки
    @Override
    public int compareTo(House o) {
        int areaCompare = Double.compare(this.area, o.area) * -1;

        if (areaCompare == 0) {
            return (this.address).compareTo(o.address);
        }

        return areaCompare;
    }

    public static void main(String[] args) {
        House house1 = new House(100, "aaa");
        House house2 = new House(100, "bbb");
        House house3 = new House(100, "abc");
        House house4 = new House(100, "ccc");

        TreeSet<House> houses = new TreeSet<>();

        houses.add(house1);
        houses.add(house4);
        houses.add(house2);
        houses.add(house3);

        for (House house : houses) {
            System.out.println(house);
        }

        System.out.println(Integer.compare(12, 12));
        System.out.println(Integer.compare(12, 34));
        System.out.println(Integer.compare(102, 34));
    }
}
