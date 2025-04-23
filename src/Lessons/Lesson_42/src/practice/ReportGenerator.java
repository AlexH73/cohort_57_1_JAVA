package Lessons.Lesson_42.src.practice;

import java.sql.*;

public class ReportGenerator {

    public void generateDailyReport() throws SQLException {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM daily_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }

    public void generateWeeklyReport() throws SQLException {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM weekly_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }

    public void generateMonthlyReport() throws SQLException {
        // Подключение к базе данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Выполнение запроса к базе данных
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM monthly_reports");
        // Обработка результатов запроса
        while (rs.next()) {
            // Логика отображения результатов
        }
        // Закрытие соединения
        connection.close();
    }
}