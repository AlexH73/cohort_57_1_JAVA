package HomeWork.lesson_24.PaymentMethod_s;

public class CreditCard extends PaymentMethod{
    private int creditLimit;

    public CreditCard(String accountNumber, int balance, int creditLimit) {
        super(accountNumber,balance);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void creditLimit(){
        System.out.println("Credit Limit: " + creditLimit);
    }
}
