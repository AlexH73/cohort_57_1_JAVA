<details style="padding-top: 18px">
  <summary><b>Lesson 23: OOP Principles.</b></summary>

<details style="padding-top: 18px">
  <summary><b>Lesson 23: OOP Principles. Encapsulation</b></summary>

<details style="padding-top: 18px">
  <summary>1. What is Encapsulation?</summary>

## **What is Encapsulation?**

### **Definition and Importance of Encapsulation**

🔹 **Encapsulation** is one of the key principles of OOP, which means **hiding internal object data** and **restricting
access to it**.

The main goals of encapsulation:  
✔️ **Data Protection** – preventing direct modification of important object fields.  
✔️ **Access Control** – data can only be changed through methods.  
✔️ **Code Flexibility** – internal logic can be modified without affecting other parts of the code.

**Example without encapsulation (bad practice):**

```java
class Homework.lesson_23.Bank {
    String owner;
    double balance;
}
```

Here, **balance** is public and can be changed from outside without restrictions:

```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.balance =-1000; // Error: Can set a negative balance!
```

To prevent such issues, we use **encapsulation**.

### **Analogy: File Access on a Computer**

Imagine your computer is a **class**, and the files on it have **different access levels**:

| **Modifier** | **Analogy on a Computer**                                 | **Who Can Open the File?**          |
|--------------|-----------------------------------------------------------|-------------------------------------|
| `private`    | **Personal documents**                                    | Only the computer owner             |
| `default`    | **Work files in a local network**                         | Only colleagues in the same network |
| `protected`  | **Shared folder with a password**                         | Family members or selected users    |
| `public`     | **File on the internet (Google Docs with public access)** | Anyone on the internet              |

🔹 **Examples:**

- **`private`** – Your personal diary, which no one can open without a password.
- **`default`** – Files in an office network, accessible only to employees.
- **`protected`** – Family photos in the cloud, available only with a password.
- **`public`** – An open article on the internet, accessible to everyone.

### **Protecting Data with Access Modifiers**

In Java, **access modifiers** are used for encapsulation, controlling which parts of the code can interact with an
object's fields and methods.

| **Modifier** | **Accessible Inside Class** | **Accessible Inside Package** | **Accessible in Subclasses** | **Accessible in Other Classes** |
|--------------|-----------------------------|-------------------------------|------------------------------|---------------------------------|
| `private`    | ✅ Yes                       | ❌ No                          | ❌ No                         | ❌ No                            |
| `default`    | ✅ Yes                       | ✅ Yes                         | ❌ No                         | ❌ No                            |
| `protected`  | ✅ Yes                       | ✅ Yes                         | ✅ Yes                        | ❌ No                            |
| `public`     | ✅ Yes                       | ✅ Yes                         | ✅ Yes                        | ✅ Yes                           |

**How to properly protect data?**  
✔️ Use `private` for fields (so they cannot be modified directly).  
✔️ Provide access to data via **getters and setters**.  
✔️ Allow modifications only through methods with validation.

Example of **data encapsulation** in the `Homework.lesson_23.Bank` class:

```java
class Homework.lesson_23.Bank {
    private String owner;
    private double balance;

    public Homework.lesson_23.Bank(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Balance cannot be negative. Set to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
```

Now, `balance` cannot be modified directly:

```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank("Alice", 500);
account.

deposit(200);
account.

withdraw(1000); // Error: Insufficient funds
```

---

### **Real-World Analogy: Homework.lesson_23.Bank Account**

Imagine you have a **bank account**.

- You **cannot** simply set the balance by writing `balance = 100000;`
- The balance can **increase** only through deposits.
- The balance can **decrease** only through withdrawals.
- You cannot go into negative balance unless the bank allows overdrafts.

🔹 **The `Homework.lesson_23.Bank` class works the same way!** It hides `balance` and allows access to it **only through methods**
that validate operations.

## **Summary**

✅ **Encapsulation** protects data and controls access to it.  
✅ Class fields should be `private`, and access to them should be provided through methods.  
✅ **Analogy** – a bank account: access to the balance is only possible through transactions.

</details>

--------

<details style="padding-top: 18px">
  <summary>2. Access Modifiers in Java</summary>

## **Access Modifiers in Java**

### **What Are Access Modifiers?**
🔹 **Access modifiers** are keywords in Java that define **the level of visibility and accessibility** of classes, methods, and fields in a program.

**Why are they important?**  
✔️ Allow **control over data access**.  
✔️ Protect **internal class logic** from misuse.  
✔️ Improve **code structure and readability**.

Java provides **four main access modifiers**:

| **Modifier**  | **Visible Inside Class** | **Visible in Package** | **Visible in Subclasses** | **Visible in Other Classes** |
|--------------|----------------------|----------------------|----------------------|----------------------|
| `private`    | ✅ Yes | ❌ No | ❌ No | ❌ No |
| `default` (no modifier) | ✅ Yes | ✅ Yes | ❌ No | ❌ No |
| `protected`  | ✅ Yes | ✅ Yes | ✅ Yes | ❌ No |
| `public`     | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |

---

### **Explanation of Modifiers with Examples**

#### **1. `private` – Full Control Inside the Class**
🔹 **Accessible only within the class itself**.  
🔹 Completely **hides data** from other classes.  
🔹 Used to **protect important data**, such as passwords or account balances.

**Example:**
```java
class User {
    private String password;

    public User(String password) {
        this.password = password;
    }

    private void encryptPassword() {
        System.out.println("Encrypting password...");
    }
}
```

**❌ Error: You cannot access `password` or call `encryptPassword()` from another class.**

---

#### **2. `default` (package-private) – Access Within the Same Package**
🔹 **Accessible within the same package**, but **not in other packages**.  
🔹 If **no modifier is specified**, `default` is used.  
🔹 Useful for classes that should interact **only within a module**.

**Example:**
```java
class PackageClass {
    String message = "Accessible only within this package!";
}
```

If another class **in the same package** tries to access `message`, it will work:  
```java
PackageClass obj = new PackageClass();
System.out.println(obj.message); // Works!
```

However, if the class is in **a different package**, access **will not be allowed**.

---

#### **3. `protected` – Access in Package + Inheritance**
🔹 Accessible to **all classes in the package** + **subclasses in other packages**.  
🔹 Allows **protected inheritance**: data is hidden from others but available to child classes.

**Example:**
```java
class Parent {
    protected String familySecret = "Family secret";
}
```

```java
class Child extends Parent {
    void revealSecret() {
        System.out.println(familySecret); // Works!
    }
}
```

If `Child` is in **a different package** but **inherits from Parent**, it can access `protected` fields.

---

#### **4. `public` – Full Access Anywhere**
🔹 **Accessible in any class and package**.  
🔹 Used for **public APIs and interfaces** that should be available everywhere.

**Example:**
```java
public class PublicClass {
public String greeting = "Hello, world!";
}
```

Any code can access `greeting`:  
```java
PublicClass obj = new PublicClass();
System.out.println(obj.greeting); // Works!
```

---

### **When and Why to Use Each Modifier?**

| **Modifier**  | **When to Use?** |
|--------------|--------------------------|
| `private`    | For **hidden data**, such as passwords, balances, internal methods. |
| `default`    | When a class or method **should not be visible outside the package**. |
| `protected`  | When you need to **allow subclass access** but hide from others. |
| `public`     | When **a method or class should be accessible to everyone** (e.g., API). |

---

## **Summary**
✅ **Access modifiers** manage data visibility in Java.  
✅ **`private`** protects data inside the class.  
✅ **`default`** works only within the same package.  
✅ **`protected`** is accessible to subclasses, even in other packages.  
✅ **`public`** allows unrestricted access everywhere.

🚀 **Next, we'll practice choosing the right access modifiers for various classes!**


<details style="padding-top: 18px">
  <summary>Practice</summary>

### **Task: Choose the Right Access Modifiers**

Below are several classes with fields that currently have no access modifiers.  
Your task is to **assign appropriate modifiers (`public`, `private`, `protected`)** based on logic and encapsulation
principles.

---

```java
// TODO: Assign access modifiers to the fields based on best practices.

class UserAccount {
    String username;
    String password;
    String email;
    int age;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class Homework.lesson_23.Bank {
    String accountNumber;
    double balance;
    String ownerName;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class Product {
    String name;
    double price;
    int stock;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class Car {
    String brand;
    String model;
    int speed;
    double fuelLevel;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class LibraryBook {
    String title;
    String author;
    boolean isAvailable;
    String borrowerName;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class Order {
    int orderId;
    String customerName;
    double totalAmount;
    String status;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class Flight {
    String flightNumber;
    String destination;
    int availableSeats;
    String departureTime;
}
```

---

```java
// TODO: Assign access modifiers to the fields.

class ChatMessage {
    String sender;
    String receiver;
    String text;
    String timestamp;
}
```

---

### **Instructions:**

1. Review the fields in each class and decide which ones should be **`private`**, **`protected`**, or **`public`**.
2. Consider **which fields should be hidden (private)** and which should remain accessible.
3. Modify the classes accordingly.

🚀 **This exercise will help you understand how to properly encapsulate data in Java!**
</details>
</details>

--------

<details style="padding-top: 18px">
  <summary><b>3. Getters and Setters</b></summary>

## **Getters and Setters in Java**

### **Why is Direct Access to Fields Bad Practice?**

🔹 **Direct access to fields (`public`) breaks encapsulation** and allows uncontrolled modifications.  
🔹 If fields are public, **any class can change them without restrictions**, leading to potential errors.  
🔹 Getters and setters **allow validation** before changing field values.

**Example of Bad Practice (No Encapsulation):**  
```java
class Homework.lesson_23.Bank {
    public double balance;
}
```

Here, any class can modify `balance` without control:  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.balance = -1000; // ❌ Incorrect! The balance should not be negative.
```

To avoid such problems, **we use getters and setters**.

---

### **Implementing Getters and Setters**

🔹 **Getter (`get`)** – a method that allows reading the value of a private field.  
🔹 **Setter (`set`)** – a method that allows modifying the value with validation.

**Example: Correct Implementation Using Getters and Setters**  
```java
class Homework.lesson_23.Bank {
private double balance;

    public double getBalance() { // Getter
        return balance;
    }

    public void setBalance(double balance) { // Setter
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("❌ Balance cannot be negative!");
        }
    }
}
```

Now, an external class **cannot** modify `balance` directly but can use `setBalance()`, which includes validation.

**Usage:**  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.setBalance(500);  // ✅ Correct
account.setBalance(-100); // ❌ Will print "Balance cannot be negative!"
System.out.println(account.getBalance()); // Prints 500
```



### **Example: `Homework.lesson_23.Bank` with Controlled Balance Modification**

A more advanced example where we also add `deposit()` and `withdraw()` methods.

```java
class Homework.lesson_23.Bank {
private double balance;

    public Homework.lesson_23.Bank(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("❌ Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    public double getBalance() { // Getter
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient funds or invalid amount.");
        }
    }
}
```

**Usage:**  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank(100);
account.deposit(50);
account.withdraw(200); // ❌ Insufficient funds
System.out.println("Balance: " + account.getBalance()); // ✅ 150
```

---

## **Summary**
✅ **Getters** allow reading private fields safely.  
✅ **Setters** validate data before modifying fields.  
✅ Encapsulation prevents **direct field modification**, reducing errors.

</details>

-------

<details style="padding-top: 18px">
  <summary><b>4. Practice: Getters, Setters, and `this`</b></summary>

## **Task: Implement Getters and Setters**

### **Exercise Goals**
✔️ Learn to use **getters and setters** to access private fields.  
✔️ Understand how **validation** in setters helps protect data.  
✔️ Practice using **the `this` keyword** to distinguish local variables from class fields.

---

### **Part 1: Basic Getters and Setters**
🔹 In the first two classes, you need to **implement simple getters and setters** without validation.

---

```java
// TODO: Add getters and setters for all fields.
class Book {
    private String title;
    private String author;
    private int pages;
}
```

---

```java
// TODO: Add getters and setters for all fields.
class User {
    private String username;
    private String email;
    private int age;
}
```

---

### **Part 2: Getters, Setters, and Validation**
🔹 In the next classes, you need to **implement getters and setters with validation**.

---

```java
// TODO: Implement getters and setters with validation.
// 1. The `balance` field cannot be negative.
// 2. The `accountNumber` field should not be changed after the object is created.
class Homework.lesson_23.Bank {
    private String accountNumber;
    private double balance;
}
```

---

```java
// TODO: Implement getters and setters with validation.
// 1. The `temperature` field must be within the range of -100 to 100 degrees.
// 2. The `condition` field can only be "Sunny", "Rainy", "Cloudy", or "Snowy".
class WeatherReport {
    private double temperature;
    private String condition;
}
```

---

```java
// TODO: Implement getters and setters with validation.
// 1. The `rating` field must be between 1 and 5.
// 2. The `reviewText` field cannot be empty.
class ProductReview {
    private String productName;
    private int rating;
    private String reviewText;
}
```

---

## **Instructions**
1. **Add getters and setters** in each class.
2. **In the first two classes (`Book`, `User`), getters and setters should simply return and set values.**
3. **In the other classes (`Homework.lesson_23.Bank`, `WeatherReport`, `ProductReview`), add validation in setters.**
4. Use **`this`** in setters to differentiate local variables from class fields.

</details>

</details>
</details>


---------

<details style="padding-top: 18px">
  <summary><b>Урок 23: Принципы ООП </b></summary>

<details style="padding-top: 18px">
  <summary><b>Урок 23: Принципы ООП. Инкапсуляция </b></summary>

<details style="padding-top: 18px">
  <summary><b>1. Что такое инкапсуляция? </b></summary>

## **Что такое инкапсуляция?**

### **Определение и важность инкапсуляции**

🔹 **Инкапсуляция** – это один из ключевых принципов ООП, который означает **скрытие внутренних данных объекта** и *
*ограничение доступа к ним**.

Основные цели инкапсуляции:  
✔️ **Защита данных** – исключение прямого изменения важных полей объекта.  
✔️ **Контроль доступа** – изменение данных происходит только через методы.  
✔️ **Гибкость кода** – можно менять внутреннюю логику класса без влияния на остальной код.

**Пример без инкапсуляции (плохая практика):**

```java
class Homework.lesson_23.Bank {
    String owner;
    double balance;
}
```

Здесь **balance** открыт, и его можно изменить извне без ограничений:

```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.balance =-1000; // Ошибка: можно установить отрицательный баланс!
```

Чтобы избежать таких проблем, используют **инкапсуляцию**.

### **Аналогия: Доступ к файлам на компьютере**

Представьте, что ваш компьютер — это **класс**, а файлы на нём имеют **разные уровни доступа**:

| **Модификатор** | **Аналогия в компьютере**                              | **Кто может открыть файл?**                |
|-----------------|--------------------------------------------------------|--------------------------------------------|
| `private`       | **Личные документы**                                   | Только владелец компьютера                 |
| `default`       | **Рабочие файлы в локальной сети**                     | Только коллеги в одной сети                |
| `protected`     | **Общий диск с паролем**                               | Доступен семье или избранным пользователям |
| `public`        | **Файл в интернете (Google Docs с открытым доступом)** | Любой пользователь сети                    |

🔹 **Примеры:**

- **`private`** – ваш личный дневник, который никто не может открыть без пароля.
- **`default`** – файлы в офисной сети, доступные только сотрудникам компании.
- **`protected`** – семейные фото в облаке, доступные только по паролю.
- **`public`** – открытая статья в интернете, доступная всем.

### **Защита данных с помощью модификаторов доступа**

В Java для инкапсуляции используются **модификаторы доступа**, которые контролируют, какие части кода могут
взаимодействовать с полями и методами объекта.

| **Модификатор** | **Доступен внутри класса** | **Доступен внутри пакета** | **Доступен в подклассах** | **Доступен в других классах** |
|-----------------|----------------------------|----------------------------|---------------------------|-------------------------------|
| `private`       | ✅ Да                       | ❌ Нет                      | ❌ Нет                     | ❌ Нет                         |
| `default`       | ✅ Да                       | ✅ Да                       | ❌ Нет                     | ❌ Нет                         |
| `protected`     | ✅ Да                       | ✅ Да                       | ✅ Да                      | ❌ Нет                         |
| `public`        | ✅ Да                       | ✅ Да                       | ✅ Да                      | ✅ Да                          |

**Как правильно защитить данные?**  
✔️ Использовать `private` для полей (чтобы нельзя было изменить их напрямую).  
✔️ Доступ к данным делать через **геттеры и сеттеры**.  
✔️ Разрешать изменение данных только через методы с проверками.

Пример **инкапсуляции данных** в классе `Homework.lesson_23.Bank`:

```java
class Homework.lesson_23.Bank {
    private String owner;
    private double balance;

    public Homework.lesson_23.Bank(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Баланс не может быть отрицательным. Установлено 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Баланс пополнен на " + amount);
        } else {
            System.out.println("Сумма для пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято " + amount);
        } else {
            System.out.println("Недостаточно средств или некорректная сумма.");
        }
    }

}
```

Теперь нельзя просто так изменить `balance`:

```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank("Alice", 500);
account.

deposit(200);
account.

withdraw(1000); // Ошибка: недостаточно средств
```

---

### **Аналогия из реального мира: банковский счёт**

Представьте, что у вас есть **банковский счёт**.

- Вы **не можете** просто так изменить баланс, написав `balance = 100000;`
- Баланс можно **увеличить** только через пополнение.
- Баланс можно **уменьшить** только через снятие.
- Нельзя уйти в минус, если банк не разрешает овердрафт.

🔹 **Класс `Homework.lesson_23.Bank` работает так же!** Он скрывает `balance` и даёт доступ к нему **только через методы**, которые
проверяют, можно ли выполнить операцию.

---

## **Вывод**

✅ **Инкапсуляция** защищает данные и контролирует доступ к ним.  
✅ Поля класса делают `private`, а доступ к ним организуют через методы.  
✅ **Аналогия** – банковский счёт: доступ к балансу возможен только через операции.

</details>



--------

<details style="padding-top: 18px">
  <summary><b>2. Модификаторы доступа в Java </b></summary>

## **Модификаторы доступа в Java**

### **Что такое модификаторы доступа?**

🔹 **Модификаторы доступа** (Access Modifiers) – это ключевые слова в Java, которые определяют **уровень видимости и
доступности** классов, методов и полей внутри программы.

**Почему это важно?**  
✔️ Позволяют **контролировать доступ** к данным.  
✔️ Защищают **внутреннюю логику** класса от неправильного использования.  
✔️ Улучшают **структуру и читаемость кода**.

В Java есть **4 основных модификатора доступа**:

| **Модификатор**              | **Видимость в классе** | **Видимость в пакете** | **Видимость в подклассах** | **Видимость в других классах** |
|------------------------------|------------------------|------------------------|----------------------------|--------------------------------|
| `private`                    | ✅ Да                   | ❌ Нет                  | ❌ Нет                      | ❌ Нет                          |
| `default` (без модификатора) | ✅ Да                   | ✅ Да                   | ❌ Нет                      | ❌ Нет                          |
| `protected`                  | ✅ Да                   | ✅ Да                   | ✅ Да                       | ❌ Нет                          |
| `public`                     | ✅ Да                   | ✅ Да                   | ✅ Да                       | ✅ Да                           |

---

### **Разбор модификаторов с примерами**

#### **1. `private` – Полный контроль внутри класса**

🔹 **Доступен только внутри самого класса**.  
🔹 Полностью **скрывает данные** от других классов.  
🔹 Используется для **защиты важных данных**, например, пароля или баланса.

**Пример:**
```java
class User {
private String password;

    public User(String password) {
        this.password = password;
    }

    private void encryptPassword() { 
        System.out.println("Шифрование пароля...");
    }

}
```

**❌ Ошибка: нельзя получить доступ к `password` или вызвать `encryptPassword()` из другого класса.**

---

#### **2. `default` (package-private) – Доступ в рамках пакета**

🔹 **Доступен внутри того же пакета**, но **не доступен в других пакетах**.  
🔹 Если **не указан модификатор**, по умолчанию используется `default`.  
🔹 Полезен для классов, которые должны взаимодействовать внутри одного модуля.

**Пример:**
```java
class PackageClass {
    String message = "Доступен только в этом пакете!";
}
```

Если другой класс из **того же пакета** попытается обратиться к `message`, он сможет это сделать:  
```java
PackageClass obj = new PackageClass();
System.out.println(obj.message); // Работает!
```

Но если класс находится **в другом пакете**, он **не сможет получить доступ**.

---

#### **3. `protected` – Доступ в пакете + наследование**

🔹 Доступен **всем классам внутри пакета** + **наследникам в других пакетах**.  
🔹 Позволяет **защищённое наследование**: данные скрыты от всех, кроме дочерних классов.

**Пример:**
```java
class Parent {
    protected String familySecret = "Секрет семьи";
}
```

```java
class Child extends Parent {
    void revealSecret() {
        System.out.println(familySecret); // Работает!
    }
}
```

Если `Child` находится в **другом пакете**, но **наследуется от Parent**, то он сможет получить доступ к `protected`
-полю.

---

#### **4. `public` – Полный доступ отовсюду**

🔹 Доступен **в любом классе и любом пакете**.  
🔹 Используется для **открытых API и интерфейсов**, которые должны быть доступны всем.

**Пример:**
```java
public class PublicClass {
    public String greeting = "Привет, мир!";
}
```

Любой код может получить доступ к `greeting`:  
```java
PublicClass obj = new PublicClass();
System.out.println(obj.greeting); // Работает!
```

---

### **Когда и зачем использовать каждый модификатор?**

| **Модификатор** | **Когда использовать?**                                                 |
|-----------------|-------------------------------------------------------------------------|
| `private`       | Для **скрытых данных**, например, паролей, баланса, внутренних методов. |
| `default`       | Если класс или метод **не должен быть виден за пределами пакета**.      |
| `protected`     | Если нужно **разрешить доступ подклассам**, но скрыть от остальных.     |
| `public`        | Если **метод или класс должен быть доступен всем** (например, API).     |

---

## **Вывод**

✅ **Модификаторы доступа** управляют видимостью данных в Java.  
✅ **`private`** защищает данные внутри класса.  
✅ **`default`** работает только в рамках одного пакета.  
✅ **`protected`** доступен наследникам, даже если они в другом пакете.  
✅ **`public`** позволяет использовать класс и его методы везде.

<details style="padding-top: 18px">
  <summary>4. Практика</summary>

### **Задание: Выбрать правильные модификаторы доступа**

Ниже представлены несколько классов с полями, у которых **пока нет модификаторов доступа**.  
Ваша задача — **назначить правильные модификаторы (`public`, `private`, `protected`)**, следуя принципам инкапсуляции.

---

```java
// TODO: Назначить модификаторы доступа для полей в соответствии с принципами инкапсуляции.

class UserAccount {
    String username;
    String password;
    String email;
    int age;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class Homework.lesson_23.Bank {
    String accountNumber;
    double balance;
    String ownerName;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class Product {
    String name;
    double price;
    int stock;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class Car {
    String brand;
    String model;
    int speed;
    double fuelLevel;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class LibraryBook {
    String title;
    String author;
    boolean isAvailable;
    String borrowerName;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class Order {
    int orderId;
    String customerName;
    double totalAmount;
    String status;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class Flight {
    String flightNumber;
    String destination;
    int availableSeats;
    String departureTime;
}
```

---

```java
// TODO: Назначить модификаторы доступа для полей.

class ChatMessage {
    String sender;
    String receiver;
    String text;
    String timestamp;
}
```

---

### **Инструкции:**

1. Просмотрите поля в каждом классе и решите, какие из них должны быть **`private`**, **`protected`** или **`public`**.
2. Подумайте, **какие поля следует скрыть (private)**, а какие оставить доступными.
3. Отредактируйте классы, добавив модификаторы доступа.

🚀 **Это упражнение поможет вам понять, как правильно инкапсулировать данные в Java!**
</details>
</details>

-------

<details style="padding-top: 18px">
  <summary><b>3. Геттеры, сеттеры и ключевое слово `this`</b></summary>

## **Геттеры и сеттеры в Java**

### **Почему прямой доступ к полям — плохая практика?**

🔹 **Прямой доступ к полям (`public`) нарушает инкапсуляцию** и позволяет неконтролируемо изменять данные.  
🔹 Если поля открыты, **любой класс может изменить их без ограничений**, что может привести к ошибкам.  
🔹 Геттеры и сеттеры **позволяют контролировать** изменение значений, добавляя валидацию.

**Пример плохой практики (без инкапсуляции):**  
```java
class Homework.lesson_23.Bank {
public double balance;
}
```

В этом случае любой класс может изменить `balance` без проверки:  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.balance = -1000; // ❌ Ошибка! Баланс не может быть отрицательным.
```

Чтобы избежать подобных проблем, **используют геттеры и сеттеры**.

---

### **Реализация геттеров и сеттеров**

🔹 **Геттер (`get`)** – метод, который позволяет **прочитать значение** приватного поля.  
🔹 **Сеттер (`set`)** – метод, который **изменяет значение** с проверкой.

#### **Использование `this` в сеттерах**
🔹 Внутри сеттера часто используется **`this`**, чтобы различать локальную переменную и поле класса, если они имеют одинаковые имена.

**Пример: правильная реализация с использованием геттеров, сеттеров и `this`**  
```java
class Homework.lesson_23.Bank {
private double balance;

    public double getBalance() { // Геттер
        return balance;
    }

    public void setBalance(double balance) { // Сеттер
        if (balance >= 0) {
            this.balance = balance; // `this.balance` указывает на поле класса, `balance` — локальная переменная.
        } else {
            System.out.println("❌ Баланс не может быть отрицательным!");
        }
    }
}
```

Теперь внешний код **не может** напрямую изменить `balance`, а может использовать `setBalance()` с проверкой.

**Использование:**  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank();
account.setBalance(500);  // ✅ Корректно
account.setBalance(-100); // ❌ Выведет "Баланс не может быть отрицательным!"
System.out.println(account.getBalance()); // Выведет 500
```

---

### **Пример: `Homework.lesson_23.Bank` с контролируемым изменением баланса**

Более сложный пример, где также добавлены методы `deposit()` и `withdraw()`, использующие `this`.

```java
class Homework.lesson_23.Bank {
private double balance;

    public Homework.lesson_23.Bank(double balance) {
        if (balance >= 0) {
            this.balance = balance; // Используем `this` для явного указания на поле класса
        } else {
            System.out.println("❌ Начальный баланс не может быть отрицательным. Установлен 0.");
            this.balance = 0;
        }
    }

    public double getBalance() { // Геттер
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("✅ Баланс пополнен на " + amount);
        } else {
            System.out.println("❌ Сумма пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("✅ Снято: " + amount);
        } else {
            System.out.println("❌ Недостаточно средств или некорректная сумма.");
        }
    }
}
```

**Использование:**  
```java
Homework.lesson_23.Bank account = new Homework.lesson_23.Bank(100);
account.deposit(50);
account.withdraw(200); // ❌ Недостаточно средств
System.out.println("Баланс: " + account.getBalance()); // ✅ 150
```

---

## **Что такое `this` и зачем он нужен?**

🔹 `this` – это **ссылка на текущий объект класса**, позволяющая:  
✔️ Различать локальные переменные и поля класса (например, `this.balance = balance`).  
✔️ Передавать текущий объект в методы других классов.  
✔️ Вызывать один конструктор внутри другого (`this(...)`).

**Пример: использование `this` в конструкторах**  
```java
class User {
private String username;
private int age;

    // Конструктор с двумя параметрами
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Конструктор по умолчанию вызывает другой конструктор через `this`
    public User() {
        this("Unknown", 18); // Вызывает другой конструктор
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username + ", Age: " + this.age);
    }
}
```

**Использование:**  
```java
User user1 = new User("Alice", 25);
User user2 = new User(); // Будет использован конструктор по умолчанию

user1.displayInfo(); // ✅ Username: Alice, Age: 25
user2.displayInfo(); // ✅ Username: Unknown, Age: 18
```

---

## **Вывод**
✅ **Геттеры** позволяют безопасно получать значения приватных полей.  
✅ **Сеттеры** проверяют данные перед изменением полей.  
✅ **`this`** используется для явного указания на поля класса и вызова конструкторов.  
✅ Инкапсуляция защищает **данные от некорректных изменений**, уменьшая вероятность ошибок.

🚀 **Далее перейдём к практике, где будем реализовывать геттеры, сеттеры и `this` в разных классах!**
</details>

--------

<details style="padding-top: 18px">
  <summary><b>4. Практика: Геттеры, сеттеры и `this`</b></summary>

## **Задание: Реализовать геттеры и сеттеры**

### **Цель упражнения**
✔️ Научиться использовать **геттеры и сеттеры** для доступа к приватным полям.  
✔️ Понять, как **валидация** в сеттерах помогает защищать данные.  
✔️ Освоить применение **ключевого слова `this`** для различения локальных переменных и полей класса.

---

### **Часть 1: Простые геттеры и сеттеры**
🔹 В первых двух классах вам нужно **просто реализовать геттеры и сеттеры** без валидации.

```java
// TODO: Добавить геттеры и сеттеры для всех полей.
class Book {
    private String title;
    private String author;
    private int pages;
}
```

---

```java
// TODO: Добавить геттеры и сеттеры для всех полей.
class User {
    private String username;
    private String email;
    private int age;
}
```

---

### **Часть 2: Геттеры, сеттеры и валидация**
🔹 В следующих классах вам нужно **реализовать геттеры и сеттеры** с **валидацией значений**.

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `balance` не может быть отрицательным.
// 2. Поле `accountNumber` нельзя менять после создания объекта.
class Homework.lesson_23.Bank {
    private String accountNumber;
    private double balance;
}
```

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `temperature` должно быть в диапазоне от -100 до 100 градусов.
// 2. Поле `condition` может быть только "Sunny", "Rainy", "Cloudy" или "Snowy".
class WeatherReport {
    private double temperature;
    private String condition;
}
```

---

```java
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `rating` должно быть от 1 до 5.
// 2. Поле `reviewText` не должно быть пустым.
class ProductReview {
    private String productName;
    private int rating;
    private String reviewText;
}
```

---

## **Инструкции**
1. **Добавьте геттеры и сеттеры** в каждый класс.
2. **В первых двух классах (`Book`, `User`) геттеры и сеттеры должны просто возвращать и устанавливать значения.**
3. **В остальных классах (`Homework.lesson_23.Bank`, `WeatherReport`, `ProductReview`) добавьте валидацию в сеттерах.**
4. Используйте **`this`** в сеттерах, чтобы отличать локальные переменные от полей класса.

</details>
</details>
</details>
