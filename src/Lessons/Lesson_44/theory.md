<details>
<summary>Lesson 44. Stream API</summary>

# Lesson 44. Stream API. Introduction to Functional Programming and the Stream API in Java

Data processing is a standard task in development. Previously, you had to use loops or recursive functions to do this.
With the advent of the Java 8 Stream API, the data processing process has accelerated significantly. This language tool
allows you to describe how to process data, briefly and succinctly.

## What is the Java Stream API?

It is a Java language tool that allows you to use a functional style when working with different data structures.

To begin with, the stream needs a source from which it will receive objects. Most often these are collections, but not
always. For example, you can use a generator as a source, which has rules for creating objects.

The data in the stream is processed on intermediate operations. For example: we can filter the data, skip a few items,
limit the selection, and sort. Then the terminal operation is performed. It absorbs the data and outputs the result.

## Stream as an example of a simple task

For clarity, let's look at the example of using streams in comparison with the old solution of a similar problem.

The task is to find the sum of the odd numbers in the collection.

```java
Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0);
```

Here we see a functional style. Without streams, the same task has to be solved through the use of a loop:

```java
public class Example {
    public static void main(String[] args) {
        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
    }
}
```

Yes, at first glance, the cycle looks more understandable. But it's a matter of experience interacting with streams. You
get used to the fact that you can process data without using cycles very quickly.

## Advantages of Stream

Thanks to streams, you no longer need to write stereotypical code every time you have to do something with data: sort,
filter, transform. Developers think less about the standard implementation and spend more time on more complex things.

##### A few more advantages of streams:

- Support for weak connectivity. The less classes know about each other, the better.
- Parallelizing operations with collections has become easier. Where previously it would have been necessary to cycle,
  streams significantly reduce the amount of code.
- Methods

The `Stream API` does not modify the original collections, reducing the number of side effects.
Even complex data processing operations thanks to the `Stream API`
The `Stream API` looks concise and clear. In general, it becomes more convenient to write, and easier to read.

## How to create streams

#### The table below shows the main ways to create streams.

| Source                                  | Method                                 | Example                                                                                                                   |
|-----------------------------------------|----------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| Collection                              | `collection.stream()`                  | ``` Collection<String> collection = Arrays.asList("f5", "b6", "z7"); Stream<String> collectionS = collection.stream();``` |
| Values                                  | `Stream.of(v1,... vN)`                 | `` Stream<String> Value = Stream.of("f5", "b6", "z7");``                                                                  |
| Primitives                              | `IntStream.of(1, ... N)`               | ``` IntStream intS = IntStream.of(9, 8, 7);```                                                                            |
|                                         | `DoubleStream.of(1.1, … N)`            | ``` DoubleStream doubleS = DoubleStream.of(2.4, 8.9);```                                                                  |
| Array                                   | `Arrays.stream(arr)`                   | `` String[] arr ={"f5","b6","z7"}; Stream<String> arrS = Arrays.stream(arr);``                                            |
| File — each new line becomes an element | `Files.lines(file_path)`               | `` Stream<String> fromFileS = Files.lines(Paths.get("doc.txt "))``                                                        |
| Stream.builder                          | `Stream.builder().add(...)....build()` | ``` Stream.builder().add("f5").add("b6").build();```                                                                      |

## Streaming methods

There are two types of methods available in the Stream API — pipeline and terminal. In addition, there are a number of
special methods for working with numeric streams and several methods for checking parallelism/ consistency. But this is
a formal separation.

There can be many pipeline methods in a stream. There is only one terminal method. After its execution, the stream ends.

Nothing happens until you call the terminal method. That's because conveyor methods are lazy. This means that they
process the data and wait for the command to pass it to the terminal method. We recommend not to be lazy as pipeline
methods, but to be trained in order to have full knowledge of working with the Java Stream API.

### Conveyor belts

| Method | What will | Use | Do
|------------|---------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| `filter` | Works as a filter, returns values that match the specified
condition | `` collection.stream().filter("e22"::equals).count();```                                                                 |
| `sorted`   | Sorts the elements in a natural order; you can use the `Comparator`          | ``` collection.stream().sorted().collect(Collectors.toList());```                                                         |
| `limit`    | Limits the output by the amount that you specify | `` collection.stream().limit(10).collect(
Collectors.ToList());``                                                        |
| `skip`     | Skips the number of items you specified | `` collection.stream().skip(3).findFirst().orElse("
4");```                                                               |
| `distinct` | Finds and removes elements that are repeated; returns elements without repetitions |`` collection.stream().distinct().collect(Collectors.ToList());``                                                       |
| `peek`     | Performs an action on each element of the elements, returns a stream with the original elements | `` collection.stream().map(String::toLowerCase).peek((e) -> System.out.print("," + e)). collect(Collectors.ToList());`` |
| `map`      | Performs actions on each element; returns elements with the results of functions | `` Stream.of("3", "4", "5"). map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);```                     |
| `mapToInt` | It will work as a `map`, only it will return a
numeric `stream`                                  | ``` collection.stream().mapToInt((s) -> Integer.parseInt(s)).toArray();```                                                |
| `flatMap` | Will work as a `map`, but will convert one element to zero, one, or many others | `` collection.stream()
.flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);```                   |

### Terminal

| Method | What will | Use | Do
|------------------|---------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| ` findFirst` | Returns the element corresponding to the condition that stands
first | ``` collection.stream().findFirst().orElse("10");```                                     |
| `findAny` | Will return any element matching the
condition | ``` collection.stream().findAny().orElse("10");```                                       |
| `collect`        | Will collect the processing results in a collection and not
only | ``` collection.stream().filter((s) -> s.contains("10")).collect(Collectors.toList());``` |
| `count`          | Counts and outputs how many elements match the
condition | ```collection.stream().filter("f5"::equals).count();```                                 |
| `anyMatch`       | True when at least one element meets the
conditions | `` collection.stream().anyMatch("f5"::equals);``                                       |
| `noneMatch`      | True when no element matches the
conditions | `` collection.stream().noneMatch("b6"::equals);``                                      |
| `allMatch`       | True when all elements meet the
conditions | `` collection.stream().allMatch((s) -> s.contains("8"));``                             |
| `min`            | Will find the smallest element using the passed
comparator | `` collection.stream().min(String::compareTo).get();``                                 |
| `max`            | Will find the largest element using the passed
comparator | `` collection.stream().max(String::compareTo).get();``                                 |
| `forEach`        | Will apply the function to all elements, but cannot guarantee the execution
order | ``` set.stream().forEach((p) -> p.append("_2"));```                                      |
| `forEachOrdered` | Will apply the function to all elements in turn, the order of execution can be guaranteed
by | ``` list.stream().forEachOrdered((p) -> p.append("_nv"));```                             |
| `toArray`        | Will bring the stream values to the
array |``` collection.stream().map(String::toLowerCase).toArray(String[]::new);```              |
| `reduce`         | Converts all elements into one
object | ``` collection.stream().reduce((c1, c2) -> c1 + c2).OrElse(0);```                        |

### Pipeline operations process data and pass it further down the pipeline without terminating the stream, while terminal operations process data and return the result, terminating the stream.

#### Examples Of Pipeline Operations:

- filter:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);  // Output: C1 C2
    }
}

```

- map:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);  // Output: C2 C1 B1 A2 A1
    }
}
```

#### Examples Of Terminal Operations:

- forEach:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);  // Output: a1 a2
    }
}
```

- collect:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> resultList = myList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());  // resultList: [A1, A2, B1, C2, C1]
    }
}
```

</details>

-------------------------------------


<details>
<summary>Урок 44. Stream API</summary>

# Урок 44. Stream API. Введение в Функциональное Программирование и Stream API в Java

Обработка данных — стандартная задача при разработке. Раньше для этого приходилось использовать циклы или рекурсивные
функции. С появлением в Java 8 Stream API процесс обработки данных значительно ускорился. Этот инструмент языка
позволяет описать, как нужно обработать данные, кратко и емко.

## Что такое Java Stream API

Это инструмент языка Java, который позволяет использовать функциональный стиль при работе с разными структурами данных.

Для начала стриму нужен источник, из которого он будет получать объекты. Чаще всего это коллекции, но не всегда.
Например, можно взять в качестве источника генератор, у которого заданы правила создания объектов.

Данные в стриме обрабатываются на промежуточных операциях. Например: мы можем отфильтровать данные, пропустить несколько
элементов, ограничить выборку, выполнить сортировку. Затем выполняется терминальная операция. Она поглощает данные и
выдает результат.

## Stream на примере простой задачи

Для наглядности посмотрим на примере использование стримов в сравнении со старым решением аналогичной задачи.

Задача — найти сумму нечетных чисел в коллекции.

```java
Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0);
```

Здесь мы видим функциональный стиль. Без стримов эту же задачу приходится решать через использование цикла:

```java
public class Example {
    public static void main(String[] args) {
        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
    }
}
```

Да, на первый взгляд цикл выглядит более понятным. Но это вопрос опыта взаимодействия со стримами. Очень быстро
привыкаешь к тому, что можно обрабатывать данные без использования циклов.

## Преимущества Stream

Благодаря стримам больше не нужно писать стереотипный код каждый раз, когда приходится что-то делать с данными:
сортировать, фильтровать, преобразовывать. Разработчики меньше думают о стандартной реализации и больше времени уделяют
более сложным вещам.

##### Еще несколько преимуществ стримов:

- Поддержка слабой связанности. Чем меньше классы знают друг про друга, тем лучше.
- Распараллеливать проведений операций с коллекциями стало проще. Там, где раньше пришлось бы проходить циклом, стримы
  значительно сокращают количество кода.
- Методы

`Stream API` не изменяют исходные коллекции, уменьшая количество побочных эффектов.
Даже сложные операции по обработке данных благодаря `Stream API`
`Stream API` выглядят лаконично и понятно. В общем, писать становится удобнее, а читать — проще.

## Как создавать стримы

#### В таблице ниже — основные способы создания стримов.

| Источник                                        | Способ                                 | Пример                                                                                                                    |
|-------------------------------------------------|----------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| Коллекция                                       | `collection.stream()`                  | ``` Collection<String> collection = Arrays.asList("f5", "b6", "z7"); Stream<String> collectionS = collection.stream();``` |
| Значения                                        | `Stream.of(v1,… vN)`                   | ``` Stream<String> valuesS = Stream.of("f5", "b6", "z7");```                                                              |
| Примитивы                                       | `IntStream.of(1, … N)`                 | ``` IntStream intS = IntStream.of(9, 8, 7);```                                                                            |
|                                                 | `DoubleStream.of(1.1, … N)`            | ``` DoubleStream doubleS = DoubleStream.of(2.4, 8.9);```                                                                  |
| Массив                                          | `Arrays.stream(arr)`                   | ``` String[] arr = {"f5","b6","z7"}; Stream<String> arrS = Arrays.stream(arr);```                                         |
| Файл — каждая новая строка становится элементом | `Files.lines(file_path)`               | ``` Stream<String> fromFileS = Files.lines(Paths.get("doc.txt"))```                                                       |
| Stream.builder                                  | `Stream.builder().add(...)....build()` | ``` Stream.builder().add("f5").add("b6").build();```                                                                      |

## Методы стримов

В Stream API доступны методы двух видов — конвейерные и терминальные. Кроме них можно выделить ряд спецметодов для
работы с числовыми стримами и несколько методов для проверки параллельности/последовательности. Но это формальное
разделение.

Конвейерных методов в стриме может быть много. Терминальный метод — только один. После его выполнения стрим завершается.

Пока вы не вызвали терминальный метод, ничего не происходит. Все потому, что конвейерные методы ленятся. Это значит, что
они обрабатывают данные и ждут команды, чтобы передать их терминальному методу. Мы рекомендуем не лениться как
конвейерные методы, а пройти обучение чтобы иметь полноценные знания для работы с Java Stream API.

### Конвейерные

| Метод      | Что сделает                                                                           | Использование                                                                                                             |
|------------|---------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| `filter`   | Отработает как фильтр, вернет значения, которые подходят под заданное условие         | ``` collection.stream().filter("e22"::equals).count();```                                                                 |
| `sorted`   | Отсортирует элементы в естественном порядке; можно использовать `Comparator`          | ``` collection.stream().sorted().collect(Collectors.toList());```                                                         |
| `limit`    | Лимитирует вывод по тому, количеству, которое вы укажете                              | ``` collection.stream().limit(10).collect(Collectors.toList());```                                                        |
| `skip`     | Пропустит указанное вами количество элементов                                         | ``` collection.stream().skip(3).findFirst().orElse("4");```                                                               |
| `distinct` | Найдет и уберет элементы, которые повторяются; вернет элементы без повторов           | ``` collection.stream().distinct().collect(Collectors.toList());```                                                       |
| `peek`     | Выполнит действие над каждым элементом элементов, вернет стрим с исходными элементами | ``` collection.stream().map(String::toLowerCase).peek((e) -> System.out.print("," + e)). collect(Collectors.toList());``` |
| `map`      | Выполнит действия над каждым элементом; вернет элементы с результатами функций        | ``` Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);```                     |
| `mapToInt` | Сработает как `map`, только вернет числовой `stream`                                  | ``` collection.stream().mapToInt((s) -> Integer.parseInt(s)).toArray();```                                                |
| `flatMap`  | Сработает как `map`, но преобразует один элемент в ноль, один или множество других    | ``` collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);```                   |

### Терминальные

| Метод            | Что сделает                                                                           | Использование                                                                            |
|------------------|---------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| `findFirst`      | Вернет элемент, соответствующий условию, который стоит первым                         | ``` collection.stream().findFirst().orElse("10");```                                     |
| `findAny`        | Вернет любой элемент, соответствующий условию                                         | ``` collection.stream().findAny().orElse("10");```                                       |
| `collect`        | Соберет результаты обработки в коллекции и не только                                  | ``` collection.stream().filter((s) -> s.contains("10")).collect(Collectors.toList());``` |
| `count`          | Посчитает и выведет, сколько элементов, соответствующих условию                       | ``` collection.stream().filter("f5"::equals).count();```                                 |
| `anyMatch`       | True, когда хоть один элемент соответствует условиям                                  | ``` collection.stream().anyMatch("f5"::equals);```                                       |
| `noneMatch`      | True, когда ни один элемент не соответствует условиям                                 | ``` collection.stream().noneMatch("b6"::equals);```                                      |
| `allMatch`       | True, когда все элементы соответствуют условиям                                       | ``` collection.stream().allMatch((s) -> s.contains("8"));```                             |
| `min`            | Найдет самый маленький элемент, используя переданный сравнитель                       | ``` collection.stream().min(String::compareTo).get();```                                 |
| `max`            | Найдет самый большой элемент, используя переданный сравнитель                         | ``` collection.stream().max(String::compareTo).get();```                                 |
| `forEach`        | Применит функцию ко всем элементам, но порядок выполнения гарантировать не может      | ``` set.stream().forEach((p) -> p.append("_2"));```                                      |
| `forEachOrdered` | Применит функцию ко всем элементам по очереди, порядок выполнения гарантировать может | ``` list.stream().forEachOrdered((p) -> p.append("_nv"));```                             |
| `toArray`        | Приведет значения стрима к массиву                                                    | ``` collection.stream().map(String::toLowerCase).toArray(String[]::new);```              |
| `reduce`         | Преобразует все элементы в один объект                                                | ``` collection.stream().reduce((c1, c2) -> c1 + c2).orElse(0);```                        |

### Конвейерные операции обрабатывают данные и передают их дальше по конвейеру, не завершая поток, в то время как терминальные операции обрабатывают данные и возвращают результат, завершая поток.

#### Примеры Конвейерных Операций:

- filter:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);  // Output: C1 C2
    }
}

```

- map:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);  // Output: C2 C1 B1 A2 A1
    }
}
```

#### Примеры Терминальных Операций:

- forEach:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);  // Output: a1 a2
    }
}
```

- collect:

```java
public class Example {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> resultList = myList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());  // resultList: [A1, A2, B1, C2, C1]
    }
}
```

</details>
