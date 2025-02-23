package Homework.lesson_23;

// Часть 1: Ограничение прямого доступа с помощью private полей
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class Passport {
    private String passportNumber;
    private String holderName;

    public Passport(String passportNumber, String holderName) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}
