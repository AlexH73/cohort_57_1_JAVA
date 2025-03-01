package Homerwork.Practica.Practica25;
/*4. Практика
// TODO: Создать класс User
// 1. Добавить поля:
//    - `username` (String) - Логин пользователя
//    - `email` (String) - Электронная почта
//    - `age` (int) - Возраст пользователя
// 2. Создать конструктор, который принимает все три параметра.
// 3. Реализовать метод `displayUserInfo()`, который выводит информацию о пользователе.

class User {
// TODO: Определить поля

    // TODO: Реализовать конструктор

    // TODO: Реализовать метод displayUserInfo()
}
Copy
// TODO: Создать класс BankAccount
// 1. Добавить поля:
//    - `accountNumber` (String) - Номер банковского счета
//    - `balance` (double) - Баланс счета
// 2. Создать конструктор, который принимает `accountNumber` и начальный баланс.
// 3. Реализовать методы:
//    - `deposit(double amount)`, который увеличивает баланс на указанную сумму.
//    - `withdraw(double amount)`, который уменьшает баланс, если средств достаточно.

class BankAccount {
// TODO: Определить поля

    // TODO: Реализовать конструктор

    // TODO: Реализовать метод deposit(double amount)

    // TODO: Реализовать метод withdraw(double amount)
}
Copy
// TODO: Создать класс Product
// 1. Добавить поля:
//    - `name` (String) - Название продукта
//    - `price` (double) - Цена продукта
//    - `stock` (int) - Количество на складе
// 2. Создать конструктор, принимающий все три параметра.
// 3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
//    - `restock(int quantity)`, который увеличивает `stock`.

class Product {
// TODO: Определить поля

    // TODO: Реализовать конструктор

    // TODO: Реализовать метод sell(int quantity)

    // TODO: Реализовать метод restock(int quantity)
}
Copy
// TODO: Создать класс SmartDevice
// 1. Добавить поля:
//    - `deviceName` (String) - Название устройства
//    - `isOn` (boolean) - Включено ли устройство
// 2. Создать конструктор, принимающий `deviceName`, который устанавливает `isOn` в `false`.
// 3. Реализовать методы:
//    - `turnOn()`, который включает устройство (`isOn = true`).
//    - `turnOff()`, который выключает устройство (`isOn = false`).
//    - `displayStatus()`, который выводит текущее состояние устройства.

class SmartDevice {
// TODO: Определить поля

    // TODO: Реализовать конструктор

    // TODO: Реализовать метод turnOn()

    // TODO: Реализовать метод turnOff()

    // TODO: Реализовать метод displayStatus()
}
Copy
// TODO: Создать класс Order
// 1. Добавить поля:
//    - `orderId` (int) - Уникальный идентификатор заказа
//    - `customerName` (String) - Имя покупателя
//    - `totalAmount` (double) - Сумма заказа
//    - `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
// 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.
// 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
//    - `displayOrder()`, который выводит информацию о заказе.

class Order {
// TODO: Определить поля

    // TODO: Реализовать конструктор

    // TODO: Реализовать метод updateStatus(String newStatus)

    // TODO: Реализовать метод displayOrder()
}*/
public class Practica_24 {
    /*Задание: Наследование в интернет-магазине
        🔹 В этом задании вам нужно создать иерархию классов, моделирующую систему товаров в интернет-магазине.
        🔹 Шаг 1: Создать базовый класс Product, который содержит общие свойства товара.
        🔹 Шаг 2: Создать подклассы Electronics, Clothing и Grocery, добавляя уникальные характеристики.
        🔹 Шаг 3: Переопределить метод applyDiscount() в каждом подклассе.

        Шаг 1: Создание базового класса Product
        ✔ Поля name (название товара) и price (цена).
        ✔ Метод applyDiscount(), который выводит "Скидка пока не применяется.".

        Шаг 2: Создание подклассов Electronics, Clothing, Grocery
        ✔ Electronics – добавляет warranty (гарантия в годах).
        ✔ Clothing – добавляет size (размер) и color (цвет).
        ✔ Grocery – добавляет expirationDate (срок годности).

        Шаг 3: Переопределение метода applyDiscount()
        ✔ У Electronics метод applyDiscount() снижает цену на 10%.
        ✔ У Clothing метод applyDiscount() снижает цену на 20%, если сезон распродаж.
        ✔ У Grocery метод applyDiscount() снижает цену на 50%, если срок годности скоро истекает.

        🚀 Дополнительно:
        ✔ Использовать super.applyDiscount(), чтобы сначала вызывался метод родительского класса.
        ✔ Создать массив Product[], добавить туда товары разных типов и применить к ним скидки.*/
    public static class Practica_244 {
    }
}
