package Practice.Practice_23;

//[х] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `balance` не может быть отрицательным.
// 2. Поле `accountNumber` нельзя менять после создания объекта.
public class BankAccount {
    private final String accountNumber;
    private double balance;


    // Конструктор с аргументом для accountNumber
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Геттер для accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Геттер для balance
    public double getBalance() {
        return balance;
    }

    // Сеттер для balance с валидацией
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным.");
        }
        this.balance = balance;
    }
}
