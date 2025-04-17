package Homework.lesson_23;

//[x] TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
// все корректно
class Passport {
    private String passportNumber;
    private String holderName;

    // Геттер для passportNumber
    public String getPassportNumber(){
        return passportNumber;
    }

    // Геттер для holderName
    public String getHolderName() {
        return holderName;
    }
}


