package Homework.lesson_25.OldVersion;

/*Шаг 3: Использование полиморфизма в классе Main
✔ Создайте массив или список объектов PaymentMethod, содержащий разные способы оплаты.
✔ Проитерируйте коллекцию и вызовите pay() для каждого платежа.
✔ Обратите внимание, как Java автоматически вызывает нужную версию метода pay() в зависимости от типа объекта.*/
public class PaymentMethodTest {
    public static void main(String[] args) {
        //Создаем список различных способов оплаты
        PaymentMethod[] payments = {
                new CreditCardPayment(100.0, "USD" , "4556"),
                new PayPalPayment(75, "EUR" ,"user@example.com"),
                new CryptoPayment(10, "ВTC" , "ygwgf66304220ghv")
        };

        //Вызываем pay() для каждого объекта (полиморфизм)
        for (PaymentMethod payment : payments) {
            payment.pay();
        }
    }
}
