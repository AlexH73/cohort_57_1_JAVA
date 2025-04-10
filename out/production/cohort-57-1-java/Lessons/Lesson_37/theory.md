<details>
<summary>Recursion and Big-O theory</summary>
<details>
<summary>Recursion</summary>

## Recursion

## Introduction to Recursion

Recursion in programming is when a function calls itself to solve a subtask. Recursion is often used
to solve problems that can be broken down into smaller, similar tasks.

### Definition of recursion

A recursive function is a function that calls itself with a new set of parameters to solve a problem.

### Examples of recursive functions

- Factorial of the number: \(n! = n\cdot (n-1)! \)
- Fast exponentiation: \(a^n = a\cdot a^{(n-1)} \)
- Calculation of Fibonacci numbers: \(F(n) = F(n-1) + F(n-2) \)

### The main components of a recursive function

1. **Base case**: the condition under which the recursion stops. Without a base case, the function will call itself
   infinitely.
2. **Recursive case**: calling a function itself with a new set of parameters.

### The importance of preventing infinite recursion

Infinite recursion can lead to stack overflow and program crash. To avoid this, it is important
always have a base case and make sure that every recursive call brings us closer to it.

## Examples of recursive tasks

Recursion can be used to solve a variety of programming problems. Let's look at some
classic examples.

### Factorial of a number

The factorial of the number `n`, denoted as `n!`, is the product of all positive integers from `1` to `n`.

```java
    int factorial(int n){
        if(n<=1){
        return 1; // base case
        }
        return n*factorial(n-1); // recursive case
        }
```

The `factorial` function calls itself with the parameter reduced by one until it reaches the base case.

### Fibonacci Numbers

Fibonacci numbers are a sequence of numbers in which each number is the sum of the previous two.

```java
int fibonacci(int n){
        if(n<=1){
        return n; // base cases
        }
        return fibonacci(n-1)+fibonacci(n-2); // recursive case
        }
```

The `fibonacci` function calls itself twice with the parameters `n - 1` and `n - 2` until it reaches the base cases.

### Depth-first search in a graph or tree

Recursion is also often used to traverse data structures such as graphs and trees.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
package algorithms.lesson10trees;


import java.util.*;

// example of a binary tree with recursive traversal in depth
public class BinaryTree {
    public static void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Sum of the tree: " + Tree.sumWide(root));
        //System.out.println(root.sumRecursive(root));

        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        // example of a binary tree with recursive traversal in depth
        public int sumRecursive(Tree root) {
            int summ = root.value;

            System.out.println(root.value);

            if (root.left != null) {
                summ += sumRecursive(root.left);
            }

            if (root.right != null) {
                summ += sumRecursive(root.right);
            }
            return summ;
        }

        // example of a binary tree with iterative traversal in depth
        public static int sumDeep(Tree root) {
            Stack<Tree> stack = new Stack<>();
            stack.push(root);

            int summ = 0;

            while (!stack.isEmpty()) {
                Tree node = stack.pop();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return summ;
        }

        // example of a binary tree with iterative breadth traversal
        public static int sumWide(Tree root) {
            Queue<Tree> queue = new LinkedList<>();
            queue.add(root);

            int summ = 0;

            while (!queue.isEmpty()) {
                Tree node = queue.remove();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return summ;
        }
    }
}
```

</details>

## Advantages and disadvantages of recursion

Recursion is a powerful tool in programming, but like any tool, it has its advantages and disadvantages.

### Advantages of recursion

1. **Clarity and Purity of Code**: Recursive solutions are often more straightforward and easier to understand,
   especially
   when the task is naturally divided into subtasks.
2. **Simplification of Complex Tasks**: Some tasks are difficult to solve iteratively, but they become much more
   manageable
   when using recursion.
3. **Power and Flexibility**: Recursion allows you to solve complex tasks, such as traversing trees and graphs, with a
   minimum
   amount of code.

### Disadvantages of recursion

1. **Memory Consumption**: Each recursive call requires additional space in the call stack, which can
   lead to stack overflow with a large recursion depth.
2. **Time-consuming**: Recursive calls may be less efficient compared to iterative solutions due to
   additional costs for calling the function and returning from it.
3. **Debugging Complexity**: Recursive code can be harder to debug and understand, especially for those who are not used
   to
   this style of programming.

As with any programming tool, it is important to understand when recursion is the best choice and when
iterative methods should be preferred.

## Optimization of recursive functions

Even when recursion provides a clean and elegant solution, it is important to take into account its resource consumption
and work on
optimization to prevent unnecessary execution time and memory costs.

### Memoization

Memoization is a technique for storing the results of previous function calls to prevent them from being recalculated.

```java
int fibonacci(int n,int[]memo){
        if(n<=1)return n; // base cases
        if(memo[n]!=-1)return memo[n]; // return the saved result, if there is one
        memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo); // saving the result before returning
        return memo[n];
        }
```

Initialize the `memo` array with -1 values and pass it to the function. The results of each calculation will be saved
and
reused, which will significantly reduce the execution time.

### Tail recursion

Tail recursion occurs when a recursive call is the last operation in a function. Some compilers and
interpreters optimize tail recursion, reducing stack usage.

#CODE
int factorial(int n, int accumulator = 1) {
if (n <= 1) return accumulator;
return factorial(n - 1, n * accumulator); // tail recursive call
}
#CODE

In this example, the calculation state is stored in the accumulator, and there is no need to save the previous states of
the function
on the stack.

### Performance evaluation

After making optimizations, it is important to evaluate the performance of a recursive function by comparing it with
iterative analogues and
making sure that it meets the performance requirements of your application.

Optimizing recursive functions requires understanding how they work and how they interact with the system. Proper
application of these techniques can lead to more efficient and faster code.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
public class PerformanceComparison {

    public static void main(String[] args) {
        int number = 100; // Select a number to calculate the factorial. Be careful with large numbers, as this can lead to stack overflow in a recursive method.

        // Time measurement for an iterative method
        long startTime = System.nanoTime();
        long iterativeResult = factorialIterative(number);
        long endTime = System.nanoTime();
        long durationIterative = endTime - startTime;

        System.out.println("Iterative method: " + iterativeResult + ", Execution time: " + durationIterative + " nanoseconds");

        // Time measurement for the recursive method
        startTime = System.nanoTime();
        long recursiveResult = factorialRecursive(number);
        endTime = System.nanoTime();
        long durationRecursive = endTime - startTime;

        System.out.println("Recursive method: " + recursiveResult + ", Execution time: " + durationRecursive + " nanoseconds");
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

</details>

## Applying recursion

Recursion is widely used in programming and can be very effective for certain types of tasks.

### Search and crawl algorithms

- **Binary search**: Recursively dividing an array in half until the desired element is found.
- **Tree Traversal**: Using Depth-First Search (DFS) for trees and graphs.

### Sorting algorithms

- **Quick Sort**: Recursive division of an array and its sorting.
- **Merge sort**: Recursive array division, sorting and subsequent merging.

### Mathematical problems

- **Calculating the factorial**: `n! = n *(n-1)!`
- **Fibonacci numbers**: `F(n) = F(n-1) + F(n-2)`

### Working with data structures

- Recursive traversal of trees and graphs.
- Algorithms on graphs, for example, shortest path search.

### Algorithms of division and conquest

- Quick sort and merge sort are prime examples.

### Recursion in graphical interfaces

- Creation of fractals and other visual effects.

### In compiler programming

- Recursive descent in parsing.

### Games and puzzle solving

- Algorithms for the Tower of Hanoi and other puzzles.
- Algorithms for games with recursive logic.

## Advantages and disadvantages of recursion

### Advantages:

1. **Simplicity and purity of code**: Recursive solutions are often more concise and understandable.
2. **Direct mapping of mathematical definitions**: Many mathematical formulas are naturally expressed by
   recursion.

### Disadvantages:

1. **Efficiency**: Recursive calls may be less efficient and waste more resources, especially if
   there is no tail recursion optimization.
2. **Stack Limitation**: Deep recursive calls can lead to stack overflow.

### Conclusion

Recursion is a powerful tool, but it is important to understand its limitations and be able to determine when it is
better to use iterative
methods. In some cases, a combination of recursion and memoization can offer an optimal solution while maintaining the
simplicity
of the recursive approach and improving performance.
</details>

<details>
<summary>Time Complexity and "Big O" Notation</summary>

# Time Complexity and "Big O" Notation

## Definition

**Big O (O-notation)** is a mathematical notation used in computer science to describe a top—down constraint on
the time complexity of an algorithm as a function of the size of the input data. It gives an upper bound on the
execution time,
showing the worst case of the algorithm execution.

Examples

- 'O(1)`: Execution time is constant. Example: accessing an array element by index.
- `O(log n)`: The execution time grows logarithmically with respect to the size of the input data. Example: binary
  search.
- `O(n)`: Execution time grows linearly with increasing input data size. Example: linear search.
- `O(n log n)': Execution time grows linearly logarithmically. Example: merge sorting.
- `O(n^2)`: Execution time grows quadratically. Example: bubble sorting.
- `O(2^n)`: Execution time grows exponentially. Example: recursive calculation of Fibonacci numbers.

## Why Is It Necessary

Understanding the time complexity of algorithms allows programmers to make informed choices about algorithms and
data structures, which in turn affects the performance and efficiency of programs.

## Recursion and Big O

In the case of recursive algorithms, a Large O can help to understand how the execution time will change with an
increase in the size
of the input data and the depth of recursion. Recursive algorithms can have high time complexity due to multiple
function calls and the use of additional memory in the call stack.

## Important Points

The Big O describes the worst case: It is important to understand that the Big O gives an estimate of the worst case of
execution, not
the average or best.
Constants and Smaller Terms are Ignored: In the Big O, constants and smaller terms are ignored.
For example, `O(2n + 5)`
is simplified to `O(n)'.
Conclusion
Big O is a critical tool for evaluating the effectiveness of algorithms. Understanding the time complexity
of the algorithm helps programmers make informed decisions when choosing algorithms and data structures, which, in
turn, can significantly affect the performance of the program.

## Mathematical complexity

- Constant complexity `O(1)`
  This means that the execution time of the algorithm does not depend on the size of the input data. No matter how much
  whether the input data is large or small, the algorithm will be executed in the same amount of time. An example is
  access to an array element by index.

- Linear complexity `O(n)`
  The execution time of the algorithm is proportional to the size of the input data. For example, if we have an array of
  n elements, and
  we want to go through all the elements and do something with them, the execution time will be proportional to n.
  Example: search
  an element in an unsorted array.

- Power complexity `O(n^k)`, where 'k` is a constant
  The execution time of the algorithm is proportional to the size of the input data raised to the power of `k`. This is
  slower than
  linear complexity, and is common in algorithms with nested loops. Example: bubble sorting has
  complexity O(n^2).

- Logarithmic complexity `O(log(n))`
  The execution time of the algorithm is proportional to the logarithm of the size of the input data. This means that if
  the input data is increased by k times, the execution time will increase only by a constant. Example: binary search in
  a sorted
  array.

- Factorial complexity `O(n!)`
  The algorithm execution time increases factorially with increasing input data size. This is one of the slowest forms
  the execution time increases, and such algorithms become impractical even with relatively small values of n.
  Example: solving the traveling salesman problem by a complete search of all possible routes.

Each of these types of complexity describes how the algorithm execution time varies depending on the size of the input
data, and helps developers understand which algorithm is best suited for solving a specific task.

![img.png](img.png)
</details>
</details>

_____________

<details>
<summary>Рекурсия и теория Big-O</summary>
<details>
<summary>Рекурсия</summary>

## Рекурсия

## Введение в рекурсию

Рекурсия в программировании — это когда функция вызывает сама себя для решения подзадачи. Рекурсия часто используется
для решения задач, которые можно разбить на более мелкие, однотипные задачи.

### Определение рекурсии

Рекурсивная функция — это функция, которая для решения задачи вызывает сама себя с новым набором параметров.

### Примеры рекурсивных функций

- Факториал числа:  `n! = n * (n-1)! `
- Быстрое возведение в степень: `a^n = a * a^{(n-1)} `
- Вычисление чисел Фибоначчи: `F(n) = F(n-1) + F(n-2)`

### Основные компоненты рекурсивной функции

1. **Базовый случай**: условие, при котором рекурсия остановится. Без базового случая функция будет вызывать сама себя
   бесконечно.
2. **Рекурсивный случай**: вызов функции самой себя с новым набором параметров.

### Важность предотвращения бесконечной рекурсии

Бесконечная рекурсия может привести к переполнению стека и аварийному завершению программы. Чтобы избежать этого, важно
всегда иметь базовый случай и убедиться, что каждый рекурсивный вызов приближает нас к нему.

## Примеры рекурсивных задач

Рекурсия может быть использована для решения разнообразных задач в программировании. Давайте рассмотрим несколько
классических примеров.

### Факториал числа

Факториал числа  `n` , обозначаемый как `n!`, — это произведение всех положительных целых чисел от `1` до `n`.

```java
    int factorial(int n){
        if(n<=1){
        return 1; // базовый случай
        }
        return n*factorial(n-1); // рекурсивный случай
        }
```

Функция `factorial` вызывает сама себя с уменьшенным на единицу параметром, пока не достигнет базового случая.

### Числа Фибоначчи

Числа Фибоначчи — это последовательность чисел, в которой каждое число является суммой двух предыдущих.

```java
int fibonacci(int n){
    if(n<=1){
        return n; // базовые случаи
    }
    return fibonacci(n-1)+fibonacci(n-2); // рекурсивный случай
}
```

Функция `fibonacci` вызывает сама себя дважды с параметрами  `n - 1` и `n - 2` , пока не достигнет базовых случаев.

### Поиск в глубину в графе или дереве

Рекурсия также часто используется для обхода структур данных, таких как графы и деревья.

<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
package algorithms.lesson10trees;


import java.util.*;

// пример бинарного дерева с рекурсивным обходом в глубину
public class BinaryTree {
    public static void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + Tree.sumWide(root));
        //System.out.println(root.sumRecursive(root));

        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        // пример бинарного дерева с рекурсивным обходом в глубину
        public int sumRecursive(Tree root) {
            int summ = root.value;

            System.out.println(root.value);

            if (root.left != null) {
                summ += sumRecursive(root.left);
            }

            if (root.right != null) {
                summ += sumRecursive(root.right);
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в глубину
        public static int sumDeep(Tree root) {
            Stack<Tree> stack = new Stack<>();
            stack.push(root);

            int summ = 0;

            while (!stack.isEmpty()) {
                Tree node = stack.pop();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в ширину
        public static int sumWide(Tree root) {
            Queue<Tree> queue = new LinkedList<>();
            queue.add(root);

            int summ = 0;

            while (!queue.isEmpty()) {
                Tree node = queue.remove();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return summ;
        }
    }
}
```

</details>

## Преимущества и недостатки рекурсии

Рекурсия — мощный инструмент в программировании, но, как и любой инструмент, он имеет свои преимущества и недостатки.

### Преимущества рекурсии

1. **Понятность и Чистота Кода**: Рекурсивные решения часто бывают более прямолинейными и легче для понимания, особенно
   когда задача естественным образом разделяется на подзадачи.
2. **Упрощение Сложных Задач**: Некоторые задачи сложно решить итеративно, но они становятся гораздо более управляемыми
   при использовании рекурсии.
3. **Мощь и Гибкость**: Рекурсия позволяет решать сложные задачи, такие как обход деревьев и графов, с минимальным
   объемом кода.

### Недостатки рекурсии

1. **Потребление Памяти**: Каждый рекурсивный вызов требует дополнительного пространства в стеке вызовов, что может
   привести к переполнению стека при большой глубине рекурсии.
2. **Временные Затраты**: Рекурсивные вызовы могут быть менее эффективными по сравнению с итеративными решениями из-за
   дополнительных затрат на вызов функции и возврат из нее.
3. **Сложность Отладки**: Рекурсивный код может быть сложнее отлаживать и понимать, особенно для тех, кто не привык к
   такому стилю программирования.

Как и в случае с любым инструментом в программировании, важно понимать, когда рекурсия является лучшим выбором, и когда
стоит отдать предпочтение итеративным методам.

## Оптимизация рекурсивных функций

Даже когда рекурсия предоставляет чистое и элегантное решение, важно учитывать ее потребление ресурсов и работать над
оптимизацией для предотвращения излишних затрат на время выполнения и память.

### Мемоизация

Мемоизация — это техника хранения результатов предыдущих вызовов функции для предотвращения их повторного вычисления.

```java
int fibonacci(int n,int[]memo){
        if(n<=1)return n; // базовые случаи
        if(memo[n]!=-1)return memo[n]; // возвращаем сохраненный результат, если он есть
        memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo); // сохраняем результат перед возвратом
        return memo[n];
        }
```

Инициализируйте массив `memo` значениями -1 и передайте его в функцию. Результаты каждого вычисления будут сохранены и
повторно использованы, что существенно сократит время выполнения.

### Хвостовая рекурсия

Хвостовая рекурсия происходит, когда рекурсивный вызов является последней операцией в функции. Некоторые компиляторы и
интерпретаторы оптимизируют хвостовую рекурсию, сокращая использование стека.

```java
int factorial(int n,int accumulator=1){
        if(n<=1)return accumulator;
        return factorial(n-1,n*accumulator); // хвостовой рекурсивный вызов
        }

```

В этом примере состояние вычисления хранится в аккумуляторе, и нет необходимости сохранять предыдущие состояния функции
на стеке.

### Оценка производительности

После внесения оптимизаций важно оценить производительность рекурсивной функции, сравнив ее с итеративными аналогами и
убедившись, что она соответствует требованиям к производительности вашего приложения.

Оптимизация рекурсивных функций требует понимания их работы и того, как они взаимодействуют с системой. Правильное
применение этих техник может привести к более эффективному и быстрому коду.

<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
public class PerformanceComparison {

    public static void main(String[] args) {
        int number = 100; // Выберите число для вычисления факториала. Будьте осторожны с большими числами, так как это может привести к переполнению стека в рекурсивном методе.

        // Измерение времени для итеративного метода
        long startTime = System.nanoTime();
        long iterativeResult = factorialIterative(number);
        long endTime = System.nanoTime();
        long durationIterative = endTime - startTime;

        System.out.println("Итеративный метод: " + iterativeResult + ", Время выполнения: " + durationIterative + " наносекунд");

        // Измерение времени для рекурсивного метода
        startTime = System.nanoTime();
        long recursiveResult = factorialRecursive(number);
        endTime = System.nanoTime();
        long durationRecursive = endTime - startTime;

        System.out.println("Рекурсивный метод: " + recursiveResult + ", Время выполнения: " + durationRecursive + " наносекунд");
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

</details>

## Применение рекурсии

Рекурсия широко используется в программировании и может быть очень эффективной для определенных типов задач.

### Алгоритмы поиска и обхода

- **Бинарный поиск**: Рекурсивное деление массива пополам до нахождения искомого элемента.
- **Обход дерева**: Применение обхода в глубину (Depth-First Search, DFS) для деревьев и графов.

### Алгоритмы сортировки

- **Быстрая сортировка**: Рекурсивное деление массива и его сортировка.
- **Сортировка слиянием**: Рекурсивное деление массива, сортировка и последующее слияние.

### Математические задачи

- **Вычисление факториала**: `n! = n * (n-1)!`
- **Числа Фибоначчи**: `F(n) = F(n-1) + F(n-2)`

### Работа со структурами данных

- Рекурсивный обход деревьев и графов.
- Алгоритмы на графах, например, поиск кратчайшего пути.

### Алгоритмы разделения и завоевания

- Быстрая сортировка и сортировка слиянием – яркие примеры.

### Рекурсия в графических интерфейсах

- Создание фракталов и других визуальных эффектов.

### В программировании компиляторов

- Рекурсивный спуск при синтаксическом анализе.

### Игры и решение головоломок

- Алгоритмы для Ханойской башни и других головоломок.
- Алгоритмы для игр с рекурсивной логикой.

## Преимущества и недостатки рекурсии

### Преимущества:

1. **Простота и чистота кода**: Рекурсивные решения часто более лаконичны и понятны.
2. **Прямое отображение математических определений**: Многие математические формулы естественно выражаются через
   рекурсию.

### Недостатки:

1. **Эффективность**: Рекурсивные вызовы могут быть менее эффективными и тратить больше ресурсов, особенно если
   отсутствует оптимизация хвостовой рекурсии.
2. **Ограничение стека**: Глубокие рекурсивные вызовы могут привести к переполнению стека.

### Заключение

Рекурсия – мощный инструмент, но важно понимать ее ограничения и уметь определять, когда лучше использовать итеративные
методы. В некоторых случаях комбинация рекурсии и мемоизации может предложить оптимальное решение, сохраняя простоту
рекурсивного подхода и повышая производительность.
</details>

<details>
<summary>Временная Сложность и Нотация "Большое О"</summary>

# Временная Сложность и Нотация "Большое О"

## Определение

**Большое О (O-нотация)** — это математическая нотация, используемая в информатике для описания ограничения сверху на
временную сложность алгоритма как функцию от размера входных данных. Она дает верхнюю границу времени выполнения,
показывая наихудший случай выполнения алгоритма.

Примеры

- `O(1)`: Время выполнения константно. Пример: доступ к элементу массива по индексу.
- `O(log n)`: Время выполнения растет логарифмически по отношению к размеру входных данных. Пример: бинарный поиск.
- `O(n)`: Время выполнения растет линейно с увеличением размера входных данных. Пример: линейный поиск.
- `O(n log n)`: Время выполнения растет линейно-логарифмически. Пример: сортировка слиянием.
- `O(n^2)`: Время выполнения растет квадратично. Пример: сортировка пузырьком.
- `O(2^n)`: Время выполнения растет экспоненциально. Пример: рекурсивное вычисление чисел Фибоначчи.

## Зачем Это Нужно

Понимание временной сложности алгоритмов позволяет программистам делать обоснованные выборы в отношении алгоритмов и
структур данных, что в свою очередь влияет на производительность и эффективность программ.

## Рекурсия и Большое О

В случае рекурсивных алгоритмов, Большое О может помочь понять, как изменится время выполнения с увеличением размера
входных данных и глубины рекурсии. Рекурсивные алгоритмы могут иметь высокую временную сложность из-за множественных
вызовов функций и использования дополнительной памяти в стеке вызовов.

## Важные Моменты

Большое О описывает наихудший случай: Важно понимать, что Большое О дает оценку наихудшего случая выполнения, а не
среднего или наилучшего.
Константы и Меньшие Слагаемые Игнорируются: В Большом О константы и меньшие слагаемые игнорируются.
Например, `O(2n + 5)`
упрощается до `O(n)`.
Заключение
Большое О является критически важным инструментом для оценки эффективности алгоритмов. Понимание временной сложности
алгоритма помогает программистам принимать обоснованные решения при выборе алгоритмов и структур данных, что, в свою
очередь, может значительно повлиять на производительность программы.

## Математическая сложность

- Константная сложность `O(1)`
  Это означает, что время выполнения алгоритма не зависит от размера входных данных. Независимо от того, насколько
  велики или малы входные данные, алгоритм будет выполняться за одинаковое количество времени. Примером может служить
  доступ к элементу массива по индексу.

- Линейная сложность `O(n)`
  Время выполнения алгоритма пропорционально размеру входных данных. Например, если у нас есть массив из n элементов, и
  мы хотим пройтись по всем элементам и что-то с ними сделать, время выполнения будет пропорционально n. Пример: поиск
  элемента в неотсортированном массиве.

- Степенная сложность `O(n^k)`, где `k` - константа
  Время выполнения алгоритма пропорционально размеру входных данных, возведенному в степень `k`. Это более медленно, чем
  линейная сложность, и часто встречается в алгоритмах с вложенными циклами. Пример: пузырьковая сортировка имеет
  сложность O(n^2).

- Логарифмическая сложность `O(log(n))`
  Время выполнения алгоритма пропорционально логарифму от размера входных данных. Это означает, что при увеличении
  входных данных в k раз, время выполнения увеличится только на константу. Пример: бинарный поиск в отсортированном
  массиве.

- Факториальная сложность `O(n!)`
  Время выполнения алгоритма растет факториально с увеличением размера входных данных. Это одна из самых медленных форм
  роста времени выполнения, и такие алгоритмы становятся непрактичными даже при относительно небольших значениях n.
  Пример: решение задачи коммивояжера методом полного перебора всех возможных маршрутов.

Каждый из этих типов сложности описывает, как время выполнения алгоритма изменяется в зависимости от размера входных
данных, и помогает разработчикам понять, какой алгоритм лучше всего подходит для решения конкретной задачи.

![img.png](img.png)


<details>
<summary>Пример кода</summary>

```java

public class BigOExamples {

    /**
     * Константная сложность O(1).
     * Возвращает элемент по индексу из массива.
     * Сложность O(1), так как операция получения элемента по индексу всегда выполняется за одно и то же время,
     * независимо от размера массива.
     */
    public static int constantTime(int[] array, int index) {
        return array[index];
    }

    /**
     * Линейная сложность O(n).
     * Считает сумму всех элементов массива.
     * Сложность O(n), так как необходимо пройти по всем элементам массива ровно один раз.
     */
    public static int linearTime(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * Квадратичная сложность O(n^2).
     * Считает сумму всех возможных пар элементов массива.
     * Сложность O(n^2), так как используется вложенный цикл, и для каждого элемента массива выполняется
     * операция со всеми элементами массива.
     */
    public static int quadraticTime(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i] + array[j];
            }
        }
        return sum;
    }

    /**
     * Логарифмическая сложность O(log n).
     * Бинарный поиск элемента в отсортированном массиве.
     * Сложность O(log n), так как на каждом шаге алгоритм сокращает область поиска вдвое.
     */
    public static int logarithmicTime(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == key) {
                return mid;
            }
            if (sortedArray[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // элемент не найден
    }

    /**
     * Линейно-логарифмическая сложность O(n log n).
     * Алгоритм сортировки слиянием (Merge Sort).
     * Сложность O(n log n), так как массив делится пополам (логарифмическая часть), а затем элементы
     * сливаются обратно (линейная часть).
     */
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    /**
     * Экспоненциальная сложность O(2^n).
     * Подсчёт n-го числа Фибоначчи через рекурсию.
     * Сложность O(2^n), так как каждый вызов функции вызывает два дополнительных вызова,
     * образуя дерево вызовов, количество которых удваивается на каждом шаге.
     */
    public static int exponentialTime(int n) {
        if (n <= 1) {
            return n;
        }
        return exponentialTime(n - 1) + exponentialTime(n - 2);
    }

    /**
     * Факториальная сложность O(n!).
     * Подсчёт факториала числа n через рекурсию.
     * Сложность O(n!), так как для вычисления факториала нужно выполнить n рекурсивных вызовов,
     * где каждый вызов порождает уменьшение задачи на единицу.
     */
    public static long factorialTime(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialTime(n - 1);
    }
}


```

</details>
</details>
</details>