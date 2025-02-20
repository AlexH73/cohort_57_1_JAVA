package Hausaufgaben.Hausaufgaben_25.Payment;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentMethod method = new PaymentMethod();
        method.getAmount();
        method.setAmount();
        method.getCurrency();
        method.setCurrency();
        method.pay();
    }

}
