package Lessons.Lesson_43.src.classwork;

import Lessons.Lesson_43.src.teacher_code.functional_interface_usage.Circle;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class UsagePreConfigedFunctionalInterefaceExample {
    public static void main(String[] args) {
        Function<String, Integer> wordCounter = (str) -> str.split("\\s+").length;

        System.out.println("wordCounter.apply(\"hello friends!\") = " + wordCounter.apply("hello friends!"));

        // Circle
        Function<Circle, Double> circleSquareCalculator = (circle) -> Math.PI * Math.pow(circle.radius, 2);

        Circle circle1 = new Circle();
        circle1.radius = 324;

        System.out.println("circleSquareCalculator.apply(circle1) = " + circleSquareCalculator.apply(circle1));

        Consumer<List<String>> consumer = (list) -> {
            for (String s : list) {
                System.out.println(s);
                System.out.println(s.length());
            }
        };

        Function<String, String> transformFunction = (myStr) -> {
            myStr = myStr.trim();
            myStr.toUpperCase();
            return myStr;
        };
    }

    static String transform(String str) {
        str = str.trim();
        str = str.toUpperCase();
        return str;
    }

    static boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }
}
