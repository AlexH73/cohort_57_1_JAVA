package Homework.lesson_24.HierarchyPaymentSystem;
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
public class CreditCard extends PaymentMethod {
    private double creditLimit;

    //Конструктор
    public CreditCard(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }
    //Геттер
    public double getCreditLimit() {
        return creditLimit;
    }
    //Переопределение метода для отображения информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кредитный лимит: " + creditLimit + " $");
    }
}
