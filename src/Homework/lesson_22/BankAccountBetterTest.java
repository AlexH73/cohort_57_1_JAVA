package Homework.lesson_22;

public class BankAccountBetterTest {
    public static void main(String[] args) {
        //Создаем несколько банковских счетов
        BankAccountBetter account1 = new BankAccountBetter("12345" , 2000.0);
        BankAccountBetter account2 = new BankAccountBetter("67890" , 500.0);

        //Выводим начальный баланс
        account1.displayBalance();
        account2.displayBalance();

        //Пополняем первый счет
        account1.deposit(300.0);
        account1.displayBalance();

        //Пытаемся больше снять, чем есть на счету
        account1.withdraw(5000.0);  //Ошибка: недостаточно средств
        account1.withdraw(100.0);   //Успешное снятие
        account1.displayBalance();

        //Делаем перевод со счета 1 на счет 2
        account1.transfer(account2, 250.0);  //Успешный перевод
        account1.displayBalance();
        account2.displayBalance();

        //пытаемся перевести больше, чем осталось
        account1.transfer(account2, 7000.0);  //Ошибка: недостаточно средств

        //Делаем перевод со счета 1 на счет 2
        account2.transfer(account1, 3.0);  //Успешный перевод
        account1.displayBalance();
        account2.displayBalance();

    }
}
