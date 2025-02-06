package Homework.Homework_22;

public class BankAccount {
    String accountNumber;
    double balance;

    // Конструктор для инициализации номера счета и начального баланса
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для пополнения баланса
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Пополнение на " + amount + "€. Остаток средств на балансе: " + balance + "€");
    }

    // Метод для снятия средств с баланса
    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Снято " + amount + "€ со счета: " + accountNumber);
            System.out.println("Остаток средств на балансе: " + balance + "€");
        } else {
            System.out.println("Не достаточно средств для снятия " + amount + "€. На балансе: " + balance + "€");
        }
    }

    // Метод для перевода средств на другой счет
    public void transfer(BankAccount targetAccount, double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Сумма " + amount + "€ переведена на счет: " + targetAccount.accountNumber);
            System.out.println("Остаток средств на балансе: " + balance + "€");
        } else {
            System.out.println("Не достаточно средств для перевода " + amount + "€. На балансе: " + balance + "€");
        }
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance + "€" +
                '}';
    }
}