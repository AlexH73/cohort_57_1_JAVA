<details>
<summary>Collections Framework. English version</summary>

<details>
<summary>Lesson 33. Stack and Queue data structure </summary>
<details>
<summary>Stack</summary>

### What is Stack?

A stack is a linear data structure in which the insertion of a new element and removal of an existing element takes
place at the same end represented as the top of the stack.

To implement the stack, it is required to maintain the pointer to the top of the stack, which is the last element to be
inserted because we can access the elements only on the top of the stack.

#### LIFO( Last In First Out ):

This strategy states that the element that is inserted last will come out first.
You can take a pile of plates kept on top of each other as a real-life example. The plate which we put last is on the
top and since we remove the plate that is at the top, we can say that the plate that was put last comes out first.

### Basic Operations on Stack

In order to make manipulations in a stack, there are certain operations provided to us.

- `push()` to insert an element into the stack
- `pop()` to remove an element from the stack
- `peek()` Returns the top element of the stack.
- `isEmpty()` returns true if stack is empty else false.
- `size()` returns the size of stack.

![img_12.png](images%2Fimg_12.png)

### Push:

Adds an item to the stack. If the stack is full, then it is said to be an Overflow condition.

### Pop:

Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is
empty, then it is said to be an Underflow condition.

### peek:

Returns the top element of the stack.

### isEmpty:

Returns true if the stack is empty, else false.

### Understanding stack practically:

There are many real-life examples of a stack. Consider the simple example of plates stacked over one another in a
canteen. The plate which is at the top is the first one to be removed, i.e. the plate which has been placed at the
bottommost position remains in the stack for the longest period of time. So, it can be simply seen to follow the
LIFO/FILO order.

### Complexity Analysis:

| Operations | Complexity |
|------------|------------|
| push()     | O(1)       |
| pop()      | O(1)       |
| isEmpty()  | O(1)       |
| size()     | O(1)       |

</details>
<details>
<summary>Queue</summary>

### What is a Queue?

A queue is a linear data structure where the addition of a new element takes place at the end (via the `add()` method),
and removal occurs from the beginning (via the `remove()` method).

The main principle of this structure is that the first added element will also be the first to be removed. This is the
opposite of the stack concept.

FIFO (First In First Out):
This strategy implies that the element added first will be removed first. As an analogy, consider the queue at a store
checkout or at a bus stop.

### Primary Queue Operations in Java

For manipulating a queue in Java, the following methods are provided:

- `add(E e)` - adds an element to the end of the queue.
- `remove()` - removes and returns the element from the beginning of the queue.
- `element()` - retrieves, but does not remove, the element from the beginning of the queue.
- `isEmpty()` - returns `true` if the queue is empty, otherwise `false`.
- `size()` - returns the size of the queue.

![img_13.png](images%2Fimg_13.png)

**add(E e)**:
Adds an element to the end of the queue. If the queue is full, an exception is thrown.

**remove()**:
Removes and returns the element from the beginning of the queue. If the queue is empty, an exception is thrown.

**element()**:
Retrieves, but does not remove, the element from the beginning of the queue. If the queue is empty, an exception is
thrown.

**isEmpty()**:
Returns `true` if the queue is empty, otherwise `false`.

### Practical Understanding of Queue:

Queues are ubiquitous in real life. For instance, people waiting in line at a store checkout. The first person in the
queue will be the first to leave, and so forth. This is a real-life example of the FIFO principle.

### Complexity Analysis:

 Method      | Complexity 
-------------|------------
 `add(E e)`  | O(1)       
 `remove()`  | O(1)       
 `element()` | O(1)       
 `isEmpty()` | O(1)       
 `size()`    | O(1)       

</details>
</details>

</details>

------------

<details>
<summary>Collections Framework. Русскаязычная версия</summary>

<details>
<summary>Основная информация о Collections Framework</summary>

# Collections in Java

Любая группа отдельных объектов, представленных как единое целое, называется коллекцией объектов Java. В Java в JDK 1.2
определена отдельная структура под названием "Collection Framework", которая содержит все классы и интерфейсы коллекций
Java.

В Java интерфейс коллекции (`java.util.Collection`) и интерфейс `Map` (`java.util.Map`) — два основных «корневых»
интерфейса классов коллекций Java.

## Что такое фреймворк в Java?

Фреймворк — это набор классов и интерфейсов, которые предоставляют готовую архитектуру. Чтобы реализовать новую функцию
или класс, нет необходимости определять структуру. Однако оптимальный объектно-ориентированный дизайн всегда включает в
себя структуру с набором классов, в которой все классы выполняют задачи одного и того же типа.

### Необходимость в отдельной платформе сбора данных в Java

До появления Collection Framework (или до JDK 1.2) стандартными методами группировки объектов Java (или коллекций) были
Массивы или Векторы или Хеш-таблицы. Все эти коллекции не имели общего интерфейса. Таким образом, хотя основная цель
всех коллекций одна и та же, реализация всех этих коллекций определялась независимо и не имела никакой корреляции между
ними. Кроме того, пользователям очень сложно запомнить все различные методы, синтаксис и конструкторы.

### Преимущества Java Collection Framework

Поскольку отсутствие системы сбора данных привело к вышеуказанному набору недостатков, ниже приведены преимущества
системы сбора данных.

- **Последовательный API:** API имеет базовый набор интерфейсов, таких как `Set`, `List` или `Map` общий набор
  методов.

- **Уменьшает усилия по программированию:** Программисту не нужно беспокоиться о дизайне Коллекции, он может
  сосредоточиться на ее наилучшем использовании в своей программе. Таким образом, основная концепция
  объектно-ориентированного программирования (т.е. абстракции) была успешно реализована.

- **Повышает скорость и качество программы:** Повышает производительность за счет обеспечения высокопроизводительной
  реализации полезных структур данных и алгоритмов, поскольку в этом случае программисту не нужно думать о лучшей
  реализации конкретная структура данных. Он может просто использовать лучшую реализацию, чтобы значительно повысить
  производительность своего алгоритма/программы.

### Иерархия платформы сбора данных в Java

Пакет `java.util` содержит все классы и интерфейсы, необходимые платформе `collection` framework. Фреймворк `collection`
содержит интерфейс с именем `iterable` интерфейс, который позволяет легко перебирать коллекции. Этот
интерфейс расширяется за счет основного интерфейса `collection`, который выступает в качестве корня
для `collection framework`.
Все коллекции расширяют этот интерфейс, тем самым расширяя свойства итератора и методов этого интерфейса. На
следующем рисунке показана иерархия структуры сбора данных `collection framework`.

![img.png](images%2Fimg.png)

### Методы интерфейса коллекции

Этот интерфейс содержит различные методы, которые могут напрямую использоваться всеми коллекциями, реализующими этот
интерфейс:

| Метод                       | Описание                                                                        |
|-----------------------------|---------------------------------------------------------------------------------|
| `add(Object)`               | Добавляет объект в коллекцию.                                                   |
| `addAll(Collection c)`      | Добавляет все элементы из указанной коллекции в эту коллекцию.                  |
| `clear()`                   | Удаляет все элементы из этой коллекции.                                         |
| `contains(Object o)`        | Возвращает `true`, если коллекция содержит указанный элемент.                   |
| `containsAll(Collection c)` | Возвращает `true`, если коллекция содержит все элементы из указанной коллекции. |
| `equals(Object o)`          | Сравнивает указанный объект с этой коллекцией на равенство.                     |
| `hashCode()`                | Возвращает хеш-код этой коллекции.                                              |
| `isEmpty()`                 | Возвращает `true`, если коллекция не содержит элементов.                        |
| `iterator()`                | Возвращает итератор для элементов в этой коллекции.                             |
| `max()`                     | Возвращает максималь                                                            

</details>

<details>
<summary>Урок 33. Структуры данных стек и очередь</summary>
<details>
<summary>Стек (Stack), как структура данных</summary>

### Что такое Стек?

Стек — это линейная структура данных, в которой вставка нового элемента и удаление существующего элемента происходят с
одного и того же конца, представленного вершиной стека.

Для реализации стека необходимо поддерживать указатель на вершину стека, который является последним вставленным
элементом, так как мы можем получить доступ только к элементам на вершине стека.

#### LIFO (Last In First Out, "Последний пришел — первый ушел"):

Эта стратегия гласит, что элемент, который был вставлен последним, выйдет первым. В качестве примера из реальной жизни
можно привести кучу тарелок, сложенных друг на друга. Тарелка, которую мы поставили последней, находится сверху, и так
как мы убираем тарелку, которая находится сверху, мы можем сказать, что тарелка, поставленная последней, убирается
первой.

### Основные операции со стеком

Чтобы производить манипуляции со стеком, нам предоставлены определенные операции.

- `push()` - вставить элемент в стек.
- `pop()` - удалить элемент из стека.
- `peek()` - возвращает верхний элемент стека.
- `isEmpty()` - возвращает `true`, если стек пуст, иначе `false`.
- `size()` - возвращает размер стека.

![img_12.png](images%2Fimg_12.png)

**Push**:
Добавляет элемент в стек. Если стек полон, говорят о состоянии переполнения.

**Pop**:
Удаляет элемент из стека. Элементы извлекаются в обратном порядке их добавления. Если стек пуст, говорят о состоянии
недополнения.

**peek**:
Возвращает верхний элемент стека.

**isEmpty**:
Возвращает `true`, если стек пуст, иначе `false`.

### Понимание стека на практике:

Существует множество реальных примеров стека. Рассмотрим простой пример тарелок, сложенных друг на друга в столовой.
Тарелка, которая находится сверху, первая, которую уберут, т.е. тарелка, которая была помещена на самое дно, остается в
стеке наибольшее время. Таким образом, можно увидеть, что это следует принципу LIFO/FILO.

### Анализ сложности:

 Операции    | Сложность 
-------------|-----------
 `push()`    | O(1)      
 `pop()`     | O(1)      
 `isEmpty()` | O(1)      
 `size()`    | O(1)      

</details>

<details>
<summary>Очередь, как структура данных</summary>

### Что такое Очередь?

Очередь (queue) — это линейная структура данных, в которой добавление нового элемента происходит в конец (через
метод `add()`),
а удаление — из начала (через метод `remove()`).

Основная идея этой структуры заключается в том, что первый добавленный элемент также будет первым удаленным. Это
противоположно концепции стека.

FIFO (First In First Out, "Первый пришел — первый ушел"):
Эта стратегия гласит, что элемент, который был добавлен первым, будет удален первым. В качестве примера можно
рассмотреть очередь в магазине или на автобусной остановке.

### Основные операции с Очередью в Java

Для манипуляции очередью в Java предоставляются следующие методы:

- `add(E e)` - добавляет элемент в конец очереди.
- `remove()` - удаляет и возвращает элемент из начала очереди.
- `element()` - возвращает, но не удаляет, элемент из начала очереди.
- `isEmpty()` - возвращает `true`, если очередь пуста, иначе `false`.
- `size()` - возвращает размер очереди.

![img_13.png](images%2Fimg_13.png)

**add(E e)**:
Добавляет элемент в конец очереди. В случае переполнения генерируется исключение.

**remove()**:
Удаляет и возвращает элемент из начала очереди. Если очередь пуста, генерируется исключение.

**element()**:
Возвращает, но не удаляет, первый элемент очереди. Если очередь пуста, генерируется исключение.

**isEmpty()**:
Возвращает `true`, если очередь пуста, иначе `false`.

### Понимание очереди на практике:

Очереди присутствуют повсюду в реальной жизни. Например, люди, стоящие в очереди к кассе в магазине. Первый человек в
этой очереди — первый, кто уйдет, и так далее. Это является примером принципа FIFO.

### Анализ сложности:

 Метод       | Сложность 
-------------|-----------
 `add(E e)`  | O(1)      
 `remove()`  | O(1)      
 `element()` | O(1)      
 `isEmpty()` | O(1)      
 `size()`    | O(1)      

</details>
</details>
</details>


