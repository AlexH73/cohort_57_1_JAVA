<details style="padding-top: 18px">
  <summary><b>Lesson 31: Java Sets</b></summary>

<details style="padding-top: 18px">
  <summary><b>1. Introduction to Collections and Sets</b></summary>

## **1. Introduction to Collections and Sets**
- **Brief Overview of Java Collections:**  
  The Java Collections Framework provides a robust set of standard interfaces and classes for storing, processing, and managing groups of objects. Collections simplify common tasks such as sorting, searching, and filtering data.

- **Explanation of the Set Interface and Its Role:**  
  The `Set` interface is designed to store unique elements. It does not allow duplicates, ensuring that each element in the collection is unique.

- **Comparison with List:**  
  Unlike the `List` interface, which permits duplicate elements and maintains an order based on indices, a `Set` focuses on uniqueness. The order of elements in a set depends on its implementation:
  - `HashSet` does not guarantee any specific order.
  - `LinkedHashSet` maintains the insertion order.
  - `TreeSet` stores elements in a sorted order.
</details>

<details style="padding-top: 18px">
  <summary><b>2. What is a Set?</b></summary>

## **2. What is a Set?**
- **Definition:**  
  A Set is a collection that does not allow duplicate elements. Each element in a Set is unique.

- **Characteristics:**
  - Ensures the uniqueness of elements by guaranteeing that each element appears only once.
  - The order of elements may be undefined (as in HashSet), maintained in insertion order (as in LinkedHashSet), or sorted (as in TreeSet).
</details>

<details style="padding-top: 18px">
  <summary><b>3. Basic Operations on a Set (in English)</b></summary>

## **3. Basic Operations on a Set**

### Adding Elements
- **Description:**  
  Elements are added to a Set using the `add()` method. Since a Set guarantees the uniqueness of elements, adding a duplicate will not change the Set.

### Removing Elements
- **Description:**  
  The `remove()` method is used to delete an element from the Set if it exists.

### Checking for an Element
- **Description:**  
  The `contains()` method checks whether a specific element is present in the Set. It returns `true` if the element is found, otherwise `false`.

### Iteration
- **Description:**  
  You can iterate over the elements of a Set using a for-each loop or an iterator. The order of iteration depends on the Set implementation (e.g., `HashSet` does not guarantee any order, while `LinkedHashSet` maintains the insertion order).

### Determining Size
- **Description:**  
  The `size()` method returns the number of elements currently stored in the Set.

---

### Code Example (in English):
```java
import java.util.HashSet;
import java.util.Set;

public class SetOperationsExample {
    public static void main(String[] args) {
        // Creating a Set using HashSet
        Set<String> fruits = new HashSet<>();
        
        // Adding elements (duplicates will not be added)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate; will not be added
        System.out.println("Set contents after adding elements: " + fruits);
        
        // Checking for the presence of "Banana"
        if (fruits.contains("Banana")) {
            System.out.println("The set contains 'Banana'.");
        }
        
        // Removing the element "Cherry"
        fruits.remove("Cherry");
        System.out.println("Set contents after removing 'Cherry': " + fruits);
        
        // Iterating over the set elements
        System.out.println("Iterating over set elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Determining the size of the set
        System.out.println("Set size: " + fruits.size());
    }
}
```
</details>

<details style="padding-top: 18px">
  <summary><b>4. Types of Set and Their Characteristics (in English)</b></summary>

## **4. Types of Set and Their Characteristics**

### HashSet
- **Characteristics:**
  - Uses a hash table to store elements.
  - Does not guarantee any specific order of the elements.
  - Offers constant time performance for basic operations (add, remove, contains) with a proper hash function.
- **Handling of null:**
  - Allows one null element.
- **Determining Equality of Elements:**
  - Equality is determined by the `equals()` and `hashCode()` methods. Two objects are considered equal if `equals()` returns true and their hash codes match.
- **Code Example:**
  ```java
  import java.util.HashSet;
  import java.util.Set;
  
  public class HashSetExample {
      public static void main(String[] args) {
          Set<String> set = new HashSet<>();
          set.add("Apple");
          set.add("Banana");
          set.add("Cherry");
          set.add(null);       // adding a null element
          set.add("Apple");    // duplicate, will not be added
          
          System.out.println("HashSet: " + set);
      }
  }
  ```

---

### TreeSet
- **Characteristics:**
  - Implements the SortedSet interface and stores elements in sorted order (either natural order or as defined by a Comparator).
  - Generally slower than HashSet due to the overhead of maintaining order.
- **Handling of null:**
  - By default, does not allow null elements, as comparing null with other objects is not possible.
- **Determining Equality of Elements:**
  - Equality is determined based on comparison using `compareTo()` or a Comparator. Two elements are considered equal if the comparison returns 0.
- **Code Example:**
  ```java
  import java.util.TreeSet;
  import java.util.Set;
  
  public class TreeSetExample {
      public static void main(String[] args) {
          Set<String> set = new TreeSet<>();
          set.add("Banana");
          set.add("Apple");
          set.add("Cherry");
          // set.add(null); // will throw NullPointerException
          set.add("Apple"); // duplicate, will not be added
          
          System.out.println("TreeSet: " + set);
      }
  }
  ```

---

### LinkedHashSet
- **Characteristics:**
  - Maintains the insertion order of the elements.
  - Based on HashSet, combining fast access with predictable iteration order.
- **Handling of null:**
  - Allows one null element, similar to HashSet.
- **Determining Equality of Elements:**
  - Uses the `equals()` and `hashCode()` methods, as in HashSet.
- **Code Example:**
  ```java
  import java.util.LinkedHashSet;
  import java.util.Set;
  
  public class LinkedHashSetExample {
      public static void main(String[] args) {
          Set<String> set = new LinkedHashSet<>();
          set.add("Banana");
          set.add("Apple");
          set.add("Cherry");
          set.add(null);       // allowed, one null element
          set.add("Apple");    // duplicate, will not be added
          
          System.out.println("LinkedHashSet: " + set);
      }
  }
  ```
</details>

<details style="padding-top: 18px">
  <summary><b>5. Practical Applications (in English)</b></summary>

## **5. Practical Applications**

### Usage Scenarios:
- **Eliminating Duplicates:**  
  A Set easily removes duplicate elements from a collection, which is especially useful when processing data from various sources or user input.

- **Checking for an Element:**  
  Using the `contains()` method, you can quickly verify whether a specific element exists in the collection, simplifying data lookup and validation.

- **Performing Set Operations:**  
  Although the Set interface does not provide specialized methods for union or intersection directly, these operations can be conceptually implemented using:
  - `addAll()` for union – adds all elements from one Set to another.
  - `retainAll()` for intersection – retains only the elements that are present in another Set.

</details>
</details>

------

<details style="padding-top: 18px">
  <summary><b>Урок 31: Множества в Java (Set) </b></summary>

<details style="padding-top: 18px">
  <summary><b>1. Введение в коллекции и сеты</b></summary>

## **1. Введение в коллекции и сеты**
- **Краткий обзор коллекций в Java:**  
  Java Collections Framework предоставляет мощный набор стандартных интерфейсов и классов для хранения, обработки и управления группами объектов. Коллекции упрощают решение общих задач, таких как сортировка, поиск и фильтрация данных.

- **Объяснение интерфейса Set и его роли:**  
  Интерфейс `Set` предназначен для хранения уникальных элементов. Он не допускает дублирование, что гарантирует уникальность каждого элемента в коллекции.

- **Сравнение с List:**  
  В отличие от `List`, который допускает дублирование элементов и сохраняет их порядок по индексам, `Set` фокусируется на уникальности. Порядок элементов в сете зависит от конкретной реализации:
  - `HashSet` не гарантирует определённого порядка.
  - `LinkedHashSet` сохраняет порядок вставки.
  - `TreeSet` хранит элементы в отсортированном порядке.
</details>

<details style="padding-top: 18px">
  <summary><b>2. Что такое Set?</b></summary>

## **2. Что такое Set?**
- **Определение:**  
  Set – это коллекция, которая не допускает дублирование элементов. Каждый элемент в Set является уникальным.

- **Особенности:**
  - Обеспечивает уникальность элементов, гарантируя, что каждый элемент встречается только один раз.
  - Порядок элементов может быть неопределённым (например, в HashSet), сохраняться в порядке вставки (например, в LinkedHashSet) или быть отсортированным (например, в TreeSet).
</details>

<details style="padding-top: 18px">
  <summary><b>3. Основные операции с Set</b></summary>

## **3. Основные операции с Set**

### Добавление элементов
- **Описание:**  
  Добавление элемента в Set выполняется с помощью метода `add()`. Если элемент уже присутствует в Set, он не будет добавлен, так как Set гарантирует уникальность элементов.

### Удаление элементов
- **Описание:**  
  Удаление элемента производится методом `remove()`, который удаляет указанный элемент из Set, если он там присутствует.

### Проверка наличия элемента
- **Описание:**  
  Метод `contains()` используется для проверки, содержится ли конкретный элемент в Set. Он возвращает `true`, если элемент найден, и `false` в противном случае.

### Итерация по элементам
- **Описание:**  
  Итерация по элементам Set осуществляется с помощью цикла `for-each` или итератора. Порядок обхода зависит от реализации Set (например, `HashSet` не гарантирует порядок, а `LinkedHashSet` сохраняет порядок вставки).

### Определение размера
- **Описание:**  
  Метод `size()` возвращает количество элементов, находящихся в Set.

---

### Пример кода:
```java
import java.util.HashSet;
import java.util.Set;

public class SetOperationsExample {
    public static void main(String[] args) {
        // Создание Set с использованием HashSet
        Set<String> fruits = new HashSet<>();
        
        // Добавление элементов (дубликаты не будут добавлены)
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Вишня");
        fruits.add("Яблоко"); // Этот элемент не добавится, так как уже присутствует
        System.out.println("Содержимое сета после добавления: " + fruits);
        
        // Проверка наличия элемента "Банан"
        if (fruits.contains("Банан")) {
            System.out.println("Сет содержит элемент 'Банан'.");
        }
        
        // Удаление элемента "Вишня"
        fruits.remove("Вишня");
        System.out.println("Содержимое сета после удаления 'Вишня': " + fruits);
        
        // Итерация по элементам сета
        System.out.println("Итерация по элементам сета:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Определение размера сета
        System.out.println("Размер сета: " + fruits.size());
    }
}
```
</details>

<details style="padding-top: 18px">
  <summary><b>4. Типы Set и их особенности (на русском)</b></summary>

## **4. Типы Set и их особенности**

### HashSet
- **Особенности:**
  - Использует хеш-таблицу для хранения элементов.
  - Не гарантирует определённого порядка элементов.
  - Обеспечивает константное время выполнения основных операций (добавление, удаление, проверка) при корректной реализации hashCode().
- **Работа с null:**
  - Позволяет хранить один null-элемент.
- **Определение равенства элементов:**
  - Равенство определяется с помощью методов `equals()` и `hashCode()`. Два объекта считаются равными, если их методы `equals()` возвращают true и их хеш-коды совпадают.
- **Пример кода:**
  ```java
  import java.util.HashSet;
  import java.util.Set;
  
  public class HashSetExample {
      public static void main(String[] args) {
          Set<String> set = new HashSet<>();
          set.add("Яблоко");
          set.add("Банан");
          set.add("Вишня");
          set.add(null);       // добавление null
          set.add("Яблоко");   // дубликат не будет добавлен
          
          System.out.println("HashSet: " + set);
      }
  }
  ```

---

### TreeSet
- **Особенности:**
  - Реализует интерфейс SortedSet и хранит элементы в отсортированном порядке (натуральном порядке или по заданному компаратору).
  - Обычно работает медленнее, чем HashSet, из-за накладных расходов на поддержание сортировки.
- **Работа с null:**
  - По умолчанию не допускает добавление null, так как сравнение null с другими элементами невозможно.
- **Определение равенства элементов:**
  - Равенство определяется на основе сравнения с помощью метода `compareTo()` или компаратора. Элементы считаются равными, если сравнение возвращает 0.
- **Пример кода:**
  ```java
  import java.util.TreeSet;
  import java.util.Set;
  
  public class TreeSetExample {
      public static void main(String[] args) {
          Set<String> set = new TreeSet<>();
          set.add("Банан");
          set.add("Яблоко");
          set.add("Вишня");
          // set.add(null); // вызовет NullPointerException
          set.add("Яблоко"); // дубликат не будет добавлен
          
          System.out.println("TreeSet: " + set);
      }
  }
  ```

---

### LinkedHashSet
- **Особенности:**
  - Сохраняет порядок вставки элементов.
  - Основан на HashSet, сочетая преимущества быстрого доступа с сохранением порядка.
- **Работа с null:**
  - Позволяет хранить один null-элемент, аналогично HashSet.
- **Определение равенства элементов:**
  - Используются методы `equals()` и `hashCode()`, как и в HashSet.
- **Пример кода:**
  ```java
  import java.util.LinkedHashSet;
  import java.util.Set;
  
  public class LinkedHashSetExample {
      public static void main(String[] args) {
          Set<String> set = new LinkedHashSet<>();
          set.add("Банан");
          set.add("Яблоко");
          set.add("Вишня");
          set.add(null);       // допускается один null
          set.add("Яблоко");   // дубликат не будет добавлен
          
          System.out.println("LinkedHashSet: " + set);
      }
  }
  ```
</details>

<details style="padding-top: 18px">
  <summary><b>5. Применение на практике </b></summary>

## **5. Применение на практике**

### Сценарии использования:
- **Устранение дубликатов:**  
  Set позволяет легко удалить повторяющиеся элементы из коллекции, что особенно полезно при обработке данных из разных источников или пользовательского ввода.

- **Проверка наличия элемента:**  
  С помощью метода `contains()` можно быстро проверить, содержится ли конкретный элемент в коллекции, что упрощает поиск и валидацию данных.

- **Выполнение операций над множествами:**  
  Хотя интерфейс Set не предоставляет специализированных методов для объединения или пересечения, операции над множествами можно реализовать концептуально с использованием методов:
  - `addAll()` для объединения (Union) – добавляет все элементы одного Set в другой.
  - `retainAll()` для пересечения (Intersection) – оставляет в Set только те элементы, которые присутствуют в другом Set.


</details>


<details style="padding-top: 18px">
  <summary><b>Практическое задание: Плейлист с уникальными песнями (на русском)</b></summary>

## **Задание: Создание плейлиста с уникальными песнями**
В этом задании необходимо реализовать музыкальный плеер, позволяющий формировать плейлист, в котором не допускаются дубликаты песен. Для этого выполните следующие шаги:

1. **Определите сущность "Песня" (Song):**
  - Создайте класс `Song` с такими полями, как `title` (название песни) и `artist` (исполнитель). При желании можно добавить дополнительные поля, например, `album` или `duration`.
  - Переопределите методы `equals()` и `hashCode()` таким образом, чтобы две песни считались одинаковыми, если у них совпадают основные характеристики (например, название и исполнитель).

2. **Реализуйте плейлист с использованием Set:**
  - Создайте коллекцию типа `Set<Song>` (например, `HashSet<Song>`), чтобы хранить песни.
  - Добавьте несколько песен в плейлист, в том числе попытайтесь добавить дубликаты, и убедитесь, что они не сохраняются.

3. **Напишите демонстрационное приложение:**
  - Создайте основной класс с методом `main()`, который будет создавать объекты `Song`, добавлять их в плейлист, а затем выводить содержимое плейлиста для проверки работы переопределенных методов `equals()` и `hashCode()`.

<details style="padding-top: 18px">
  <summary><b>Реализация:</b></summary>

```java
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Класс, представляющий песню
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song other = (Song) obj;
        // Песни считаются одинаковыми, если совпадают название и исполнитель
        return Objects.equals(title, other.title) && Objects.equals(artist, other.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
```

```java
// Основной класс для демонстрации работы плейлиста
public class PlaylistDemo {
    public static void main(String[] args) {
        Set<Song> playlist = new HashSet<>();

        // Создаем объекты песен
        Song song1 = new Song("Imagine", "John Lennon");
        Song song2 = new Song("Bohemian Rhapsody", "Queen");
        Song song3 = new Song("Imagine", "John Lennon"); // Дубликат song1
        Song song4 = new Song("Hotel California", "Eagles");

        // Добавляем песни в плейлист
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3); // Дублирующаяся песня, не будет добавлена
        playlist.add(song4);

        // Выводим содержимое плейлиста
        System.out.println("Плейлист с уникальными песнями:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}
```
</details>

</details>
</details>
