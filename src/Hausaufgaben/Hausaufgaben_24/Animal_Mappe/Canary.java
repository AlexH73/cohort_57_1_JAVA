package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

// наследуется не ваш класс, а мой


// лишняя работа
public class Canary extends Animal {
    public void fly() {
        System.out.println(("Fogel fliegt !"));
    }

    @Override
    public void feed() {
        System.out.println(("Fogel frist !"));
    }
    public void voice() {
        System.out.println(("Fogel singt !"));
    }
}
