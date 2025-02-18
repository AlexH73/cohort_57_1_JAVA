package Hausaufgaben.Hausaufgaben_24.PaymentMethod;

public class GoldCreditCard extends CreditCard {
    private double cashbackPercentage;

    public double getCashbackPercentage() {
        return cashbackPercentage;
    }

    public void setCashbackPercentage(double cashbackPercentage) {
        this.cashbackPercentage = cashbackPercentage;
    }

    protected GoldCreditCard(String accountNumber, double balance, double creditLimit, double cashbackPercentage);
}


    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        super.setAccountNumber(accountNumber);
    }

    @Override
    public double getBalance() {
        setBalance();
    }
        super();
    PaymentMethod payment = new PaymentMethod();
    payment.accountNumber();
    payment.balance();

    CreditCard card = new CreditCard();
    card.creditLimit();

    GoldCreditLimit limit = new GoldCreditLimit();
    limit.cashbackPercentage();
}
