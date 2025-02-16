package Homework;

public class paymentMethod {
}
// TODO: Реализовать иерархию платежных систем.
// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.
class PaymentMethod {
    private String accountNumber;
    private double balance;

    public PaymentMethod(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class CreditCard extends PaymentMethod {
    private double creditLimit;

    public CreditCard(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

class GoldCreditCard extends CreditCard {
    private double cashbackPercentage;

    public GoldCreditCard(String accountNumber, double balance, double creditLimit, double cashbackPercentage) {
        super(accountNumber, balance, creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    public double getCashbackPercentage() {
        return cashbackPercentage;
    }
}