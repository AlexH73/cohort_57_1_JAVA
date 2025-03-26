package Lessons.Lesson_34.code.practice;

// данный класс, используется в качестве класса-предупреждения,
// когда пытаемся установить некорректное значение для этажа в здании
public class IncorrectFloorNumberException extends Exception {
    public IncorrectFloorNumberException(String message) {
        super("IncorrectFloorNumberException: " + message);
    }


}
