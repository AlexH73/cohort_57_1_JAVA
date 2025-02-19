package Practice.ThirdParty.polymorphism.calculating_the_area;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}