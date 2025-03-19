package Homework.lesson_22;

public class homework22 {
}

/* Задание 1: Доработка класса User
Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше,
и false в противном случае.
Изменить метод displayUserInfo(), чтобы он также
отображал информацию о совершеннолетии пользователя.
Протестировать класс, создав несколько объектов User и вызвав все методы.
*/
class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isAdult()) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Ivan", 20);
        User user2 = new User("Maria", 17);

        user1.displayUserInfo();
        user2.displayUserInfo();
    }
}

/*
Задание 2: Улучшение класса BankAccount
Добавить метод transfer(BankAccount targetAccount, double amount),
который переводит деньги с текущего счета на другой,
если средств достаточно.
Изменить метод withdraw(double amount), чтобы он не позволял снимать больше, чем есть на счету
(выводить сообщение об ошибке).
Протестировать класс, создав несколько объектов BankAccount и выполнив операции пополнения,
 снятия и перевода.
*/
class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


/*Задание 3: Расширение класса Product
Добавить метод applyDiscount(double percentage), который уменьшает цену товара на заданный процент.
Изменить метод sell(int quantity), чтобы он проверял наличие нужного количества товара;
если товара недостаточно, продавать только доступное количество и выводить сообщение.
Протестировать класс, создав несколько объектов Product и применив скидки и продажи.

 */
class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) {
        if (quantity > 0) {
            if (quantity <= stock) {
                stock -= quantity;
                System.out.println("Sold: " + quantity + " units of " + name + ". Remaining stock: " + stock);
            } else {
                System.out.println("Not enough stock! Selling only " + stock + " units.");
                stock = 0;
            }
        } else {
            System.out.println("Invalid quantity to sell!");
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println("Restocked: " + quantity + " units of " + name + ". Now in stock: " + stock);
        } else {
            System.out.println("Invalid quantity to restock!");
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
            System.out.println("Price of " + name + " after " + percentage + "% discount: " + price + " €");
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: " + price + " € | Stock: " + stock + " units.");
    }

    public static void main(String[] args) {
        Product apple = new Product("Apple", 1.5, 20);
        Product laptop = new Product("Laptop", 1200, 5);

        apple.displayProduct();
        laptop.displayProduct();

        apple.sell(5);
        laptop.sell(10);

        apple.restock(10);
        laptop.applyDiscount(15);

        apple.displayProduct();
        laptop.displayProduct();
    }
}

/*Задание 4: Улучшение класса SmartDevice
Добавить метод togglePower(), который переключает устройство между включенным и выключенным состоянием.
Изменить displayStatus(), чтобы он показывал, включено ли устройство или нет.
 Протестировать класс, создав объект SmartDevice и несколько раз переключив его состояние.
*/

class SmartDevice {
    private String deviceName;
    private boolean isOn;


    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(deviceName + " увімкнено.");
        } else {
            System.out.println(deviceName + " вже увімкнено.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(deviceName + " вимкнено.");
        } else {
            System.out.println(deviceName + " вже вимкнено.");
        }
    }

    public void togglePower() {
        isOn = !isOn;
        System.out.println(deviceName + " тепер" + (isOn ? "увімкнено" : "вимкнено") + ".");
    }

    public void displayStatus() {
        System.out.println("Стан " + deviceName + ": " + (isOn ? "Увімкнено" : "Вимкнено"));
    }

    public static void main(String[] args) {
        SmartDevice lamp = new SmartDevice("Настільна лампа");
        SmartDevice tv = new SmartDevice("Телевізор");

        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
        lamp.togglePower();
        lamp.displayStatus();

        System.out.println();

        tv.displayStatus();
        tv.turnOff();
        tv.turnOn();
        tv.togglePower();
        tv.displayStatus();
    }
}

/*Задание 5: Улучшение класса Order
Добавить метод calculateFinalAmount(double taxRate, double discountPercentage), который возвращает итоговую сумму заказа с учетом налога и скидки.
Изменить displayOrder(), чтобы он отображал финальную сумму с учетом налога и скидки.
        Протестировать класс, создав несколько объектов Order с разными налогами и скидками.
Дополнительное задание (необязательное, для продвинутых студентов)
Создать новый класс Store, который управляет списком товаров (Product). Реализовать:

Поле products (список товаров).
Метод addProduct(Product product), который добавляет товар в магазин.
Метод displayAllProducts(), который выводит список всех товаров.
Метод findMostExpensiveProduct(), который возвращает самый дорогой товар.
Протестировать, создав Store и добавив несколько товаров.*/

class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = "Ожидает";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Статус заказа №" + orderId + " изменён: " + status);
    }

    public double calculateFinalAmount(double taxRate, double discountPercentage) {
        double amountWithTax = totalAmount + (totalAmount * (taxRate / 100));
        return amountWithTax - (amountWithTax * (discountPercentage / 100));
    }

    public void displayOrder(double taxRate, double discountPercentage) {
        double finalAmount = calculateFinalAmount(taxRate, discountPercentage);
        System.out.println("\n--- Информация о заказе ---");
        System.out.println("Номер заказа: " + orderId);
        System.out.println("Покупатель: " + customerName);
        System.out.println("Сумма заказа: " + totalAmount + " €");
        System.out.println("Статус: " + status);
        System.out.println("Итоговая сумма (налог " + taxRate + "%, скидка " + discountPercentage + "%): " + finalAmount + " €");
    }

    public static void main(String[] args) {
        Order order1 = new Order(101, "Иван Петров", 250.00);
        Order order2 = new Order(102, "Анна Смирнова", 500.00);

        order1.displayOrder(19, 10);
        order1.updateStatus("Отправлен");

        order2.displayOrder(7, 5);
        order2.updateStatus("Доставлен");
    }
}
