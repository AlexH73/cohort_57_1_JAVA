<details style="padding-top: 18px">
  <summary><b>English</b></summary>

<details>
  <summary><b>Introduction to Java</b></summary>

## Introduction to Java

Java is a high-level, object-oriented programming language used for developing a wide range of applications, from mobile
to server-side and embedded systems. The language was developed by Sun Microsystems in 1995 and has since become one of
the most popular programming languages in the world.

### Key Features of Java:

1. **Portability**: Java programs run on any platform that supports the JVM (Java Virtual Machine). This allows
   developers to write code once and run it anywhere ("Write Once, Run Anywhere").
2. **Object-Oriented**: Java supports OOP principles (inheritance, encapsulation, polymorphism), making it easier to
   develop complex applications.
3. **Security**: With built-in security mechanisms, Java protects applications from running malicious code.
4. **Memory Management**: Java uses an automatic garbage collector to free unused memory, eliminating the need for
   manual memory management.
5. **Multithreading**: Java supports the development of multithreaded applications, enabling the creation of highly
   performant programs.
6. **Extensive Standard Library**: Java provides a comprehensive set of pre-built classes and methods for solving most
   development tasks.

### Where Java is Used:

- **Web Development**: Server-side applications and REST APIs.
- **Mobile Applications**: Development of Android apps.
- **Enterprise Applications**: Banking and logistics systems.
- **Embedded Systems**: Programs for home appliances, terminals, and sensors.
- **Game Development**: Creation of multiplayer games and game servers.

### Why Learn Java:

1. **Popularity and Demand**: Java is widely used in the enterprise world, and demand for Java developers remains
   consistently high.
2. **Ease of Learning**: With its structured and clear syntax, Java is beginner-friendly.
3. **Vast Ecosystem**: Java is supported by a wide range of libraries and tools that accelerate development.

In the next section, we will start with installing Java and setting up the development environment for comfortable
coding.

## Installing Java and an IDE

To work with Java, you need to install the Java Development Kit (JDK), which provides the tools required to develop Java
applications. You’ll also need an Integrated Development Environment (IDE), such as IntelliJ IDEA, to write and debug
your code.

</details>

---

<details>
  <summary><b>Installing Java</b></summary>

### Installing JDK on Windows

1. **Download JDK:**
   - Visit the [official Java download page by Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Select the latest JDK version and download the installer for Windows.

2. **Install JDK:**
   - Run the downloaded `.exe` file.
   - Follow the installation wizard. By default, JDK will be installed in `C:\Program Files\Java\jdk-XX`.
   - Ensure you are installing the JDK and not just the JRE.

3. **Set Environment Variables:**
   - Open "Control Panel" → "System" → "Advanced system settings."
   - Go to the "Environment Variables" section.
   - Add a new variable `JAVA_HOME` with the path to your JDK installation (e.g., `C:\Program Files\Java\jdk-XX`).
   - Edit the `Path` variable and append `;%JAVA_HOME%\bin`.
   - Click "OK" to save changes.

4. **Verify Installation:**
   - Open the Command Prompt and run:
     ```bash
     java -version
     ```
   - If Java is installed correctly, you will see the JDK version displayed.

---

### Installing JDK on macOS

1. **Download JDK:**
   - Visit the [official Java download page by Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Download the installer for macOS (usually a `.dmg` file).

2. **Install JDK:**
   - Open the downloaded `.dmg` file.
   - Run the installer and follow the instructions.

3. **Verify Installation:**
   - Open the Terminal and run:
     ```bash
     java -version
     ```
   - Ensure the installed JDK version is displayed.

---

### Installing JDK on Linux

1. **Download and Install:**
   - Visit the [official Java download page by Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Download the `.tar.gz` archive for Linux.
   - Extract the archive to your desired directory:
     ```bash
     tar -xvzf jdk-XX_linux-x64_bin.tar.gz -C /opt/
     ```

2. **Set Environment Variables:**
   - Open the `~/.bashrc` (or `~/.zshrc`) file:
     ```bash
     nano ~/.bashrc
     ```
   - Add the following lines:
     ```bash
     export JAVA_HOME=/opt/jdk-XX
     export PATH=$JAVA_HOME/bin:$PATH
     ```
   - Save the file and apply the changes:
     ```bash
     source ~/.bashrc
     ```

3. **Verify Installation:**
   - Run the following command:
     ```bash
     java -version
     ```
   - Ensure the JDK version is displayed correctly.

---

### Installing IntelliJ IDEA

1. **Download the IDE:**
   - Visit the [official IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/other.html).
   - Download the **Community** version (free) or **Ultimate** version (for advanced features).

2. **Installation on Windows:**
   - Run the installer and follow the setup wizard.
   - Choose the installation directory and enable the option to add a desktop shortcut.
   - Ensure the "Add to PATH" option is checked.

3. **Installation on macOS:**
   - Open the downloaded `.dmg` file.
   - Drag and drop the IntelliJ IDEA icon into the "Applications" folder.

4. **Installation on Linux:**
   - Extract the `.tar.gz` archive to your desired location:
     ```bash
     tar -xvzf idea-IC-XX.tar.gz -C /opt/
     ```
   - Run the IDE using the `bin/idea.sh` script.

5. **Initial Setup:**
   - On the first launch, select your preferred theme (light or dark).
   - Specify the path to the previously installed JDK.
   - Install any plugins you may need.

Now your system is ready to write and execute Java programs. In the next lesson, we will explore the basic syntax of the
language.

</details>

------

<details>
  <summary><b>Basic Java Syntax</b></summary>

### Classes and the main Method

Java is an object-oriented programming language, and all programs in Java are written inside classes. The main entry point for any program is the `main` method.

**Example of basic program structure:**

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- `class HelloWorld` — defines a class named `HelloWorld`. The class name must match the filename (e.g., `HelloWorld.java`).
- `public static void main(String[] args)` — this method is called by the JVM (Java Virtual Machine) when the program starts.
   - `public` means the method can be accessed from outside the class.
   - `static` allows the JVM to call the method without creating an object of the class.
   - `void` indicates that the method does not return any value.
   - `String[] args` — arguments passed to the program from the command line.

---

### Console Output

To print text to the screen, Java uses the `System.out.println()` method.

**Examples:**

```java
System.out.println("Hello, Java!"); // Prints a line with a line break
System.out.print("This is ");      // Prints text without a line break
System.out.println("Java!");      // Continues the previous line
```

Output:

```text
Hello, Java!
This is Java!
```


### Declaring Variables

Variables in Java must always have a strictly defined type, specified during declaration.

**Syntax:**
```java
type variable_name = value;
```

**Examples:**

```java
int age = 25;                  // Integer
double salary = 55000.75;      // Floating-point number
char grade = 'A';              // Single character
String name = "Ilias";         // String
boolean isJavaFun = true;      // Boolean value
```

**Key points:**
- Variables must be declared before they are used.
- Variable names must start with a letter, `_`, or `$`.
- It is recommended to use `camelCase` for variable names.

---

### Comparison of Basic Operations: Python vs Java

| **Operation**        | **Python**                                     | **Java**                                     |
|----------------------|-----------------------------------------------|---------------------------------------------|
| **Print (print)**     | `print("Hello, World!")`                      | `System.out.println("Hello, World!");`      |
| **Input (input)**     | `name = input("Enter your name: ")`           | `Scanner sc = new Scanner(System.in);`      |
|                      |                                               | `String name = sc.nextLine();`              |
| **For Loop**          | `for i in range(5):`                          | `for (int i = 0; i < 5; i++) {`             |
|                      | `    print(i)`                                | `    System.out.println(i);`                |
|                      |                                               | `}`                                         |
| **While Loop**        | `while condition:`                            | `while (condition) {`                       |
|                      | `    # do something`                          | `    // do something`                       |
|                      |                                               | `}`                                         |
| **If-Else Statement**| `if a > b:`                                   | `if (a > b) {`                              |
|                      | `    print("A is greater")`                   | `    System.out.println("A is greater");`   |
|                      | `else:`                                       | `} else {`                                  |
|                      | `    print("B is greater")`                   | `    System.out.println("B is greater");`   |
|                      |                                               | `}`                                         |

---

In the next section, we will explore control structures such as conditional statements and loops.

</details>

--------

<details>
  <summary><b>Data Types and Differences Between Python and Java</b></summary>

### Data Types in Java

Java is a statically typed language, meaning every variable must have a declared type, and the type cannot change during the program's execution. Java has two main categories of data types:

1. **Primitive Data Types:**
   - These are the most basic data types and are not objects.
   - Examples:
      - `byte`: 1 byte, integer range from -128 to 127.
      - `short`: 2 bytes, integer range from -32,768 to 32,767.
      - `int`: 4 bytes, integer range from -2,147,483,648 to 2,147,483,647.
      - `long`: 8 bytes, larger integer values.
      - `float`: 4 bytes, single-precision floating-point.
      - `double`: 8 bytes, double-precision floating-point.
      - `char`: 2 bytes, a single Unicode character.
      - `boolean`: 1 bit, values `true` or `false`.

2. **Reference Data Types:**
   - These are objects and include classes, arrays, and interfaces.
   - Examples:
      - `String`: A sequence of characters.
      - Arrays: Collections of elements of the same type.

**Example of declaring variables in Java:**

```java
int age = 30;          // Integer
double price = 99.99;  // Floating-point number
char grade = 'A';      // Single character
boolean isActive = true; // Boolean
String name = "Alice"; // Reference type
```

---

### Key Differences Between Python and Java Data Types

| **Feature**               | **Python**                            | **Java**                                |
|---------------------------|----------------------------------------|-----------------------------------------|
| **Typing**                | Dynamically typed                     | Statically typed                        |
| **Declaration**           | No need to declare type explicitly    | Type must be explicitly declared        |
| **Integer Range**         | No limit for integers                 | Limited by `int` or `long`              |
| **String Handling**       | Immutable, no need for type prefix    | Immutable, declared as `String`         |
| **Boolean Values**        | `True` or `False`                     | `true` or `false`                       |
| **Collections**           | Flexible and diverse (`list`, `dict`) | Requires explicit arrays or objects     |

---

### Examples of Differences in Practice

**Variable Declaration:**

Python:

```python
x = 10       # No type declaration
y = "hello"  # Type inferred as string
z = True     # Type inferred as boolean
```

Java:
```java
int x = 10;          // Explicit type declaration
String y = "hello";  // Explicitly defined as string
boolean z = true;    // Boolean type declared explicitly
```

---

### Why Java Requires Static Typing

Static typing in Java helps the compiler detect type-related errors during compilation rather than at runtime. This leads to more robust and predictable programs but requires more boilerplate code compared to Python.

---

### Practical Task

Write a program that declares and initializes variables of all primitive data types in Java. Print each variable to the console, explaining its purpose.

---

In the next section, we will explore control structures in Java, such as conditional statements and loops.

</details>

-------

<details>
  <summary><b>Control Structures</b></summary>

### Conditional Statements (if-else)

Conditional statements in Java allow you to execute different blocks of code depending on certain conditions. The basic syntax is as follows:

**Syntax:**
```java
if (condition) {
    // Code executed if the condition is true
} else if (another_condition) {
    // Code executed if another condition is true
} else {
    // Code executed if none of the conditions are true
}
```

**Example:**
```java
int age = 18;

if (age >= 18) {
    System.out.println("You are an adult.");
} else if (age > 12) {
    System.out.println("You are a teenager.");
} else {
    System.out.println("You are a child.");
}
```

---

### Loops

Loops allow you to repeat a block of code while a condition is true or for a set number of iterations.

#### For Loop

The `for` loop is used when the number of iterations is known. Its syntax includes three parts: initialization, condition, and increment.

**Syntax:**
```java
for (initialization; condition; increment) {
   // Code executed in each iteration
}

```
**Example:**
```java
for (int i = 0; i < 5; i++) {
   System.out.println("Iteration: " + i);
}
```

---

#### While Loop

The `while` loop executes a block of code as long as the condition is true. It's often used when the number of iterations is unknown.

**Syntax:**
```java
while (condition) {
   // Code executed while the condition is true
}
```

**Example:**
```java
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

---

#### Do-While Loop

The `do-while` loop is similar to `while`, but it guarantees that the body of the loop will execute at least once since the condition is checked after the code is executed.

**Syntax:**
```java
do {
    // Code executed at least once
} while (condition);
```

**Example:**
```java
int i = 0;
do {
    System.out.println("Iteration: " + i);
i++;
} while (i < 5);
```

---

### Comparison of Python and Java Control Structures

| **Structure**         | **Python**                          | **Java**                                  |
|-----------------------|--------------------------------------|-------------------------------------------|
| **if-else**           | `if condition:`                     | `if (condition) { ... }`                 |
|                       | `elif another_condition:`           | `else if (another_condition) { ... }`    |
|                       | `else:`                             | `else { ... }`                           |
| **for loop**          | `for i in range(5):`                | `for (int i = 0; i < 5; i++) { ... }`    |
|                       | `for item in collection:`           | Requires explicit `for` with collections |
| **while loop**        | `while condition:`                  | `while (condition) { ... }`              |
| **do-while loop**     | Not available in Python             | `do { ... } while (condition);`          |

---

### Practical Task

1. Write a program that determines if an entered number is positive, negative, or zero using `if-else`.
2. Write a program that prints numbers from 1 to 10:
   - Using `for`.
   - Using `while`.
   - Using `do-while`.


</details>

<details>
  <summary><b>Arrays in Java</b></summary>

### What is an Array in Java?

An array in Java is a data structure of fixed size that allows you to store multiple elements of the same type. Key features of arrays include:
- **Fixed size:** Once created, the size of the array cannot be changed.
- **Type-safe:** All elements in the array must be of the same type.
- **Indexed access:** Array elements are accessed via their indices, starting from 0.

---

### Creating an Array

1. **Declaration and memory allocation:**
```java
   int[] numbers = new int[5]; // An array of 5 integers
```
    - The array is initialized with default values (`0` for numbers, `null` for objects, `false` for booleans).

2. **Creation and initialization:**
```java
   int[] numbers = {10, 20, 30, 40, 50}; // Explicit initialization
```

3. **Filling an array using a loop:**
```java
   int[] numbers = new int[5];
   for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i * 2; // Fills with values: 0, 2, 4, 6, 8
   }
```

---

### Accessing Array Elements

To retrieve or modify array values, use their indices.

**Example:**
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[1]); // Output: 20
numbers[1] = 50;                // Modifying the element
System.out.println(numbers[1]); // Output: 50
```

Accessing an index outside the bounds of the array will throw an `ArrayIndexOutOfBoundsException`.

---

### Iterating Over an Array

1. **Using a for loop:**
```java
   int[] numbers = {10, 20, 30, 40, 50};
   for (int i = 0; i < numbers.length; i++) {
        System.out.println("Element at index " + i + ": " + numbers[i]);
   }
```

2. **Using an enhanced for loop (for-each):**
```java
   int[] numbers = {10, 20, 30, 40, 50};
   for (int number : numbers) {
        System.out.println("Element: " + number);
   }
```

---

### Comparing Arrays in Python and Java

| **Feature**              | **Python**                                      | **Java**                                         |
|--------------------------|------------------------------------------------|-------------------------------------------------|
| **Typing**               | Dynamic                                        | Static: single type for all elements           |
| **Size**                 | Dynamic: elements can be added/removed         | Fixed, defined at creation                     |
| **Initialization**       | `numbers = [10, 20, 30]`                       | `int[] numbers = {10, 20, 30};`                |
| **Indexing**             | `numbers[1]`                                   | `numbers[1]`                                   |
| **Filling with a loop**  | `numbers = [i * 2 for i in range(5)]`          | `for (int i = 0; i < numbers.length; i++) {}`  |
| **Iteration**            | `for num in numbers:`                          | `for (int num : numbers) {}`                   |

---

### Advantages and Disadvantages of Arrays in Java

**Advantages:**
- Simple to use for fixed-size data.
- High performance due to direct index-based access.

**Disadvantages:**
- The size of the array cannot be changed after creation.
- For more complex operations, collections such as `ArrayList` or `LinkedList` are required.

---

### Practical Tasks

1. Create an array of 10 numbers, fill it with the squares of their indices, and print them.
2. Write a program to find the maximum element in an array of 5 numbers.
3. Iterate through an array of strings and print them in reverse order.


</details>



<details>
  <summary><b>Methods in Java</b></summary>

### What is a Method?

A method in Java is a block of code designed to perform a specific task. It can accept parameters, return values, or act as a procedure (a method without a return value). Methods help make code more readable, reusable, and structured.

---

### Defining and Calling Methods

**Syntax for defining a method:**

Java:
```java
public static void printMessage() {
System.out.println("Hello, Java!");
}
```

Python:
```python
def print_message():
print("Hello, Python!")
```

**Calling a method:**

Java:
```java
public static void main(String[] args) {
printMessage(); // Method call
}
```

Python:
```python
print_message()  # Function call
```

---

### Method Parameters

Methods can accept parameters, allowing data to be passed into the method for processing.

**Example of a method with parameters:**

Java:
```java
public static void greet(String name) {
System.out.println("Hello, " + name + "!");
}
```

Python:
```python
def greet(name):
print(f"Hello, {name}!")
```

**Calling the method:**

Java:
```java
public static void main(String[] args) {
greet("Alice"); // Output: Hello, Alice!
greet("Bob");   // Output: Hello, Bob!
}
```

Python:
```python
greet("Alice")  # Output: Hello, Alice!
greet("Bob")    # Output: Hello, Bob!
```

---

### Return Values

A method can return a value that can then be used elsewhere in the program. The `return` keyword is used for this.

**Example of a method with a return value:**

Java:
```java
public static int add(int a, int b) {
return a + b; // Returns the sum of two numbers
}
```

Python:
```python
def add(a, b):
return a + b  # Returns the sum of two numbers
```

**Calling the method:**

Java:
```java
public static void main(String[] args) {
int result = add(5, 3); // Store the result in a variable
System.out.println("Result: " + result); // Output: Result: 8
}
```

Python:
```python
result = add(5, 3)  # Store the result in a variable
print(f"Result: {result}")  # Output: Result: 8
```

---

### Method Overloading

In Java, there are no optional parameters like in Python. Instead, **method overloading** is used, allowing multiple methods with the same name but different parameter counts or types.

**Example of method overloading:**

Java:
```java
public static int multiply(int a, int b) {
return a * b;
}

public static int multiply(int a, int b, int c) {
return a * b * c;
}
```

Python (optional parameters instead of overloading):
```python
def multiply(a, b, c=None):
if c is None:
return a * b
return a * b * c
```

**Calling the methods:**

Java:
```java
public static void main(String[] args) {
System.out.println(multiply(2, 3));       // Output: 6
System.out.println(multiply(2, 3, 4));   // Output: 24
}
```

Python:
```python
print(multiply(2, 3))      # Output: 6
print(multiply(2, 3, 4))   # Output: 24
```

---

### Comparison of Methods in Python and Java

| **Feature**             | **Python**                                     | **Java**                                      |
|-------------------------|-----------------------------------------------|----------------------------------------------|
| **Method definition**   | `def greet(name):`                            | `public static void greet(String name) {`    |
| **Optional arguments**  | Yes: `def greet(name="Guest"):`               | No, uses method overloading                  |
| **Return values**       | `return a + b`                                | `return a + b;`                              |
| **Method overloading**  | Not supported, emulated through arguments     | Fully supported via different signatures     |

---

### Practical Tasks

1. Write a method `multiply` that accepts two numbers and returns their product.
2. Create an overloaded `multiply` method that accepts three numbers and returns their product.
3. Implement a method `greet` that accepts a name as a parameter and prints a greeting.
4. Implement a method `findMax` that accepts an array of numbers and returns the maximum value.

---

In the next section, we will dive deeper into working with arrays and methods in Java.

</details>
</details>

-------

<details style="padding-top: 18px">
  <summary><b>На русском</b></summary>
<details>
  <summary><b>Введение в Java</b></summary>

## Введение в Java

Java — это высокоуровневый объектно-ориентированный язык программирования, который используется для разработки самых
разных приложений: от мобильных до серверных и встроенных систем. Язык был разработан компанией Sun Microsystems в 1995
году и с тех пор стал одним из самых популярных языков программирования в мире.

### Основные особенности Java:

1. **Портативность**: Java-программы работают на любой платформе, поддерживающей JVM (Java Virtual Machine). Это
   позволяет писать код один раз и запускать его где угодно ("Write Once, Run Anywhere").
2. **Объектно-ориентированность**: Java поддерживает принципы ООП (наследование, инкапсуляция, полиморфизм), что
   упрощает разработку сложных приложений.
3. **Безопасность**: Благодаря встроенным механизмам безопасности Java защищает приложения от выполнения вредоносного
   кода.
4. **Управление памятью**: Java использует автоматический сборщик мусора (Garbage Collector), который освобождает
   неиспользуемую память, избавляя программиста от необходимости делать это вручную.
5. **Многопоточность**: Java поддерживает разработку многопоточных приложений, что позволяет создавать программы с
   высокой производительностью.
6. **Большая стандартная библиотека**: Java предоставляет обширный набор готовых классов и методов для решения
   большинства задач разработки.

### Где используется Java:

- **Веб-разработка**: Серверные приложения и REST API.
- **Мобильные приложения**: Разработка приложений для Android.
- **Корпоративные приложения**: Банковские и логистические системы.
- **Встроенные системы**: Программы для бытовой техники, терминалов и датчиков.
- **Игровая индустрия**: Создание многопользовательских игр и серверов.

### Почему стоит изучать Java:

1. **Популярность и востребованность**: Java активно используется в корпоративной среде, и спрос на разработчиков Java
   остаётся стабильно высоким.
2. **Простота для изучения**: Благодаря строгой структуре и понятному синтаксису Java легко понять новичкам.
3. **Множество инструментов и фреймворков**: Java поддерживается огромным количеством библиотек и инструментов для
   ускорения разработки.

В следующем блоке мы начнем с установки Java и настроим рабочую среду для комфортного написания кода.

## Установка Java и IDE

Для работы с Java необходимо установить Java Development Kit (JDK) — это набор инструментов для разработки приложений на
Java. Также потребуется интегрированная среда разработки (IDE), например IntelliJ IDEA, для написания и отладки кода.

---

### Установка JDK на Windows

1. **Скачивание JDK:**
   - Перейдите на [официальную страницу загрузки Java от Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Выберите последнюю версию JDK и скачайте установочный файл для Windows.

2. **Установка JDK:**
   - Запустите скачанный файл `.exe`.
   - Следуйте инструкциям установщика. По умолчанию JDK устанавливается в папку `C:\Program Files\Java\jdk-XX`.
   - Убедитесь, что выбрана опция установки JDK, а не JRE.

3. **Настройка переменных окружения:**
   - Откройте "Панель управления" → "Система" → "Дополнительные параметры системы".
   - Перейдите в раздел "Переменные среды".
   - Добавьте переменную `JAVA_HOME` и укажите путь к папке с установленным JDK (
     например, `C:\Program Files\Java\jdk-XX`).
   - Найдите переменную `Path`, нажмите "Изменить" и добавьте `;%JAVA_HOME%\bin`.
   - Нажмите "ОК", чтобы сохранить изменения.

4. **Проверка установки:**
   - Откройте терминал (командную строку) и введите:
     ```bash
     java -version
     ```
   - Если Java установлена правильно, вы увидите сообщение с версией JDK.

</details>

---


<details>
  <summary><b>Установка Java</b></summary>

### Установка JDK на macOS

1. **Скачивание JDK:**
   - Перейдите на [официальную страницу загрузки Java от Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Скачайте установочный файл для macOS (обычно это `.dmg`).

2. **Установка JDK:**
   - Откройте скачанный `.dmg` файл.
   - Запустите установщик и следуйте инструкциям.

3. **Проверка установки:**
   - Откройте "Терминал" и введите:
     ```bash
     java -version
     ```
   - Убедитесь, что отображается установленная версия JDK.

---

### Установка JDK на Linux

1. **Скачивание и установка:**
   - Перейдите на [официальную страницу загрузки Java от Oracle](https://www.oracle.com/java/technologies/downloads/).
   - Скачайте архив `.tar.gz` для Linux.
   - Распакуйте архив в нужную директорию:
     ```bash
     tar -xvzf jdk-XX_linux-x64_bin.tar.gz -C /opt/
     ```

2. **Настройка переменных окружения:**
   - Откройте файл `~/.bashrc` (или `~/.zshrc`):
     ```bash
     nano ~/.bashrc
     ```
   - Добавьте строки:
     ```bash
     export JAVA_HOME=/opt/jdk-XX
     export PATH=$JAVA_HOME/bin:$PATH
     ```
   - Сохраните файл и примените изменения:
     ```bash
     source ~/.bashrc
     ```

3. **Проверка установки:**
   - Выполните команду:
     ```bash
     java -version
     ```
   - Убедитесь, что версия JDK отображается корректно.

---

### Установка IntelliJ IDEA

1. **Скачивание IDE:**
   - Перейдите на [официальную страницу IntelliJ IDEA](https://www.jetbrains.com/idea/download/other.html).
   - Скачайте версию **Community** (бесплатная) или **Ultimate** (для расширенных возможностей).

2. **Установка на Windows:**
   - Запустите установочный файл и следуйте инструкциям.
   - Выберите путь для установки и включите опцию добавления ярлыка на рабочий стол.
   - Убедитесь, что галочка "Добавить в PATH" активна.

3. **Установка на macOS:**
   - Откройте скачанный `.dmg` файл.
   - Перетащите значок IntelliJ IDEA в папку "Applications".

4. **Установка на Linux:**
   - Распакуйте скачанный архив `.tar.gz` в директорию, например:
     ```bash
     tar -xvzf idea-IC-XX.tar.gz -C /opt/
     ```
   - Запустите IDE через файл `bin/idea.sh`.

5. **Первоначальная настройка:**
   - При первом запуске выберите тему оформления (светлая или тёмная).
   - Укажите путь к JDK, установленному ранее.
   - Настройте плагины по необходимости.

Теперь ваша система готова для написания и выполнения программ на Java. В следующем уроке мы разберём базовый синтаксис
языка.

</details>

-------

<details>
  <summary><b>Основной синтаксис Java</b></summary>

### Классы и метод main

Java — это объектно-ориентированный язык программирования, и все программы на Java пишутся внутри классов. Основной точкой входа для любой программы является метод `main`.

**Пример базовой структуры программы:**
```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- `class HelloWorld` — определяет класс с именем `HelloWorld`. Название класса должно совпадать с именем файла (например, `HelloWorld.java`).
- `public static void main(String[] args)` — это метод, который JVM (Java Virtual Machine) вызывает при запуске программы.
   - `public` означает, что метод доступен для вызова извне.
   - `static` позволяет JVM вызывать метод без создания экземпляра класса.
   - `void` указывает, что метод не возвращает значения.
   - `String[] args` — аргументы командной строки, переданные программе.

---

### Вывод на консоль

Для вывода текста на экран используется метод `System.out.println()`.

**Примеры:**
```java
System.out.println("Hello, Java!"); // Вывод строки с переводом строки
System.out.print("This is ");      // Вывод строки без перевода строки
System.out.println("Java!");      // Продолжение строки
```

Результат:

```text
Hello, Java!
This is Java!
```


### Объявление переменных

Переменные в Java всегда имеют строго определённый тип, который указывается при объявлении.

**Синтаксис:**
```java
тип имя_переменной = значение;
```

**Примеры:**

```java
int age = 25;                  // Целое число
double salary = 55000.75;      // Число с плавающей точкой
char grade = 'A';              // Символ
String name = "Ilias";         // Строка
boolean isJavaFun = true;      // Логическое значение
```

**Особенности:**
- Переменные должны быть объявлены до использования.
- Имена переменных должны начинаться с буквы, символа `_` или `$`.
- Рекомендуется использовать стиль `camelCase` для имен переменных.

---

### Сравнение базовых операций: Python и Java

| **Операция**        | **Python**                                     | **Java**                                     |
|----------------------|-----------------------------------------------|---------------------------------------------|
| **Вывод (print)**    | `print("Hello, World!")`                      | `System.out.println("Hello, World!");`      |
| **Ввод (input)**     | `name = input("Enter your name: ")`           | `Scanner sc = new Scanner(System.in);`      |
|                      |                                               | `String name = sc.nextLine();`              |
| **Цикл (for)**       | `for i in range(5):`                          | `for (int i = 0; i < 5; i++) {`             |
|                      | `    print(i)`                                | `    System.out.println(i);`                |
|                      |                                               | `}`                                         |
| **Цикл (while)**     | `while condition:`                            | `while (condition) {`                       |
|                      | `    # do something`                          | `    // do something`                       |
|                      |                                               | `}`                                         |
| **Условие (if-else)**| `if a > b:`                                   | `if (a > b) {`                              |
|                      | `    print("A is greater")`                   | `    System.out.println("A is greater");`   |
|                      | `else:`                                       | `} else {`                                  |
|                      | `    print("B is greater")`                   | `    System.out.println("B is greater");`   |
|                      |                                               | `}`                                         |

</details>

-----

<details>
  <summary><b>Типы данных и различия между Python и Java</b></summary>

### Типы данных в Java

Java — это язык со строгой статической типизацией, то есть каждая переменная должна иметь объявленный тип, и этот тип не может изменяться в процессе выполнения программы. Типы данных в Java делятся на две основные категории:

1. **Примитивные типы данных:**
   - Это базовые типы данных, которые не являются объектами.
   - Примеры:
      - `byte`: 1 байт, целые числа от -128 до 127.
      - `short`: 2 байта, целые числа от -32,768 до 32,767.
      - `int`: 4 байта, целые числа от -2,147,483,648 до 2,147,483,647.
      - `long`: 8 байт, большие целые числа.
      - `float`: 4 байта, числа с плавающей точкой одинарной точности.
      - `double`: 8 байт, числа с плавающей точкой двойной точности.
      - `char`: 2 байта, одиночный символ Unicode.
      - `boolean`: 1 бит, значения `true` или `false`.

2. **Ссылочные типы данных:**
   - Это объекты, такие как классы, массивы и интерфейсы.
   - Примеры:
      - `String`: последовательность символов.
      - Массивы: коллекции элементов одного типа.

**Пример объявления переменных в Java:**

```java
int age = 30;          // Целое число
double price = 99.99;  // Число с плавающей точкой
char grade = 'A';      // Одиночный символ
boolean isActive = true; // Логическое значение
String name = "Alice"; // Ссылочный тип
```

---

### Основные различия между типами данных в Python и Java

| **Особенность**          | **Python**                            | **Java**                                |
|--------------------------|----------------------------------------|-----------------------------------------|
| **Типизация**            | Динамическая                          | Статическая                             |
| **Объявление**           | Тип указывать не требуется            | Тип указывается явно                    |
| **Диапазон целых чисел** | Нет ограничений для целых чисел        | Ограничен типами `int` или `long`       |
| **Работа со строками**   | Строки неизменяемы, тип указывать не нужно | Строки неизменяемы, используются `String` |
| **Логические значения**  | `True` или `False`                    | `true` или `false`                      |
| **Коллекции**            | Гибкие и разнообразные (`list`, `dict`) | Требуют явного указания массива или объекта |

---

### Примеры различий на практике

**Объявление переменных:**

Python:

```python
x = 10       # Тип не указывается
y = "hello"  # Тип определяется автоматически
z = True     # Логический тип
```

Java:

```java
int x = 10;          // Тип указывается явно
String y = "hello";  // Тип строки
boolean z = true;    // Логический тип
```

---

### Почему Java требует статической типизации

Статическая типизация помогает компилятору Java обнаруживать ошибки, связанные с типами данных, ещё на этапе компиляции, а не во время выполнения программы. Это повышает надёжность и предсказуемость кода, но требует большего объёма шаблонного кода по сравнению с Python.

---

### Практическое задание

Напишите программу, в которой объявляются и инициализируются переменные всех примитивных типов данных в Java. Выведите каждую переменную на консоль, объяснив её назначение.

---

В следующем разделе мы рассмотрим управляющие конструкции в Java, такие как условия и циклы.

</details>

-----

<details>
  <summary><b>Управляющие конструкции</b></summary>

### Условные операторы (if-else)

Условные операторы в Java позволяют выполнять разные блоки кода в зависимости от условий. Основной синтаксис следующий:

**Синтаксис:**
```java
if (условие) {
    // Код, выполняемый при выполнении условия
} else if (другое_условие) {
    // Код, выполняемый при выполнении другого условия
} else {
    // Код, выполняемый, если ни одно условие не выполнено
}
```

**Пример:**
```java
int age = 18;

if (age >= 18) {
    System.out.println("You are an adult.");
} else if (age > 12) {
    System.out.println("You are a teenager.");
} else {
    System.out.println("You are a child.");
}
```

---

### Циклы

Циклы позволяют выполнять блок кода несколько раз, пока выполняется определённое условие.

#### Цикл for

Цикл `for` используется, когда известно количество повторений. Синтаксис включает три части: инициализацию, условие, и шаг.

**Синтаксис:**
```java
for (инициализация; условие; шаг) {
    // Код, который выполняется на каждой итерации
}
```

**Пример:**
```java
for (int i = 0; i < 5; i++) {
   System.out.println("Iteration: " + i);
}
```

---

#### Цикл while

Цикл `while` выполняет блок кода, пока условие истинно. Используется, когда количество повторений заранее неизвестно.

**Синтаксис:**
```java
while (условие) {
   // Код, который выполняется, пока условие истинно
}
```

**Пример:**
```java
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

---

#### Цикл do-while

Цикл `do-while` похож на `while`, но гарантирует выполнение тела цикла хотя бы один раз, так как условие проверяется после выполнения кода.

**Синтаксис:**

```java
do {
    // Код, который выполняется
} while (условие);
```

**Пример:**
```java
int i = 0;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i < 5);
```

---

### Сравнение Python и Java в управлении потоками

| **Конструкция**      | **Python**                          | **Java**                                  |
|----------------------|--------------------------------------|-------------------------------------------|
| **if-else**          | `if condition:`                     | `if (condition) { ... }`                 |
|                      | `elif another_condition:`           | `else if (another_condition) { ... }`    |
|                      | `else:`                             | `else { ... }`                           |
| **for loop**         | `for i in range(5):`                | `for (int i = 0; i < 5; i++) { ... }`    |
|                      | `for item in collection:`           | Requires explicit `for` with collections |
| **while loop**       | `while condition:`                  | `while (condition) { ... }`              |
| **do-while loop**    | Not available in Python             | `do { ... } while (condition);`          |

---

### Практическое задание

1. Напишите программу, которая определяет, является ли введённое число положительным, отрицательным или равным нулю, используя `if-else`.
2. Напишите программу, которая выводит числа от 1 до 10:
   - С использованием `for`.
   - С использованием `while`.
   - С использованием `do-while`.

</details>

<details>
  <summary><b>Массивы в Java</b></summary>

### Что такое массив в Java?

Массив в Java — это структура данных фиксированного размера, которая позволяет хранить несколько элементов одного типа. Основные особенности массивов:
- **Неизменяемость размера:** После создания размер массива нельзя изменить.
- **Типизация:** Все элементы массива должны быть одного типа.
- **Доступ по индексу:** Элементы массива доступны через индекс, начиная с 0.

---

### Создание массива

1. **Объявление и выделение памяти:**
   #CODE
   int[] numbers = new int[5]; // Массив из 5 целых чисел
   #CODE
    - Массив заполняется значениями по умолчанию (`0` для чисел, `null` для объектов, `false` для логических).

2. **Создание и инициализация:**
   #CODE
   int[] numbers = {10, 20, 30, 40, 50}; // Явная инициализация
   #CODE

3. **Пример заполнения через цикл:**
   #CODE
   int[] numbers = new int[5];
   for (int i = 0; i < numbers.length; i++) {
   numbers[i] = i * 2; // Заполнение значениями: 0, 2, 4, 6, 8
   }
   #CODE

---

### Доступ к элементам массива

Для получения или изменения значения массива используется индекс.

**Пример:**
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[1]); // Вывод: 20
numbers[1] = 50;                // Изменение элемента
System.out.println(numbers[1]); // Вывод: 50
```

Если обратиться к индексу за пределами массива, возникнет ошибка `ArrayIndexOutOfBoundsException`.

---

### Перебор массива

1. **С использованием цикла for:**
2.
```java
   int[] numbers = {10, 20, 30, 40, 50};
   for (int i = 0; i < numbers.length; i++) {
        System.out.println("Element at index " + i + ": " + numbers[i]);
   }
```

2. **С использованием расширенного for (for-each):**
```java
   int[] numbers = {10, 20, 30, 40, 50};
   for (int number : numbers) {
        System.out.println("Element: " + number);
   }
```

---

### Сравнение массивов в Python и Java

| **Особенность**            | **Python**                                      | **Java**                                         |
|----------------------------|------------------------------------------------|-------------------------------------------------|
| **Типизация**              | Динамическая                                   | Статическая: один тип для всех элементов       |
| **Размер**                 | Динамический: можно добавлять/удалять элементы | Фиксированный, задаётся при создании           |
| **Инициализация**          | `numbers = [10, 20, 30]`                       | `int[] numbers = {10, 20, 30};`                |
| **Доступ по индексу**      | `numbers[1]`                                   | `numbers[1]`                                   |
| **Заполнение через цикл**  | `numbers = [i * 2 for i in range(5)]`          | `for (int i = 0; i < numbers.length; i++) {}`  |
| **Перебор**                | `for num in numbers:`                          | `for (int num : numbers) {}`                   |

---

### Преимущества и недостатки массивов в Java

**Преимущества:**
- Простота использования для фиксированных данных.
- Высокая производительность за счёт прямого доступа по индексу.

**Недостатки:**
- Нельзя изменять размер массива после создания.
- Для более сложных операций требуется использование коллекций (`ArrayList`, `LinkedList`).

---

### Практическое задание

1. Создайте массив из 10 чисел, заполните его квадратами индексов и выведите на экран.
2. Напишите программу, которая находит максимальный элемент в массиве из 5 чисел.
3. Переберите массив строк и выведите их в обратном порядке.

</details>


<details>
  <summary><b>Методы в Java</b></summary>

### Что такое метод?

Метод в Java — это блок кода, который выполняет определённую задачу. Он может принимать параметры, возвращать значения или быть процедурой (методом без возвращаемого значения). Методы помогают сделать код более читаемым, повторно используемым и структурированным.

---

### Определение и вызов методов

**Синтаксис определения метода:**

Java:
```java
public static void printMessage() {
System.out.println("Hello, Java!");
}
```

Python:
```python
def print_message():
print("Hello, Python!")
```

**Вызов метода:**

Java:
```java
public static void main(String[] args) {
printMessage(); // Вызов метода
}
```

Python:
```python
print_message()  # Вызов функции
```

---

### Параметры методов

Методы могут принимать параметры, которые позволяют передавать данные внутрь метода для выполнения операций.

**Пример метода с параметрами:**

Java:
```java
public static void greet(String name) {
System.out.println("Hello, " + name + "!");
}
```

Python:
```python
def greet(name):
print(f"Hello, {name}!")
```

**Вызов метода:**

Java:
```java
public static void main(String[] args) {
greet("Alice"); // Вывод: Hello, Alice!
greet("Bob");   // Вывод: Hello, Bob!
}
```

Python:
```python
greet("Alice")  # Вывод: Hello, Alice!
greet("Bob")    # Вывод: Hello, Bob!
```

---

### Возвращаемые значения

Метод может возвращать значение, которое затем может быть использовано в других частях программы. Для этого используется ключевое слово `return`.

**Пример метода с возвращаемым значением:**

Java:
```java
public static int add(int a, int b) {
return a + b; // Возвращает сумму двух чисел
}
```

Python:
```python
def add(a, b):
return a + b  # Возвращает сумму двух чисел
```

**Вызов метода:**

Java:
```java
public static void main(String[] args) {
int result = add(5, 3); // Сохранение результата в переменную
System.out.println("Result: " + result); // Вывод: Result: 8
}
```

Python:
```python
result = add(5, 3)  # Сохранение результата в переменную
   print(f"Result: {result}")  # Вывод: Result: 8
```

---

### Перегрузка методов

В Java отсутствуют опциональные параметры, как в Python. Вместо этого используется **перегрузка методов** (method overloading), что позволяет создавать несколько методов с одинаковым именем, но разным количеством или типами параметров.

**Пример перегрузки:**

Java:
```java
public static int multiply(int a, int b) {
return a * b;
}

public static int multiply(int a, int b, int c) {
return a * b * c;
}
```

Python (опциональные параметры вместо перегрузки):
```python
def multiply(a, b, c=None):
if c is None:
return a * b
return a * b * c
```

**Вызов методов:**

Java:
```java
public static void main(String[] args) {
System.out.println(multiply(2, 3));       // Вывод: 6
System.out.println(multiply(2, 3, 4));   // Вывод: 24
}
```

Python:
```python
print(multiply(2, 3))      # Вывод: 6
print(multiply(2, 3, 4))   # Вывод: 24
```

---

### Сравнение методов в Python и Java

| **Особенность**        | **Python**                                     | **Java**                                      |
|------------------------|-----------------------------------------------|----------------------------------------------|
| **Определение метода** | `def greet(name):`                            | `public static void greet(String name) {`    |
| **Опциональные аргументы** | Да: `def greet(name="Guest"):`             | Нет, используется перегрузка методов         |
| **Возврат значения**   | `return a + b`                                | `return a + b;`                              |
| **Перегрузка методов** | Не поддерживается, эмулируется через аргументы | Полная поддержка через разные сигнатуры      |

---

### Практическое задание

1. Напишите метод `multiply`, который принимает два числа и возвращает их произведение.
2. Создайте перегруженный метод `multiply`, который принимает три числа и возвращает их произведение.
3. Реализуйте метод `greet`, который принимает имя как параметр и выводит приветствие.
4. Реализуйте метод `findMax`, который принимает массив чисел и возвращает максимальное значение.

---

В следующем разделе мы углубимся в работу с массивами и методами в Java.

</details>

<details>
  <summary><b>Практикаи</b></summary>

## Практика: "Код на Python, переписать на Java"

---

### Задание 1: Вывести сообщение

**Код на Python:**
```python
def print_message():
print("Hello, Python!")

print_message()
```

---

### Задание 2: Приветствие пользователя по имени

**Код на Python:**
```python
def greet(name):
print(f"Hello, {name}!")

greet("Alice")
```

---

### Задание 3: Сложение двух чисел

**Код на Python:**
```python
def add(a, b):
return a + b

result = add(5, 3)
print(f"Result: {result}")
```

---

### Задание 4: Найти максимальное значение в массиве

**Код на Python:**
```python
def find_max(numbers):
max_value = numbers[0]
for num in numbers:
if num > max_value:
max_value = num
return max_value

numbers = [1, 3, 5, 7, 2]
print(f"Max value: {find_max(numbers)}")
```

---

### Задание 5: Умножение чисел с опциональным третьим аргументом

**Код на Python:**
```python
def multiply(a, b, c=None):
if c is None:
return a * b
return a * b * c

print(multiply(2, 3))      # 6
print(multiply(2, 3, 4))   # 24
```

---

### Задание 6: Перебор массива и вывод его элементов

**Код на Python:**
```python
def print_array_elements(arr):
for elem in arr:
print(f"Element: {elem}")

array = [10, 20, 30, 40, 50]
print_array_elements(array)
```

---

### Задание 7: Подсчитать сумму всех элементов в массиве

**Код на Python:**
```python
def sum_array(numbers):
total = 0
for num in numbers:
total += num
return total

numbers = [1, 2, 3, 4, 5]
print(f"Sum of array: {sum_array(numbers)}")
```

---

### Задание 8: Приветствие пользователя с несколькими именами

**Код на Python:**
```python
def greet_all(names):
for name in names:
print(f"Hello, {name}!")

names_list = ["Alice", "Bob", "Charlie"]
greet_all(names_list)
```
</details>

</details>


