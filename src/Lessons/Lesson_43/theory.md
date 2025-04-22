<details>
<summary>Lesson 37. Stream API. Introduction to Functional Programming and Stream API in Java</summary>

# Functional Interface in Java

A functional interface in Java is an interface that contains exactly one abstract method. It can also contain
one or more default methods or static methods. Functional interfaces are the basis
of lambda expressions in Java 8 and above.

## Defining The Functional Interface

The annotation `@FunctionalInterface` is used to define the functional interface. This annotation is optional,
but it helps the compiler to throw an error if the interface does not match the definition of a functional interface.

```java 

@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();
}
```

## Using The Functional Interface

Functional interfaces can be used to create functional interface objects using
lambda expressions, method references, or constructors.

### Lambda expressions

```java
public class FunctionExample {
  public static void main(String[] args) {
    MyFunctionalInterface myFunc = () -> System.out.println("Hello World!");
    myFunc.myAbstractMethod();  // Output: Hello World!
  }
}
```

### Links to methods

```java
public class Example {
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = Example::sayHello;
        myFunc.myAbstractMethod();  // Output: Hello World!
    }
}
```

### Links to constructors

```java
public class MyClass {
    public MyClass() {
        System.out.println("Constructor Called!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = MyClass::new;
        myFunc.myAbstractMethod();  // Output: Constructor Called!
    }
}
```

## Predefined Functional Interfaces in Java

Java offers a set of predefined functional interfaces such
as `Function`, `Consumer`, `Supplier`, `Predict`, etc., which simplifies the work with functional programming.

### Example of using the Function interface

```java

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

## Comparison table and examples for Function, Consumer, Supplier and Predicate in Java

| Interface | Description | Method | Example |
|-------------|----------------------------------------------------|---------------------|--------------------------------------------------------------------------------------------------------|
| `Function`  | Takes one argument and returns the result.    | `R apply(T t)`      | ``` Function<String, Integer> func = String::length; int length = func.apply("Hello"); // Output: 5``` |
| `Consumer`  | Takes one argument and does not return a result. | `void accept(T t)`  | `Consumer<String> consumer = System.out::println; consumer.accept("Hello"); // Output: Hello`          |
| `Supplier`  | Does not accept arguments, but returns a result.  | `T get()`           | `Supplier<String> supplier = () -> "Hello"; String str = supplier.get(); // Output: Hello`             |
| `Predicate` | Takes one argument and returns `boolean'.    | `boolean test(T t)` | `Predicate<String> predicate = String::isEmpty; boolean result = predicate.test(""); // Output: true`  |

## Usage examples

### Function

The `Function` interface takes one argument and returns the result.

```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

### Consumer

The `Consumer` interface accepts a single argument and does not return a result.

```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello
    }
}
```

### Supplier

The `Supplier` interface does not accept arguments, but returns a result.

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello
    }
}
```

### Predicate

The `Predict` interface takes one argument and returns boolean.

```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }
}
```
</details>

-------------------------------------

<details>
<summary>Урок 43. Stream API. Введение в Функциональное Программирование и Stream API в Java</summary>

# Функциональный Интерфейс в Java

Функциональный интерфейс в Java - это интерфейс, который содержит ровно один абстрактный метод. Он может содержать также
один или несколько методов по умолчанию или статических методов. Функциональные интерфейсы являются основой
лямбда-выражений в Java 8 и выше.

## Определение Функционального Интерфейса

Для определения функционального интерфейса используется аннотация `@FunctionalInterface`. Эта аннотация не обязательна,
но она помогает компилятору выдать ошибку, если интерфейс не соответствует определению функционального интерфейса.

```java 

@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();
}
```

## Использование Функционального Интерфейса

Функциональные интерфейсы можно использовать для создания объектов функциональных интерфейсов с помощью
лямбда-выражений, ссылок на методы или конструкторов.

### Лямбда-выражения

```java
public class FunctionExample {
  public static void main(String[] args) {
    MyFunctionalInterface myFunc = () -> System.out.println("Hello World!");
    myFunc.myAbstractMethod();  // Output: Hello World!
  }
}
```

### Ссылки на методы

```java
public class Example {
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = Example::sayHello;
        myFunc.myAbstractMethod();  // Output: Hello World!
    }
}
```

### Ссылки на конструкторы

```java
public class MyClass {
    public MyClass() {
        System.out.println("Constructor Called!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = MyClass::new;
        myFunc.myAbstractMethod();  // Output: Constructor Called!
    }
}
```

## Предопределённые Функциональные Интерфейсы в Java

Java предлагает набор предопределённых функциональных интерфейсов, таких
как `Function`, `Consumer`, `Supplier`, `Predicate` и т.д., что упрощает работу с функциональным программированием.

### Пример использования интерфейса Function

```java

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

## Сравнительная таблица и примеры для Function, Consumer, Supplier и Predicate в Java

| Интерфейс   | Описание                                           | Метод               | Пример                                                                                                 |
|-------------|----------------------------------------------------|---------------------|--------------------------------------------------------------------------------------------------------|
| `Function`  | Принимает один аргумент и возвращает результат.    | `R apply(T t)`      | ``` Function<String, Integer> func = String::length; int length = func.apply("Hello"); // Output: 5``` |
| `Consumer`  | Принимает один аргумент и не возвращает результат. | `void accept(T t)`  | `Consumer<String> consumer = System.out::println; consumer.accept("Hello"); // Output: Hello`          |
| `Supplier`  | Не принимает аргументов, но возвращает результат.  | `T get()`           | `Supplier<String> supplier = () -> "Hello"; String str = supplier.get(); // Output: Hello`             |
| `Predicate` | Принимает один аргумент и возвращает `boolean`.    | `boolean test(T t)` | `Predicate<String> predicate = String::isEmpty; boolean result = predicate.test(""); // Output: true`  |

## Примеры использования

### Function

Интерфейс `Function` принимает один аргумент и возвращает результат.

```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

### Consumer

Интерфейс `Consumer` принимает один аргумент и не возвращает результат.

```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello
    }
}
```

### Supplier

Интерфейс `Supplier` не принимает аргументов, но возвращает результат.

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello
    }
}
```

### Predicate

Интерфейс `Predicate` принимает один аргумент и возвращает boolean.

```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }
}
```
</details>
