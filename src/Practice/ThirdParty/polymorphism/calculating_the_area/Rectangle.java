package Practice.ThirdParty.polymorphism.calculating_the_area;

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}