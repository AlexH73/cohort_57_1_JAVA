package Lessons.Lesson_42.src.practice;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
