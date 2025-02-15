package Homework.lesson_24.HomeworkYulia_24;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3);
        dog.makeSound();

        GoldCreditCard gcc = new GoldCreditCard("234",12,211,2);
        String account_number = gcc.getAccountNumber();
        System.out.println(account_number);

        Employee employee = new Employee("Иван Иванович Иванов","Пример");
        Developer developer = new Developer("Марат","Разработчик");
        Manager manager = new Manager("Фёдор","Мэнеджер");

        employee.work();
        developer.work();
        manager.work();

        Vehicle vehicle = new Vehicle(200,30);
        Car car = new Car(150, 50);

        vehicle.move();
        car.move();

        Product laptop = new Electronics("Ноутбук", 50000);
        Product tShirt = new Clothing("Футболка", 2000, true);

        laptop.applyDiscount(10);
        tShirt.applyDiscount(15);

        System.out.println("новая цена: " + laptop.getPrice());
        System.out.println("новая цена: " + tShirt.getPrice());
    }
}

