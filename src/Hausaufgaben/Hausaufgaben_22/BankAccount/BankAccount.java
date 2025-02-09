package Hausaufgaben.Hausaufgaben_22.BankAccount;

public class BankAccount {
    String accountNumber;
    double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        this.balance += amount;

    }

    public void withdraw(double amount) {
        //Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно с редств на счету: " + balance);
        }
    }

    public void transfer(double amount) {
        //Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой, если средств достаточно.
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно с редств на счету: " + balance);
        }
    }
}



