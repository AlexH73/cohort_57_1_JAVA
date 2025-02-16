package Homework.lesson_24.HierarchyPaymentSystem;
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.
public class GoldCreditCard extends CreditCard  {
    private double cashbackPercentage;

    //Конструктор
    public GoldCreditCard(String accountNumber, double balance, double creditLimit, double cashbackPercentage) {
        super(accountNumber, balance, creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }
    //Геттер
    public double getCashbackPercentage() {
        return cashbackPercentage;
    }
    //Переопределение метода для отображения информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кэшбэк: " + cashbackPercentage + " %");
    }
}
