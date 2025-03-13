package Lessons.Lesson_31.classwork;

import Lessons.Lesson_30.comparator_usage.House;

public class Classwork {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());

        House house5 = new House(11, 5, 2000, 110);
        House house6 = new House(11, 90, 2000, 110);

        System.out.println("house5.hashCode() = " + house5.hashCode());
        System.out.println("house6.hashCode() = " + house6.hashCode());

        System.out.println("house5 == house6 = " + (house5 == house6));
        System.out.println("house5.equals(house6) = " + house5.equals(house6));
    }
}
