package Homework.lesson_22;
/*Задание 5: Улучшение класса Order
Добавить метод calculateFinalAmount(double taxRate, double discountPercentage), который возвращает
итоговую сумму заказа с учетом налога и скидки.
Изменить displayOrder(), чтобы он отображал финальную сумму с учетом налога и скидки.
Протестировать класс, создав несколько объектов Order с разными налогами и скидками.*/
public class Order {
    String orderNumber; //Номер заказа
    double amount;      //Исходная сумма заказа
    double taxRate;     //Процент налога (например, 10 для 10%)
    double discountPercentage;  //Процент скидки (например, 5 для 5%)

    //Конструктор для инициализации заказа
    public Order(String orderNumber, double amount) {
        this.orderNumber = orderNumber;
        this.amount = amount;
    }
    //метод calculateFinalAmount(double taxRate, double discountPercentage), который возвращает
    //итоговую сумму заказа с учетом налога и скидки
    public double calculateFinalAmount(double taxRate, double discountPercentage) {
        double taxAmount = amount * (taxRate / 100); //Рассчитываем сумму налога
        double discountAmount = amount * (discountPercentage/ 100); //Рассчитываем сумму скидки
        return amount + taxAmount - discountAmount; //Итоговая сумма заказа
    }
    //метод displayOrder(), чтобы он отображал финальную сумму с учетом налога и скидки
    public void displayOrder(double taxRate, double discountPercentage) {
        System.out.println("Заказ: " + orderNumber);
        System.out.println("Исходная сумма: " + amount);
        System.out.println("Налог: " + taxRate + " %");
        System.out.println("Скидка: " + discountPercentage + " %");
        System.out.println("---------------------------------");

    }

}
