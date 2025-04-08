<details style="padding-top: 18px">
  <summary><b>Lesson 30: Java Lists – LinkedList vs ArrayList</b></summary>

<details style="padding-top: 18px">
  <summary><b>1. Introduction to Collections and Lists</b></summary>

## **1. Introduction to Collections and Lists**
In Java, collections provide ready-to-use data structures for storing and manipulating groups of objects. The `List` interface allows elements to be stored in an ordered manner. The primary implementations are `ArrayList` and `LinkedList`, each with its own advantages and use cases.

## **2. ArrayList: Basics and Usage**
`ArrayList` implements a dynamic array.
- **Advantages:**
    - Fast access to elements by index.
    - Efficient for read operations.
- **Disadvantages:**
    - Insertions or removals in the middle of the list require shifting elements, which can impact performance.

## **3. LinkedList: Basics and Usage**
`LinkedList` implements a doubly-linked list.
- **Advantages:**
    - Fast insertions and deletions, especially at the beginning or in the middle.
    - Ideal for implementing queues, stacks, and other structures with frequent modifications.
- **Disadvantages:**
    - Accessing an element by index requires sequential traversal, making random access slower.
    - Higher memory usage due to storing pointers to previous and next elements.

## **4. Comparing ArrayList and LinkedList**
- **ArrayList** is optimal when:
    - Read operations and indexed access are predominant.
    - Modifications to the list are infrequent.
- **LinkedList** is preferable when:
    - There are frequent insertions and deletions.
    - The order of elements matters, but random access is not critical.

## **5. Code Examples**
Below are examples of creating and using both `ArrayList` and `LinkedList`.

```java
// Example of using ArrayList
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println("ArrayList: " + arrayList);
    }
}
```

```java
// Example of using LinkedList
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        System.out.println("LinkedList: " + linkedList);
    }
}
```

</details>

<details style="padding-top: 18px">
  <summary><b>2. LinkedList: Concept and Characteristics</b></summary>

## **Definition**
`LinkedList` is an implementation of the `List` interface based on a doubly-linked list, where each element holds references to both the previous and next elements.

## **Advantages**
- **Fast insertions and deletions in the middle of the list:** Thanks to its doubly-linked structure, adding and removing elements can be done without the need to shift other elements.
- **Efficiency with frequently modified data:** It is ideal for scenarios where the list undergoes frequent modifications, such as frequent additions and removals.

## **Disadvantages**
- **Slow random access:** Accessing elements by index requires sequential traversal, making lookup operations less efficient compared to `ArrayList`.
- **Higher memory consumption:** Each element maintains references to its neighboring elements, which increases the overall memory footprint of the collection.
</details>

<details style="padding-top: 18px">
  <summary><b>3. Comparing ArrayList and LinkedList</b></summary>

## **ArrayList**
- **Optimal for read operations and indexed access:** Its array-based structure provides fast access to elements via an index.
- **Less efficient for frequent insertions and deletions in the middle of the list:** Modifications require shifting elements, which can slow down performance.

### Code Example for ArrayList:
```java
// Example using ArrayList for fast indexed access
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // Accessing an element by index
        System.out.println("Element at index 5: " + list.get(5));
    }
}
```

## **LinkedList**
- **Ideal for frequent modifications (adding and removing elements):** The doubly-linked structure allows quick insertions and deletions without needing to shift other elements.
- **Trade-off – slower indexed access:** Accessing an element requires sequential traversal, which is less efficient for random access.

### Code Example for LinkedList:
```java
// Example using LinkedList for frequent modifications
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // Inserting an element in the middle of the list
        list.add(5, 100);
        // Removing an element from the middle of the list
        list.remove(5);
        System.out.println("LinkedList content: " + list);
    }
}
```

## **Criteria for Choosing a Collection**
- The choice between `ArrayList` and `LinkedList` depends on the nature of the operations:
    - If fast indexed access and read operations are a priority, `ArrayList` is preferred.
    - If frequent modifications (insertions/deletions) are required, `LinkedList` may be the better option.
</details>

<details style="padding-top: 18px">
  <summary><b>4. Practical Applications</b></summary>

## **Usage Scenarios**
- **ArrayList:** Best suited for scenarios where fast access to elements and efficient iteration are crucial.
- **LinkedList:** Preferred when frequent modifications are needed, such as when implementing queues or deques.

## **Code Examples**
Below are examples demonstrating the creation and initialization of `ArrayList` and `LinkedList`, as well as performing add, delete, and search operations.

### Example for ArrayList:
```java
// Example using ArrayList
import java.util.ArrayList;
import java.util.List;

public class ArrayListUsage {
    public static void main(String[] args) {
        // Creating and initializing an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        // Adding an element in the middle of the list
        long startTime = System.nanoTime();
        arrayList.add(50000, 999);
        long endTime = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (endTime - startTime) + " ns");

        // Searching for an element
        startTime = System.nanoTime();
        int index = arrayList.indexOf(999);
        endTime = System.nanoTime();
        System.out.println("ArrayList search time: " + (endTime - startTime) + " ns");

        // Removing an element
        startTime = System.nanoTime();
        arrayList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("ArrayList deletion time: " + (endTime - startTime) + " ns");
    }
}
```

### Example for LinkedList:
```java
// Example using LinkedList
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {
    public static void main(String[] args) {
        // Creating and initializing a LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        // Adding an element in the middle of the list
        long startTime = System.nanoTime();
        linkedList.add(50000, 999);
        long endTime = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (endTime - startTime) + " ns");

        // Searching for an element (sequential traversal)
        startTime = System.nanoTime();
        int index = linkedList.indexOf(999);
        endTime = System.nanoTime();
        System.out.println("LinkedList search time: " + (endTime - startTime) + " ns");

        // Removing an element
        startTime = System.nanoTime();
        linkedList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("LinkedList deletion time: " + (endTime - startTime) + " ns");
    }
}
```

## **Performance Analysis**
- **ArrayList:** Offers fast indexed access, making read and iteration operations very quick. However, inserting or removing an element in the middle requires shifting many elements.
- **LinkedList:** Allows rapid additions and deletions without shifting elements, but random access is slower due to the need for sequential traversal.
</details>

<details style="padding-top: 18px">
  <summary><b>4. Task Scheduler with Sorting Capability</b></summary>

## **Description**
In this assignment, we will implement a "Task Scheduler" application where each task is represented by a `Task` object. Tasks can be sorted by two criteria:
- **Priority:** an integer value, where a lower number indicates a higher priority.
- **Due Date:** represented as a string (e.g., "2023-05-10") and sorted lexicographically.

## **Implementation using Comparator**
We will create two comparators:
- **PriorityComparator:** for sorting tasks by priority.
- **DateComparator:** for sorting tasks by due date.

<details style="padding-top: 18px">
  <summary><b>Implementation (don't open it if you want to decide on your own)</b></summary>

## **Code Example**
Below is a sample implementation of the `Task` class and the comparators:

```java
import java.util.*;

// Task class representing a task
public class Task {
    private String name;
    private int priority; // Lower number indicates higher priority
    private String dueDate; // Date in "YYYY-MM-DD" format

    public Task(String name, int priority, String dueDate) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
               "name='" + name + '\'' +
               ", priority=" + priority +
               ", dueDate='" + dueDate + '\'' +
               '}';
    }
}
```

```java
// Comparator for sorting by priority
class PriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}
```

```java
// Comparator for sorting by due date (lexicographically)
class DateComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return t1.getDueDate().compareTo(t2.getDueDate());
    }
}
```

```java
public class TaskScheduler {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Prepare report", 2, "2023-06-15"));
        tasks.add(new Task("Create presentation", 1, "2023-05-10"));
        tasks.add(new Task("Client meeting", 3, "2023-05-20"));

        System.out.println("Initial task list:");
        tasks.forEach(System.out::println);

        // Sorting by priority
        tasks.sort(new PriorityComparator());
        System.out.println("\nTasks sorted by priority:");
        tasks.forEach(System.out::println);

        // Sorting by due date
        tasks.sort(new DateComparator());
        System.out.println("\nTasks sorted by due date:");
        tasks.forEach(System.out::println);
    }
}
```

</details>
</details>
</details>

------

<details style="padding-top: 18px">
  <summary><b>Урок 30: Лист в Java – LinkedList и ArrayList</b></summary>

<details style="padding-top: 18px">
  <summary><b>1. Введение в коллекции и листы</b></summary>

## **1. Введение в коллекции и листы**
Коллекции в Java представляют собой набор готовых к использованию структур для хранения и обработки групп объектов. Интерфейс `List` обеспечивает хранение элементов в упорядоченном виде. Основными реализациями являются `ArrayList` и `LinkedList`, каждая из которых имеет свои особенности и области применения.

## **2. ArrayList: основы и применение**
`ArrayList` реализует динамический массив.
- **Преимущества:**
    - Быстрый доступ к элементам по индексу.
    - Эффективен при операциях чтения.
- **Недостатки:**
    - При вставке или удалении элементов в середине списка требуется сдвиг оставшихся элементов, что может замедлить работу.

## **3. LinkedList: основы и применение**
`LinkedList` реализует двусвязный список.
- **Преимущества:**
    - Быстрые операции вставки и удаления, особенно в начале или середине списка.
    - Идеален для реализации очередей, стеков и других структур, где часто меняется состав элементов.
- **Недостатки:**
    - Для доступа к элементу по индексу требуется последовательный обход, что делает случайный доступ медленным.
    - Больший расход памяти из-за хранения ссылок на предыдущий и следующий элементы.

## **4. Сравнение ArrayList и LinkedList**
- **ArrayList** оптимален, когда:
    - Преобладают операции чтения и доступ по индексу.
    - Изменения в списке происходят редко.
- **LinkedList** предпочтителен, когда:
    - Часто происходят вставки и удаления элементов.
    - Порядок элементов важен, но случайный доступ менее критичен.

## **5. Примеры кода**
Ниже приведены примеры создания и использования `ArrayList` и `LinkedList`.

```java
// Пример использования ArrayList
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");
        System.out.println("ArrayList: " + arrayList);
    }
}
```

```java
// Пример использования LinkedList
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");
        System.out.println("LinkedList: " + linkedList);
    }
}
```

</details>

<details style="padding-top: 18px">
  <summary><b>2. LinkedList: концепция и особенности</b></summary>

## **Определение**
`LinkedList` — это реализация интерфейса `List` на основе двусвязного списка, где каждый элемент содержит ссылки на предыдущий и следующий элементы.

## **Преимущества**
- **Быстрые вставки и удаления в середине списка:** Благодаря двусвязной структуре, операции добавления и удаления выполняются без необходимости сдвига остальных элементов.
- **Эффективность при работе с часто изменяемыми данными:** Идеально подходит для сценариев, где список подвергается частым модификациям, таким как добавление и удаление элементов.

## **Недостатки**
- **Медленный случайный доступ:** Доступ к элементам по индексу требует последовательного обхода, что делает поиск менее эффективным по сравнению с `ArrayList`.
- **Дополнительное потребление памяти:** Каждый элемент хранит ссылки на соседние элементы, что увеличивает общий объем используемой памяти.
</details>

<details style="padding-top: 18px">
  <summary><b>3. Сравнение ArrayList и LinkedList</b></summary>

## **ArrayList**
- **Оптимален для операций чтения и доступа по индексу:** Благодаря массивной структуре обеспечивает быстрый доступ к элементам по индексу.
- **Менее эффективен при частых операциях вставки и удаления в середине списка:** При изменении содержимого происходит сдвиг элементов, что замедляет выполнение операций.

### Пример кода для ArrayList:
```java
// Пример использования ArrayList для быстрого доступа по индексу
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // Доступ к элементу по индексу
        System.out.println("Элемент на позиции 5: " + list.get(5));
    }
}
```

## **LinkedList**
- **Идеален для частых модификаций (добавление и удаление элементов):** Двусвязная структура позволяет быстро выполнять вставки и удаления без сдвига остальных элементов.
- **Компромисс – медленный доступ по индексу:** Для доступа к элементам требуется последовательный обход списка.

### Пример кода для LinkedList:
```java
// Пример использования LinkedList для частых модификаций
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // Вставка элемента в середину списка
        list.add(5, 100);
        // Удаление элемента из середины списка
        list.remove(5);
        System.out.println("Содержимое LinkedList: " + list);
    }
}
```

## **Обсуждение критериев выбора коллекции**
- Выбор между `ArrayList` и `LinkedList` зависит от характера операций:
    - Если приоритетом является быстрый доступ по индексу и операции чтения, лучше использовать `ArrayList`.
    - Если основное требование – частые модификации (вставки/удаления), предпочтительнее `LinkedList`.
</details>

<details style="padding-top: 18px">
  <summary><b>4. Применение на практике</b></summary>

## **Сценарии использования**
- **ArrayList:** Идеально подходит для ситуаций, где важны быстрый доступ к элементам и эффективная итерация по списку.
- **LinkedList:** Предпочтителен, когда требуется частое изменение списка, например, при реализации очередей или дек.

## **Примеры кода**
Ниже приведены примеры создания и инициализации `ArrayList` и `LinkedList`, а также выполнения операций добавления, удаления и поиска элементов.

### Пример для ArrayList:
```java
// Пример использования ArrayList
import java.util.ArrayList;
import java.util.List;

public class ArrayListUsage {
    public static void main(String[] args) {
        // Создание и инициализация ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        // Добавление элемента в середину списка
        long startTime = System.nanoTime();
        arrayList.add(50000, 999);
        long endTime = System.nanoTime();
        System.out.println("Время вставки в ArrayList: " + (endTime - startTime) + " нс");

        // Поиск элемента
        startTime = System.nanoTime();
        int index = arrayList.indexOf(999);
        endTime = System.nanoTime();
        System.out.println("Время поиска в ArrayList: " + (endTime - startTime) + " нс");

        // Удаление элемента
        startTime = System.nanoTime();
        arrayList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("Время удаления из ArrayList: " + (endTime - startTime) + " нс");
    }
}
```

### Пример для LinkedList:
```java
// Пример использования LinkedList
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {
    public static void main(String[] args) {
        // Создание и инициализация LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        // Добавление элемента в середину списка
        long startTime = System.nanoTime();
        linkedList.add(50000, 999);
        long endTime = System.nanoTime();
        System.out.println("Время вставки в LinkedList: " + (endTime - startTime) + " нс");

        // Поиск элемента (обход списка)
        startTime = System.nanoTime();
        int index = linkedList.indexOf(999);
        endTime = System.nanoTime();
        System.out.println("Время поиска в LinkedList: " + (endTime - startTime) + " нс");

        // Удаление элемента
        startTime = System.nanoTime();
        linkedList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("Время удаления из LinkedList: " + (endTime - startTime) + " нс");
    }
}
```

## **Анализ различий в производительности**
- **ArrayList:** Отличается высокой скоростью доступа по индексу, что делает операции чтения и итерации очень быстрыми. Однако вставка или удаление элемента в середине списка требует сдвига множества элементов.
- **LinkedList:** Позволяет быстро добавлять и удалять элементы, так как не требуется сдвиг элементов, но случайный доступ к элементу осуществляется медленнее из-за последовательного обхода списка.
</details>

<details style="padding-top: 18px">
  <summary><b>4. Планировщик с возможностью сортировки задач</b></summary>

## **Описание**
В этом задании мы реализуем приложение "Планировщик задач", в котором каждая задача представлена объектом `Task`. Задачи можно сортировать по двум критериям:
- **Приоритет:** целочисленное значение, где более низкое число означает более высокий приоритет.
- **Дата выполнения:** представлена в виде строки (например, "2023-05-10") и сортируется лексикографически.

## **Реализация через Comparator**
Мы создадим два компаратора:
- **PriorityComparator:** для сортировки задач по приоритету.
- **DateComparator:** для сортировки задач по дате выполнения.

<details style="padding-top: 18px">
  <summary><b>Реализация (не открывайте, если хотите решить самостоятельно)</b></summary>

## **Пример кода**
Ниже приведён пример реализации класса `Task` и компараторов:

```java
import java.util.*;

// Класс Task, представляющий задачу
public class Task {
    private String name;
    private int priority; // Чем ниже число, тем выше приоритет
    private String dueDate; // Дата в формате "YYYY-MM-DD"

    public Task(String name, int priority, String dueDate) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
               "name='" + name + '\'' +
               ", priority=" + priority +
               ", dueDate='" + dueDate + '\'' +
               '}';
    }
}
```

```java
// Компаратор для сортировки по приоритету
class PriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}
```

```java
// Компаратор для сортировки по дате выполнения (лексикографически)
class DateComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return t1.getDueDate().compareTo(t2.getDueDate());
    }
}

```

```java
public class TaskScheduler {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Сделать отчет", 2, "2023-06-15"));
        tasks.add(new Task("Подготовить презентацию", 1, "2023-05-10"));
        tasks.add(new Task("Встреча с клиентом", 3, "2023-05-20"));

        System.out.println("Исходный список задач:");
        tasks.forEach(System.out::println);

        // Сортировка по приоритету
        tasks.sort(new PriorityComparator());
        System.out.println("\nЗадачи, отсортированные по приоритету:");
        tasks.forEach(System.out::println);

        // Сортировка по дате выполнения
        tasks.sort(new DateComparator());
        System.out.println("\nЗадачи, отсортированные по дате выполнения:");
        tasks.forEach(System.out::println);
    }
}
```

</details>

</details>
</details>
