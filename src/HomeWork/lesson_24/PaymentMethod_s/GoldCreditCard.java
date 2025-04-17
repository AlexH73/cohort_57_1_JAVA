package HomeWork.lesson_24.PaymentMethod_s;

public class GoldCreditCard extends CreditCard {
    private int cashbackPercentage;

    public GoldCreditCard(String accountNumber, int balance,
                          int creditLimit, int cashbackPercentage) {
        super(accountNumber, balance, creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    public int getCashbackPercentage() {
        return cashbackPercentage;
    }

    public void setCashbackPercentage(int cashbackPercentage) {
        this.cashbackPercentage = cashbackPercentage;
    }

    public void cashbackPercentage() {
        System.out.println("Cashback Percentage: " + cashbackPercentage);
    }
}
