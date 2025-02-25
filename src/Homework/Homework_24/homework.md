<details style="padding-top: 18px">
  <summary><b>Homework: Inheritance in Java</b></summary>

## **Task: Implement Inheritance in Real-Life Scenarios**

### **Exercise Goals**
✔️ Learn to use **inheritance** to create a structured class hierarchy.  
✔️ Understand how to **avoid code duplication** and improve reusability.  
✔️ Learn how to **override methods** and use **`super`** to call parent class behavior.  
✔️ Implement **multilevel inheritance**, adding new functionality at each level.

---

## **Part 1: Basic Inheritance – Creating a Class Hierarchy**
🔹 In the first two exercises, create a **base class** and **inherit from it**.  
🔹 Each subclass should extend functionality by **adding new fields and methods**.

```java
// TODO: Create a base class `Animal` with fields `name` and `age`.
// 1. Implement a method `makeSound()` that prints a generic sound.
// 2. Create a subclass `Dog` that overrides `makeSound()` and prints "Bark!".
class Animal {
    private String name;
    private int age;
}
```

---

```java
// TODO: Create a base class `Vehicle` with fields `speed` and `capacity`.
// 1. Implement a method `move()` that prints "The vehicle is moving."
// 2. Create a subclass `Car` that overrides `move()` and prints "The car is driving."
class Vehicle {
    private int speed;
    private int capacity;
}
```

---

## **Part 2: Implementing Multilevel Inheritance**
🔹 In the following exercises, build a **chain of inheritance**, where each class extends the previous one.  
🔹 The final class should **combine functionalities** from all previous levels.

```java
// TODO: Implement a user hierarchy for an online learning platform.
// 1. `User` (base class) contains `username` and `email` fields.
// 2. `Student` extends `User` and adds `studentId`.
// 3. `PremiumStudent` extends `Student` and adds `membershipLevel`.
class User {
    private String username;
    private String email;
}
```

---

```java
// TODO: Implement a payment system hierarchy.
// 1. `PaymentMethod` (base class) contains `accountNumber` and `balance` fields.
// 2. `CreditCard` extends `PaymentMethod` and adds `creditLimit`.
// 3. `GoldCreditCard` extends `CreditCard` and adds `cashbackPercentage`.
class PaymentMethod {
    private String accountNumber;
    private double balance;
}
```

---

## **Part 3: Overriding Methods and Using `super`**
🔹 In these exercises, you need to **override methods** in child classes and use **`super`** to call the parent class method.

```java
// TODO: Override the `work()` method in subclasses and use `super`.
// 1. `Employee` (base class) has a `work()` method that prints "The employee is working."
// 2. `Manager` overrides `work()` and adds "Conducting meetings."
// 3. `Developer` overrides `work()` and adds "Writing code."
class Employee {
    private String name;
    private String position;
}
```

---

```java
// TODO: Override the `applyDiscount()` method and use `super.applyDiscount()`.
// 1. `Product` (base class) contains `name` and `price` fields.
// 2. `Electronics` overrides `applyDiscount()` to reduce the price by 10%.
// 3. `Clothing` overrides `applyDiscount()` to reduce the price by 20% if it's a seasonal sale.
class Product {
    private String name;
    private double price;
}
```

---

## **Instructions**
1. **Create classes** using **inheritance (`extends`)**, avoiding code duplication.
2. **Override methods**, adding specific behavior to subclasses.
3. **Use `super`** in overridden methods to retain parent class functionality.
4. **Build a multilevel hierarchy**, adding new properties and methods at each level.

🚀 **By completing this assignment, you will master key concepts of inheritance in Java!**
</details>

-----

<details style="padding-top: 18px">
  <summary><b>Домашнее задание: Наследование в Java</b></summary>

## **Задание: Реализация наследования в реальных сценариях**

### **Цели упражнения**
✔️ Научиться использовать **наследование** для создания логичной структуры классов.  
✔️ Понять, как **избежать дублирования кода** и **повысить его переиспользуемость**.  
✔️ Научиться **переопределять методы** и использовать **`super`** для вызова родительского поведения.  
✔️ Реализовать **многоуровневое наследование**, добавляя новый функционал на каждом уровне.

---

## **Часть 1: Базовое наследование – создание иерархии классов**
🔹 В первых двух заданиях необходимо создать **базовый класс** и **унаследовать от него**.  
🔹 Каждый подкласс должен расширять функциональность, добавляя **новые поля и методы**.

```java
// TODO: Создать базовый класс `Animal` с полями `name` и `age`.
// 1. Реализовать метод `makeSound()`, который выводит общий звук.
// 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".
class Animal {
    private String name;
    private int age;
}
```

---

```java
// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."
class Vehicle {
    private int speed;
    private int capacity;
}
```

---

## **Часть 2: Реализация многоуровневого наследования**
🔹 В следующих заданиях нужно построить **цепочку наследования**, где каждый класс расширяет предыдущий.  
🔹 Финальный класс должен **объединять функциональность** всех предыдущих уровней.

```java
// TODO: Реализовать иерархию пользователей в онлайн-обучении.
// 1. `User` (базовый класс) содержит `username` и `email`.
// 2. `Student` наследует `User` и добавляет `studentId`.
// 3. `PremiumStudent` наследует `Student` и добавляет `membershipLevel`.
class User {
    private String username;
    private String email;
}
```

---

```java
// TODO: Реализовать иерархию платежных систем.
// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.
class PaymentMethod {
    private String accountNumber;
    private double balance;
}
```

---

## **Часть 3: Переопределение методов и использование `super`**
🔹 В этих заданиях вам нужно **переопределить методы** в дочерних классах и использовать **`super`** для вызова метода родительского класса.

```java
// TODO: Переопределить метод `work()` в подклассах и использовать `super`.
// 1. `Employee` (базовый класс) содержит `work()`, который выводит "Работник выполняет свою работу."
// 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи."
// 3. `Developer` переопределяет `work()` и добавляет "Пишет код."
class Employee {
    private String name;
    private String position;
}
```

---

```java
// TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
// 1. `Product` (базовый класс) содержит `name` и `price`.
// 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
// 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.
class Product {
    private String name;
    private double price;
}
```

---

## **Инструкции**
1. **Создайте классы** с использованием **наследования (`extends`)**, избегая дублирования кода.
2. **Переопределите методы**, добавляя специфичное поведение в подклассы.
3. **Используйте `super`** в переопределённых методах, чтобы сохранить функциональность родительского класса.
4. **Постройте многоуровневую иерархию**, добавляя новые свойства и методы на каждом уровне.

🚀 **После выполнения этого задания вы освоите ключевые концепции наследования в Java!**
</details>