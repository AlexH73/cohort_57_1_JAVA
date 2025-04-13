<details>
<summary>Lesson 41. Learning the Date-Time API in Java </summary>

# Lesson 41. Learning the Date-Time API in Java

## Introduction to the Date-Time API

### Overview of the problems of working with date and time before Java 8

#### Problems with `java.util.Date` and `java.util.Calendar`

- **Insufficient thread security**: `Date` and `Calendar` classes they are not thread-safe, which creates problems
  in multithreaded environments.
- **Mutability**: `Date` objects are mutable, which can lead to errors, especially when developing large and complex
  systems.
- **Outdated and confusing API**: Many methods in `Date` are outdated and replaced by analogues in `Calendar`, but
  even `Calendar`
  it is difficult to use and unintuitive.
- **Time Zone Issues**: Working with time zones is difficult and error-prone.
- **Lack of support for ISO 8601**: The International Standard for Date and Time representation is not directly
  supported.

#### Introduction to the Date-Time API (Java 8)

With the release of Java 8, a new Date-Time API was introduced in the `java.time` package, developed taking into account
the lessons learned
from Joda-Time (a date and time management library for Java up to Java 8) and designed to solve
the problems mentioned above.

##### The main advantages of the Date-Time API:

- **Immutability**: Most classes in `java.time` are immutable, which makes them safe to
  use in multithreaded environments and eliminates many problems associated with mutable state.
- **Clear separation of concepts**: The Date-Time API offers a clear separation of the concepts of date, time,
  date-time,
  duration, period, time zone, time point, which makes it easier to work with time values.
- **Convenience and intuitiveness of use**: The API is designed to be more intuitive and user-friendly.
- **ISO 8601 support**: The API fully supports the ISO 8601 standard.
- **Improved time zone support**: Working with time zones has become easier and more reliable.

### Conclusion

The introduction of the Date-Time API in Java 8 greatly simplifies the work with date and time, providing developers
with powerful and
flexible tools for solving tasks related to time and dates.

## Basic concepts and classes of the Date-Time API

### Review

The Date-Time API in Java 8 is a flexible and powerful set of tools for working with dates, times and their
combinations. In this section, we will look at the key API classes that allow you to manage date and time at
different levels of abstraction and with different levels of detail.

### Date-Time API classes

#### `LocalDate`

- **Description**: Represents a date without taking into account the time of day or time zone. It is used to represent
  such
  concepts such as birthdays, payment dates and other events related only to calendar dates.
- **Basic operations**: Creating instances, adding or subtracting days, months and years, comparing dates.

#### `LocalTime`

- **Description**: Represents the time of day without taking into account the date or time zone. It can be used to
  manage the time
  of events during the day.
- **Basic operations**: Creating instances, adding or subtracting hours, minutes, seconds and nanoseconds, comparing
  time.

#### `LocalDateTime`

- **Description**: Combines date and time, but also without taking into account the time zone. Perfect for presentation
  specific points in time when the time zone does not matter.
- **Basic operations**: Creating instances, manipulating date and time, comparing time points.

#### `ZonedDateTime`

- **Description**: Represents the full date with time and time zone. It is used when it is necessary to take into
  account time zones
  belts, for example, in applications that work with users from different regions.
- **Basic operations**: Creating instances based on time zones, converting between different time zones,
  manipulations with the date and time in a specific time zone.

#### `Instant`

- **Description**: Represents a moment in time in the context of the Unix era (counting from January 1, 1970). `Instant`
  It is used to work with timestamps that do not depend on the calendar or time zone.
- **Basic operations**: Creating instances, adding or subtracting time intervals, comparing
  time points.

### Conclusion

Each of these classes provides different methods for creating, manipulating, and comparing dates and times, allowing
developers to choose the appropriate level of abstraction for their specific tasks. It is important to note that all
these classes
are immutable and the stream

## Working with date and time in the Date-Time API

### Creating instances

#### LocalDate, LocalTime, LocalDateTime

- **Creating the current date/time**: Use `.now()` to get the current date, time, or date-time
  according to the system time in the default time zone.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
    }
}
```

- **Creating instances from specific values**: The `.of()` method allows you to create instances by specifying the year,
  month,
  day, and so on.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1990, Month.JANUARY, 1);
        LocalTime timeOfMeeting = LocalTime.of(13, 30);
    }
}
```

- **Parsing a string into date/time**: `.parse()` takes a string and creates an instance of `LocalDate`, `LocalTime`
  or `LocalDateTime'.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1990-01-01");
        LocalTime time = LocalTime.parse("13:30:00");
    }
}
```

### ZonedDateTime

- **Creating a `ZonedDateTime`**: Use `.now(ZoneId)` to get the current date-time in a certain time zone
  a zone or `.of()` with `ZoneId` to create an instance with specific values.

```java
public class Example {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
    }
}
```

### Date and time operations

- **Addition and Subtraction**: Use methods like `.plusDays()`, `.minusHours()` to change values.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate tomorrow = today.plusDays(1);
        LocalTime hourEarlier = now.minusHours(1);
    }
}
```

- **Date and time comparison**: The methods `.isBefore()`, `.isAfter()` allow you to compare timestamps.

```java
public class Example {
    public static void main(String[] args) {
        boolean isPast = dateOfBirth.isBefore(LocalDate.now());
    }
}
```

### Working with time zones

- **Creating instances of `ZonedDateTime'**: Use `ZonedDateTime` to work with specific time zones

```java
public class Example {
    public static void main(String[] args) {
        ZonedDateTime meetingNY = ZonedDateTime.of(dateTimeNow, ZoneId.of("America/New_York"));
    }
}
```

- **Working with `ZoneId`**: `ZoneId` allows you to manage time zones when creating instances of `ZonedDateTime`.

```java
public class Example {
    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}
```

### Conclusion

Working with the Date-Time API in Java 8 and later provides powerful and flexible tools for date and time management,
allowing you to easily perform common operations such as addition, subtraction and comparison, as well
as work effectively with time zones. Understanding and using these classes and methods will make your code more
readable, reliable, and
easily maintained.

## Formatting and parsing the date and time

### Date and time formatting (10 minutes)

The Date-Time API provides the `DateTimeFormatter` class for formatting and parsing dates and times. This allows
you to represent dates and times in human-readable formats and inversely convert text representations into
date/time objects.

#### Using the `DateTimeFormatter`

- **Standard Formats**: `DateTimeFormatter` offers a number of predefined formats such as `ISO_LOCAL_DATE'.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted date (ISO): " + formattedDate);
    }
}
```

- **Custom formats**: You can create your own formats using formatting templates.

```java
public class Example {
    public static void main(String[] args) {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String customFormattedDate = date.format(customFormatter);
        System.out.println("Formatted date (custom): " + customFormattedDate);
    }
}
```

### Parsing the date and time string

'DateTimeFormatter` is also used to parse strings containing date and/or time back into `LocalDate` objects,
`LocalTime` and `LocalDateTime'.

#### Parsing the date and time from the string

- Parsing using standard formats:

```java
public class Example {
    public static void main(String[] args) {
        String dateString = "2023-01-28";
        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Parsed date (ISO): " + parsedDate);
    }
}
```

- Parsing using custom formats:

```java
public class Example {
    public static void main(String[] args) {
        String customDateString = "28.01.2023";
        LocalDate parsedCustomDate = LocalDate.parse(customDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Parsed date (custom): " + parsedCustomDate);
    }
}
```

**Practical tips**

- It is important to make sure that the parsing string matches the format specified in the `DateTimeFormatter`,
  otherwise
  a `DateTimeParseException` exception may be thrown.
- When working with `LocalDateTime` or ZonedDateTime, take into account the format and availability of time and time
  zone information
  accordingly, in the line.

### Conclusion

The mastery of formatting and parsing dates and times using the `DateTimeFormatter` is a key skill when
working with the Date-Time API in Java. This allows you not only to present dates and times in a user-friendly way, but
also
and provides the ability to reliably process text data containing date and time information.

## Calendar class in Java

### General description

The `Calendar' class in Java is an abstract class for retrieving and manipulating calendar data such as year, month, day
of the month, hour, minute, and so on. Calendar provides methods for converting time between a specific instant point (
milliseconds since the beginning of the Unix era) and a set of calendar fields, as well as for manipulating calendar
fields.

### Main Features

- **Abstractness**: `Calendar` is an abstract class, which allows you to use its specific implementations, such as `
  GregorianCalendar'.
- **Localization**: Supports different types of calendars, including the Gregorian calendar and is available for
  localization.
- **Time Zones**: Allows you to work with time zones through the `TimeZone' class.

### Basic operations

- **Creating instances**: You can get an instance of `Calendar` using the `getInstance()` method, which
  returns `Calendar` according to the default locale and time zone.
- **Working with date and time**: `Calendar` allows you to set and receive the values of the year, month, day, etc., as
  well as manipulate these values, for example, add or subtract a certain amount of time.
- **Date Comparison**: The `before()`, `after()` and `equals()` methods allow you to compare two dates.
- **Time Conversion**: It is possible to convert the time between milliseconds since the beginning of the Unix epoch and
  calendar fields.

### Usage example

```java
public class Example {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Set date: " + calendar.getTime());
    }
}
```

### Advantages and disadvantages

**Advantages**:

Flexibility in working with different calendar systems and time zones.
An extensive set of methods for manipulating dates.

**Disadvantages**:

The complexity of use compared to the newer Date-Time API from Java 8.
The `Calendar` is mutable, which can lead to errors in multithreaded environments.

## Conclusion of the lesson on learning the Date-Time API

During this lesson, we looked at the main aspects of working with dates and times in Java, using powerful features
Date-Time APIs introduced in Java 8 and later versions. This API has been designed to simplify working with
time points, dates, and durations by providing a set of intuitive and flexible tools.

### Key points of the lesson:

- **LocalDate, LocalTime and LocalDateTime** allow you to manage dates and times without reference to a time zone, which
  It is convenient for working with calendar dates and time of day.
- **ZonedDateTime and Instant** expand time management capabilities by adding work with time zones and
  timestamps on a global scale.
- **DateTimeFormatter** provides flexible means for formatting and parsing dates and times, allowing you to easily
  translate dates and timestamps from strings to objects and back.
- **ZoneId** and **ZoneOffset** are used to work with different time zones and offsets, making development easier
  applications for users from different parts of the world.

### Practical significance:

Mastering the Date-Time API opens up great opportunities for developing reliable and error-resistant applications that
require accurate and efficient time management. Whether it's event management applications, booking systems,
time tracking applications, or any other date and time management systems, the Date-Time API
provides all the necessary tools to implement them.
</details>


-----------

<details>
<summary>Урок 41. Изучение Date-Time API в Java </summary>

# Урок 41. Изучение Date-Time API в Java

## Введение в Date-Time API

### Обзор проблем работы с датой и временем до Java 8

#### Проблемы с `java.util.Date` и `java.util.Calendar`

- **Недостаточная безопасность потоков**: Классы `Date` и `Calendar` не являются потокобезопасными, что создает проблемы
  в многопоточных средах.
- **Изменяемость**: Объекты `Date` изменяемы, что может привести к ошибкам, особенно при разработке больших и сложных
  систем.
- **Устаревший и запутанный API**: Многие методы в `Date` устарели и заменены аналогами в `Calendar`, но даже `Calendar`
  сложен в использовании и неинтуитивен.
- **Проблемы с часовым поясом**: Работа с часовыми поясами сложна и подвержена ошибкам.
- **Отсутствие поддержки ISO 8601**: Международный стандарт представления даты и времени не поддерживается напрямую.

#### Введение в Date-Time API (Java 8)

С выходом Java 8 было представлено новое Date-Time API в пакете `java.time`, разработанное с учетом уроков, извлеченных
из Joda-Time (библиотека управления датой и временем для Java до Java 8) и предназначенное для решения упомянутых выше
проблем.

##### Основные преимущества Date-Time API:

- **Неизменяемость**: Большинство классов в `java.time` являются неизменяемыми, что делает их безопасными для
  использования в многопоточных средах и устраняет множество проблем, связанных с изменяемым состоянием.
- **Четкое разделение концепций**: Date-Time API предлагает ясное разделение концепций даты, времени, даты-времени,
  длительности, периода, часового пояса, момента времени, что упрощает работу с временными значениями.
- **Удобство и интуитивность использования**: API разработано быть более интуитивно понятным и удобным в использовании.
- **Поддержка ISO 8601**: API полностью поддерживает стандарт ISO 8601.
- **Улучшенная поддержка часовых поясов**: Работа с часовыми поясами стала проще и надежнее.

### Заключение

Введение в Date-Time API в Java 8 значительно упрощает работу с датой и временем, предоставляя разработчикам мощные и
гибкие инструменты для решения задач, связанных с временем и датами.

## Основные концепции и классы Date-Time API

### Обзор

Date-Time API в Java 8 представляет собой гибкий и мощный набор инструментов для работы с датами, временем и их
комбинациями. В этом разделе мы рассмотрим ключевые классы API, которые позволяют управлять датой и временем на
различных уровнях абстракции и с разным уровнем детализации.

### Классы Date-Time API

#### `LocalDate`

- **Описание**: Представляет собой дату без учета времени суток или часового пояса. Используется для представления таких
  понятий, как дни рождения, даты выплат и других событий, связанных только с календарными датами.
- **Основные операции**: Создание экземпляров, добавление или вычитание дней, месяцев и лет, сравнение дат.

#### `LocalTime`

- **Описание**: Представляет время суток без учета даты или часового пояса. Может использоваться для управления временем
  событий в течение дня.
- **Основные операции**: Создание экземпляров, добавление или вычитание часов, минут, секунд и наносекунд, сравнение
  времени.

#### `LocalDateTime`

- **Описание**: Комбинирует дату и время, но также без учета часового пояса. Идеально подходит для представления
  конкретных моментов времени, когда часовой пояс не играет роли.
- **Основные операции**: Создание экземпляров, манипуляции с датой и временем, сравнение моментов времени.

#### `ZonedDateTime`

- **Описание**: Представляет полную дату с временем и часовым поясом. Используется, когда необходимо учитывать часовые
  пояса, например, в приложениях, работающих с пользователями из разных регионов.
- **Основные операции**: Создание экземпляров с учетом часовых поясов, конвертация между разными часовыми поясами,
  манипуляции с датой и временем в конкретном часовом поясе.

#### `Instant`

- **Описание**: Представляет момент времени в контексте эпохи Unix (считая от 1 января 1970 года). `Instant`
  используется для работы с метками времени, не зависящими от календаря или часового пояса.
- **Основные операции**: Создание экземпляров, добавление или вычитание временных интервалов, сравнение моментов
  времени.

### Заключение

Каждый из этих классов предоставляет различные методы для создания, манипуляции и сравнения дат и времени, позволяя
разработчикам выбирать подходящий уровень абстракции для их конкретных задач. Важно отметить, что все эти классы
являются неизменяемыми и поток

## Работа с датой и временем в Date-Time API

### Создание экземпляров

#### LocalDate, LocalTime, LocalDateTime

- **Создание текущей даты/времени**: Используйте `.now()` для получения текущей даты, времени или даты-времени в
  соответствии с системным часом в часовом поясе по умолчанию.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
    }
}
```

- **Создание экземпляров из конкретных значений**: Метод `.of()` позволяет создавать экземпляры, указывая год, месяц,
  день и так далее.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1990, Month.JANUARY, 1);
        LocalTime timeOfMeeting = LocalTime.of(13, 30);
    }
}
```

- **Разбор строки в дату/время**: `.parse()` принимает строку и создает экземпляр `LocalDate`, `LocalTime`
  или `LocalDateTime`.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1990-01-01");
        LocalTime time = LocalTime.parse("13:30:00");
    }
}
```

### ZonedDateTime

- **Создание `ZonedDateTime`**: Используйте `.now(ZoneId)` для получения текущей даты-времени в определенном часовом
  поясе или `.of()` с `ZoneId` для создания экземпляра с конкретными значениями.

```java
public class Example {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
    }
}
```

### Операции над датой и временем

- **Добавление и вычитание**: Используйте методы типа `.plusDays()`, `.minusHours()` для изменения значений.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate tomorrow = today.plusDays(1);
        LocalTime hourEarlier = now.minusHours(1);
    }
}
```

- **Сравнение дат и времени**: Методы `.isBefore()`, `.isAfter()` позволяют сравнивать временные метки.

```java
public class Example {
    public static void main(String[] args) {
        boolean isPast = dateOfBirth.isBefore(LocalDate.now());
    }
}
```

### Работа с часовыми поясами

- **Создание экземпляров `ZonedDateTime`**: Для работы с конкретными часовыми поясами используйте `ZonedDateTime`

```java
public class Example {
    public static void main(String[] args) {
        ZonedDateTime meetingNY = ZonedDateTime.of(dateTimeNow, ZoneId.of("America/New_York"));
    }
}
```

- **Работа с `ZoneId`**: `ZoneId` позволяет управлять часовыми поясами при создании экземпляров `ZonedDateTime`.

```java
public class Example {
    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}
```

Список доступных идентификаторов часовых поясов (`ZoneId`) можно получить непосредственно в вашем Java приложении с
помощью метода `ZoneId.getAvailableZoneIds()`. Этот метод возвращает `Set<String>`, содержащий все доступные
идентификаторы
часовых поясов. Вот пример кода, который выводит весь список доступных `ZoneId`:

```java
public class Example {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }
}
```

### Заключение

Работа с Date-Time API в Java 8 и новее предоставляет мощные и гибкие инструменты для управления датами и временем,
позволяя легко выполнять распространенные операции, такие как добавление, вычитание и сравнение, а также эффективно
работать с часовыми поясами. Понимание и использование этих классов и методов сделает ваш код более читаемым, надежным и
легко поддерживаемым.

## Форматирование и разбор даты и времени

### Форматирование даты и времени

Date-Time API предоставляет класс `DateTimeFormatter` для форматирования и разбора даты и времени. Это позволяет
представлять даты и времена в удобочитаемых форматах и обратно преобразовывать текстовые представления в объекты
даты/времени.

#### Использование `DateTimeFormatter`

- **Стандартные форматы**: `DateTimeFormatter` предлагает ряд предопределенных форматов, таких как `ISO_LOCAL_DATE`.

```java
public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted date (ISO): " + formattedDate);
    }
}
```

- **Пользовательские форматы**: Вы можете создавать свои собственные форматы, используя шаблоны форматирования.

```java
public class Example {
    public static void main(String[] args) {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String customFormattedDate = date.format(customFormatter);
        System.out.println("Formatted date (custom): " + customFormattedDate);
    }
}
```

### Разбор строки с датой и временем

`DateTimeFormatter` также используется для разбора строк, содержащих дату и/или время, обратно в объекты `LocalDate`,
`LocalTime` и `LocalDateTime`.

#### Разбор даты и времени из строки

- Разбор с использованием стандартных форматов:

```java
public class Example {
    public static void main(String[] args) {
        String dateString = "2023-01-28";
        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Parsed date (ISO): " + parsedDate);
    }
}
```

- Разбор с использованием пользовательских форматов:

```java
public class Example {
    public static void main(String[] args) {
        String customDateString = "28.01.2023";
        LocalDate parsedCustomDate = LocalDate.parse(customDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Parsed date (custom): " + parsedCustomDate);
    }
}
```

**Практические советы**

- Важно убедиться, что строка для разбора соответствует формату, указанному в `DateTimeFormatter`, иначе может быть
  выброшено исключение `DateTimeParseException`.
- При работе с `LocalDateTime` или ZonedDateTime учитывайте формат и наличие информации о времени и часовом поясе
  соответственно в строке.

### Заключение

Мастерство форматирования и разбора даты и времени с использованием `DateTimeFormatter` является ключевым навыком при
работе с Date-Time API в Java. Это позволяет не только представлять даты и времена в понятном для пользователя виде, но
и обеспечивает возможность надежно обрабатывать текстовые данные, содержащие информацию о дате и времени.

## Класс Calendar в Java

### Общее описание

Класс `Calendar` в Java представляет собой абстрактный класс для получения и манипулирования календарными данными,
такими как год, месяц, день месяца, час, минута и так далее. `Calendar` предоставляет методы для преобразования времени
между конкретной моментальной точкой (миллисекунды с начала эпохи Unix) и набором календарных полей, а также для
манипулирования календарными полями.

### Основные характеристики

- **Абстрактность**: `Calendar` является абстрактным классом, что позволяет использовать его конкретные реализации,
  такие как `GregorianCalendar`.
- **Локализация**: Поддерживает разные типы календарей, включая григорианский календарь и доступен для локализации.
- **Часовые пояса**: Позволяет работать с часовыми поясами через класс `TimeZone`.

### Основные операции

- **Создание экземпляров**: Получить экземпляр `Calendar` можно с помощью метода `getInstance()`, который
  возвращает `Calendar` в соответствии с локалью и часовым поясом по умолчанию.
- **Работа с датой и временем**: `Calendar` позволяет устанавливать и получать значения года, месяца, дня и т.д., а
  также манипулировать этими значениями, например, добавлять или вычитать определенное количество времени.
- **Сравнение дат**: Методы `before()`, `after()` и `equals()` позволяют сравнивать две даты.
- **Преобразование времени**: Можно преобразовывать время между миллисекундами с начала эпохи Unix и календарными
  полями.

### Пример использования

```java
public class Example {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Установленная дата: " + calendar.getTime());
    }
}
```

### Преимущества и недостатки

**Преимущества**:

Гибкость в работе с разными календарными системами и часовыми поясами.
Обширный набор методов для манипулирования датами.

**Недостатки**:

Сложность использования по сравнению с более новым Date-Time API из Java 8.
`Calendar` является изменяемым, что может привести к ошибкам в многопоточных средах.

## Заключение урока по изучению Date-Time API

В ходе этого урока мы рассмотрели основные аспекты работы с датами и временем в Java, используя мощные возможности
Date-Time API, представленные в Java 8 и более поздних версиях. Это API было разработано для упрощения работы с
временными точками, датами и длительностями, предоставляя набор интуитивно понятных и гибких инструментов.

### Ключевые моменты урока:

- **`LocalDate`, `LocalTime` и `LocalDateTime`** позволяют управлять датами и временем без привязки к часовому поясу, что
  удобно для работы с календарными датами и временем суток.
- **`ZonedDateTime` и `Instant`** расширяют возможности управления временем, добавляя работу с часовыми поясами и метками
  времени в глобальном масштабе.
- **`DateTimeFormatter`** предоставляет гибкие средства для форматирования и разбора дат и времени, позволяя легко
  переводить даты и временные метки из строк в объекты и обратно.
- **`ZoneId`** и **`ZoneOffset`** используются для работы с различными часовыми поясами и смещениями, облегчая разработку
  приложений для пользователей из разных частей мира.

### Практическая значимость:

Освоение Date-Time API открывает широкие возможности для разработки надежных и устойчивых к ошибкам приложений, которые
требуют точного и эффективного управления временем. Будь то приложения для управления событиями, системы бронирования,
приложения для отслеживания времени или любые другие системы, работающие с датами и временем, Date-Time API
предоставляет все необходимые инструменты для их реализации.



</details>