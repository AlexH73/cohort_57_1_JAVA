<details style="padding-top: 18px">
  <summary><b>Homework: </b></summary>

- finish previous homework

- [learn the rules of Java code design](https://skillbox.ru/media/base/java_code_style_kak_pravilno_oformlyat_kod_java/)


- fix code below using code style rules:

```java
public class calculator{
public int addNumbers(int[]nums){
int sum=0;
for(int i=0;i<nums.length;i++){
sum=sum+nums[i];
}
return sum;
}
public static void main(String args[]){
calculator calc=new calculator();
int result=calc.addNumbers(new int[]{1,2,3,4});
System.out.println("Сумма: "+result);
}
}
```

```java
public class arrayUtils{
public int findMax(int[]arr){
int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
}
return max;
}
public static void main(String[] args){
arrayUtils a=new arrayUtils();
int m=a.findMax(new int[]{5,3,8,1});
System.out.println("Max: "+m);
}
}
```

```java
public class SimpleCounter{
public void count(){
for(int i=1;i<=10;i++){
if(i%2==0)
System.out.println(i+" is even");
else
System.out.println(i+" is odd");
}
}
public static void main(String args[]){
SimpleCounter sc=new SimpleCounter();
sc.count();
}
}
```

```java
/**
MessyPerson - A class representing a person, with messy formatting.
Incorrect Javadoc: no proper line breaks and extra spaces.
*/
public class MessyPerson {
    
    String name;
    
    int  age;
    public MessyPerson( String name , int age ){
        this.name = name;
        this.age = age;
    }
    
    public void display( ){
        System.out.println("Name:"+ name +"    Age:"+ age );
    }
    
    
    public static void main(String[] args){
        MessyPerson   p = new MessyPerson("Alice" , 25);
        p.display();}
    
    
}
```

```java
/**
 * MESSY_Class
 * Данный класс демонстрирует:
 * - неиспользуемый код в виде комментариев
 * - некорректные отступы
 * - неверный нейминг (нижние подчеркивания, ALL_CAPS для методов)
 */
public class MESSY_Class {
    public static final int MAX_VALUE = 100; // константа (можно оставить, но ниже покажем нарушения)
    
    // Переменная с нижним подчеркиванием (по стандарту должно быть myVar)
    private int my_var=10;
    
    // Метод с неправильным именованием (по стандарту - lowerCamelCase)
    public void DO_SOMETHING(){
        System.out.println("Doing something...");
    }
    
    // Закомментированный неиспользуемый код, который загромождает класс
    /*
    public void unusedMethod(){
    System.out.println("This method is not used");
    }
    */
    
    // Метод с плохими отступами и некорректным именованием (должно быть calculateSum)
    public int Calculate_Sum( int a,int b){
      int sum=a+b;  // неправильный отступ и отсутствие пробелов вокруг оператора +
        // Неиспользуемый код:
        // int temp=a*b;
      return sum;
    }
    
    public static void main(String[] args){
         MESSY_Class  obj = new MESSY_Class(); 
         obj.DO_SOMETHING();
         int result=obj.Calculate_Sum(5,10);
         System.out.println("Result: " + result);
         
         // Неиспользуемый цикл, оставленный в комментарии
         // for(int i=0;i<MAX_VALUE;i++){
         //     System.out.println("Value: " + i);
         // }
    }
}
```
</details>


------

<details style="padding-top: 18px">
  <summary><b>Домашнее задание:</b></summary>

- Завершить предыдущее дз

- [изучить правила оформления кода Java](https://skillbox.ru/media/base/java_code_style_kak_pravilno_oformlyat_kod_java/)

- исправить код, согласно кодстайлу:

```java
public class calculator{
public int addNumbers(int[]nums){
int sum=0;
for(int i=0;i<nums.length;i++){
sum=sum+nums[i];
}
return sum;
}
public static void main(String args[]){
calculator calc=new calculator();
int result=calc.addNumbers(new int[]{1,2,3,4});
System.out.println("Сумма: "+result);
}
}
```

```java
public class arrayUtils{
public int findMax(int[]arr){
int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
}
return max;
}
public static void main(String[] args){
arrayUtils a=new arrayUtils();
int m=a.findMax(new int[]{5,3,8,1});
System.out.println("Max: "+m);
}
}
```

```java
public class SimpleCounter{
public void count(){
for(int i=1;i<=10;i++){
if(i%2==0)
System.out.println(i+" is even");
else
System.out.println(i+" is odd");
}
}
public static void main(String args[]){
SimpleCounter sc=new SimpleCounter();
sc.count();
}
}
```

```java
/**
MessyPerson - A class representing a person, with messy formatting.
Incorrect Javadoc: no proper line breaks and extra spaces.
*/
public class MessyPerson {
    
    String name;
    
    int  age;
    public MessyPerson( String name , int age ){
        this.name = name;
        this.age = age;
    }
    
    public void display( ){
        System.out.println("Name:"+ name +"    Age:"+ age );
    }
    
    
    public static void main(String[] args){
        MessyPerson   p = new MessyPerson("Alice" , 25);
        p.display();}
    
    
}
```

```java
/**
 * MESSY_Class
 * Данный класс демонстрирует:
 * - неиспользуемый код в виде комментариев
 * - некорректные отступы
 * - неверный нейминг (нижние подчеркивания, ALL_CAPS для методов)
 */
public class MESSY_Class {
    public static final int MAX_VALUE = 100; // константа (можно оставить, но ниже покажем нарушения)
    
    // Переменная с нижним подчеркиванием (по стандарту должно быть myVar)
    private int my_var=10;
    
    // Метод с неправильным именованием (по стандарту - lowerCamelCase)
    public void DO_SOMETHING(){
        System.out.println("Doing something...");
    }
    
    // Закомментированный неиспользуемый код, который загромождает класс
    /*
    public void unusedMethod(){
    System.out.println("This method is not used");
    }
    */
    
    // Метод с плохими отступами и некорректным именованием (должно быть calculateSum)
    public int Calculate_Sum( int a,int b){
      int sum=a+b;  // неправильный отступ и отсутствие пробелов вокруг оператора +
        // Неиспользуемый код:
        // int temp=a*b;
      return sum;
    }
    
    public static void main(String[] args){
         MESSY_Class  obj = new MESSY_Class(); 
         obj.DO_SOMETHING();
         int result=obj.Calculate_Sum(5,10);
         System.out.println("Result: " + result);
         
         // Неиспользуемый цикл, оставленный в комментарии
         // for(int i=0;i<MAX_VALUE;i++){
         //     System.out.println("Value: " + i);
         // }
    }
}
```
</details>