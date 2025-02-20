package Practice.ThirdParty.polymorphism.calculating_the_area;

public class GeometryCalculator {
    private Shape[] shapes;

    public GeometryCalculator(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void displayAllAreas() {
        System.out.println("=== Вычисление площадей фигур ===");
        for (Shape shape : shapes) {
            System.out.println(shape.getInfo());
        }
    }

    public static void main(String[] args) {
        Shape[] shapeArray = {
                new Circle(5),                  // Радиус 5
                new Rectangle(4, 6),      // 4x6
                new Triangle(3, 8),       // Основание 3, высота 8
                new Circle(7),                 // Радиус 7
                new Rectangle(2, 9)      // 2x9
        };

        GeometryCalculator calculator = new GeometryCalculator(shapeArray);
        calculator.displayAllAreas();
    }
}
