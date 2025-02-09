package Homework.lesson_22.HomeworkYulia_22;

public class Main22 {
    public static void main(String[] args) {

        // Вывод для 4 задачи:

        User user1 = new User("Мария", 25, "maria@example.com");
        User user2 = new User("Владимир", 36, "vladimir@example.com");
        User user3 = new User("Николай", 20, "nik@example.com");

        System.out.println("\nИнформация о пользователях:");
        user1.displayUserInfo();
        user2.displayUserInfo();
        user3.displayUserInfo();


// Вывод для 5 задачи:

        BankAccount account1 = new BankAccount("Иван", 5000);
        BankAccount account2 = new BankAccount("Мария", 2000);


        System.out.println("\nИсходные данные:");
        account1.displayInfo();
        account2.displayInfo();


        System.out.println("\n➕ Пополнение счета:");
        account1.deposit(1000);
        account2.deposit(500);


        System.out.println("\nСнятие средств:");
        account1.withdraw(2000);
        account2.withdraw(3000);


        System.out.println("\nПеревод средств:");
        account1.transfer(account2, 1500);
        account2.transfer(account1, 10000);


        System.out.println("\nИтоговый баланс:");
        account1.displayInfo();
        account2.displayInfo();


// Вывод для 6 задачи:

        Product phone = new Product("Смартфон", 50000, 10);
        Product laptop = new Product("Ноутбук", 80000, 5);


        System.out.println("\nИсходные данные:");
        phone.displayProductInfo();
        laptop.displayProductInfo();


        System.out.println("\nПрименение скидки:");
        phone.applyDiscount(10);
        laptop.applyDiscount(5);


        System.out.println("\nПродажа товаров:");
        phone.sell(3);
        laptop.sell(6);


        System.out.println("\nИтоговый остаток:");
        phone.displayProductInfo();
        laptop.displayProductInfo();


// Вывод для 7 задачи:

        SmartDevice lamp = new SmartDevice("Умная лампа");


        System.out.println("\n Начальный статус:");
        lamp.displayStatus();


        System.out.println("\n Переключаем питание:");
        lamp.togglePower();
        lamp.displayStatus();


        System.out.println("\n Ещё раз переключаем:");
        lamp.togglePower();
        lamp.displayStatus();


// Вывод для 8 задачи:

        Order order1 = new Order("A123", 5000);
        Order order2 = new Order("B456", 12000);
        Order order3 = new Order("C789", 8000);


        System.out.println("\n Заказ 1:");
        order1.displayOrder(10, 5);

        System.out.println("\n Заказ 2:");
        order2.displayOrder(15, 10);

        System.out.println("\n Заказ 3:");
        order3.displayOrder(8, 3);

    }
}