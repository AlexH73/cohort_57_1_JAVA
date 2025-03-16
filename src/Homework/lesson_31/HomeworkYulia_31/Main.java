package Homework.lesson_31.HomeworkYulia_31;

public class Main {
    public static void main(String[] args) {
        CollectionOperationsHomeworkTest test = new CollectionOperationsHomeworkTest();

        System.out.println("Запуск всех тестов:");
        test.testCountDuplicatesInteger();
        test.testUnionOfIntegerLists();
        test.testIntersectionOfIntegerLists();
        test.testDifferenceOfIntegerLists();
        test.testAreIntegerElementsUnique();
        test.testCountDuplicatesString();
        test.testUnionOfStringLists();
        test.testIntersectionOfStringLists();
        test.testDifferenceOfStringLists();
        test.testAreStringElementsUnique();
        System.out.println("Все 10 тестов завершены!");
    }
}
