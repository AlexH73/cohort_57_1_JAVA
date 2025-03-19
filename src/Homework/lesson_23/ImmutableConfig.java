package Homework.lesson_23;

// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

    public ImmutableConfig(String databaseUrl, int maxConnections, boolean isLoggingEnabled) {
        this.databaseUrl = databaseUrl;
        this.maxConnections = maxConnections;
        this.isLoggingEnabled = isLoggingEnabled;
    }

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
