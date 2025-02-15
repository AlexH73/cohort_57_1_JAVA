package Homework.lesson_24.HomeworkYulia_24;

public class GoldCreditCard extends CreditCard {

    private double cashbackPercentage;

    public GoldCreditCard(String accountNumber, double balance, double creditLimit, double cashbackPercentage) {
        super(accountNumber, balance, creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    public double getCashbackPercentage() {
        return cashbackPercentage;
    }
}
