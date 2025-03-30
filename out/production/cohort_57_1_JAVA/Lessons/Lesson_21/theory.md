<details style="padding-top: 18px">
  <summary><b>Lesson 21: Introduction to OOP. Classes and objects</b></summary>

# Lesson 21

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

<details style="padding-top: 18px">
  <summary>4. Practice</summary>

```java
// TODO: Modify the AudioTrack class
// 1. Add a new field `genre` (String) to store the music genre.
// 2. Create a method `displayTrackInfo()` that prints all track details.

class AudioTrack {
String title;
String artist;
int durationInSeconds;

    // TODO: Add a field `genre`

    // TODO: Implement `displayTrackInfo()` method
}
```

```java
// TODO: Create the Message class
// 1. Add fields:
//    - `sender` (String) - The name of the sender
//    - `receiver` (String) - The name of the recipient
//    - `text` (String) - The message content
//    - `timestamp` (String) - The time the message was sent
// 2. Implement a method `displayMessage()` to print the message in format:
//    "[12:30] John → Alice: Hello, how are you?"

class Message {
// TODO: Define fields

    // TODO: Implement `displayMessage()` method
}
```

```java
// TODO: Create the Task class
// 1. Add fields:
//    - `title` (String) - The name of the task
//    - `description` (String) - A short task description
//    - `status` (String) - Task status (e.g., "New", "In Progress", "Completed")
// 2. Implement a method `updateStatus(String newStatus)` to update the task status.
// 3. Implement a method `displayTask()` to print task details.

class Task {
// TODO: Define fields

    // TODO: Implement `updateStatus(String newStatus)` method

    // TODO: Implement `displayTask()` method
}
```

</details>
</details>

---------

<details style="padding-top: 18px">
  <summary><b>Урок 21: Введение в ООП. Классы и объекты</b></summary>

# Lesson 21

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

<details style="padding-top: 18px">
  <summary>4. Практика</summary>

```java
// TODO: Доработать класс AudioTrack
// 1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// 2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

class AudioTrack {
String title;
String artist;
int durationInSeconds;

    // TODO: Добавить поле `genre`

    // TODO: Реализовать метод `displayTrackInfo()`
}
```

```java
// TODO: Создать класс Message
// 1. Добавить поля:
//    - `sender` (String) - Имя отправителя
//    - `receiver` (String) - Имя получателя
//    - `text` (String) - Текст сообщения
//    - `timestamp` (String) - Время отправки сообщения
// 2. Реализовать метод `displayMessage()`, который выводит сообщение в формате:
//    "[12:30] John → Alice: Привет, как дела?"

class Message {
// TODO: Определить поля

    // TODO: Реализовать метод `displayMessage()`
}
```


```java
// TODO: Создать класс Task
// 1. Добавить поля:
//    - `title` (String) - Название задачи
//    - `description` (String) - Краткое описание задачи
//    - `status` (String) - Статус задачи (например, "Новая", "В процессе", "Выполнена")
// 2. Реализовать метод `updateStatus(String newStatus)`, который обновляет статус задачи.
// 3. Реализовать метод `displayTask()`, который выводит всю информацию о задаче.

class Task {
// TODO: Определить поля

    // TODO: Реализовать метод `updateStatus(String newStatus)`

    // TODO: Реализовать метод `displayTask()`
}
```

</details>
</details>
