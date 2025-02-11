package Homework.lesson_22;
/*Задание 2: Улучшение класса BankAccount
Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на
 другой, если средств достаточно.
Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету
(выводить сообщение об ошибке).Протестировать класс, создав несколько объектов BankAccount и выполнив операции
 пополнения, снятия и перевода.*/
public class BankAccountBetter {
    String accountNumber; //Номер счета
    double balance;  //Баланс счета
    double amount;  //Сумма пополнения или снятия

    //Конструктор для инициализации счета
    public BankAccountBetter(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
//Метод deposite() пополняет счет на указанную сумму (amount - Сумма пополнения)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: + " + amount + " на счет " + accountNumber);
        }  else {
            System.out.println("Ошибка: сумма пополнения должна быть больше 0");
        }
    }
    //метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету
    //(выводить сообщение об ошибке)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: - " + amount + " со счета " + accountNumber);
        }else {
            System.out.println("Ошибка: недостаточно средств на счете " + accountNumber);
        }

    }
//метод transfer(BankAccountBetter targetAccount, double amount), который переводит деньги с текущего счета на
// другой, если средств достаточно.
    public void transfer(BankAccountBetter targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;               //Уменьшаем баланс текущего счета
            targetAccount.balance += amount; //Увеличиваем баланс счета-получателя
            System.out.println("Перевод: - " + amount + " со счета " + accountNumber +
                    " на счет " + targetAccount.accountNumber);
        } else {
            System.out.println("Ошибка: не достаточно средств для перевода " + amount + " |На Балансе: " + balance);
        }

    }


    //метод displayBalance() выводит текущий  баланс счета
    public void displayBalance() {
        System.out.println("Счет " + accountNumber + " |Баланс: " + balance);


    }

}
