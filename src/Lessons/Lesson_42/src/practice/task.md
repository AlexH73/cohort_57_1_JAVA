## SOLID‑принципы

### Принцип единственной ответственности (SRP)

Каждый класс должен иметь только одну причину для изменения.  
**Задание 1. Single Responsibility (SRP)**  
У вас есть класс:

```java
class Invoice {
    void calculateTotal() { …}

    void printInvoice() { …}

    void saveToFile(String path) { …}
}
```

— Распишите, как вы разделите этот класс на несколько, чтобы каждый отвечал только за одно действие.

### Принцип открытости/закрытости (OCP)

Программные сущности должны быть открыты для расширения, но закрыты для модификации.  
**Задание 2. Open/Closed (OCP)**  
Интерфейс:

```java
interface Discount {
    double apply(double price);
}
```

Реализуйте два класса:

```java
class SeasonalDiscount implements Discount {
// скидка 10%
}
```

```java
class ClearanceDiscount implements Discount {
// скидка 30%
}
```

Напишите метод, который принимает список товаров и `Discount`, и вычисляет общую сумму со скидкой, не меняя исходный код
при добавлении новых скидок.

### Принцип подстановки Лисков (LSP)

Подклассы должны быть взаимозаменяемы с базовыми классами.  
**Задание 3. Liskov Substitution (LSP)**

Есть базовый класс:

```java
class Rectangle {
    void setWidth(double w);

    void setHeight(double h);

    double area();
}
```

— Попробуйте создать подкласс `Square`, нарушающий LSP, и объясните, почему это плохо. Затем предложите архитектурное
решение, сохраняющее корректность подстановки.

### Принцип разделения интерфейса (ISP)

Клиенты не должны зависеть от методов, которые они не используют.  
**Задание 4. Interface Segregation (ISP)**  
Интерфейс:

```java
interface AllInOne {
    void print();

    void fax();

    void scan();
}
```

— Создайте более узкие интерфейсы и два класса (`Printer`, `Scanner`), которые реализуют только необходимые методы.

### Принцип инверсии зависимостей (DIP)

Модули высокого уровня не должны зависеть от модулей низкого уровня напрямую.  
**Задание 5. Dependency Inversion (DIP)**  
Определено:

```java
interface Logger {
    void log(String msg);
}
```

```java
class FileLogger implements Logger { …
}
```

```java
class App {
    private FileLogger logger;

    public App() {
        this.logger = new FileLogger();
    }

    public void run() {
        logger.log("start");
    }
}
```

— Перепишите `App`, чтобы он зависел от интерфейса `Logger`, а не от `FileLogger`, и покажите, как внедрить другой `Logger` (
например, `ConsoleLogger`).