package Homework.lesson_24.HierarchyPaymentSystem;
//Класс для тестирования
public class PaymentMethodTest {
    public static void main(String[] args) {
        PaymentMethod basicPayment = new PaymentMethod("4789007", 7000);
        basicPayment.displayInfo();

        System.out.println();

        CreditCard creditCard = new CreditCard("12368909765554",
                32557, 30500);
        creditCard.displayInfo();

        System.out.println();

        GoldCreditCard goldCreditCard = new GoldCreditCard("7867",
                100000, 50000, 5);
        goldCreditCard.displayInfo();

        System.out.println();
    }
}
