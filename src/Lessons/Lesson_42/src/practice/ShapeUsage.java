package Lessons.Lesson_42.src.practice;

public class ShapeUsage {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape circle2 = new Circle();
        Shape rectangle2 = new Rectangle();

        Shape[] shapes = {circle, rectangle, circle2, rectangle2};

        int areas = 0;
        for (Shape shape : shapes) {
            areas += shape.area();
        }

        System.out.println(areas);
    }
}
