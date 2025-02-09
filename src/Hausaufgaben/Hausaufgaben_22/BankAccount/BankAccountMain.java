package Hausaufgaben.Hausaufgaben_22.BankAccount;
/*
Задание 2: Улучшение класса BankAccount.
Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой, если средств достаточно.
Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.
 */
public class BankAccountMain {
    public static void main(String[] args) {
      //Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.
        BankAccount userAlex = new BankAccount("12345", 75000);
        System.out.println("userAlex = " + userAlex);

        userAlex.withdraw(10000);
        System.out.println("userAlex = " + userAlex);

        userAlex.withdraw(100000);
        System.out.println("userAlex = " + userAlex);

        userAlex.deposit(10000);
        System.out.println("userAlex = " + userAlex);

        userAlex.transfer(75001);
        System.out.println("userAlex = " + userAlex);
    }


}
