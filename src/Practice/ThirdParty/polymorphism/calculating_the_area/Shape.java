package Practice.ThirdParty.polymorphism.calculating_the_area;

abstract class Shape {
    private String name; // название фигуры
    public final String squareCm = "см²";

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public String getInfo() {
        return "Фигура: " + name + ", Площадь: " + calculateArea() + " " + squareCm;
    }
}