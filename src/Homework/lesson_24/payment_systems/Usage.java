package Homework.lesson_24.payment_systems;

public class Usage {
    public static void main(String[] args) {
        // Создание объекта PaymentMethod
        PaymentMethod paymentMethod = new PaymentMethod("123456789", 1000.0);
        System.out.println("PaymentMethod: " + paymentMethod.getAccountNumber() + ", Balance: " + paymentMethod.getBalance());

        System.out.println();
        // Создание объекта CreditCard
        CreditCard creditCard = new CreditCard("987654321", 500.0, 2000.0);
        System.out.println("CreditCard: " + creditCard.getAccountNumber() + ", Balance: " + creditCard.getBalance() + ", Credit Limit: " + creditCard.getCreditLimit());

        System.out.println();
        // Создание объекта GoldCreditCard
        GoldCreditCard goldCreditCard = new GoldCreditCard("555555555", 300.0, 1500.0, 5.0);
        System.out.println("GoldCreditCard: " + goldCreditCard.getAccountNumber() + ", Balance: " + goldCreditCard.getBalance() + ", Credit Limit: " + goldCreditCard.getCreditLimit() + ", Cashback Percentage: " + goldCreditCard.getCashbackPercentage());

        System.out.println();
        // Тестирование методов
        paymentMethod.addFunds(500.0);
        System.out.println("PaymentMethod Balance после добавления средств: " + paymentMethod.getBalance());

        System.out.println();
        creditCard.withdrawFunds(100.0);
        System.out.println("CreditCard Balance после снятия средств: " + creditCard.getBalance());

        System.out.println();
        double cashback = goldCreditCard.getCashback(200.0);
        System.out.println("GoldCreditCard Cashback за покупку на 200.0: " + cashback);

    }
}
