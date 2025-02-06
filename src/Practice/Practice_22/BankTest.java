package Practice.Practice_22;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("DE12345678", 20.5);
        System.out.println(account1);

        account1.deposit(100);
        System.out.println(account1);

        account1.withdraw(30);
        System.out.println(account1);

        account1.withdraw(150);
        System.out.println(account1);
    }
}
