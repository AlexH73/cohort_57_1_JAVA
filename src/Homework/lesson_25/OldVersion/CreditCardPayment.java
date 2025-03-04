package Homework.lesson_25.OldVersion;

/*Шаг 2: Создание подклассов для различных способов оплаты
✔ CreditCardPayment – реализует pay(), имитируя оплату кредитной картой.*/
public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Оплата " + amount + " " + currency + " с кредитной карты " + cardNumber);
    }
}
