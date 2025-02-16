package Homework.lesson_24.payment_systems;

public class GoldCreditCard extends CreditCard {
    private double cashbackPercentage;

    // Конструктор
    public GoldCreditCard(String accountNumber, double balance, double creditLimit, double cashbackPercentage) {
        super(accountNumber, balance, creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    // Геттер и сеттер
    public double getCashbackPercentage() {
        return cashbackPercentage;
    }

    public void setCashbackPercentage(double cashbackPercentage) {
        if (cashbackPercentage < 0 || cashbackPercentage > 100) {
            System.out.println("Процент кэшбэка должен быть в диапазоне от 0 до 100.");
            return;
        }
        this.cashbackPercentage = cashbackPercentage;
    }

    // Метод для получения кэшбэка
    public double getCashback(double amount) {
        return amount * (cashbackPercentage / 100);
    }
}
