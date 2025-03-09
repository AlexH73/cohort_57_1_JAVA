package HomeWork.Lesson_25;

public class PaymentMethodUsage {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment(125.6,"USD");
        creditCardPayment.pay();
        System.out.println("Сумма = " + creditCardPayment.getAmount() + ", Валюта = " + creditCardPayment.getCurrency());

        PaymentMethod payPalPayment = new PayPalPayment(122, "Euro");
        payPalPayment.pay();
        System.out.println("Сумма = " + payPalPayment.getAmount() + ", Валюта = " + payPalPayment.getCurrency());

        PaymentMethod cryptoPayment = new CryptoPayment(0.2, "Ethereum");
        cryptoPayment.pay();
        System.out.println("Сумма = " + cryptoPayment.getAmount() + ", Валюта = " + cryptoPayment.getCurrency());





        //creditCardPayment.amount(222);


    }
}




/*
Создайте массив или список объектов PaymentMethod, содержащий разные способы оплаты.
✔ Проитерируйте коллекцию и вызовите pay() для каждого платежа.
        ✔ Обратите внимание, как Java автоматически вызывает нужную версию метода pay() в зависимости от типа объекта.

        🚀 Дополнительное задание:
        ✔ Добавьте в PaymentMethod метод refund(), который можно переопределить в подклассах для имитации возврата платежа.
        ✔ Реализуйте перегрузку метода pay(), чтобы можно было передавать дополнительные детали (например, transactionId).


*/








