package Lessons.Lesson_42.src.practice;

public class Report {
    // данные метод нарушает принцип единственной ответственности,
    // тк объединяет в себе более чем одну логику (логика создания отчета
    // и логика генерации отчета)
    public static void report() {
        // создание отчета:
        System.out.println("creating report");
        String report = "some context";

        // вторая логика "печать отчета":
        System.out.println(report);
    }

    //проблема единственной ответственности решена, тк теперь у меня 2 разных метода,
    // каждый из которых выполняет свою собственную логику.
    public static String getReport() {
        System.out.println("creating report");
        String report = "some context";

        return report;
    }

    public static void printReport(String report) {
        // сложная логика
        System.out.println(report);
    }
}
