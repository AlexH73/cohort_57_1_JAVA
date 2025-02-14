package Homework.lesson_23;

public class ImmutableConfigTest {
    public static void main(String[] args) {
        //Создаем объект ImmutableConfig
        ImmutableConfig config;
        config = new ImmutableConfig();

        //Выводим конфигурацию
        System.out.println("\n Конфигурация:");
        System.out.println("URL базы данных: " + config.getDatabaseUrl());
        System.out.println("Максимальное число подключений: " + config.getMaxConnections());
        System.out.println("Логирование включено: " + config.isLoggingEnabled());
    }
}
