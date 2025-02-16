package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

// лишняя работа
public class Cat extends Animal{
    public void hunt() {
        System.out.println(("Кот охотиться"));
    }

    @Override
    public void feed() {
        System.out.println(("кот ест"));
    }
}
