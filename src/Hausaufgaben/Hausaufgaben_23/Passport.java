package Hausaufgaben.Hausaufgaben_23;

// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
public class Passport {
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


