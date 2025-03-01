package Homerwork.Practica.Practica24;
// 3. Реализовать методы:
//- `deposit(double amount)`, который увеличивает баланс на указанную сумму.
//- `withdraw(double amount)`, который уменьшает баланс, если средств достаточно.
public class Bank {
    private String accountNumber;
    private double balance;

    public Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public void displayUserInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
