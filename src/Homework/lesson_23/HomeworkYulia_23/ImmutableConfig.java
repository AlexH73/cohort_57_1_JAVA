// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).

package Homework.lesson_23.HomeworkYulia_23;

class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

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
