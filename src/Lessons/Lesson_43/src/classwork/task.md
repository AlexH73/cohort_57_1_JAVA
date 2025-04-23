# Задачи по теме «Функциональные интерфейсы и Stream API»

1. **Задача 1. Свой функциональный интерфейс и лямбда**
- Определите свой функциональный интерфейс
```java
@FunctionalInterface
interface Printer {
   void print(String message);
}
```  
  - Создайте его экземпляр с помощью лямбда‑выражения, которое выводит переданное сообщение на консоль.

2. **Задача 2. Method reference и `Function`**
   - Используя предопределённый интерфейс `Function<String, Integer>`, создайте функцию, которая возвращает длину строки.
- Реализуйте её через ссылку на метод:
```java
Function<String, Integer> lengthFunc = String::length;
```  
  - Проверьте на разных строках (например: `""`, `"Java"`, `"Functional Programming"`).

3. **Задача 3. Ссылка на конструктор и `Supplier`**
- Объявите
```java
Supplier<List<String>> listSupplier = ArrayList::new;
```  
- С помощью `listSupplier.get()` создайте новый `ArrayList`, добавьте в него 3–5 любых строк и выведите список на консоль:
```java
List<String> list = listSupplier.get();
list.addAll(List.of("one", "two", "three"));
System.out.println(list);
```

4. **Задача 4. `Consumer` для обработки списка**
- Дана коллекция:
```java
List<String> names = List.of("Alice", "Bob", "Charlie", "Diana");
```  
- С помощью `Consumer<String>` и ссылки `System.out::println` выведите каждому имени приветствие вида:
```java
"Hello, " + name + "!"
```

5. **Задача 5. Составление цепочки `Predicate` → `Function` → `Consumer`**
- Дана коллекция чисел:
```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
```  
- С помощью:
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
Function<Integer, Integer> square = n -> n * n;
Consumer<Integer> printer = System.out::println;
```  
отфильтруйте чётные числа, возведите каждое в квадрат и выведите результат на экран:
```java
for (Integer n : numbers) {
    if (isEven.test(n)) {
        Integer sq = square.apply(n);
        printer.accept(sq);
    }
}
```
- *(Опционально)* оберните это в метод, который принимает три интерфейса и список чисел, и внутри него выполняет `filter` + `map` + `forEach`.
