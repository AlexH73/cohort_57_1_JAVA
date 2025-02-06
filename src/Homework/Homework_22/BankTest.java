package Homework.Homework_22;

public class BankTest {
    public static void main(String[] args) {
        // Создание нескольких объектов BankAccount
        BankAccount account1 = new BankAccount("DE1234567890", 1000.0);
        BankAccount account2 = new BankAccount("DE0987654321", 500.0);
        BankAccount account3 = new BankAccount("DE1122334455", 200.0);

        // Вывод начальных балансов
        System.out.println("Начальный баланс:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        // Пополнение счета account1
        System.out.println("\nПосле пополнения account1 на 200€:");
        account1.deposit(200.0);
        System.out.println(account1);

        // Снятие средств со счета account2
        System.out.println("\nПосле снятия 100€ с account2:");
        account2.withdraw(100.0);
        System.out.println(account2);

        // Попытка снять сумму, превышающую баланс
        System.out.println("\nПосле попытки снять 300€ с account3:");
        account3.withdraw(300.0);
        System.out.println(account3);

        // Перевод средств с account1 на account2
        System.out.println("\nПосле перевода 500€ с account1 на account2:");
        account1.transfer(account2, 500.0);
        System.out.println(account1);
        System.out.println(account2);

        // Попытка перевода суммы, превышающей баланс
        System.out.println("\nПосле попытки перевести 1000€ с account1 на account3:");
        account1.transfer(account3, 1000.0);

        System.out.println("\nОстаток средств на балансе account1:");
        System.out.println(account1);
        System.out.println("Остаток средств на балансе account3:");
        System.out.println(account3);
    }
}
