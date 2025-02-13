package Lessons.Lesson_24.teachers_code.inheritance_encapsulation;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Parent parent = new Parent("example");

        System.out.println("parent.getName() = " + parent.getName());

        parent.setName("parent");
        System.out.println("parent.getName() = " + parent.getName());
    }
}
