package Hausaufgaben.Hausaufgaben_22.BankAccount;

/*
Задание 2: Улучшение класса BankAccount.
Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой, если средств достаточно.
Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.
 */
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
            System.out.println("Недостаточно средств на счету: " + balance);
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        //Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой, если средств достаточно.
        if (amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
        } else {
            System.out.println("Недостаточно с редств на счету: " + balance);
        }
    }
}



