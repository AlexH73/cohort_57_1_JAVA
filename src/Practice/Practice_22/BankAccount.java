package Practice.Practice_22;
// TODO: Создать класс BankAccount
// 1. Добавить поля:
//    - `accountNumber` (String) - Номер банковского счета
//    - `balance` (double) - Баланс счета
// 2. Создать конструктор, который принимает `accountNumber` и начальный баланс.
// 3. Реализовать методы:
//    - `deposit(double amount)`, который увеличивает баланс на указанную сумму.
//    - `withdraw(double amount)`, который уменьшает баланс, если средств достаточно.

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Не достаточно средств. На балансе: " + balance + "€");
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

