# Упражнения на функциональные интерфейсы (без Stream API)

В этих задачах вы потренируетесь с предопределёнными и собственными функциональными интерфейсами. Для каждой задачи
сначала реализуйте решение в классическом (императивном) стиле — через метод или цикл, затем — с помощью функционального
интерфейса (лямбда-выражение или ссылка на метод).

---

## Пример. `Consumer` — печать строки и её длины

Дан список слов:  
`List<String> items = Arrays.asList("one", "three", "seven");`

**Шаги:**
1. Императивно: в цикле выводите сначала слово, потом — его длину.
2. Функционально: создайте два `Consumer<String>` и соедините их через `andThen()`.

### Императивный стиль

 ```java
 import java.util.*;

 public class MainConsumerChain {
     public static void main(String[] args) {
         List<String> items = Arrays.asList("one", "three", "seven");
         for (String s : items) {
             System.out.println(s);
             System.out.println("Length = " + s.length());
         }
     }
 }
 ```

### Функциональный стиль

 ```java
 import java.util.*;
 import java.util.function.Consumer;

 public class MainConsumerChain {
     public static void main(String[] args) {
         List<String> items = Arrays.asList("one", "three", "seven");
         Consumer<String> print = System.out::println;
         Consumer<String> printLen = s -> System.out.println("Length = " + s.length());
         Consumer<String> combined = print.andThen(printLen);

         for (String s : items) {
             combined.accept(s);
         }
     }
 }
 ```
----

## Пример 2. `Function` — обрезка и перевод в верхний регистр

Дан список строк с пробелами:  
`List<String> raw = Arrays.asList("  java  ", " Stream", "lambda  ");`

**Шаги:**
1. Императивно: напишите метод `String transform(String s)` — выполняет `trim()` + `toUpperCase()`.
2. Функционально: используйте два `Function<String,String>` и метод `andThen()`.

### Императивный стиль

 ```java
 import java.util.*;

 public class MainFunctionChain {
     public static String transform(String s) {
         return s.trim().toUpperCase();
     }
     public static void main(String[] args) {
         List<String> raw = Arrays.asList("  java  ", " Stream", "lambda  ");
         for (String s : raw) {
             System.out.println("'" + transform(s) + "'");
         }
     }
 }
```

### Функциональный стиль

 ```java
 import java.util.*;
 import java.util.function.Function;

 public class MainFunctionChain {
     public static void main(String[] args) {
         List<String> raw = Arrays.asList("  java  ", " Stream", "lambda  ");
         Function<String,String> trim = String::trim;
         Function<String,String> toUpper = String::toUpperCase;
         Function<String,String> pipeline = trim.andThen(toUpper);

         for (String s : raw) {
             System.out.println("'" + pipeline.apply(s) + "'");
         }
     }
 }
 ```

---

## Задача 1. `Predicate` — проверка на положительность

Дан массив чисел: `int[] nums = { -5, 0, 7, 10 };`

**Шаги:**

1. Императивно: напишите метод `isPositive(int n)`, возвращающий `boolean`.
2. Функционально: используйте `Predicate<Integer>`.
---

## Задача 2. `Function` — длина строки

Дан список слов: `List<String> words = Arrays.asList("Java", "Hi", "Stream");`

**Шаги:**

1. Императивно: напишите метод `int lengthOf(String s)`.
2. Функционально: используйте `Function<String, Integer>`.

---

## Задача 3. `Consumer` — приветствие

Дан массив имён: `String[] names = { "Alice", "Bob", "Eve" };`

**Шаги:**

1. Императивно: напишите метод `void greet(String name)`, который печатает `"Hello, <name>!"`.
2. Функционально: используйте `Consumer<String>`.

---

## Задача 4. `Supplier` — генератор случайного числа

**Шаги:**

1. Императивно: напишите метод `int getRandom()`, возвращающий случайное число от 0 до 100.
2. Функционально: используйте `Supplier<Integer>`.

---

## Задача 5. Собственный функциональный интерфейс — `Checker<T>`

**Шаги:**

1. Определите интерфейс:
    ```java
    @FunctionalInterface
    public interface Checker<T> {
        boolean check(T t);
    }
    ```
2. Императивно: напишите метод `boolean isLong(String s)` — проверяет, что длина строки > 3.
3. Функционально: используйте `Checker<String>`.

# Дополнительные базовые задачи на функциональные интерфейсы

Каждую задачу сначала решите в классическом (императивном) виде, затем — используя функциональные интерфейсы.

---

## Задача 6. `Predicate` — делимость на 3 или 5

Дан массив чисел: `int[] nums = { 1, 3, 5, 7, 9, 10, 12 };`

**Шаги:**
1. Императивно: напишите метод `boolean isDivBy3Or5(int n)`.
2. Функционально: используйте два `Predicate<Integer>` и объедините их через `or()`.


---
