package HomerJavaWork.Homer21work;

public class BankTestAccount {
    public static void main(String[] args) {
        BankAccount userIryna = new BankAccount("12345", 7500);
        System.out.println("userIryna = " + userIryna);

        userIryna.withdraw(1000);
        System.out.println("userIryna = " + userIryna);

        userIryna.withdraw(10000);
        System.out.println("userIryna = " + userIryna);
    }

}
