package Hausaufgaben.Hausaufgaben_25.Payment;

public class CreditCardPayment extends PaymentMethod{
    private String creditCardNumber;

    public CreditCardPayment(double amount, String currency, String creditCardNumber) {
        super(amount, currency);
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Kreditkarte akzeptiert !");
    }

}
