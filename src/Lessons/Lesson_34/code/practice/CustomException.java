package Lessons.Lesson_34.code.practice;

// Определение пользовательского исключения
public class CustomException extends Exception {
    // Конструктор, принимающий сообщение об ошибке
    public CustomException(String message) {
        super(message); // Вызов конструктора базового класса Exception
    }
}
