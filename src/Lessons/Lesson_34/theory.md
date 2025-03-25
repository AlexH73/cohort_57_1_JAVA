<details>
<summary>Lesson 34. Error and exception handling</summary>

# Lesson 34: Exceptions in Java

## Introduction to Exceptions in Java

### Basic Concepts
- **Exceptions (`Exceptions'):** Objects that represent errors or other unusual events,
  occurring during the execution of the program. They are "thrown" (`throw`) when an error occurs and
  "intercepted" (`catch`) for processing.
- **Errors (`Errors'):** Serious problems that should not normally be attempted by the program.
  They are usually associated with problems at the system level, for example, `OutOfMemoryError'.
- **Program execution interruption:** The state when the program stops due to an unprocessed
  an exception or a serious error.

### Types of Exceptions
1. **Checked Exceptions:**
- Require processing in the code or declaration in the method signature using `throws'.
    - Examples: `IOException`, `SQLException'.
    - Used to handle expected but unpredictable situations, such as I/O errors.

2. **Unchecked Exceptions:**
- Do not require mandatory processing or declaration in the code.
    - Examples: `NullPointerException`, `ArithmeticException'.
    - They often occur due to errors in program logic and can be prevented by checks before code execution.

3. **Errors:**
- Usually do not involve processing, as they indicate serious system problems.
    - Examples: `OutOfMemoryError`, `StackOverflowError'.
    - Attempts to handle such problems are often ineffective and can lead to an unstable application state.

## Hierarchy of exceptions
- All exceptions and errors are inheritors of the `Throwable` class.
- **Class `Exception`**: A subclass of `Throwable` used for exceptions that the program user may expect to handle.
- **Class `Error`**: A subclass of `Throwable` designed for errors related to the environment in which the program is running.

###The `Throwable` class
- The main class for all errors and exceptions in Java.
- Contains methods for getting detailed information about an error or exception, for example, `GetMessage()`, `getCause()`, `printStackTrace()`.

###The `Exception` class
- A superclass for all exceptions that can be thrown and intercepted in the application.
- Includes both verifiable and unchecked exceptions.

###The `Error` class
- **Description**: `Error` is a subclass of the `Throwable` class in Java, which is used to indicate serious problems that the application is not designed to handle. These problems are usually related to the environment in which the program is running.
- **Examples**: `OutOfMemoryError`, `StackOverflowError`, `AssertionError`.
- **Usage**: Errors presented by the `Error` class usually indicate flaws that can only be fixed by changing the environment of the program, and not by changing the program itself. For example, a memory leak in the JVM can lead to an `OutOfMemoryError'.
- **Handling**: Unlike exceptions, errors are usually not handled in the program, as they indicate serious conditions, often beyond the control of the programmer.

![img.png](images/img.png)

## The main part: Verifiable and unchecked exceptions

### Checked Exceptions
- **Description**: Checked exceptions are exceptions that must be explicitly handled in the program or declared in the method signature.
- **Examples**:
- `IOException`: Occurs when I/O errors occur.
    - `SQLException': Related to errors that occur when working with the database.
- **When to use**: Use verifiable exceptions to handle errors that can be anticipated and handled at runtime. For example, file or database error handling.

### Unchecked Exceptions
- **Description**: Unchecked exceptions include errors that occur during program execution and do not require explicit processing or declaration in methods.
- **Examples**:
- `NullPointerException`: Occurs when we try to use a reference that points to `null'.
    - `ArrayIndexOutOfBoundsException`: Occurs when trying to access an array element with an index beyond its size.
- **When to use**: Unchecked exceptions are usually used to indicate programmer errors, such as errors in program logic or API misuse. They are usually not handled directly, but rather used to indicate the need to fix the code.

### Discussion of the use of each type
- **Verifiable exceptions** suggest that the programmer can anticipate and handle these situations, while **unchecked exceptions** most often indicate errors that need to be fixed in the code, rather than handled at runtime.
- The choice between using verifiable and unchecked exceptions depends on the specific situation and the design of the application.

## Try-catch exception handling (20 minutes)

### Syntax and example of using try-catch blocks
- **Syntax**:
```java
  try {
  // a block of code that can cause an exception
  } catch (ex exception type) {
  // a block of code for handling an exception
  }
  ```

- **Example**:
```java
  try {
  String text = null;
  System.out.println(text.length());
  } catch (NullPointerException ex) {
  System.out.println("An error occurred: the string has a null value.");
  }

```

### Handling multiple exceptions
- Use a single `catch` block to handle multiple types of exceptions.
- **Syntax**:

```java
try {
// code
} catch (Exclusion1 | Exclusion2 ex) {
// exception handling
}

```
- **Example**:
```java
  try {
  int[] numbers = new int[5];
  numbers[10] = 5; // may cause ArrayIndexOutOfBoundsException
  String text = null;
  System.out.println(text.length()); // may cause a NullPointerException
  } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
  System.out.println("Error occurred: " + ex.getMessage());
  }

```

### Using the finally block
- The `finally` block is used to execute code after the `try` and `catch` blocks, regardless of whether an exception was thrown.
- **Syntax**:
```java
try {
// code that may cause an exception
} catch (ex exception type) {
// code for exception handling
} finally {
// the code that will be executed after try and catch
}

```
- **Example**:
```java
  try {
  // some potentially dangerous code
  } catch (ex exception type) {
  // exception handling
  } finally {
  System.out.println("This code will run anyway.");
  }
```

### Discussion
- **try-catch**: The main way to handle exceptions in Java. It allows you to isolate potentially dangerous code and prevents premature termination of the program.
- **Multiple exceptions**: An efficient way to handle different types of exceptions with a single `catch` block.
- **finally**: Ensures code execution after a `try-catch`, for example, to free up resources.


## throw and throws

### How and when to use throw
- **Description**: The keyword `throw` is used in Java to explicitly throw an exception.
- **When to use**: Use `throw` when you need to throw an exception due to a certain condition in the code.
- **Example**:
```java
  if (value < 0) {
  throw new IllegalArgumentException("Value cannot be negative");
  }
```

### How and when to use throws
- **Description**: The keyword `throws` is used in the method signature to indicate that the method can throw an exception.
- **When to use**: Use `throws` when you want to warn the calling code that your method may throw an exception, and that this exception should be handled or declared further.
- **Example**:

```java
public void myMethod(String fileName) throws FileNotFoundException {
      File file = new File(fileName);
      Scanner fileReader = new Scanner(file);
      // The rest of the code
}
```
### Discussion
- **Using `throw`**: Is a way to actively generate exceptions. This can be useful, for example, when checking method arguments for validity.
- **Using `throws`**: Helps in managing exceptions by delegating the responsibility of handling them to the calling code. It is often used in methods that work with files or databases.
- **Tip**: Use `throw` to indicate a specific problem in your code and `throws` in method signatures to show that the method can generate exceptions that need to be handled.

## Create your own exceptions

### Why and when to create your own exceptions
- **Why**: Custom exceptions help to improve the readability and manageability of the code, and allow you to more accurately describe the nature of the error.
- **When to use**: Create your own exceptions when Java's built-in exceptions are not enough to accurately describe the problem. This is especially useful in large systems and libraries where you need to distinguish your exceptions from the standard ones.

### Inheritance from the Exception class
- Custom exceptions are most often inherited from the `Exception` class.
- This means that they are "checkable exceptions" and must be handled or declared in methods.

### Example of creating and using your own exception
- **Example of a custom exception class**:

```java
public class CustomException extends Exception {
      public CustomException(String message) {
          super(message); // Calling the constructor of the parent class Exception
      }
  }
```
- **Using your own exception:**

```java
public void myMethod() throws CustomException {
    // Some code that may cause an error
    throw new CustomException("Specific error message");
}
```

### Discussion
- Creating your own exception allows you to more clearly express the intentions and causes of errors in your code.
- It can also help in standardizing error handling in your application or library.
- When inheriting from `Exception`, your exception will be verifiable, which requires it to be handled or declared in methods using it.

## Conclusion: Exceptions in Java

Exceptions in Java are a powerful mechanism for managing errors in a program. They allow us to flexibly respond to exceptional situations, preventing program crashes and providing more reliable and secure code.

### Key Points:
1. **Exceptions and their Types**: There are two main types of exceptions in Java: checked and unchecked. Understanding their differences and using them correctly in code is crucial to writing a reliable application.

2. **Exception Handling**: Using `try-catch-finally` blocks allows you to effectively manage exceptions, providing the ability to restore the program after errors.

3. **Creating Custom Exceptions**: Custom exceptions improve code readability and make debugging easier, making errors clearer and more manageable.

4. **Using `throw` and `throws'**: Understanding the difference between `throw` to generate exceptions and `throws` to declare them in methods helps in proper code organization and error handling.

### Conclusion:
Exception handling in Java is not just a way to prevent program crashes, but also a tool for writing clean, error-resistant and easily maintained code. Proper use of exceptions greatly simplifies debugging and program support, makes them more reliable and user-friendly.

Remember that a good understanding of exceptions and their handling is an important skill for any Java developer.


</details>

_____________

<details>
<summary>Lesson 34. Обработка ошибок и исключений</summary>

# Lesson 34: Исключения в Java

## Введение в Исключения в Java

### Основные Понятия
- **Исключения (`Exceptions`):** Объекты, которые представляют ошибки или другие необычные события,
  происходящие во время выполнения программы. Они "выбрасываются" (`throw`) при возникновении ошибки и
  "перехватываются" (`catch`) для обработки.
- **Ошибки (`Errors`):** Серьёзные проблемы, которые обычно не должны пытаться обрабатываться программой.
  Они обычно связаны с проблемами на уровне системы, например, `OutOfMemoryError`.
- **Прерывание выполнения программы:** Состояние, когда программа останавливается из-за необработанного
  исключения или серьёзной ошибки.

### Виды Исключений
1. **Проверяемые Исключения (Checked Exceptions):**
    - Требуют обработки в коде или объявления в сигнатуре метода с помощью `throws`.
    - Примеры: `IOException`, `SQLException`.
    - Используются для обработки ожидаемых, но непредсказуемых ситуаций, как, например, ошибки ввода-вывода.

2. **Непроверяемые Исключения (Unchecked Exceptions):**
    - Не требуют обязательной обработки или объявления в коде.
    - Примеры: `NullPointerException`, `ArithmeticException`.
    - Часто возникают из-за ошибок в логике программы и могут быть предотвращены проверками перед выполнением кода.

3. **Ошибки (Errors):**
    - Обычно не предполагают обработки, так как указывают на серьёзные системные проблемы.
    - Примеры: `OutOfMemoryError`, `StackOverflowError`.
    - Попытки обработки таких проблем часто неэффективны и могут привести к нестабильному состоянию приложения.

## Иерархия исключений
- Все исключения и ошибки являются наследниками класса `Throwable`.
- **Класс `Exception`**: Подкласс `Throwable`, используемый для исключений, которые пользователь программы может предполагать обрабатывать.
- **Класс `Error`**: Подкласс `Throwable`, предназначенный для ошибок, связанных с окружением, в котором работает программа.

### Класс `Throwable`
- Основной класс для всех ошибок и исключений в Java.
- Содержит методы для получения детальной информации об ошибке или исключении, например, `getMessage()`, `getCause()`, `printStackTrace()`.

### Класс `Exception`
- Суперкласс для всех исключений, которые могут быть выброшены и перехвачены в приложении.
- Включает в себя как проверяемые, так и непроверяемые исключения.

### Класс `Error`
- **Описание**: `Error` - это подкласс класса `Throwable` в Java, который используется для обозначения серьезных проблем, которые приложение не предназначено обрабатывать. Эти проблемы обычно связаны с окружением, в котором выполняется программа.
- **Примеры**: `OutOfMemoryError`, `StackOverflowError`, `AssertionError`.
- **Использование**: Ошибки, представленные классом `Error`, обычно указывают на недостатки, которые могут быть исправлены только путем изменения окружения программы, а не изменения самой программы. Например, утечка памяти в JVM может привести к `OutOfMemoryError`.
- **Обработка**: В отличие от исключений, ошибки обычно не обрабатываются в программе, так как они указывают на серьезные условия, часто за пределами контроля программиста.

![img.png](images/img.png)

## Основная часть: Проверяемые и непроверяемые исключения

### Проверяемые исключения (Checked Exceptions)
- **Описание**: Проверяемые исключения - это исключения, которые должны быть явно обработаны в программе или объявлены в сигнатуре метода.
- **Примеры**:
    - `IOException`: Возникает при возникновении ошибок ввода/вывода.
    - `SQLException`: Связан с ошибками, возникающими при работе с базой данных.
- **Когда использовать**: Используйте проверяемые исключения для обработки ошибок, которые можно предвидеть и обработать во время исполнения. Например, обработка ошибок файла или базы данных.

### Непроверяемые исключения (Unchecked Exceptions)
- **Описание**: Непроверяемые исключения включают ошибки, возникающие во время выполнения программы, и не требуют явной обработки или объявления в методах.
- **Примеры**:
    - `NullPointerException`: Возникает, когда пытаемся использовать ссылку, которая указывает на `null`.
    - `ArrayIndexOutOfBoundsException`: Возникает при попытке доступа к элементу массива с индексом за пределами его размера.
- **Когда использовать**: Непроверяемые исключения обычно используются для обозначения ошибок программиста, таких как ошибки в логике программы или неправильное использование API. Они обычно не обрабатываются напрямую, а скорее используются для указания на необходимость исправления кода.

### Обсуждение использования каждого типа
- **Проверяемые исключения** предполагают, что программист может предвидеть и обработать эти ситуации, в то время как **непроверяемые исключения** чаще всего указывают на ошибки, которые должны быть исправлены в коде, а не обработаны во время выполнения.
- Выбор между использованием проверяемых и непроверяемых исключений зависит от конкретной ситуации и дизайна приложения.

## Обработка исключений с помощью try-catch (20 минут)

### Синтаксис и пример использования try-catch блоков
- **Синтаксис**:
  ```java
  try {
      // блок кода, который может вызвать исключение
  } catch (ТипИсключения ex) {
      // блок кода для обработки исключения
  }
  ```
- **Пример**:
```java
try {
    String text = null;
    System.out.println(text.length());
} catch (NullPointerException ex) {
    System.out.println("Произошла ошибка: строка имеет значение null.");
}

```

### Обработка множественных исключений
- Используйте один блок `catch` для обработки нескольких типов исключений.
- **Синтаксис**:
```java
try {
    // код
} catch (Исключение1 | Исключение2 ex) {
    // обработка исключений
}

```
- **Пример**:
```java
try {
    int[] numbers = new int[5];
    numbers[10] = 5; // может вызвать ArrayIndexOutOfBoundsException
    String text = null;
    System.out.println(text.length()); // может вызвать NullPointerException
} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
    System.out.println("Произошла ошибка: " + ex.getMessage());
}

```

### Использование блока finally
- Блок `finally` используется для выполнения кода после блоков `try` и `catch`, независимо от того, было ли выброшено исключение.
- **Синтаксис**:
```java
try {
    // код, который может вызвать исключение
} catch (ТипИсключения ex) {
    // код для обработки исключения
} finally {
    // код, который выполнится после try и catch
}

```
- **Пример**:
```java
try {
    // какой-то потенциально опасный код
} catch (ТипИсключения ex) {
    // обработка исключения
} finally {
    System.out.println("Этот код выполнится в любом случае.");
}
```

### Обсуждение
- **try-catch**: Основной способ обработки исключений в Java. Позволяет изолировать потенциально опасный код и предотвращает преждевременное завершение программы.
- **Множественные исключения**: Эффективный способ обработки разных типов исключений одним блоком `catch`.
- **finally**: Обеспечивает выполнение кода после `try-catch`, например, для освобождения ресурсов.


## throw и throws

### Как и когда использовать throw
- **Описание**: Ключевое слово `throw` используется в Java для явного выбрасывания исключения.
- **Когда использовать**: Применяйте `throw`, когда нужно сгенерировать исключение из-за определенного условия в коде.
- **Пример**:
```java
  if (value < 0) {
  throw new IllegalArgumentException("Значение не может быть отрицательным");
  }
```

### Как и когда использовать throws
- **Описание**: Ключевое слово `throws` используется в сигнатуре метода для указания, что метод может выбросить исключение.
- **Когда использовать**: Используйте `throws`, когда хотите предупредить вызывающий код о том, что ваш метод может выбросить исключение, и что это исключение должно быть обработано или объявлено дальше.
- **Пример**:
```java
  public void myMethod(String fileName) throws FileNotFoundException {
      File file = new File(fileName);
      Scanner fileReader = new Scanner(file);
      // Остальная часть кода
  }
```
### Обсуждение
- **Использование `throw`**: Является способом активной генерации исключений. Это может быть полезно, например, при проверке аргументов метода на допустимость.
- **Использование `throws`**: Помогает в управлении исключениями, делегируя обязанность их обработки вызывающему коду. Часто используется в методах, которые работают с файлами или базами данных.
- **Совет**: Используйте `throw` для указания конкретной проблемы в вашем коде и `throws` в сигнатурах методов, чтобы показать, что метод может генерировать исключения, требующие обработки.

## Создание собственных исключений

### Почему и когда нужно создавать собственные исключения
- **Почему**: Собственные исключения помогают улучшить читаемость и управляемость кода, позволяют более точно описать характер ошибки.
- **Когда использовать**: Создавайте собственные исключения, когда встроенных исключений Java недостаточно для точного описания проблемы. Это особенно полезно в больших системах и библиотеках, где вам нужно отличать свои исключения от стандартных.

### Наследование от класса Exception
- Собственные исключения чаще всего наследуются от класса `Exception`.
- Это означает, что они являются "проверяемыми исключениями" и должны обрабатываться или объявляться в методах.

### Пример создания и использования собственного исключения
- **Пример класса собственного исключения**:
  ```java
  public class CustomException extends Exception {
      public CustomException(String message) {
          super(message); // Вызов конструктора родительского класса Exception
      }
  }
    ```
- **Использование собственного исключения:**
```java
public void myMethod() throws CustomException {
    // Некоторый код, который может вызвать ошибку
    throw new CustomException("Специфическое сообщение об ошибке");
}
```

### Обсуждение
- Создание собственного исключения позволяет более ясно выразить намерения и причины ошибок в вашем коде.
- Это также может помочь в стандартизации обработки ошибок в вашем приложении или библиотеке.
- При наследовании от `Exception`, ваше исключение будет проверяемым, что требует его обработки или объявления в методах, использующих его.

## Заключение: Исключения в Java

Исключения в Java - это мощный механизм для управления ошибками в программе. Они позволяют нам гибко реагировать на исключительные ситуации, предотвращая аварийное завершение программ и обеспечивая более надежный и безопасный код.

### Ключевые Моменты:
1. **Исключения и их Типы**: В Java существует два основных типа исключений: проверяемые (checked) и непроверяемые (unchecked). Понимание их отличий и правильное использование в коде имеет решающее значение для написания надежного приложения.

2. **Обработка Исключений**: Использование блоков `try-catch-finally` позволяет эффективно управлять исключениями, обеспечивая возможность восстановления программы после ошибок.

3. **Создание Собственных Исключений**: Собственные исключения улучшают читаемость кода и облегчают отладку, делая ошибки более понятными и управляемыми.

4. **Использование `throw` и `throws`**: Понимание разницы между `throw` для генерации исключений и `throws` для их объявления в методах помогает в правильной организации кода и обработке ошибок.

### Заключение:
Обработка исключений в Java - это не просто способ предотвращения сбоев программы, но и инструмент для написания чистого, устойчивого к ошибкам и легко поддерживаемого кода. Правильное использование исключений значительно упрощает отладку и поддержку программ, делает их более надежными и удобными для пользователя.

Помните, что хорошее понимание исключений и их обработки - это важный навык для любого разработчика Java.


</details>



