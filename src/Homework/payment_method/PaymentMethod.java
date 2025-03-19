package Homework.payment_method;

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

