package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

public class Dog extends Animal{
    public void secure() {
        System.out.println(("Собака охраняет"));
    }

    public void dogVoice() {
        System.out.println(("Собака лает"));
    }

    // задание:
    // 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".

    @Override
    public void voice() {
        System.out.println(("Гав"));
    }
}
