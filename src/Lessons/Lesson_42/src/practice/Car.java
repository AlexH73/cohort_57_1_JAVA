package Lessons.Lesson_42.src.practice;

import java.util.List;

public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    // Этот метод делает слишком много. Он изменяет состояние и занимается выводом.
    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    // Метод для добавления автомобиля в базу данных (нарушает SRP и DIP)
    public void saveCarToDatabase(List<Car> database) {
        database.add(this);
        System.out.println("Car saved to database.");
    }
}
