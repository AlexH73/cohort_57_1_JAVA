// Часть 1: Ограничение прямого доступа с помощью private полей
//🔹 В первых двух классах вам нужно сделать поля приватными и создать только геттеры для их получения.
//🔹 У этих полей не должно быть сеттеров, то есть они доступны только для чтения после инициализации.
//
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).


package Homework.lesson_23.HomeworkYulia_23;

public class Passport {
    private String passportNumber;
    private String holderName;

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}
