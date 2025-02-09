// Задание 2: Улучшение класса BankAccount
//добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой, если средств достаточно.
//Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
//Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.

package Homework.lesson_22.HomeworkYulia_22;

public class BankAccount {
    String user;
    double balance;

    public BankAccount(String user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(user + " пополнил счет на " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Ошибка: сумма пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств на счете " + user);
        } else if (amount <= 0) {
            System.out.println("Ошибка: сумма снятия должна быть положительной.");
        } else {
            balance -= amount;
            System.out.println(user + " снял " + amount + ". Новый баланс: " + balance);
        }
    }


    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств для перевода от " + user + " к " + targetAccount.user);
        } else if (amount <= 0) {
            System.out.println("Ошибка: сумма перевода должна быть положительной.");
        } else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Перевод выполнен: " + user + " → " + targetAccount.user + " на сумму " + amount);
        }
    }


    public void displayInfo() {
        System.out.println("Владелец: " + user + ", Баланс: " + balance);
    }
}