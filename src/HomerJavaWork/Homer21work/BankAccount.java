package HomerJavaWork.Homer21work;

/*Задание 2: Улучшение класса BankAccount
Добавить метод transfer(BankAccount targetAccount, double amount), который переводит деньги с текущего счета на другой,
 если средств достаточно.
Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения, снятия и перевода.*/
public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance = this.balance - amount;
        }  else {
            System.out.println("Недостаточно средств на счету:" + balance);
        }
    }

}
