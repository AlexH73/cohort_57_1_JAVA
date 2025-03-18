<details>
<summary>Collections Framework. English version</summary>

<details>
<summary>Lesson 32. Interface Map < Key, Value > </summary>

## MAP: Essence and Features

### Introduction

MAP in Java is a data structure organized as unique "key-value" pairs, closely resembling a dictionary. It serves not only as a data structure but also as an interface in the standard Java Development Kit (JDK), supporting various implementations, including the most popular—HashMap.

### Variants

MAP in Java represents the pinnacle of the Java collections hierarchy and has been included in the standard JDK since version 1.2. Over time, as Java continues to evolve and update, this interface has been enriched with new features.

#### Key Implementations

- **HashMap**
- **LinkedHashMap**
- **TreeMap**

HashMap is most commonly used in examples and applications, and will be discussed in greater detail in subsequent sections.

### Purpose and Usage

Maps are designed for efficient data retrieval. They store information in a "key-value" format, where each key is unique and unambiguously associated with a particular value. These unique "key-value" pairs form the elements of the map.

### Method Signatures

In Java, the `java.util.Map` interface offers a set of methods for adding, retrieving, and removing elements.

### Distinctive Features of Java's Map Interface

Map interfaces in the Java Collection Framework have various implementations, each with its own unique features and level of thread-safety. The most commonly encountered type is HashMap, which is widely used in the majority of Java applications.

### Uniqueness of Map Collections

Maps are special in the sense that they do not simply extend or directly implement the collection interface. This is due to their unique way of dealing with paired "key-value" elements, as opposed to handling individual values.

### Basic Operations with Map

To work efficiently with Maps in Java, it's essential to become familiar with the methods that implement various functions. These methods will be explored further, aiding in a deeper understanding of this component.


## Creating a Map

### Introduction

In a Map, keys and values can be objects of any type. Primitive data types cannot be used due to limitations related to generics. HashMap allows for one null key and multiple null values. The order of elements is not guaranteed.

### Example

An example of creating a HashMap with integer keys and string values:

```#java
Map<Integer, String> map = new HashMap<>();
```

All subsequent methods will apply to any Map implementations, as they all implement the same interface.

### Inserting Records
To add records, the `put` method is used, which takes two arguments:
* key
* value

#### Example

```java
map.put(1, "Tyrion Lannister");
map.put(2, "Arya Stark");
map.put(3, "Ned Stark");
map.put(4, "Cersei Lannister");
```

#### Table of Map Contents

| Key | Value           |
|-----|-----------------|
| 1   | Tyrion Lannister|
| 2   | Arya Stark      |
| 3   | Ned Stark       |
| 4   | Cersei Lannister|

#### Combining Maps
To add multiple records or combine two maps, the putAll method is used.

#### Keys and Duplicates
In Map, keys must be unique. If you try to add an existing key, the put method will return the previous value or null.

Example of checking the availability of a key:
```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Duplicate key found");
}
``` 
#### Getting Data
The `get` method is used to extract information by taking the key as an argument.
```java
String value = map.get(4);  // Cersei Lannister
```
If the key is missing, the `get` method returns `null`.
Example:
```java
String value = map.get(10);  // null
```

##### Uniqueness of Keys in Map
The keys in the Map structure must be unique. If an attempt is made to add an already existing key, the following happens:

```java
map.put(4, "Daenerys Targaryen");
```
#### Table of Map Contents
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

In this case, the `put` method returns the previous key value, if any. In the absence of the previous value, `null` is returned.

#### Checking For A Key
To determine the presence of a specific key, the `containsKey` method is used.

```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Key already exists, cannot add duplicate");
}
```
#### Checking Values
To check for the presence of a certain value in the Map, the `containsValue` method is used.

```java
boolean exists = map.containsValue("Brienne of Tarth"); // Output: false
```

This method allows you to find out whether the Map contains the specified value.

#### Removing Elements from Map
In addition to adding elements, the Map structure also supports their removal. This is a basic operation that allows you to modify the contents of the Map.

##### Remove Method
To delete an element, the `remove` method is used, which works as follows:

1. Takes the key of the element as an argument.
2. Removes the corresponding element from the Map.
3. Returns the value of the deleted element or `null`, if there was none.
```java
map.remove(3); // Deletes and returns "Ned Stark"
map.remove(3); // Deletes nothing and returns null
```

#### Getting the Map Size and Checking for Emptiness
The `size` method returns the number of elements in the Map.
```java
int size = map.size(); // Getting the size
```

The 'isEmpty` method returns a Boolean value indicating whether the collection is empty or not.
```java
boolean isEmpty = map.isEmpty(); // Checking for emptiness
```
#### Viewing Map Content
Map interfaces provide methods for viewing content:

- `keySet`: Returns the set of all keys in the Map.
- `values`: Returns a collection of all values in the Map.
- `entrySet`: Returns the set of all key-value pairs in Map.

These "views" are directly related to the main map, and changes in them are reflected on the main map and vice versa. However, adding new elements through these views is not possible.

##### Clear method
To completely clear the Map, you can use the `clear` method.

```java
map.clear(); // Clears the entire map
```

#### Full Contents Of Your Map
To demonstrate the `keySet`, `values`, and `entrySet` methods, let's first look at the current contents of your Map:
##### Table of Map Contents
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

#### Using keySet, values, and entrySet

##### keySet method
The `keySet` method returns a set of all keys contained in the Map.

```java
Set<Integer> keys = map.keySet();
// keys will contain [1, 2, 3, 4]
```
##### Values method
The `values` method returns a collection of all Map values.

```java
Collection<String> values = map.values();
// values will contain ["Tyrion Lannister", "Arya Stark", "Ned Stark", "Daenerys Targaryen"]
```
##### entrySet method
The 'entrySet` method returns a set of Map.Entry objects, each of which contains a key-value pair.
```java
Set<Map.Entry<Integer, String>> entries = map.entrySet();
// entries will contain:
// 1=Tyrion Lannister, 2=Arya Stark, 3=Ned Stark, 4=Daenerys Targaryen
```
With these methods you can access keys, values or a key-value pair of your Map for further use or manipulation.

#### Iterations
Iterations on maps (mapping collections) are possible in various ways. This section presents the most common iteration methods.

##### Features of exceptions
It is worth knowing that an attempt to iterate over a null map will result in a `NullPointerException` exception.

##### Application of Foreach
The most popular method of iterating over the map is using the `foreach` loop. This method is convenient for most tasks and provides access to both keys and values.

```java
map.forEach((key, value) -> {
    System.out.println("Key: " + key + ", Value: " + value);
});
```

##### Note
Above is an example of using lambda expressions in Java 8 to iterate over the map. In this case, the developer is given the opportunity to work with both keys and values.

##### Examples of iteration without using lambda expressions

##### Iteration using for-each and the `keySet()` method

```java
for (Integer key : map.keySet()) {
    String value = map.get(key);
    System.out.println("Key: " + key + ", Value: " + value);
}
```
#### Iteration using for-each and the 'entrySet()` method

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```
#### Iteration using an iterator

```java
Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```

### Conclusion

#### Practical advantages of using Map (Map)

1. **Quick Access and Search**: Maps provide very quick access to key data.
2. **Unique keys**: There can be no duplicate keys in maps, which ensures data accuracy.
3. **Flexibility**: Maps can be used to store key-value pairs of different types.
4. **Ordering**: Some map implementations (for example, `TreeMap`) support data ordering.
5. **Availability of useful methods**: Built-in methods for performing basic operations such as adding, deleting and searching for elements.

#### Summary table with classes and complexity of operations

| Class | `get` | `put`   | `remove` | `containsKey` | Features |
|------------|---------|---------|----------|---------------|--------------------------------------|
| `HashMap` | O(1) | O(1) | O(1) | O(1) | Unordered |
| `TreeMap` | O(log n)| O(log n)| O(log n) | O(log n) | Ordered |
| `LinkedHashMap`| O(1) | O(1) | O(1) | O(1) | Ordered by insertion order |
| `Hashtable`| O(1) | O(1) | O(1) | O(1) | Thread-safe, but deprecated |

#### Map application options in practice

1. **Caching**: Storing the results of expensive calculations for quick re-access.
2. **Dictionaries and Thesauruses**: Building dictionaries for translation or synonyms.
3. **Data Indexing**: Maps can be used to index large amounts of data.
4. **Configuration Systems**: Storing key-value pairs for program settings.
5. **Graphs and networks**: Representation of graphs or networks using a map.
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
<summary>ArrayList</summary>


# ArrayList в Java

## Введение в Интерфейс List в Java

Интерфейс `List` в Java является частью Java Collections Framework и представляет собой упорядоченную коллекцию (или
последовательность) элементов. Элементы в списке могут быть доступны и управляемы по индексам, начиная с нуля. Главное
отличие интерфейса `List` от стандартных массивов заключается в его гибкости: в отличие от массивов, размер списков
может динамически изменяться. `List` предоставляет методы для добавления, удаления и доступа к элементам, а также
позволяет выполнять поиск и сортировку данных. Этот интерфейс реализуется различными классами, такими
как `ArrayList`, `LinkedList` и другими, каждый из которых имеет свои особенности и применения. Изучение `List` и его
реализаций, особенно `ArrayList`, является фундаментальным для эффективного использования коллекций в Java.

## Введение в ArrayList

![img_1.png](images%2Fimg_1.png)

### Обзор: Что такое ArrayList и как он отличается от обычных массивов

`ArrayList` в Java — это реализация динамического массива, которая является частью Java Collections Framework. В отличие
от стандартных массивов, `ArrayList` обеспечивает возможность динамического изменения размера. Это означает, что
элементы могут быть добавлены или удалены, и размер `ArrayList` будет автоматически адаптироваться к этим
изменениям. `ArrayList` поддерживает только объектные типы данных и не может хранить примитивные типы напрямую.

### Преимущества использования ArrayList по сравнению с массивами

- **Гибкость размера**: Основное преимущество `ArrayList` перед стандартными массивами заключается в его способности
  изменять размер во время выполнения программы. Это позволяет более эффективно управлять памятью, особенно когда точное
  количество элементов заранее неизвестно.
- **Удобные методы**: `ArrayList` предоставляет множество встроенных методов для управления элементами, таких как
  добавление, удаление, поиск и сортировка, что делает его более удобным в использовании по сравнению с обычными
  массивами.
- **Автоупаковка и автораспаковка**: С `ArrayList` можно легко использовать оберточные классы для примитивных типов
  данных, такие как `Integer` и `Double`, которые автоматически упаковываются и распаковываются.

## Основы работы с ArrayList

### Создание ArrayList: Как инициализировать и использовать ArrayList

`ArrayList` можно создать несколькими способами. Самый простой способ - использовать конструктор без аргументов, который
создает пустой список. Также можно инициализировать `ArrayList` с начальной емкостью или существующей коллекцией.
Например, `ArrayList<String> list = new ArrayList<>();` создает пустой список строк.

### Основные методы: add, get, set, remove, size

- `add(Object)` - добавляет элемент в конец списка.
- `get(int index)` - возвращает элемент по указанному индексу.
- `set(int index, Object)` - заменяет элемент в указанной позиции.
- `remove(int index)` или `remove(Object)` - удаляет элемент по индексу или значению.
- `size()` - возвращает количество элементов в списке.

### Автоматическое изменение размера: Как ArrayList автоматически расширяется и сжимается

`ArrayList` автоматически увеличивает свою емкость, когда количество элементов превышает текущую емкость списка. Это
происходит благодаря перераспределению внутреннего массива. При удалении элементов размер `ArrayList` не уменьшается
автоматически, но можно вручную уменьшить размер, используя метод `trimToSize()`.

## Работа с данными в ArrayList

### Добавление элементов: Различные способы добавления элементов
- **Прямое добавление**: Использование метода `add(Object)` для добавления элемента в конец списка.
- **Добавление по индексу**: Метод `add(int index, Object element)` позволяет вставить элемент на определенную позицию в списке.

![img_2.png](images%2Fimg_2.png)

### Удаление элементов: Как и когда следует удалять элементы из списка
- **Удаление по индексу**: Метод `remove(int index)` удаляет элемент по указанному индексу.
- **Удаление по значению**: Метод `remove(Object o)` удаляет первое вхождение указанного элемента, если он присутствует в списке.

![img_3.png](images%2Fimg_3.png)

### Поиск и обновление элементов: Получение данных и изменение элементов в списке
- **Поиск элемента**: Метод `indexOf(Object o)` возвращает индекс первого вхождения элемента, `contains(Object o)` проверяет наличие элемента.
- **Обновление элемента**: Метод `set(int index, Object element)` заменяет элемент на указанной позиции.

### Перебор элементов: Использование циклов и итераторов для обхода ArrayList
- **Использование for-each цикла**: Удобный способ перебора элементов без доступа к индексу.
- **Использование итератора**: Итераторы позволяют более гибко управлять процессом перебора, включая удаление элементов во время итерации.

| Операция            | Сложность        | Описание                                     |
|---------------------|------------------|----------------------------------------------|
| `add(E e)`          | O(1) амортизированно | Добавление элемента в конец списка. Сложность может увеличиться до O(n) при расширении массива. |
| `add(int index, E element)` | O(n) | Добавление элемента в заданную позицию. Требует сдвига всех последующих элементов. |
| `get(int index)`    | O(1)             | Получение элемента по индексу.               |
| `set(int index, E element)` | O(1) | Замена элемента на заданной позиции.         |
| `remove(int index)` | O(n)             | Удаление элемента по индексу. Требует сдвига всех последующих элементов. |
| `remove(Object o)`  | O(n)             | Удаление первого вхождения указанного элемента, если он присутствует. |
| `size()`            | O(1)             | Получение размера списка.                    |
| `clear()`           | O(n)             | Удаление всех элементов из списка.           |
| `contains(Object o)`| O(n)             | Проверка наличия элемента в списке.          |
| `indexOf(Object o)` | O(n)             | Получение индекса первого вхождения элемента.|
| `lastIndexOf(Object o)` | O(n)         | Получение индекса последнего вхождения элемента. |



## Заключение: Изучение ArrayList в Java

### Обобщение ключевых моментов урока
- Мы изучили `ArrayList` — динамическую структуру данных, которая обеспечивает гибкость и удобство работы с массивами объектов в Java.
- Рассмотрели основные операции, такие как добавление, удаление, поиск и обновление элементов, а также различные способы итерации по списку.
- Узнали о преимуществах использования `ArrayList` по сравнению со стандартными массивами, включая динамическое изменение размера и более удобные методы управления данными.

</details>

<details>
<summary>LinkedList (Связанный список)</summary>

# LinkedList (Связанный список)

## Введение

### Определение связных списков

Linked List (Связный список) - это структура данных, состоящая из узлов, каждый из которых содержит данные и ссылку
(или указатель) на следующий узел в списке. Эта структура позволяет эффективно вставлять и удалять элементы
без необходимости перераспределения или реорганизации всей структуры данных, как это требуется в массивах.

### Сравнение связных списков с массивами

1. **Динамический размер**: В отличие от массивов, размер связного списка не фиксирован, и он может
   динамически увеличиваться или уменьшаться.

2. **Память**: Связные списки более эффективно используют память, так как они выделяют память под новые
   элементы по мере необходимости, в то время как массивы требуют заранее определенного количества памяти,
   даже если она не полностью используется.

3. **Время доступа к элементам**: В массивах доступ к элементу по индексу выполняется быстро, в то время
   как в связных списках для доступа к элементу необходимо пройти через список.

4. **Вставка и удаление**: Вставка и удаление элементов в связных списках обычно быстрее, чем в массивах,
   особенно если необходимо вставить или удалить элементы в начале или середине списка.

5. **Случайный доступ**: Массивы обеспечивают эффективный случайный доступ к элементам, тогда как для
   доступа к определенному элементу в связном списке требуется последовательный проход от начала или конца списка.

6. **Память на дополнительные данные**: Каждый узел в связном списке требует дополнительной памяти для
   хранения указателя на следующий или предыдущий элементы, в то время как массивы не требуют этого.

## Основные концепции

### Односвязные списки (Singly Linked Lists)

Односвязный список - это структура данных, где каждый элемент (узел) содержит данные и ссылку на следующий
узел в списке. Это самая простая форма связного списка, где проход возможен только в одном направлении - от
начала к концу:
![img_4.png](images%2Fimg_4.png)

- **Структура узла**: Каждый узел содержит два элемента - данные и ссылку на следующий узел.
- **Преимущества**: Простота реализации, эффективное использование памяти, динамичное управление размером.
- **Недостатки**: Доступ к элементам только последовательный, удаление требует доступа к предыдущему узлу.

### Двусвязные списки (Doubly Linked Lists)

Двусвязный список похож на односвязный, но каждый узел содержит ссылки как на следующий, так и на
предыдущий узлы. Это позволяет двунаправленный проход по списку:
![img_5.png](images%2Fimg_5.png)

- **Структура узла**: Каждый узел содержит данные, ссылку на следующий узел и ссылку на предыдущий узел.
- **Преимущества**: Двунаправленный доступ, более удобное удаление элементов.
- **Недостатки**: Больше занимаемой памяти из-за дополнительных ссылок, сложность реализации.

### Циклические списки (Circular Linked Lists)

Циклический список может быть односвязным или двусвязным, но в нем последний узел содержит ссылку на
первый узел, формируя замкнутый цикл. Это обеспечивает бесконечный циклический доступ к элементам:
![img_6.png](images%2Fimg_6.png)

- **Особенности**: В односвязном циклическом списке последний узел указывает на первый. В двусвязном -
  дополнительно первый узел указывает на последний.
- **Преимущества**: Позволяет бесконечно обходить элементы списка, полезно для приложений, где список
  постоянно перебирается (например, карусели).
- **Недостатки**: Необходимость дополнительной обработки при вставке и удалении для поддержания цикличности,
  легко создать бесконечный цикл при неправильной обработке.

## Примеры и практические задачи

### Реализация базовых методов для односвязного и двусвязного списка

#### Односвязный список

- **Добавление элемента в конец списка**: Проход по списку до последнего элемента, затем вставка нового узла.
- **Удаление элемента по значению**: Поиск узла с заданным значением и его удаление, при этом необходимо обновить ссылку
  предыдущего узла.
- **Поиск элемента по значению**: Последовательный проход по списку с проверкой значения каждого узла.

#### Двусвязный список

- **Добавление элемента в конец списка**: Вставка нового узла после текущего последнего узла и обновление ссылок.
- **Удаление элемента по значению**: Аналогично односвязному списку, но с обновлением предыдущей и следующей ссылок.
- **Поиск элемента по значению**: Такой же, как в односвязном списке, но с возможностью движения в обоих направлениях.

### Решение типичных задач на связные списки

#### Обращение списка

Обращение списка - это процесс изменения направления связей так, чтобы первый элемент стал последним, а последний -
первым. Это можно сделать путем последовательного переставления ссылок на узлы.

**Пример для односвязного списка:**

```java
public void reverse() {
    Node prev = null;
    Node current = head;
    Node next;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}
```

### Поиск среднего элемента
Для нахождения среднего элемента в списке можно использовать два указателя: один перемещается с двойной скоростью, а
другой - с обычной. Когда быстрый указатель достигает конца списка, медленный будет указывать на средний элемент.

```java
public Node findMiddle() {
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;
}

```

| Операция             | LinkedList | ArrayList     |
|----------------------|------------|---------------|
| Добавление в конец   | O(1)       | O(1)*         |
| Добавление в начало  | O(1)       | O(n)          |
| Добавление в середину| O(n)       | O(n)          |
| Удаление из конца    | O(1)       | O(1)*         |
| Удаление из начала   | O(1)       | O(n)          |
| Удаление из середины | O(n)       | O(n)          |
| Поиск по индексу     | O(n)       | O(1)          |
| Поиск по значению    | O(n)       | O(n)          |
| Размер списка        | O(1)       | O(1)          |

## Заключение

### Краткий обзор пройденных тем
В рамках данного урока мы охватили ключевые аспекты работы со связными списками в Java. Рассмотрены следующие темы:
- **Определение и основные концепции связных списков**: Понимание односвязных, двусвязных и циклических списков.
- **Реализация односвязного списка**: Создание класса узла, добавление, удаление и поиск элементов.
- **Реализация двусвязного списка**: Расширенная структура узла, особенности добавления и удаления элементов.
- **Практические задачи**: Обращение списка и поиск среднего элемента, для развития практических навыков работы со списками.

</details>

<details>
<summary>Set (Множества). Контракт методов `hashCode` и `equals` в Java </summary>

# Контракт методов `hashCode` и `equals` в Java

## Контракт `equals`

1. **Рефлексивность**: Объект должен быть равен самому себе.
    ```java
    x.equals(x) // должно вернуть true
    ```

2. **Симметричность**: Если `x` равно `y`, то `y` должно быть равно `x`.
    ```java
    x.equals(y) == y.equals(x) // должно быть true
    ```

3. **Транзитивность**: Если `x` равно `y` и `y` равно `z`, то `x` должно быть равно `z`.
    ```java
    if (x.equals(y) && y.equals(z)) {
        x.equals(z); // должно вернуть true
    }
    ```

4. **Консистентность**: Многократные вызовы `equals` с теми же объектами должны возвращать одинаковый результат, при условии, что информация, используемая в сравнениях на равенство, не меняется.

5. **Неравенство с `null`**: Любая не-null ссылка `x.equals(null)` должна возвращать `false`.

## Контракт `hashCode`

1. **Консистентность**: В течение одного выполнения приложения, метод должен всегда возвращать одно и то же целочисленное значение, если информация, используемая в методе `equals`, не изменилась.

2. **Если объекты равны, хеш-коды тоже должны быть равны**: Если `x.equals(y)` возвращает `true`, то `x.hashCode()` должен возвращать тот же хеш-код, что и `y.hashCode()`.

## Взаимосвязь `hashCode` и `equals`

Если два объекта считаются равными по методу `equals`, их хеш-коды также должны быть равны. Однако обратное не всегда верно: равенство хеш-кодов не гарантирует равенство объектов. Другими словами, два различных объекта могут иметь одинаковый хеш-код, что является коллизией.

Таким образом, при переопределении одного из этих методов, как правило, необходимо переопределить и другой, соблюдая указанный контракт.

# Множество (Set) в Java

## Обзор

Интерфейс `Set` находится в пакете `java.util` и расширяет интерфейс `Collection`. Это неупорядоченная коллекция объектов, в которой не могут храниться дубликаты. По сути, он реализует математическое понятие множества. Этот интерфейс содержит методы, унаследованные от интерфейса `Collection`, и добавляет функцию, которая ограничивает вставку дублирующих элементов.

Есть два основных подинтерфейса, которые расширяют интерфейс `Set`:

- `SortedSet`
- `NavigableSet`


## NavigableSet и SortedSet

На приведенной выше диаграмме интерфейс `NavigableSet` расширяет интерфейс `SortedSet`. Поскольку множество не сохраняет порядок вставки, интерфейс `NavigableSet` предоставляет реализацию для навигации по множеству. Класс, который реализует `NavigableSet`, — это `TreeSet`, являющийся реализацией самобалансирующегося дерева. Таким образом, этот интерфейс предоставляет нам способ навигации по этому дереву.

## Объявление

Интерфейс `Set` объявлен так:

```java
public interface Set<E> extends Collection<E>
```

## Создание объектов Set
Поскольку Set является интерфейсом, объекты типа `Set` создать нельзя. Нам всегда нужен класс, который расширяет этот список, чтобы создать объект. После введения обобщений в `Java 1.5` стало возможным ограничить тип объекта, который может быть сохранен в `Set`. Типобезопасное множество можно определить так:
```java
// Obj is the type of the object to be stored in Set
Set<Object> set = new HashSet<Object>();
```

## Классы, реализующие интерфейс Set в Java

| Класс         | Хранение                          | Порядок                           | Сложность операций                     | Потокобезопасность | Null-элементы                  |
|---------------|-----------------------------------|-----------------------------------|---------------------------------------|--------------------|--------------------------------|
| `HashSet`      | Хеш-таблица                       | Не сохраняет порядок               | Константное время для основных операций| Нет                | Допускает                       |
| `TreeSet`      | Красно-черное дерево              | Элементы отсортированы            | Логарифмическое время                 | Нет                | Не допускает (Java 7 и выше)    |
| `LinkedHashSet`| Хеш-таблица и двусвязный список   | Сохраняет порядок вставки          | Константное время для основных операций| Нет                | Допускает                       |

</details>


<details>
<summary> Урок 32. Инткрфейс Map < Key, Value>. </summary>

## MAP: Суть и Особенности

MAP в Java представляет собой структуру данных, организованную в форме уникальных пар "ключ-значение", и очень напоминает словарь. MAP не только является структурой данных, но и интерфейсом в стандартной Java Development Kit (JDK), поддерживающим различные реализации, включая самую популярную — HashMap.

### Введение и Разновидности

MAP в Java представляет вершину иерархии коллекций Java и включено в стандартный JDK начиная с версии 1.2. Этот интерфейс предлагает базовый набор операций для управления данными, представленными в форме "ключ-значение". С течением времени, с улучшением и обновлением Java, этот интерфейс обогащается новыми функциями.

Иерархия MAP в Java включает несколько ключевых реализаций:

- HashMap
- LinkedHashMap
- TreeMap

HashMap наиболее часто используется в примерах и приложениях, и о нем будет говориться подробнее в следующих разделах.

### Назначение и Применение

Карты (Maps) служат для эффективного поиска данных. Они хранят информацию в формате "ключ-значение", где каждый ключ является уникальным и однозначно связан с определенным значением. Такие уникальные пары "ключ-значение" и составляют элементы карты.

### Сигнатуры Основных Методов

В Java, интерфейс `java.util.Map` предлагает набор методов для добавления, извлечения и удаления элементов.

## Отличительные Характеристики Map в Java

Map интерфейсы в Java Collection Framework обладают различными реализациями, каждая с своими особенностями и уровнем потокобезопасности. Наиболее часто встречаемый тип — HashMap, который широко используется в большинстве Java-приложений.

### Уникальность Map Коллекций

Map являются особенными в том смысле, что они не просто расширяют или реализуют коллекционный интерфейс напрямую. Это связано с их особенностями работы с парными элементами "ключ-значение", в отличие от обработки индивидуальных значений.

### Основные Операции с Map

Чтобы эффективно работать с Map в Java, необходимо ознакомиться с методами, которые реализуют различные функции. Эти методы будут рассмотрены далее и помогут в дальнейшем изучении этого компонента.

#### Создание Map

В Map ключи и значения могут быть объектами любого типа. Примитивные типы данных не могут быть использованы из-за ограничений, связанных с использованием generics. HashMap позволяет иметь один нулевой ключ и множество нулевых значений. Порядок элементов не гарантирован.

Пример создания HashMap с целочисленными ключами и строковыми значениями:

```java
Map<Integer, String> map = new HashMap<>();
```

Все последующие методы будут применимы для любых реализаций Map, так как все они реализуют один и тот же интерфейс.

#### Вставка Записей
Для добавления записей используется метод put, принимающий два аргумента:
* ключ
* значение  
  Пример:

```java
map.put(1, "Tyrion Lannister");
map.put(2, "Arya Stark");
map.put(3, "Ned Stark");
map.put(4, "Cersei Lannister");
```

#### Таблица содержимого Map:
| Key | Value           |
|-----|-----------------|
| 1   | Tyrion Lannister|
| 2   | Arya Stark      |
| 3   | Ned Stark       |
| 4   | Cersei Lannister|

#### Объединение Карт
Для добавления нескольких записей или объединения двух карт используется метод `putAll`.

#### Ключи и Дубликаты
В Map ключи должны быть уникальными. Если попытаться добавить существующий ключ, метод `put` вернёт предыдущее значение или `null`.

##### Пример проверки наличия ключа:
```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Duplicate key found");
}
```  
##### Получение Данных
Метод `get` используется для извлечения информации, принимая ключ как аргумент.

Пример:
```java
String value = map.get(4);  // Cersei Lannister
```
Если ключ отсутствует, метод `get` возвращает `null`.
```java
String value = map.get(10);  // null
```

##### Уникальность Ключей в Map
Ключи в структуре Map должны быть уникальными. В случае попытки добавления уже существующего ключа происходит следующее:


```java
map.put(4, "Daenerys Targaryen");
```
#### Таблица содеражимого Map:
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

В данном случае, метод `put` возвращает предыдущее значение ключа, если таковое имеется. В отсутствие предыдущего значения возвращается `null`.

#### Проверка Наличия Ключа
Для определения наличия конкретного ключа используется метод `containsKey`.


```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Key already exists, cannot add duplicate");
}
```

#### Проверка Значений
Для проверки наличия определенного значения в Map применяется метод `containsValue`.


```java
boolean exists = map.containsValue("Brienne of Tarth"); // Output: false
```

Этот метод позволяет узнать, содержится ли в Map заданное значение.

#### Удаление Элементов из Map
Кроме добавления элементов, в структуре Map также поддерживается их удаление. Это базовая операция, которая позволяет модифицировать содержимое Map.

##### Метод Remove
Для удаления элемента используется метод `remove`, который работает следующим образом:

1. Принимает ключ элемента как аргумент.
2. Удаляет соответствующий элемент из Map.
3. Возвращает значение удаленного элемента или `null`, если такового не было.

```java
map.remove(3); // Удаляет и возвращает "Ned Stark"
map.remove(3); // Ничего не удаляет и возвращает null
```

#### Получение Размера Map и Проверка на Пустоту
Метод `size` возвращает количество элементов в Map.

```java
int size = map.size(); // Получение размера
```
Метод `isEmpty` возвращает булево значение, указывающее, пуста ли коллекция или нет.
```java
boolean isEmpty = map.isEmpty(); // Проверка на пустоту
```
#### Просмотр Содержимого Map
Интерфейсы Map предоставляют методы для просмотра содержимого:

- `keySet`: Возвращает набор всех ключей в Map.
- `values`: Возвращает коллекцию всех значений в Map.
- `entrySet`: Возвращает набор всех пар "ключ-значение" в Map.

Эти "представления" напрямую связаны с основной картой, и изменения в них отражаются на основной карте и наоборот. Однако, добавление новых элементов через эти представления невозможно.



##### Метод Clear
Чтобы полностью очистить Map, можно использовать метод `clear`.

```java
map.clear(); // Очищает всю карту
```

#### Полное Содержимое Вашей Map
Для демонстрации методов `keySet`, `values`, и `entrySet` давайте сначала посмотрим на текущее содержимое вашей Map:

##### Таблица содержимого Map:
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

#### Использование keySet, values, и entrySet

##### Метод keySet
Метод `keySet` возвращает набор всех ключей, содержащихся в Map.

```java
Set<Integer> keys = map.keySet();
// keys будет содержать [1, 2, 3, 4]
```
##### Метод values
Метод `values` возвращает коллекцию всех значений Map.

```java
Collection<String> values = map.values();
// values будет содержать ["Tyrion Lannister", "Arya Stark", "Ned Stark", "Daenerys Targaryen"]
```
##### Метод entrySet
Метод `entrySet` возвращает набор объектов Map.Entry, каждый из которых содержит пару "ключ-значение".
```java
Set<Map.Entry<Integer, String>> entries = map.entrySet();
// entries будет содержать:
// 1=Tyrion Lannister, 2=Arya Stark, 3=Ned Stark, 4=Daenerys Targaryen
```
С помощью этих методов вы можете получить доступ к ключам, значениям или паре "ключ-значение" вашей Map для дальнейшего использования или манипуляций.

#### Итерации
Итерации по мапам (mapping collections) возможны различными способами. В этом разделе представлены наиболее распространенные методы итерации.

##### Особенности исключений
Стоит знать, что попытка итерации по нулевой (null) мапе приведет к исключению `NullPointerException`.

##### Применение Foreach
Наиболее популярный метод итерации по мапе — это использование цикла `foreach`. Этот метод удобен для большинства задач и предоставляет доступ как к ключам, так и к значениям.

```java
map.forEach((key, value) -> {
System.out.println("Key: " + key + ", Value: " + value);
});
```

##### Примечание
Выше представлен пример использования лямбда-выражений в Java 8 для итерации по мапе. В этом случае разработчику предоставляется возможность работать как с ключами, так и с значениями.

##### Примеры итерации без использования лямбда-выражений

###### Итерация с использованием for-each и метода `keySet()`

```java
for (Integer key : map.keySet()) {
    String value = map.get(key);
    System.out.println("Key: " + key + ", Value: " + value);
}
```
###### Итерация с использованием for-each и метода `entrySet()`

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```
###### Итерация с использованием итератора

```java
Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```

### Заключение

#### Практические преимущества использования мап (Map)

1. **Быстрый доступ и поиск**: Мапы предоставляют возможность очень быстрого доступа к данным по ключу.
2. **Уникальные ключи**: В мапах не может быть дубликатов ключей, что обеспечивает точность данных.
3. **Гибкость**: Мапы можно использовать для хранения пар "ключ-значение" разных типов.
4. **Упорядочение**: Некоторые реализации мап (например, `TreeMap`) поддерживают упорядочение данных.
5. **Наличие полезных методов**: Встроенные методы для выполнения основных операций, таких как добавление, удаление и поиск элементов.

#### Сводная таблица с классами и сложностью операций

| Класс      | `get`   | `put`   | `remove` | `containsKey` | Особенности                          |
|------------|---------|---------|----------|---------------|--------------------------------------|
| `HashMap`  | O(1)    | O(1)    | O(1)     | O(1)          | Неупорядоченная                      |
| `TreeMap`  | O(log n)| O(log n)| O(log n) | O(log n)      | Упорядоченная                        |
| `LinkedHashMap`| O(1) | O(1)   | O(1)     | O(1)          | Упорядоченная по порядку вставки     |
| `Hashtable`| O(1)    | O(1)    | O(1)     | O(1)          | Потокобезопасная, но устаревшая       |

#### Варианты применения мап на практике

1. **Кеширование**: Хранение результатов дорогостоящих вычислений для быстрого повторного доступа.
2. **Словари и тезаурусы**: Построение словарей для перевода или синонимов.
3. **Индексация данных**: Мапы могут быть использованы для индексации больших объемов данных.
4. **Системы конфигурации**: Хранение пар "ключ-значение" для настроек программы.
5. **Графы и сети**: Представление графов или сетей с помощью мап.
</details>
</details>


