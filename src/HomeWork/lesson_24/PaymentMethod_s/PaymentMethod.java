package HomeWork.lesson_24.PaymentMethod_s;

public class PaymentMethod {
    private String accountNumber;
    private int balance;

    public PaymentMethod(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\naccountNumber: " + accountNumber +
                "\nbalance: " + balance;
    }
}
