package Homework.Homework_24.payment_systems;

public class CreditCard extends PaymentMethod {
    private double creditLimit;

    // Конструктор
    public CreditCard(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    // Геттер и сеттер
    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        if (creditLimit < 0) {
            System.out.println("Лимит кредита не может быть отрицательным.");
            return;
        }
        this.creditLimit = creditLimit;
    }

    // Переопределенный метод для снятия средств
    @Override
    public void withdrawFunds(double amount) {
        if (amount < 0) {
            System.out.println("Сумма не может быть отрицательной.");
            return;
        }
        if (amount > this.getBalance() + this.creditLimit) {
            System.out.println("Превышен кредитный лимит.");
            return;
        }
        this.setBalance(this.getBalance() - amount);
    }
}
