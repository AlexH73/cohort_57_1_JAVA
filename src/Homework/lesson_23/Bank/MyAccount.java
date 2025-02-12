package Homework.lesson_23.Bank;

// Домашнее задание N: К 23 уроку
// Описание задачи: Банковский счёт с инкапсуляцией

public class MyAccount {
    private double balance; //Баланс счёта (доступ только через методы)

    // Конструктор для создания счёта с начальным балансом
    public MyAccount(double initialBalance) {
        if (initialBalance>= 0) {
            this.balance = initialBalance;
        }
        else{
            System.out.println("Ошибка: баланс не может быть отрицательным!");
            this.balance = 0;

        }
    }
    // Геттер для получения баланса
    public double getBalance() {
        return balance;
    }
    // Метод для внесения денег на счёт
    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: +" + amount + " EUR. Новый баланс: " + balance + " EUR");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств!");

        } else {
            System.out.println("Ошибка: сумма снятия должна быть больше 0!");
        }
    }
// Метод для снятия денег со счёта
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " EUR. Остаток: " + balance + " EUR");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств!");
        } else {
            System.out.println("Ошибка: сумма снятия должна быть больше 0!");
        }
    }
}
