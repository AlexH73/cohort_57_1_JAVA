package Lessons.Lesson_24.teachers_code.inheritance_encapsulation;

public class Child extends Parent{

    public Child() {

        // так как в родительском классе есть лишь один конструктор,
        // использование этого контсруктора становится обязательным.
        // В данном примере использована "заглушка", в которой имеется
        // конструктор Child(), но внутри него вызывается родительский конструктор,
        // что эквивалентно super("child") = new Parent("child")
        super("child");
    }

    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("child.getName() = " + child.getName());

        // приватные методы не наследуются! Приватные поля класса не наследуются!
        // У наследника нет прямого доступа к ним!
        // метод setName в родительском классе Parent - приватный.
        // Это означает, что он не наследуется, если попытаться вызвать этот метод, то возникнет ошибка.
        // child.setName("name");

    }
}
