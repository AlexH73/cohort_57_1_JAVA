package Homework.lesson_23;

//[x] TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

    // Геттер для databaseUrl
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    // Геттер для maxConnections
    public int getMaxConnections() {
        return maxConnections;
    }

    // Геттер для isLoggingEnabled
    public boolean getIsLoggingEnabled() {
        return isLoggingEnabled;
    }
}

