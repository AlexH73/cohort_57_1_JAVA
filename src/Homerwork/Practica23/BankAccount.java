package Homerwork.Practica23;
//1. Поле `balance` не может быть отрицательным
// 2. Поле `accountNumber` нельзя менять после создания объекта.
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }
}