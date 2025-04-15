package Lessons.Lesson_24.teachers_code.animal_example;

public class Dog extends AnimalUsage {
    public void secure() {
        System.out.println("Собака охраняет");
    }

    public void dogVoice() {
        System.out.println("Собака лает");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
