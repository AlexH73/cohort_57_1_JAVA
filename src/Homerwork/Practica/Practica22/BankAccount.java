package Homerwork.Practica.Practica22;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Метод для пополнения баланса
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: +" + amount + " | Новый баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть больше нуля.");
        }
    }

    //Метод для снятия средств
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " | Остаток: " + balance);
            return  true;
        } else {
            System.out.println("Ошибка: недостаточно средств или некорректная сумма.");
            return false;
        }
    }

    //Метод для отображения информации о счете
    public void displayAccountInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Баланс: " + balance);
    }
}
