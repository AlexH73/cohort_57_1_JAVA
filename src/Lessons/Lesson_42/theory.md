<details>
<summary> Lesson 42. Learning the principles of programming </summary>

# Lesson 42. Learning the principles of programming

## Introduction to programming principles

### Lesson Overview

This lesson is dedicated to learning the basic programming principles that every developer needs to write
clean, efficient, and maintainable code. We will cover both fundamental concepts such as variables, loops, and
functions, as well as more advanced topics, including the principles of SOLID, DRY, and KISS. The lesson is structured in such a way as to give
students a comprehensive understanding of how these principles are applied in real software development.

### Why study the principles of programming?

The principles of programming form the basis for creating high-quality software. Knowing these principles
allows developers to write code that is easy to scale, test, and maintain. This not only
improves the quality of the product, but also facilitates teamwork, as the code becomes more understandable and
standardized. Ultimately, proficiency in these principles leads to a reduction in time and costs for project development and
support.

## Goals and objectives of the lesson

The main purpose of the lesson is to familiarize students with the key principles of programming and to understand their importance for
the development of high-quality software. By the end of the lesson, you will be able to:

- Understand and explain the basic principles of programming.
- Apply these principles when writing code.
- Analyze existing code from the point of view of applying programming principles.
- Improve the quality of the code by refactoring, taking into account the principles studied.

The lesson involves not only theoretical study of the material, but also practical work with the code, which will consolidate
the acquired knowledge and skills.

## Basics of programming

### What is programming?

Programming is the process of creating programs and applications using programming languages, which includes
writing, testing, debugging, and maintaining code. Basic concepts in programming include algorithms,
data structures, design patterns, and development principles.

### Programming languages and their role

Programming languages are tools for software development. Different languages are designed for
solutions to specific tasks: for example, JavaScript is traditionally used for web development, Python is used for scientific
research and web application development, Java and C# are often used in corporate applications and for
mobile application development. The choice of programming language depends on the requirements of the project, the ecosystem and the preferences
of the developer.

### Program structure

The main elements of the program structure include variables, data types, control structures, as well as functions and methods.

- **Variables and data types**
    - Variables are used to store data. Data types determine what kind of data can be stored in
      a variable (for example, integers, real numbers, strings).

- **Control structures: conditional operators, loops**
    - Control structures allow you to change the flow of program execution using conditions (if-else) and loops (for,
      while), which makes the code flexible and adaptable to various situations.

- **Functions and methods**
    - Functions and methods organize code into logical blocks designed to perform specific tasks. They can
      accept parameters and return results, which facilitates code reuse and simplifies support
      programs.

These elements are the foundation for building programs and are present in one form or another in most
programming languages. Understanding their role and applying them correctly is the key to creating efficient and easily
maintained code.

## Programming Principles

### Clean code

#### What is "clean code"?

Clean code is code that is easy to read, understand, and modify. It is characterized by simplicity, clarity and
conciseness. Clean code not only facilitates the support and development of a software product, but also reduces the likelihood
of errors. It should be written as if the developer expected the next person working with his code to be
ignorant of it in detail and in a hurry.

#### Rules for writing clean code

1. **Naming**

- Use clear and descriptive names of variables, functions, and classes. The name should reflect why it exists
  a variable or what a function does.

2. **Methods**

- Methods should be small and perform only one task. This makes them easier to understand, test, and
  reuse.

3. **Comments**

- Comments should be used wisely. Good code is self-documenting in most cases. Use
  comments to explain "why" the decision was made, not "what" the code does.

4. **Formatting**

- Follow the same coding style throughout the project. This applies to indents, brackets, spaces, and so on. Uniformity
  makes it easier to read the code.

5. **Error handling**

- Error handling is an important part of clean code. Errors must be handled explicitly and gracefully so as not to
  complicate the basic logic.

6. **DRY (Don’t Repeat Yourself)**

- Avoid duplicating the code. Repetitive code complicates changes and increases the likelihood of errors.

7. **YAGNI (You Ain’t Gonna Need It)**

- Do not add functionality simply because it may be needed in the future. This leads to the complication of the code without
  the immediate need.

8. **The principle of sole responsibility**

- Each module or class should have one reason to change. This makes it easier to understand, test, and support
  the code.

The principles of writing clean code are the basis for professional software development. They
contribute to the creation of a high-quality product, simplify the maintenance and development of the system and increase the efficiency of
the team.

## SOLID principles

SOLID is an acronym representing the five basic principles of object-oriented programming and design
that help developers create systems that are easy to maintain and extend.

### Single Responsibility (The principle of sole responsibility)

Each class should have only one reason to change. This principle states that a class should only deal
with one task or functionality. If a class is responsible for performing multiple tasks, changing it due to requirements
for one of the tasks may affect dependent functionality.

![img.png](images%2Fimg.png)

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

Create a `Report` class that has two responsibilities: generating and printing a report. Then divide it up so that
each class has only one responsibility.
</details>

### Open/Closed (The principle of openness/closeness)

Software entities (classes, modules, functions, etc.) should be open for expansion, but closed for modification.
This means that you can add new functionality without changing existing code, which reduces the risk of introducing errors
into an already running system.

![img_1.png](images%2Fimg_1.png)

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

Create a `Shape` interface with the `area()` method. Use this interface to create the `Circle` and `Rectangle` classes.
After that, implement a function that takes an array of objects of type `Shape` and calculates the total area.
</details>

### Liskov Substitution (Barbara Liskov Substitution Principle)

Objects in the program can be replaced by their heirs without changing the correctness of the program execution. This principle
emphasizes the importance of making subclasses interchangeable with their base classes without disrupting the program.

![img_2.png](images%2Fimg_2.png)

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

Create a `Bird` class with the `fly()` method, then implement the `Penguin` and `Eagle` subclasses. Both should inherit `Bird`,
but only `Eagle` can fly.
</details>

### Interface Segregation (The principle of interface separation)

Clients should not depend on interfaces that they do not use. It is necessary to divide large interfaces into more
small and specific, so that the classes implementing these interfaces do not have unnecessary code that they do not need.

![img_3.png](images%2Fimg_3.png)

<details style="margin-left: 20px;">
<summary>Task 4:</summary>

Create a `Machine` interface with the `print()`, `fax()` and `scan()` methods. Implement the `Printer` and `Photocopier` classes,
which implement only the necessary methods.
</details>

### Dependency Inversion (The principle of dependency inversion)

High-level modules should not depend on low-level modules. Both types of modules should depend on abstractions.
In addition, abstractions should not depend on details. The details should depend on the abstractions. This principle is aimed at
reducing dependencies between code modules, which makes it easier to test and maintain them.

![img_4.png](images%2Fimg_4.png)

<details style="margin-left: 20px;">
<summary>Task 5:</summary>

Create a `Database` interface with the `read()` and `write()` methods. Use this interface to create
the `MySQLDatabase` and `MongoDatabase` classes.
</details>

The application of SOLID principles in development helps to create more flexible, user-friendly systems for support and expansion, which
It is important when working on complex projects and in large teams.

<details style="margin-left: 20px;">
<summary>The code does not comply with the principles of SOLID:</summary>

```java
import java.util.List;

public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    // This method does too much. He changes the state and deals with the output.
    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    // Method for adding a car to the database (violates SRP and DIP)
public void saveCarToDatabase(List<Car> database) {
        database.add(this);
        System.out.println("Car saved to database.");
    }
}

```

There are several problems in this code:

1. **Single Responsibility Principle (SRP)**: The `Car` class has more than one responsibility. It manages
   the car's data and
   saves it to a database.

2. **Open/Closed Principle (OCP)**: If you need to change the way data is saved, the `Car` class will be required
   modify it.

3. **Liskov Substitution Principle (LSP)**: In this simple example, LSP is not very applicable, but one can imagine that if
   we
   we are expanding this class, problems may arise.

4. **Interface Segregation Principle (ISP)**: The `Car` class has a `saveCarToDatabase()` method, which is not related to
   the primary
   responsibility of the class.

5. **Dependency Inversion Principle (DIP)**: The `Car` class depends on a specific list, which makes it dependent on
   a low-level detail.

</details>

<details style="margin-left: 20px;">
<summary>Code conforming to the principles of SOLID:</summary>

1. **Single Responsibility Principle (SRP)**: Let's separate the responsibilities, allocate the `saveCarToDatabase()` method into a separate
   interface and class.

2. **Open/Closed Principle (OCP)**: Using the interface to save data will allow us to expand
   functionality without changing existing code.

3. **Liskov Substitution Principle (LSP)**: There is nothing to change here yet, but we will keep the principle in mind when expanding
   functionality.

4. **Interface Segregation Principle (ISP)**: We will create an interface only for saving data, so as not to violate
   the main functions of the Car class.

5. **Dependency Inversion Principle (DIP)**: The `Car` class will depend on the abstraction, not on a specific class.

```java
import java.util.List;

// Interface for saving a car
interface CarSaver {
    void save(Car car);
}
```

```java
// Implementation of the CarSaver class DatabaseCarSaver implements CarSaver interface {
private List<Car> database;

    public DatabaseCarSaver(List<Car> database) {
        this.database = database;
    }

    public void save(Car car) {
        database.add(car);
        System.out.println("Car saved to database.");
    }
}

// The Car class now follows the principles of the SOLID
public class Car {
private String model;
private String brand;
private int year;
private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    // Methods related only to the car
    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }
}
```

```java
// Using
public static void main(String[] args) {
    List<Car> carDatabase = new ArrayList<>();
    CarSaver carSaver = new DatabaseCarSaver(carDatabase);

    Car myCar = new Car("Model S", "Tesla", 2020);
    myCar.startEngine();
    myCar.showCarDetails();

    // Saving the car to the database
    carSaver.save(myCar);
}
```

</details>

### KISS (Keep It Simple, Stupid) - Make it easier

The KISS principle stands for simplicity in design and implementation. He argues that systems work better when they remain
simple and uncomplicated. Complexity should be avoided and try to solve problems as straightforwardly and clearly as possible. This
does not mean that you need to sacrifice functionality for simplicity, but when choosing between two solutions, you should give
preference to the one that is easier to understand and implement. Using KISS helps to avoid unnecessary complexity, which
can lead to errors and make it difficult to maintain and expand the system.

Both of these principles are aimed at improving the quality of the code and simplifying the development process. By using DRY, developers
avoid repetition, which makes the code cleaner and easier to maintain. Following KISS, they try to make decisions as
simple as possible, which reduces the risk of introducing errors and makes it easier for both current and future
developers to understand the system.

<details style="margin-left: 20px;">
<summary>Example of using KISS</summary>

<details style="margin-left: 20px;">
<summary>The code does not comply with the principles of KISS:</summary>


Let's look at an example of code that is unnecessarily complicated, violating the KISS principle (Keep It Simple, Stupid — Make
it easier). This example illustrates how you can complicate the solution of a simple problem — for example, checking whether a number
is prime.

```java
public class ComplexPrimeCheck {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPrime(int number) {
        if (number < 10) {
            if (number == 2 || number == 3 || number == 5 || number == 7) {
                return true;
            } else {
                return false;
            }
        } else {
            return isPrime(number);
        }
    }
}

```

In this example, the `checkPrime` method tries to optimize the verification of prime numbers by pre-checking the numbers
less than 10, which is actually unnecessary and complicates the understanding of the code. The basic logic of checking a prime number in
the `isPrime` method is already quite effective and covers all cases, including numbers less than 10.
</details>

<details style="margin-left: 20px;">
<summary>The code is consistent with the principles of KISS:</summary>

The example can be simplified by removing unnecessary pre-validation, thereby making it more consistent with the principle
KISS:

```java
public class SimplePrimeCheck {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

Now the code has become simpler and easier to understand, while the functionality remains the same. Simplifying the code according to
the KISS principle makes it easier to maintain and test it.
</details>
</details>

## Conclusion on the topic of programming principles

The study and application of basic programming principles such as Clean Code, SOLID, DRY, KISS, plays a key role
in the development of high-quality and change-resistant software. These principles are aimed at improving
the maintainability, extensibility and understandability of the code, which is important for both individual developers and teams.

- **Clean code** helps to make the program more understandable and easy to maintain, minimizing the time required to
  understand and modify the code.
- **SOLID principles** ensure the creation of flexible and modular systems that simplify the addition of new functionality and
  adaptation to changing requirements without breaking existing code.
- **DRY** and **KISS** help to reduce duplication and excessive complexity of the code, which makes it more efficient
  and user-friendly.

Applying these principles requires a conscious approach and practice, but it's worth it. By following these guidelines,
developers can create software that not only meets current requirements, but is also easy
adapts to future changes. This leads to lower costs for product support and development, improved code quality
and, ultimately, increased satisfaction for both developers and users.

In conclusion, programming principles are an integral part of a developer's professional growth. They serve
as the foundation for creating high-quality software and must be constantly improved and applied in
daily development practice.

</details>


-----------

<details>
<summary>Урок 42. Изучение принципов программирования </summary>

# Урок 42. Изучение принципов программирования

## Введение в принципы программирования

### Обзор урока

Этот урок посвящен изучению основных принципов программирования, которые необходимы каждому разработчику для написания
чистого, эффективного и поддерживаемого кода. Мы рассмотрим как фундаментальные концепции, такие как переменные, циклы и
функции, так и более продвинутые темы, включая принципы SOLID, DRY и KISS. Урок структурирован таким образом, чтобы дать
учащимся комплексное понимание того, как эти принципы применяются в реальной разработке программного обеспечения.

### Зачем изучать принципы программирования?

Принципы программирования формируют основу для создания качественного программного обеспечения. Знание этих принципов
позволяет разработчикам писать код, который легко поддается масштабированию, тестированию и поддержке. Это не только
улучшает качество продукта, но и облегчает совместную работу в команде, так как код становится более понятным и
стандартизированным. В конечном итоге, владение этими принципами ведет к сокращению времени и затрат на разработку и
поддержку проектов.

## Цели и задачи урока

Основной целью урока является ознакомление учащихся с ключевыми принципами программирования и понимание их значения для
разработки качественного ПО. К концу урока вы сможете:

- Понимать и объяснять основные принципы программирования.
- Применять эти принципы при написании кода.
- Анализировать существующий код с точки зрения применения принципов программирования.
- Улучшать качество кода путем рефакторинга с учетом изученных принципов.

Урок предполагает не только теоретическое изучение материала, но и практическую работу с кодом, что позволит закрепить
полученные знания и навыки.

## Основы программирования

### Что такое программирование?

Программирование — это процесс создания программ и приложений с помощью языков программирования, который включает в себя
написание, тестирование, отладку и поддержку кода. Основные понятия в программировании включают алгоритмы, структуры
данных, паттерны проектирования и принципы разработки.

### Языки программирования и их роль

Языки программирования являются инструментами для разработки программного обеспечения. Разные языки предназначены для
решения специфических задач: например, JavaScript традиционно используется для веб-разработки, Python — для научных
исследований и разработки веб-приложений, Java и C# часто применяются в корпоративных приложениях и для разработки
мобильных приложений. Выбор языка программирования зависит от требований к проекту, экосистемы и предпочтений
разработчика.

### Структура программы

Основные элементы структуры программы включают переменные, типы данных, управляющие структуры, а также функции и методы.

- **Переменные и типы данных**
    - Переменные используются для хранения данных. Типы данных определяют, какого рода данные могут храниться в
      переменной (например, целые числа, вещественные числа, строки).

- **Управляющие структуры: условные операторы, циклы**
    - Управляющие структуры позволяют изменять поток выполнения программы с помощью условий (if-else) и циклов (for,
      while), что делает код гибким и адаптивным к различным ситуациям.

- **Функции и методы**
    - Функции и методы организуют код в логические блоки, предназначенные для выполнения конкретных задач. Они могут
      принимать параметры и возвращать результаты, что облегчает повторное использование кода и упрощает поддержку
      программы.

Эти элементы являются фундаментом для построения программ и присутствуют в той или иной форме в большинстве языков
программирования. Понимание их роли и правильное применение является ключом к созданию эффективного и легко
поддерживаемого кода.

## Принципы программирования

### Чистый код

#### Что такое "чистый код"?

Чистый код — это такой код, который легко читать, понимать и изменять. Он отличается простотой, ясностью и
лаконичностью. Чистый код не только облегчает поддержку и развитие программного продукта, но и уменьшает вероятность
ошибок. Он должен быть написан так, как если бы разработчик ожидал, что следующий человек, работающий с его кодом, будет
не знающим его в деталях и под спешкой.

#### Правила написания чистого кода

1. **Именование**

- Используйте понятные и описательные имена переменных, функций и классов. Имя должно отражать то, зачем существует
  переменная или что делает функция.

2. **Методы**

- Методы должны быть небольшими и выполнять только одну задачу. Это упрощает их понимание, тестирование и
  переиспользование.

3. **Комментарии**

- Комментарии должны использоваться с умом. Хороший код в большинстве случаев самодокументируемый. Используйте
  комментарии для объяснения "почему" было принято решение, а не "что" делает код.

4. **Форматирование**

- Соблюдайте единый стиль кодирования во всём проекте. Это касается отступов, скобок, пробелов и так далее. Единообразие
  упрощает чтение кода.

5. **Обработка ошибок**

- Обработка ошибок является важной частью чистого кода. Ошибки должны быть обработаны явно и грациозно, чтобы не
  усложнять основную логику.

6. **DRY (Don’t Repeat Yourself)**

- Избегайте дублирования кода. Повторяющийся код усложняет изменения и увеличивает вероятность ошибок.

7. **YAGNI (You Ain’t Gonna Need It)**

- Не добавляйте функциональность просто потому, что она может понадобиться в будущем. Это приводит к усложнению кода без
  непосредственной необходимости.

8. **Принцип единственной ответственности**

- Каждый модуль или класс должен иметь одну причину для изменения. Это упрощает понимание, тестирование и поддержку
  кода.

Принципы написания чистого кода являются основой для профессиональной разработки программного обеспечения. Они
способствуют созданию качественного продукта, упрощают сопровождение и развитие системы и повышают эффективность работы
команды.

## SOLID принципы

SOLID — это аббревиатура, представляющая пять основных принципов объектно-ориентированного программирования и дизайна,
которые помогают разработчикам создавать системы, легкие в поддержке и расширении.

### Single Responsibility (Принцип единственной ответственности)

Каждый класс должен иметь только одну причину для изменения. Этот принцип утверждает, что класс должен заниматься только
одной задачей или функциональностью. Если класс отвечает за выполнение нескольких задач, его изменение из-за требований
к одной из задач может повлиять на зависимую функциональность.

![img.png](images%2Fimg.png)

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

Создать класс `Report`, который имеет две ответственности: формирование и печать отчёта. Затем разделите его так, чтобы
каждый класс имел только одну ответственность.
</details>

### Open/Closed (Принцип открытости/закрытости)

Программные сущности (классы, модули, функции и т. д.) должны быть открыты для расширения, но закрыты для модификации.
Это означает, что можно добавлять новую функциональность, не изменяя существующий код, что снижает риск внесения ошибок
в уже работающую систему.

![img_1.png](images%2Fimg_1.png)

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

Создать интерфейс `Shape` с методом `area()`. Используйте этот интерфейс для создания классов `Circle` и `Rectangle`.
После этого реализуйте функцию, которая принимает массив объектов типа `Shape` и вычисляет общую площадь.
</details>

### Liskov Substitution (Принцип подстановки Барбары Лисков)

Объекты в программе можно заменять их наследниками без изменения правильности выполнения программы. Этот принцип
подчеркивает важность того, чтобы подклассы были взаимозаменяемы с их базовыми классами, не нарушая работу программы.

![img_2.png](images%2Fimg_2.png)

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

Создать класс `Bird` с методом `fly()`, затем реализуйте подклассы `Penguin` и `Eagle`. Оба должны наследовать `Bird`,
но только `Eagle` может летать.
</details>

### Interface Segregation (Принцип разделения интерфейса)

Клиенты не должны зависеть от интерфейсов, которые они не используют. Следует разделять большие интерфейсы на более
мелкие и специфические, чтобы классы, реализующие эти интерфейсы, не имели лишнего кода, который им не нужен.

![img_3.png](images%2Fimg_3.png)

<details style="margin-left: 20px;">
<summary>Задание 4:</summary>

Создать интерфейс `Machine` с методами `print()`, `fax()` и `scan()`. Реализуйте классы `Printer` и `Photocopier`,
которые имплементируют только необходимые методы.
</details>

### Dependency Inversion (Принцип инверсии зависимостей)

Модули высокого уровня не должны зависеть от модулей низкого уровня. Оба типа модулей должны зависеть от абстракций.
Кроме того, абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций. Этот принцип направлен на
уменьшение зависимостей между модулями кода, что облегчает их тестирование и поддержку.

![img_4.png](images%2Fimg_4.png)

<details style="margin-left: 20px;">
<summary>Задание 5:</summary>

Создать интерфейс `Database` с методами `read()` и `write()`. Используйте этот интерфейс для создания
классов `MySQLDatabase` и `MongoDatabase`.
</details>

Применение SOLID принципов в разработке помогает создавать более гибкие, удобные для поддержки и расширения системы, что
важно при работе над сложными проектами и в больших командах.


<details style="margin-left: 20px;">
<summary>Код не соответствующий принципам SOLID:</summary>

```java
import java.util.List;

public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    // Этот метод делает слишком много. Он изменяет состояние и занимается выводом.
    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    // Метод для добавления автомобиля в базу данных (нарушает SRP и DIP)
    public void saveCarToDatabase(List<Car> database) {
        database.add(this);
        System.out.println("Car saved to database.");
    }
}

```

В этом коде есть несколько проблем:

1. **Single Responsibility Principle (SRP)**: Класс `Car` имеет больше одной ответственности. Он управляет данными
   автомобиля и
   сохраняет их в базу данных.

2. **Open/Closed Principle (OCP)**: Если нужно изменить способ сохранения данных, класс `Car` потребуется
   модифицировать.

3. **Liskov Substitution Principle (LSP)**: В этом простом примере LSP не очень применим, но можно представить, что если
   мы
   расширяем этот класс, проблемы могут возникнуть.

4. **Interface Segregation Principle (ISP)**: Класс `Car` имеет метод `saveCarToDatabase()`, который не связан с
   основной
   ответственностью класса.

5. **Dependency Inversion Principle (DIP)**: Класс `Car` зависит от конкретного списка, что делает его зависимым от
   низкоуровневой детали.

</details>

<details style="margin-left: 20px;">
<summary>Код соответствующий принципам SOLID:</summary>

1. **Single Responsibility Principle (SRP)**: Разделим ответственности, выделим метод `saveCarToDatabase()` в отдельный
   интерфейс и класс.

2. **Open/Closed Principle (OCP)**: Использование интерфейса для сохранения данных позволит нам расширять
   функциональность без изменения существующего кода.

3. **Liskov Substitution Principle (LSP)**: Пока здесь нечего менять, но будем помнить о принципе при расширении
   функциональности.

4. **Interface Segregation Principle (ISP)**: Мы создадим интерфейс только для сохранения данных, чтобы не нарушать
   основные функции класса Car.

5. **Dependency Inversion Principle (DIP)**: Класс `Car` будет зависеть от абстракции, а не от конкретного класса.

```java
import java.util.List;

// Интерфейс для сохранения автомобиля
interface CarSaver {
    void save(Car car);
}
```

```java
// Реализация интерфейса CarSaver
class DatabaseCarSaver implements CarSaver {
    private List<Car> database;

    public DatabaseCarSaver(List<Car> database) {
        this.database = database;
    }

    public void save(Car car) {
        database.add(car);
        System.out.println("Car saved to database.");
    }
}

// Класс Car теперь следует принципам SOLID
public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    // Методы, связанные только с автомобилем
    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }
}
```

```java
// Использование
public static void main(String[] args) {
    List<Car> carDatabase = new ArrayList<>();
    CarSaver carSaver = new DatabaseCarSaver(carDatabase);

    Car myCar = new Car("Model S", "Tesla", 2020);
    myCar.startEngine();
    myCar.showCarDetails();

    // Сохраняем автомобиль в базу данных
    carSaver.save(myCar);
}
```

</details>

## DRY и KISS

### DRY (Don’t Repeat Yourself) - Не повторяйся

Принцип DRY подчеркивает важность избегания дублирования кода. Цель этого принципа — уменьшить повторение информации в
программном обеспечении. Дублирование кода увеличивает вероятность ошибок и усложняет процесс внесения изменений,
поскольку необходимо вносить одно и то же изменение в нескольких местах. Применение DRY ведет к созданию более
управляемого, расширяемого и поддерживаемого кода, поскольку для изменения поведения достаточно внести изменения в одном
месте.

<details style="margin-left: 20px;">
<summary>Пример использования DRY</summary>

<details style="margin-left: 20px;">
<summary>Код не соответствующий принципам DRY:</summary>

В этом примере код для подключения к базе данных, выполнения запроса и закрытия соединения практически идентичен во всех
трех методах. Это нарушает принцип DRY, так как одна и та же логика повторяется в нескольких местах, что увеличивает
сложность поддержки и риски при внесении изменений.

```java
public class ReportGenerator {

    public void generateDailyReport() {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM daily_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }

    public void generateWeeklyReport() {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM weekly_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }

    public void generateMonthlyReport() {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM monthly_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }
}

```

</details>

<details style="margin-left: 20px;">
<summary>Код соответствующий принципам DRY:</summary>

Чтобы код соответствовал принципу DRY, мы можем вынести повторяющуюся логику подключения к базе данных, выполнения
запроса и закрытия соединения в отдельный метод. Это уменьшит дублирование кода и упростит внесение изменений в будущем.

```java
public class ReportGenerator {

    private void generateReport(String query) {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Подключение к базе данных
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            // Выполнение запроса к базе данных
            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
            // Обработка результатов запроса
            while (rs.next()) {
                // Логика отображения результатов
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Закрытие соединений и ресурсов
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void generateDailyReport() {
        generateReport("SELECT * FROM daily_reports");
    }

    public void generateWeeklyReport() {
        generateReport("SELECT * FROM weekly_reports");
    }

    public void generateMonthlyReport() {
        generateReport("SELECT * FROM monthly_reports");
    }
}
```

В этом измененном примере, метод `generateReport` принимает SQL запрос в качестве параметра и выполняет всю необходимую
логику работы с базой данных. Теперь, вместо дублирования кода, методы `generateDailyReport`, `generateWeeklyReport`, и
`generateMonthlyReport` просто вызывают `generateReport` с соответствующим SQL запросом. Это делает код более чистым,
удобным для поддержки и расширения.
</details>
</details>

### KISS (Keep It Simple, Stupid) - Делай проще

Принцип KISS выступает за простоту в дизайне и реализации. Он утверждает, что системы работают лучше, когда они остаются
простыми и не усложненными. Сложность следует избегать и стараться решать задачи максимально прямолинейно и понятно. Это
не означает, что нужно жертвовать функциональностью ради простоты, но при выборе между двумя решениями следует отдавать
предпочтение тому, которое проще понять и реализовать. Применение KISS помогает избежать излишней сложности, которая
может привести к ошибкам и затруднить поддержку и расширение системы.

Оба этих принципа направлены на улучшение качества кода и упрощение процесса разработки. Применяя DRY, разработчики
избегают повторения, что делает код более чистым и удобным для поддержки. Следуя KISS, они стараются делать решения как
можно проще, что уменьшает риск введения ошибок и облегчает понимание системы как для текущих, так и для будущих
разработчиков.

<details style="margin-left: 20px;">
<summary>Пример использования KISS</summary>

<details style="margin-left: 20px;">
<summary>Код не соответствующий принципам KISS:</summary>


Давай рассмотрим пример кода, который усложнен без необходимости, нарушая принцип KISS (Keep It Simple, Stupid — Делай
проще). Этот пример иллюстрирует, как можно усложнить решение простой задачи — например, проверку, является ли число
простым.

```java
public class ComplexPrimeCheck {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPrime(int number) {
        if (number < 10) {
            if (number == 2 || number == 3 || number == 5 || number == 7) {
                return true;
            } else {
                return false;
            }
        } else {
            return isPrime(number);
        }
    }
}

```

В этом примере метод `checkPrime` пытается оптимизировать проверку простых чисел за счет предварительной проверки чисел
меньше 10, что на самом деле является излишним и усложняет понимание кода. Основная логика проверки простого числа в
методе `isPrime` уже достаточно эффективна и покрывает все случаи, включая числа меньше 10.
</details>

<details style="margin-left: 20px;">
<summary>Код соответствующий принципам KISS:</summary>

Пример можно упростить, убрав излишнюю предварительную проверку, тем самым сделав его более соответствующим принципу
KISS:

```java
public class SimplePrimeCheck {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

Теперь код стал проще и легче для понимания, при этом функциональность осталась той же. Упрощение кода в соответствии с
принципом KISS облегчает его поддержку и тестирование.
</details>
</details>

## Заключение по теме принципов программирования

Изучение и применение основных принципов программирования, таких как Чистый код, SOLID, DRY, KISS, играет ключевую роль
в разработке качественного и устойчивого к изменениям программного обеспечения. Эти принципы направлены на улучшение
поддерживаемости, расширяемости и понятности кода, что важно как для индивидуальных разработчиков, так и для команд.

- **Чистый код** помогает сделать программу более понятной и легкой в обслуживании, минимизируя время, необходимое для
  понимания и модификации кода.
- **Принципы SOLID** обеспечивают создание гибких и модульных систем, упрощающих добавление новой функциональности и
  адаптацию к изменяющимся требованиям без нарушения существующего кода.
- **DRY** и **KISS** способствуют уменьшению дублирования и избыточной сложности кода, что делает его более эффективным
  и удобным для восприятия.

Применение этих принципов требует осознанного подхода и практики, но оно того стоит. Следуя этим руководящим принципам,
разработчики могут создавать программное обеспечение, которое не только отвечает текущим требованиям, но и легко
адаптируется к будущим изменениям. Это ведет к снижению затрат на поддержку и развитие продукта, улучшению качества кода
и, в конечном итоге, к повышению удовлетворенности как разработчиков, так и пользователей.

В заключение, принципы программирования являются неотъемлемой частью профессионального роста разработчика. Они служат
фундаментом для создания качественного программного обеспечения и должны постоянно совершенствоваться и применяться в
повседневной практике разработки.


</details>