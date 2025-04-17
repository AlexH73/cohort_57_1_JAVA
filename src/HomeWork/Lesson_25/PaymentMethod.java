package HomeWork.Lesson_25;

public class PaymentMethod {
    private double amount;  //Сумма
    private String currency;  //Валюта

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void pay() {
        System.out.println(amount + currency);
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
