package Homework.lesson_24.HomeworkYulia_24;

public class CreditCard extends PaymentMethod {

    private double creditLimit;

    public CreditCard(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
