package Hausaufgaben.Hausaufgaben_24.PaymentMethod;
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
public class CreditCard extends PaymentMethod{
    private int creditLimit;

    protected CreditCard(String accountNumber,double balance,int creditLimit);

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        super.setAccountNumber(accountNumber);
    }

    @Override
    public double getBalance() {
        setBalance();
    }
        super()

}
