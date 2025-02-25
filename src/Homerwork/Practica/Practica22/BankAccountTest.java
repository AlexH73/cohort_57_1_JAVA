package Homerwork.Practica.Practica22;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        account.displayAccountInfo();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); //Ошибка: недостаточно средств
    }
}
