package Practice_22;

public class BankAccount {

// TODO: Создать класс BankAccount
// 1. Добавить поля:
//    - `accountNumber` (String) - Номер банковского счета
//    - `balance` (double) - Баланс счета
// 2. Создать конструктор, который принимает `accountNumber` и начальный баланс.
// 3. Реализовать методы:
//    - `deposit(double amount)`, который увеличивает баланс на указанную сумму.
//    - `withdraw(double amount)`, который уменьшает баланс, если средств достаточно.

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
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счету: " + balance);
        }
    }
}

