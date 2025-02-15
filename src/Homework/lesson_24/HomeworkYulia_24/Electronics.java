package Homework.lesson_24.HomeworkYulia_24;

public class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount(double discount) {
        super.applyDiscount(10);
    }
}
