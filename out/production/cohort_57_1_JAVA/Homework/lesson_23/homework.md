<details style="padding-top: 18px">
  <summary><b>Homework: Encapsulation in Java</b></summary>

## **Task: Implement Encapsulation in Real-Life Scenarios**

### **Exercise Goals**
✔️ Learn to use **encapsulation** to protect object data.  
✔️ Understand how to **restrict access** to fields using access modifiers.  
✔️ Apply **getters, setters, and validation** to ensure data integrity.  
✔️ Use **private methods** for internal logic.

---

## **Part 1: Restricting Direct Access with `private` Fields**
🔹 In the first two classes, you need to **make fields private** and create only **getters** to retrieve their values.  
🔹 These fields should **not have setters**, meaning they are read-only once initialized.

---

```java
// TODO: Make fields private and provide only getters (no setters).
class Passport {
    private String passportNumber;
    private String holderName;
}
```

---

```java
// TODO: Make fields private and provide only getters (no setters).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;
}
```

---

## **Part 2: Implementing Controlled Access with Getters and Setters**
🔹 In these classes, you need to **use private fields** and allow modifications only through **validated setters**.

---

```java
// TODO: Implement getters and setters with validation.
// 1. `grade` must be between 0 and 100.
// 2. `subject` cannot be empty or null.
class StudentGrade {
    private String subject;
    private int grade;
}
```

---

```java
// TODO: Implement getters and setters with validation.
// 1. The `seatsAvailable` cannot be negative.
// 2. The `destination` cannot be empty.
class TrainTicket {
    private String destination;
    private int seatsAvailable;
}
```

---

```java
// TODO: Implement getters and setters with validation.
// 1. The `temperature` must be between -50 and 50 degrees.
// 2. The `feelsLike` temperature cannot be higher than `temperature`.
class WeatherForecast {
    private double temperature;
    private double feelsLike;
}
```

---

## **Part 3: Encapsulation with Private Methods**
🔹 In the following class, use a **private method** to validate changes inside the class.  
🔹 The private method should **only be called within the class** to ensure data consistency.

---

```java
// TODO: Implement private methods for validation inside the class.
// 1. `setDiscountPercentage()` should allow only values between 0 and 50%.
// 2. The private method `validateDiscount()` should be used inside the setter.
class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;
}
```

---

## **Instructions**
1. **Modify each class** to use **proper encapsulation** (`private` fields).
2. **Decide whether a field needs a setter** (some fields should be read-only).
3. **Validate setters** to prevent incorrect values from being assigned.
4. **Use private methods** where needed for validation logic.

</details>

--------

<details style="padding-top: 18px">
  <summary><b>Домашнее задание: Инкапсуляция в Java</b></summary>

## **Задание: Реализация инкапсуляции в реальных сценариях**

### **Цели упражнения**
✔️ Научиться использовать **инкапсуляцию** для защиты данных объекта.  
✔️ Понять, как **ограничить доступ** к полям с помощью модификаторов доступа.  
✔️ Реализовать **геттеры, сеттеры и валидацию** для обеспечения корректности данных.  
✔️ Использовать **приватные методы** для внутренней логики.

---

## **Часть 1: Ограничение прямого доступа с помощью `private` полей**
🔹 В первых двух классах вам нужно **сделать поля приватными** и создать только **геттеры** для их получения.  
🔹 У этих полей **не должно быть сеттеров**, то есть они доступны только для чтения после инициализации.

---

```java
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class Passport {
    private String passportNumber;
    private String holderName;
}
```

---

```java
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;
}
```

---

## **Часть 2: Реализация контролируемого доступа через геттеры и сеттеры**
🔹 В этих классах необходимо **использовать приватные поля** и разрешить их изменение только через **валидированные сеттеры**.

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `grade` должно быть в диапазоне от 0 до 100.
// 2. `subject` не может быть пустым или null.
class StudentGrade {
    private String subject;
    private int grade;
}
```

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `seatsAvailable` не может быть отрицательным.
// 2. `destination` не может быть пустым.
class TrainTicket {
    private String destination;
    private int seatsAvailable;
}
```

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `temperature` должно быть в диапазоне от -50 до 50 градусов.
// 2. `feelsLike` не может быть выше, чем `temperature`.
class WeatherForecast {
    private double temperature;
    private double feelsLike;
}
```

---

## **Часть 3: Инкапсуляция с приватными методами**
🔹 В следующем классе используйте **приватный метод** для проверки значений внутри класса.  
🔹 Приватный метод должен **вызываться только внутри класса**, обеспечивая консистентность данных.

---

```java
// TODO: Реализовать приватные методы для валидации внутри класса.
// 1. `setDiscountPercentage()` должен принимать только значения от 0 до 50%.
// 2. Приватный метод `validateDiscount()` должен использоваться внутри сеттера.
class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;
}
```

---

## **Инструкции**
1. **Измените каждый класс**, применяя **инкапсуляцию** (`private` поля).
2. **Определите, нужно ли использовать сеттер** (некоторые поля должны быть только для чтения).
3. **Добавьте валидацию в сеттерах**, чтобы предотвратить некорректные значения.
4. **Используйте приватные методы** там, где это необходимо для валидации.

🚀 **После выполнения этого задания вы глубже разберётесь в инкапсуляции в Java!**
</details>