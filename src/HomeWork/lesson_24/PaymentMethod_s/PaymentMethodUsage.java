package HomeWork.lesson_24.PaymentMethod_s;

public class PaymentMethodUsage {
    public static void main(String[] args) {

        GoldCreditCard paymentMethode = new GoldCreditCard("AN12344555",
                25000, 5000, 2);

        System.out.println(" Банковский счёт: " + paymentMethode);

        paymentMethode.getAccountNumber();
        paymentMethode.getBalance();
        paymentMethode.creditLimit();
        paymentMethode.cashbackPercentage();
    }
}
