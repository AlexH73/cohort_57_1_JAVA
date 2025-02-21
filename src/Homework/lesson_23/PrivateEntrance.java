package Homework.lesson_23;
/*Часть 1: Ограничение прямого доступа с помощью private полей
🔹 В первых двух классах вам нужно сделать поля приватными и создать только геттеры для их получения.
🔹 У этих полей не должно быть сеттеров, то есть они доступны только для чтения после инициализации.

// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class Passport {
    private String passportNumber;
    private String holderName;
}
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;
}
*/
public class PrivateEntrance {
    //Класс Passport с приватными полями и геттерами

class Passport {
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
//Класс ImmutableConfig с приватными полями и геттерами
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;
}/*
//Конструктор для инициализации объекта
    public void ImmutableConfig(String databaseUrl, int maxConnections, boolean isLoggingEnabled) {
         this.databaseUrl = databaseUrl;
         this.maxConnections = maxConnections;
         this.isLoggingEnabled = isLoggingEnabled;
}
//геттеры (без сеттеров)
public String getDatabaseUrl() {
    return databaseUrl;
}
public int getMaxConnections() {
    return maxConnections;
}
public boolean isLoggingEnabled() {
    return isLoggingEnabled;
}
*/
}