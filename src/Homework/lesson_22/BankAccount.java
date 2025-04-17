package Homework.lesson_22;
//[х] TODO: Создать класс BankAccount
//[х] 1. Добавить поля:
//    - `accountNumber` (String) - Номер банковского счета
//    - `balance` (double) - Баланс счета
//[х] 2. Создать конструктор, который принимает `accountNumber` и начальный баланс.
//[х] 3. Реализовать методы:
//    - `deposit(double amount)`, который увеличивает баланс на указанную сумму.
//    - `withdraw(double amount)`, который уменьшает баланс, если средств достаточно.

/**
 * <h1>Задание 2: Улучшение класса BankAccount</h1>
 *    1. Добавить метод transfer(BankAccount targetAccount, double amount),
 *    который переводит деньги с текущего счета на другой, если средств достаточно.<br>
 *    2. Изменить метод withdraw(double amount), чтобы он не позволял снимать больше,
 *    чем есть на счету (выводить сообщение об ошибке).<br>
 *    3. Протестировать класс, создав несколько объектов BankAccount и выполнив
 *    операции пополнения, снятия и перевода.
 */
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