package Homework.lesson_34.OldVersion;

public class IncorrectFigureSizeException extends Exception {
    public IncorrectFigureSizeException(String message) {
        super(message); //super(message); — передаёт message в конструктор Exception, чтобы исключение хранило текст ошибки.
    }
}
