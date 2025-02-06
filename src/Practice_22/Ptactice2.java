package Practice_22;

public class Ptactice2 {
    public static void main(String[] args) {

        BankAccount userYulia = new BankAccount("12345", 75000);
        System.out.println("userYulia = " + userYulia);

        userYulia.withdraw(10000);
        System.out.println("userYulia = " + userYulia);

        userYulia.withdraw(100000);
        System.out.println("userYulia = " + userYulia);

        userYulia.deposit(10000);
        System.out.println("userYulia = " + userYulia);
    }
}
