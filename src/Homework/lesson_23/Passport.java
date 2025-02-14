package Homework.lesson_23;
/*Часть 1: Ограничение прямого доступа с помощью private полей
🔹 В первых двух классах вам нужно сделать поля приватными и создать только геттеры для их получения.
🔹 У этих полей не должно быть сеттеров, то есть они доступны только для чтения после инициализации.

// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class Passport {
    private String passportNumber;
    private String holderName;
}
*/

public class Passport {
    //Класс Passport с приватными полями и геттерами

    private String passportNumber;
    private String holderName;

    //Конструктор для инициализации объекта
    public Passport(String passportNumber, String holderName) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
    }
    //Геттеры (без сеттеров)
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getHolderName() {
        return holderName;
    }
}






