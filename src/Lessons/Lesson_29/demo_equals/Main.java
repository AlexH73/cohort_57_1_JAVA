package Lessons.Lesson_29.demo_equals;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Person p1= new Person("Oleg", "Ivanov",20);
        Person p2= new Person("Oleg", "Ivanov",20);

        System.out.println("Они равны: " + p1.equals(p2) );

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Lena","Petrova",19));
        personList.add(new Person("Olga","Olgina",21));
        personList.add(new Person("Sergey","Sergeev",24));
        personList.add(new Person("Nikolay","Nikolaev",19));
        System.out.println(personList);
        System.out.println("-------------------------");

        boolean personExists = personList.contains(new Person("Olga","Olgina",21));
        System.out.println("Ольга присутствует:" +personExists);

        int index = personList.indexOf(new Person("Olga", "Olgina", 21));
        System.out.println("Индекс объекта: " + index);

        Integer i=10;

        List<Integer> qwe = new  ArrayList();
        qwe.add(10);
        qwe.add(11);
        qwe.add(155);

        System.out.println(i.hashCode());

    }
}