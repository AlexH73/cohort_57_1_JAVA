package Homerwork.Practica.Practica23.ModifiersAccessField;
/*// TODO: Назначить модификаторы доступа для полей.

class BankAccount {
    String accountNumber;
    double balance;
    String ownerName;
}
Copy
*/
public class BankAccount {
    private String accountNumber;
    private double balance;   //Баланс счета
    private String ownerName;

    //Конструктор. Инициализация данных
    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    //Геттеры
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    //Сеттеры с валидацией
    public void deposit(double amount) {
        if (amount > 0) { //Проверяем что сумма пополнения положительная
            this.balance += amount; // Увеличиваем баланс на введенную сумму
            System.out.println("Счет пополнен на " + amount + ". Новый баланс: " + this.balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  //Проверяем, что сумма корректна и хватает средств
            balance -= amount; //Уменьшаем баланс
            System.out.println("Снятие успешно. Новый баланс: " + balance);
            return true;    // Операция успешна
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма.");
            return false;   // Операция не удалась
        }
    }

}
