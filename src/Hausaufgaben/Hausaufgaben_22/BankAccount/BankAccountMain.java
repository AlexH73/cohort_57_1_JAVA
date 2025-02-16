package Hausaufgaben.Hausaufgaben_22.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
      //Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.
        BankAccount userAlex = new BankAccount("12345", 75000);
        BankAccount userIlias = new BankAccount("67890", 75000);

        System.out.println("userAlex = " + userAlex);

        userAlex.withdraw(10000);
        System.out.println("userAlex = " + userAlex);

        userAlex.withdraw(100000);
        System.out.println("userAlex = " + userAlex);

        userAlex.deposit(10000);
        System.out.println("userAlex = " + userAlex);

        userAlex.transfer(userIlias, 75001);
        System.out.println("userAlex = " + userAlex);
    }
}
