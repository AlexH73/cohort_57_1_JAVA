package Hausaufgaben.Hausaufgaben_25.Payment;

public class PaymentMethod {
    private double amount;
    private String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void pay() {
        System.out.println("Das ist überwiesen !");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
