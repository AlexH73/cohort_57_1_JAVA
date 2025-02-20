package Practice.ThirdParty.polymorphism.calculating_the_area;

class Triangle extends Shape {
    private double base, neight;

    public Triangle(double base, double neight) {
        super("Треугольник");
        this.base = base;
        this.neight = neight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * neight;
    }
}