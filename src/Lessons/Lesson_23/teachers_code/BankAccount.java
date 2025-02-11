package Lessons.Lesson_23.teachers_code;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public String getAccountNumber() {
        // validation ?
        return accountNumber;
    }

    // setAccountNumber - не нужен! тк не предполагается замена этого значения

    public double getBalance() {
        // валидация
        return balance;
    }

    public void setBalance(double balance) {
        // валидация корректных значений
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        // валидация
        this.ownerName = ownerName;
    }
}
