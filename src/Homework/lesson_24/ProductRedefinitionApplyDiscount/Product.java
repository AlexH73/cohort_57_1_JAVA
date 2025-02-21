package Homework.lesson_24.ProductRedefinitionApplyDiscount;
/*// TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
// 1. `Product` (базовый класс) содержит `name` и `price`.
// 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
// 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.
class Product {
    private String name;
    private double price;
}
Инструкции
Создайте классы с использованием наследования (extends), избегая дублирования кода.
Переопределите методы, добавляя специфичное поведение в подклассы.
Используйте super в переопределённых методах, чтобы сохранить функциональность родительского класса.
Постройте многоуровневую иерархию, добавляя новые свойства и методы на каждом уровне.
🚀 После выполнения этого задания вы освоите ключевые концепции наследования в Java!*/

// 1. `Product` (базовый класс) содержит `name` и `price`.
public class Product {
    //Базовый класс Product содержит name и price
    private String name;
    protected double price;     //Поменяем Private на Protected,чтобы подклассы могли изменять

    //Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //Метод для получения текущей цены (гетт)
    public double getPrice() {
        return price;
    }
    //Метод для применения скидки (в базовом классе ничего не делает)
    public void applyDiscount() {
        System.out.println("Скидка не применяется.");
    }
    //Метод для отображения информации о товаре
    public void displayInfo() {
        System.out.println("Товар: " + name + ", Цена: " + price + " $");
    }


}
