package Homework.lesson_23;
/*
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;
}
*/
//Класс ImmutableConfig с приватными полями и геттерами
public class ImmutableConfig{

    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

    //Конструктор для инициализации объекта
    public  ImmutableConfig(String databaseUrl, int maxConnections, boolean isLoggingEnabled) {
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

}