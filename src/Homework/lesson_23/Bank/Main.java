package Homework.lesson_23.Bank;


public class Main {
    public static void main(String[] args) {
        // Создаём банковский счёт с начальным балансом 100 евро
        MyAccount myAccount = new MyAccount(100);

        // Проверяем баланс
        System.out.println("Текущий баланс: " + myAccount.getBalance() + " EUR");

        // Пополняем счёт на 50 евро
        myAccount.deposit(50);

        // Пробуем снять 30 евро
        myAccount.withdraw(30);

        // Пробуем снять 200 евро (должна быть ошибка)
        myAccount.withdraw(200);

        // Пробуем внести отрицательную сумму (должна быть ошибка)
        myAccount.deposit(-10);

    }
}
