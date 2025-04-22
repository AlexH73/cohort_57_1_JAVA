package Lessons.Lesson_42.src.practice;

public class ShapeUsage {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(10, 15);
        Shape circle2 = new Circle(2);
        Shape rectangle2 = new Rectangle(2, 12);

        Shape[] shapes = {circle, rectangle, circle2, rectangle2};

        int areas = 0;
        for (Shape shape : shapes) {
            areas += shape.area();
            System.out.println("Площадь фигуры равна: " + areas + " М²");
        }
    }
}
