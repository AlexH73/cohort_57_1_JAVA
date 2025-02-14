package Homework.Homework_24.payment_systems;

// TODO: Реализовать иерархию платежных систем.
// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.

public class PaymentMethod {
    private String accountNumber;
    private double balance;

    // Конструктор
    public PaymentMethod(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Геттеры и сеттеры
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным.");
        }
        this.balance = balance;
    }

    // Метод для добавления средств
    public void addFunds(double amount) {
        if (amount < 0) {
            System.out.println("Сумма не может быть отрицательной.");
        }
        this.balance += amount;
    }

    // Метод для снятия средств
    public void withdrawFunds(double amount) {
        if (amount < 0) {
            System.out.println("Сумма не может быть отрицательной.");
        }
        if (amount > this.balance) {
            System.out.println("Недостаточно средств.");
        }
        this.balance -= amount;
    }
}
