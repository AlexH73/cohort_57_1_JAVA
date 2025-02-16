package Homework.lesson_24.HierarchyPaymentSystem;
/*Часть 2: Реализация многоуровневого наследования
🔹 В следующих заданиях нужно построить цепочку наследования, где каждый класс расширяет предыдущий.
🔹 Финальный класс должен объединять функциональность всех предыдущих уровней.
// TODO: Реализовать иерархию платежных систем.
// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.
class PaymentMethod {
    private String accountNumber;
    private double balance;
}*/

// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
//Базовый класс PaymentMethod
public class PaymentMethod {
    private String accountNumber;
    private double balance;

    //Конструктор
    public PaymentMethod(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Геттеры
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    //Метод для отображения информации
    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Баланс: " + balance + " $.");
    }
}
