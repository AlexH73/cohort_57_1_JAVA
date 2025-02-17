package TestTasks.Vehicle;

public class Vehicle {
    protected String brand;  // Марка машины (например, BMW, Toyota)
    protected int year;      // Год выпуска

    // Конструктор для установки данных
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Год выпуска: " + year);
    }
}
