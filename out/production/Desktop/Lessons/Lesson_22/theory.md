<details style="padding-top: 18px">
  <summary><b>Lesson 22: Introduction to OOP. Classes and objects</b></summary>

# Lesson 22

<details style="padding-top: 18px">
  <summary>1. Introduction to OOP</summary>

## **Introduction to OOP (Object-Oriented Programming)**

### **Types of Programming**
Programming can be divided into several paradigms, each with its own characteristics. Let's look at the three main ones:

1. **Procedural Programming**
   - Code is organized into sequential instructions and functions.
   - Data is stored separately from functions that process it.
   - The main concept is executing commands step by step.
   - Used in languages such as **C, Pascal**.
   - Example: functions for processing an array of data, where the array is passed manually to each function.

2. **Object-Oriented Programming (OOP)**
   - The main idea is to **combine data and methods** that work with it into **objects**.
   - A program is built as an **interaction of objects**, rather than just function calls.
   - Used in **Java, C++, Python**.
   - Allows **code reuse** and makes the program **scalable**.
   - Example: If we are developing a project management system, we may have a `Task` class containing all task-related data and behavior.

3. **Functional Programming**
   - Focuses on **functions as first-class citizens** (they can be passed to other functions).
   - Uses **pure functions** (without modifying program state).
   - Used in **Haskell, Lisp, Scala, Kotlin (partially)**.
   - Example: processing a list using `map()` and `filter()` functions.

Other paradigms:
- **Logical Programming** (used in Prolog, based on logical rules).
- **Reactive Programming** (works with data streams and reacts to changes).

---

## **What is OOP? Procedural vs. OOP Approach**

Object-Oriented Programming (OOP) is a **method of software development** based on **working with objects**.  
Key OOP concepts:
- A program consists of **objects**, not just functions.
- An **object** contains **data** (fields) and **methods** (behavior).
- The code becomes **more flexible**, making it easier to maintain and expand.

### **Procedural vs. OOP Approach**

| **Procedural Programming** | **Object-Oriented Programming** |
|----------------------------|--------------------------------|
| Data is stored separately from functions | Data and methods are combined in objects |
| Code is hard to maintain in large projects | Code is easy to extend and reuse |
| Uses global variables and data structures | Uses classes and objects |
| Logic is built around functions | Logic is built around objects |

---

## **OOP Analogies from Real Life**

### **1. Task in a Project Management System**
In project management tools (e.g., Trello, Jira), tasks are created and assigned to users.

- **Object**: `Task`
- **Fields** (data): `title`, `description`, `status` (`new`, `in progress`, `done`), `assignee`
- **Methods** (behavior): `updateStatus()`, `assignUser()`, `displayTaskInfo()`

Example in Java:  
```java
class Task {
String title;
String description;
String status;
String assignee;

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    void displayTaskInfo() {
        System.out.println("Task: " + title + " | Status: " + status);
    }
}
```

### **2. Order in an E-commerce System**
- **Object**: `Order`
- **Fields**: `orderId`, `customerName`, `totalPrice`, `status` (`pending`, `shipped`, `delivered`)
- **Methods**: `updateStatus()`, `calculateTotal()`, `displayOrderDetails()`

Example in Java:  
```java
class Order {
int orderId;
String customerName;
double totalPrice;
String status;

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    void displayOrderDetails() {
        System.out.println("Order #" + orderId + " for " + customerName + " | Status: " + status);
    }
}
```

### **3. Ticket for an Event**
- **Object**: `Ticket`
- **Fields**: `eventName`, `seatNumber`, `price`, `isUsed`
- **Methods**: `useTicket()`, `displayTicketInfo()`

Example in Java:  
```java
class Ticket {
String eventName;
String seatNumber;
double price;
boolean isUsed;

    void useTicket() {
        if (!isUsed) {
            isUsed = true;
            System.out.println("Ticket for " + eventName + " used.");
        } else {
            System.out.println("This ticket has already been used.");
        }
    }
}
```

---

## **Conclusion**
- In **procedural programming**, code is divided into functions that work with data.
- In **OOP**, data and methods are combined into **objects**, making the code more structured and easier to extend.
- Objects in programming are analogous to **real-world entities**, such as tasks in a project management system, orders in an online store, or tickets for events.

</details>

<details style="padding-top: 18px">
  <summary>2. Creating Classes and Objects in Java</summary>

## **Creating Classes and Objects in Java**

In Object-Oriented Programming (OOP), a **class** is a blueprint for creating objects.  
An **object** is a specific instance of a class, containing its own data and behavior.

Real-world analogy:
- A class is a **blueprint** for a car.
- An object is a **specific car** created from that blueprint.

---

### **Defining a Class and an Object**

In Java, a class is declared using the `class` keyword, and objects are created using the `new` operator.

Example:  
```java
class Book {
String title;
String author;
int pages;
}
```

Here, `Book` is a **class** that represents a book. It has **fields**:
- `title` (the book's title),
- `author` (the author's name),
- `pages` (the number of pages).

To create an object, we use `new`:  
```java
Book book1 = new Book();
book1.title = "1984";
book1.author = "George Orwell";
book1.pages = 328;
```

Now we have an object `book1`, representing a **specific book**.

---

### **Fields (Instance Variables) and Methods**

**Fields** (instance variables) store object data.  
**Methods** define object behavior.

Let's add a `displayInfo()` method to print book details:  
```java
class Book {
String title;
String author;
int pages;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

Using the method:  
```java
Book book2 = new Book();
book2.title = "Brave New World";
book2.author = "Aldous Huxley";
book2.pages = 311;

book2.displayInfo();
```

Console output:

```text
Title: Brave New World
Author: Aldous Huxley
Pages: 311
```

### **Creating an Object with `new`**

The `new` operator creates an object in memory and returns a reference to it.

Example:  
```java
Book book3 = new Book();
```

When this happens:
- Memory is allocated for a new object.
- Fields (`title`, `author`, `pages`) receive default values (`null` or `0`).
- A reference to the created object is returned.

You can create **multiple objects of the same class**:  
```java
Book book4 = new Book();
book4.title = "Fahrenheit 451";
book4.author = "Ray Bradbury";
book4.pages = 256;

Book book5 = new Book();
book5.title = "Dune";
book5.author = "Frank Herbert";
book5.pages = 412;
```

Now, `book4` and `book5` store different books.

---

## **Summary**
✅ A **class** is a blueprint for creating objects.  
✅ An **object** is an instance of a class with its own data.  
✅ Fields store **data**, and methods define **behavior**.  
✅ The `new` operator creates an object in memory and returns a reference to it.

</details>

<details style="padding-top: 18px">
  <summary>3. Constructors and the `this` Keyword</summary>

## **Constructors and the `this` Keyword**

When we create an object in Java using `new`, a **constructor** is automatically called. A constructor is a special method designed to initialize an object.

### **The Role of a Constructor in Object Initialization**

A constructor:
- Is **automatically called** when an object is created.
- Allows setting **initial values** for fields.
- Has the **same name as the class**.
- Does not return a value (even `void` is omitted).

Example of a constructor in the `Book` class:  
```java
class Book {
String title;
String author;
int pages;

    // Constructor
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

Using the constructor:  
```java
Book book1 = new Book("1984", "George Orwell", 328);
book1.displayInfo();
```

Output:  
```text
Title: 1984  
Author: George Orwell  
Pages: 328  
```

Now, the object is created with predefined values.

---

### **Using `this` to Reference the Current Object**

The `this` keyword is used when method parameters have the same names as class fields. It clarifies that we are referring to **instance variables**, not local parameters.

Example without `this` (problem):  
```java
class Book {
String title;
String author;
int pages;

    // Constructor with naming conflict
    Book(String title, String author, int pages) {
        title = title;   // Error! This assigns values to the local variables, not the fields.
        author = author;
        pages = pages;
    }
}
```

In this code, the variables **title, author, pages** refer to themselves, leaving the fields uninitialized (`null` or `0`).

Correct version using `this`:  
```java
class Book {
String title;
String author;
int pages;

    Book(String title, String author, int pages) {
        this.title = title;   // Now we explicitly refer to the object's fields.
        this.author = author;
        this.pages = pages;
    }
}
```

Now, `this.title` refers to the class field, while `title` refers to the constructor parameter.

---

### **Default Constructors and Constructor Overloading**

If a class **has no constructor**, the compiler automatically creates a **default constructor** (without parameters).

Example:  
```java
class Book {
String title;
String author;
int pages;

    // Default constructor (created automatically)
    Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0;
    }
}
```

Usage:  
```text
Book book2 = new Book();
System.out.println(book2.title);
```

Output:  
```text
Unknown
```

You can also create **multiple constructors** (constructor overloading):  
```java
class Book {
String title;
String author;
int pages;

    // Constructor with parameters
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Constructor without parameters
    Book() {
        this("Unknown", "Unknown", 0);
    }
}
```

Now, objects can be created in different ways:  
```java
Book book3 = new Book("Dune", "Frank Herbert", 412);
Book book4 = new Book(); // Default values will be used
```

---

## **Summary**
✅ A **constructor** is automatically called when an object is created.  
✅ The **`this`** keyword is used to reference instance variables when parameter names match field names.  
✅ You can create **overloaded constructors** for different ways of initializing objects.


</details>

--------

<details style="padding-top: 18px">
  <summary>3.1 Instance Methods</summary>

## **Instance Methods in Java**

### **What are instance methods?**
Instance methods are functions that belong to a specific object of a class.  
They allow:
- Working with **object data**.
- Performing **operations on fields** of an object.
- Being called **only through an instance** of a class.

Example: We have a **`UserAccount` class** representing a user's account.  
We will add methods to **change the password** and **log in**.


### **Example: `UserAccount` Class**
```java
class UserAccount {
String username;
String password;

    // Method to change the password
    void changePassword(String newPassword) {
        password = newPassword;
        System.out.println("Password for " + username + " has been updated.");
    }

    // Method to check login credentials
    boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}
```

---

### **Using Instance Methods**
Let's create a `UserAccount` object and test its methods:

```java
public class Main {
public static void main(String[] args) {
UserAccount user1 = new UserAccount();
user1.username = "john_doe";
user1.password = "12345";

        // Changing password
        user1.changePassword("securePass123");

        // Attempting to log in
        boolean isLoggedIn = user1.login("john_doe", "securePass123");
        System.out.println("Login successful: " + isLoggedIn);
    }
}
```

**Console Output:**
```text
Password for john_doe has been updated.  
Login successful: true
```

---

### **Methods with Return Values**
Methods can **return results** using `return`.

For example, let's add a `getMaskedPassword()` method to hide the actual password by replacing characters with `*`:

```java
class UserAccount {
String username;
String password;

    String getMaskedPassword() {
        return "*".repeat(password.length());
    }
}
```

Using the method:
```java
UserAccount user2 = new UserAccount();
user2.username = "alice_wonder";
user2.password = "mypassword";

System.out.println("Masked password: " + user2.getMaskedPassword());
```

Output:
```java
Masked password: **********
```

---

## **Summary**
✅ **Instance methods** allow an object to perform actions.  
✅ They can **modify object fields** and **return values**.  
✅ They are called through **instances of classes**.

</details>


--------

<details style="padding-top: 18px">
  <summary>4. Practice</summary>

```java
// TODO: Create the User class
// 1. Add fields:
//    - `username` (String) - The user's login name
//    - `email` (String) - The user's email address
//    - `age` (int) - The user's age
// 2. Create a constructor that accepts all three parameters.
// 3. Implement the `displayUserInfo()` method, which prints user information.

class User {
// TODO: Define fields

    // TODO: Implement constructor

    // TODO: Implement displayUserInfo() method
}
```

```java
// TODO: Create the BankAccount class
// 1. Add fields:
//    - `accountNumber` (String) - The bank account number
//    - `balance` (double) - The account balance
// 2. Create a constructor that accepts `accountNumber` and an initial balance.
// 3. Implement methods:
//    - `deposit(double amount)`, which increases the balance by the specified amount.
//    - `withdraw(double amount)`, which decreases the balance if sufficient funds are available.

class BankAccount {
// TODO: Define fields

    // TODO: Implement constructor

    // TODO: Implement deposit(double amount) method

    // TODO: Implement withdraw(double amount) method
}
```

```java
// TODO: Create the Product class
// 1. Add fields:
//    - `name` (String) - The product name
//    - `price` (double) - The product price
//    - `stock` (int) - The quantity available in stock
// 2. Create a constructor that accepts all three parameters.
// 3. Implement methods:
//    - `sell(int quantity)`, which decreases `stock` if enough products are available.
//    - `restock(int quantity)`, which increases `stock`.

class Product {
// TODO: Define fields

    // TODO: Implement constructor

    // TODO: Implement sell(int quantity) method

    // TODO: Implement restock(int quantity) method
}
```

```java
// TODO: Create the SmartDevice class
// 1. Add fields:
//    - `deviceName` (String) - The name of the device
//    - `isOn` (boolean) - Whether the device is turned on
// 2. Create a constructor that accepts `deviceName` and sets `isOn` to `false`.
// 3. Implement methods:
//    - `turnOn()`, which turns the device on (`isOn = true`).
//    - `turnOff()`, which turns the device off (`isOn = false`).
//    - `displayStatus()`, which prints the device’s current state.

class SmartDevice {
// TODO: Define fields

    // TODO: Implement constructor

    // TODO: Implement turnOn() method

    // TODO: Implement turnOff() method

    // TODO: Implement displayStatus() method
}
```

```java
// TODO: Create the Order class
// 1. Add fields:
//    - `orderId` (int) - The unique order identifier
//    - `customerName` (String) - The customer's name
//    - `totalAmount` (double) - The total order amount
//    - `status` (String) - The order status ("Pending", "Shipped", "Delivered")
// 2. Create a constructor that accepts `orderId`, `customerName`, and `totalAmount`.
// 3. Implement methods:
//    - `updateStatus(String newStatus)`, which updates the order status.
//    - `displayOrder()`, which prints order information.

class Order {
// TODO: Define fields

    // TODO: Implement constructor

    // TODO: Implement updateStatus(String newStatus) method

    // TODO: Implement displayOrder() method
}
```

</details>

</details>

---------

<details style="padding-top: 18px">
  <summary><b>Урок 22: Введение в ООП. Классы и объекты</b></summary>

# Lesson 22

<details style="padding-top: 18px">
  <summary>1. Введение в ООП</summary>

## **Введение в ООП (Объектно-Ориентированное Программирование)**

### **Типы программирования**
Программирование можно разделить на несколько подходов, каждый из которых имеет свои особенности. Рассмотрим три основных:

1. **Процедурное программирование**
   - Код организован в виде последовательных инструкций и функций.
   - Данные хранятся отдельно от функций, которые их обрабатывают.
   - Основная концепция — выполнение команд шаг за шагом.
   - Используется в языках, таких как **C, Pascal**.
   - Пример: функции для обработки массива данных, где массив передается в каждую функцию вручную.

2. **Объектно-Ориентированное программирование (ООП)**
   - Основная идея — объединение данных и методов, работающих с ними, в **объекты**.
   - Программа строится как взаимодействие объектов, а не просто вызов функций.
   - Используется в **Java, C++, Python**.
   - Позволяет **повторно использовать код** и **делать программу масштабируемой**.
   - Пример: если мы разрабатываем систему управления задачами, у нас может быть класс `Task`, содержащий всю информацию о задаче.

3. **Функциональное программирование**
   - Фокусируется на **функциях как объектах первого класса** (их можно передавать в другие функции).
   - Использует **чистые функции** (без изменения состояния программы).
   - Используется в **Haskell, Lisp, Scala, Kotlin (частично)**.
   - Пример: обработка списка через функции `map()` и `filter()`.

Другие парадигмы:
- **Логическое программирование** (используется в Prolog, основано на логических правилах).
- **Реактивное программирование** (работает с потоками данных и реакцией на их изменения).

---

## **Что такое ООП? Разница между процедурным и ООП-подходом**

Объектно-ориентированное программирование (ООП) — это **метод разработки программ**, основанный на **работе с объектами**.  
Основные концепции ООП:
- Программа строится из **объектов**, а не просто функций.
- **Объект** содержит **данные** (поля) и **методы** (поведение).
- Код становится **гибче**, его легче поддерживать и расширять.

### **Процедурный vs ООП подход**

| **Процедурное программирование** | **Объектно-Ориентированное программирование** |
|----------------------------------|----------------------------------|
| Данные хранятся отдельно от функций | Данные и методы объединены в объектах |
| Код сложно поддерживать при увеличении проекта | Код легко расширяется и переиспользуется |
| Используются глобальные переменные и структуры данных | Используются классы и объекты |
| Логика строится вокруг функций | Логика строится вокруг объектов |

---

## **Аналогии ООП из реальной жизни**

### **1. Задача в системе управления проектами**
В системе управления проектами (например, Trello, Jira) есть задачи, которые пользователи создают и выполняют.

- **Объект**: `Task`
- **Поля** (данные): `title`, `description`, `status` (`new`, `in progress`, `done`), `assignee`
- **Методы** (поведение): `updateStatus()`, `assignUser()`, `displayTaskInfo()`

Пример в Java:  
```java
class Task {
String title;
String description;
String status;
String assignee;

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    void displayTaskInfo() {
        System.out.println("Task: " + title + " | Status: " + status);
    }
}
```

### **2. Заказ в интернет-магазине**
- **Объект**: `Order`
- **Поля**: `orderId`, `customerName`, `totalPrice`, `status` (`pending`, `shipped`, `delivered`)
- **Методы**: `updateStatus()`, `calculateTotal()`, `displayOrderDetails()`

Пример в Java:  
```java
class Order {
int orderId;
String customerName;
double totalPrice;
String status;

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    void displayOrderDetails() {
        System.out.println("Order #" + orderId + " for " + customerName + " | Status: " + status);
    }
}
```

### **3. Билет на мероприятие**
- **Объект**: `Ticket`
- **Поля**: `eventName`, `seatNumber`, `price`, `isUsed`
- **Методы**: `useTicket()`, `displayTicketInfo()`

Пример в Java:  
```java
class Ticket {
String eventName;
String seatNumber;
double price;
boolean isUsed;

    void useTicket() {
        if (!isUsed) {
            isUsed = true;
            System.out.println("Ticket for " + eventName + " used.");
        } else {
            System.out.println("This ticket has already been used.");
        }
    }
}
```


## **Вывод**
- В **процедурном программировании** код разбит на функции, работающие с данными.
- В **ООП** данные и методы объединены в **объекты**, что делает код более структурированным и удобным для расширения.
- Объекты в программировании аналогичны **реальным сущностям**, например, задачам в системе управления проектами, заказам в интернет-магазинах или билетам на мероприятия.


</details>

---

<details style="padding-top: 18px">
  <summary>2. Создание классов и объектов в Java</summary>

## **Создание классов и объектов в Java**

В объектно-ориентированном программировании (ООП) **класс** — это шаблон (чертеж) для создания объектов.  
**Объект** — это конкретный экземпляр класса, обладающий своими данными и поведением.

Пример из реальной жизни:
- Класс — это **чертеж** автомобиля.
- Объект — это **конкретный автомобиль**, созданный по этому чертежу.

---

### **Определение класса и объекта**

В Java класс объявляется с помощью ключевого слова `class`, а объекты создаются с помощью оператора `new`.

Пример:  
```java
class Book {
    String title;
    String author;
    int pages;
}
```

Здесь `Book` — это **класс**, который описывает книгу. У него есть **поля**:
- `title` (название книги),
- `author` (автор),
- `pages` (количество страниц).

Для создания объекта используется `new`:  
```java
Book book1 = new Book();
book1.title = "1984";
book1.author = "George Orwell";
book1.pages = 328;
```

Теперь у нас есть объект `book1`, который представляет **конкретную книгу**.

### **Поля (переменные экземпляра) и методы**

**Поля** (переменные экземпляра) хранят данные объекта.  
**Методы** определяют его поведение.

Добавим метод `displayInfo()`, который выводит информацию о книге:  
```java
class Book {
String title;
String author;
int pages;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

Использование метода:  
```java
Book book2 = new Book();
book2.title = "Brave New World";
book2.author = "Aldous Huxley";
book2.pages = 311;

book2.displayInfo();
```

Вывод в консоль:

```text
Title: Brave New World
Author: Aldous Huxley
Pages: 311
```

### **Создание объекта с `new`**

Оператор `new` создает объект в памяти и возвращает ссылку на него.

Пример:  
```java
Book book3 = new Book();
```

При этом:
- Выделяется память для нового объекта.
- Поля (`title`, `author`, `pages`) получают значения по умолчанию (`null` или `0`).
- Возвращается ссылка на созданный объект.

Можно создать **несколько объектов одного класса**:  
```java
Book book4 = new Book();
book4.title = "Fahrenheit 451";
book4.author = "Ray Bradbury";
book4.pages = 256;

Book book5 = new Book();
book5.title = "Dune";
book5.author = "Frank Herbert";
book5.pages = 412;
```

Теперь `book4` и `book5` хранят разные книги.

---

## **Вывод**
✅ **Класс** — это шаблон для создания объектов.  
✅ **Объект** — это экземпляр класса с собственными данными.  
✅ Поля хранят **данные**, методы описывают **поведение** объекта.  
✅ Оператор `new` создает объект в памяти и возвращает ссылку на него.

</details>

---------

<details style="padding-top: 18px">
  <summary>3. Конструкторы и ключевое слово `this`</summary>

## **Конструкторы и ключевое слово `this`**

Когда мы создаем объект в Java с помощью `new`, по умолчанию вызывается **конструктор** — специальный метод, предназначенный для инициализации объекта.

### **Роль конструктора в инициализации объектов**

Конструктор:
- Вызывается **автоматически** при создании объекта.
- Позволяет задать начальные значения для полей.
- Имеет **такое же имя, как класс**.
- Не возвращает значение (даже `void` не указывается).

Пример конструктора в классе `Book`:  
```java
class Book {
String title;
String author;
int pages;

    // Конструктор
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

Использование конструктора:  
```java
Book book1 = new Book("1984", "George Orwell", 328);
book1.displayInfo();
```

Вывод:  
```text
Title: 1984  
Author: George Orwell  
Pages: 328  
```

Теперь объект создается с уже заполненными значениями.

---

### **Использование `this` для ссылки на текущий объект**

Ключевое слово `this` используется, когда у параметров метода и полей класса одинаковые имена. Оно указывает, что речь идет о **полях объекта**, а не о локальных переменных.

Пример без `this` (проблема):  
```java
class Book {
String title;
String author;
int pages;

    // Конструктор с конфликтом имен
    Book(String title, String author, int pages) {
        title = title;   // Ошибка! Это локальная переменная, а не поле объекта
        author = author;
        pages = pages;
    }
}
```

В этом коде переменные **title, author, pages** ссылаются сами на себя, а поля объекта остаются `null`.

Правильный вариант с `this`:  
```java
class Book {
String title;
String author;
int pages;

    Book(String title, String author, int pages) {
        this.title = title;   // Теперь мы явно обращаемся к полям объекта
        this.author = author;
        this.pages = pages;
    }
}
```

Теперь `this.title` указывает на поле класса, а `title` — на параметр конструктора.

---

### **Конструкторы по умолчанию и перегрузка конструкторов**

Если в классе **нет конструктора**, компилятор создаст **конструктор по умолчанию** (без параметров).

Пример:  
```java
class Book {
String title;
String author;
int pages;

    // Конструктор по умолчанию (создается автоматически)
    Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0;
    }
}
```

Использование:  
```java
Book book2 = new Book();
System.out.println(book2.title);
```

Вывод:  
```text
Unknown
```

Также можно создать **несколько конструкторов** (перегрузка):  
```java
class Book {
String title;
String author;
int pages;

    // Конструктор с параметрами
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Конструктор без параметров
    Book() {
        this("Unknown", "Unknown", 0);
    }
}
```

Теперь можно создавать объекты по-разному:  
```java
Book book3 = new Book("Dune", "Frank Herbert", 412);
Book book4 = new Book(); // Будут использованы значения по умолчанию
```

---

## **Вывод**
✅ **Конструктор** вызывается автоматически при создании объекта.  
✅ **`this`** используется для обращения к полям объекта, если имена параметров совпадают с именами полей.  
✅ Можно создавать **перегруженные конструкторы** для разных способов инициализации.


</details>

---------

<details style="padding-top: 18px">
  <summary>3.1 Методы экземпляра</summary>

## **Методы экземпляра в Java**

### **Что такое методы экземпляра?**
Методы экземпляра — это функции, принадлежащие конкретному объекту класса.  
Они позволяют:
- Работать с **данными объекта**.
- Выполнять **действия с полями** объекта.
- Вызываться **только через экземпляр класса**.

Пример: у нас есть **класс `UserAccount`**, который представляет аккаунт пользователя.  
Мы добавим в него методы для **изменения пароля** и **авторизации**.

---

### **Пример: Класс `UserAccount`**
```java
class UserAccount {
String username;
String password;

    // Метод для смены пароля
    void changePassword(String newPassword) {
        password = newPassword;
        System.out.println("Password for " + username + " has been updated.");
    }

    // Метод для проверки логина и пароля
    boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}
```

---

### **Использование методов экземпляра**
Создадим объект `UserAccount` и проверим, как работают его методы:

```java
public class Main {
public static void main(String[] args) {
UserAccount user1 = new UserAccount();
user1.username = "john_doe";
user1.password = "12345";

        // Изменение пароля
        user1.changePassword("securePass123");

        // Попытка входа в систему
        boolean isLoggedIn = user1.login("john_doe", "securePass123");
        System.out.println("Login successful: " + isLoggedIn);
    }
}
```

**Вывод в консоль:**
```text
Password for john_doe has been updated.  
Login successful: true
```

---

### **Методы с возвращаемым значением**
Методы могут **возвращать результат**, используя `return`.

Например, добавим метод `getMaskedPassword()`, который будет скрывать реальный пароль пользователя, заменяя символы `*`:

```java
class UserAccount {
String username;
String password;

    String getMaskedPassword() {
        return "*".repeat(password.length());
    }
}
```

Использование метода:
```java
UserAccount user2 = new UserAccount();
user2.username = "alice_wonder";
user2.password = "mypassword";

System.out.println("Masked password: " + user2.getMaskedPassword());
```

Вывод:
```java
Masked password: **********
```

## **Вывод**
✅ **Методы экземпляра** позволяют объекту выполнять действия.  
✅ Они могут **изменять поля объекта** и **возвращать значения**.  
✅ Они используются через **экземпляры классов**.

</details>

---------

<details style="padding-top: 18px">
  <summary>4. Практика</summary>

```java
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
```

```java
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
```

```java
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
```

```java
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
```

```java
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
}
```

</details>


</details>
