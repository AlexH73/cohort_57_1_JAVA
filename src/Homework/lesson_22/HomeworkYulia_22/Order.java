package Homework.lesson_22.HomeworkYulia_22;

public class Order {
    private String orderId;
    private double amount; // Исходная сумма заказа


    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public double calculateFinalAmount(double taxRate, double discountPercentage) {
        double taxAmount = amount * (taxRate / 100);           // Налог
        double discountAmount = amount * (discountPercentage / 100); // Скидка
        return amount + taxAmount - discountAmount;            // Итоговая сумма
    }


    public void displayOrder(double taxRate, double discountPercentage) {
        double finalAmount = calculateFinalAmount(taxRate, discountPercentage);
        System.out.println("Заказ №: " + orderId);
        System.out.println("Исходная сумма: " + amount + " руб.");
        System.out.println("Налог (" + taxRate + "%): " + (amount * (taxRate / 100)) + " руб.");
        System.out.println("Скидка (" + discountPercentage + "%): " + (amount * (discountPercentage / 100)) + " руб.");
        System.out.println("Итоговая сумма: " + finalAmount + " руб.");
        System.out.println("---------------------------");
    }
}
