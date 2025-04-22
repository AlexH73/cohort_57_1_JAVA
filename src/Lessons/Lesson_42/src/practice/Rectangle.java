package Lessons.Lesson_42.src.practice;

public class Rectangle implements Shape{
    private int sideA;
    private int sideB;

    public Rectangle(int siteA, int siteB) {
        this.sideA = siteA;
        this.sideB = siteB;
    }

    @Override
    public int area() {
        return this.sideA * this.sideB;
    }
}
