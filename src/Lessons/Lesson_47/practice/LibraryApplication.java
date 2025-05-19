package Lessons.Lesson_47.practice;

import Lessons.Lesson_47.practice.interfaces.AuthorRepository;
import Lessons.Lesson_47.practice.models.Author;
import Lessons.Lesson_47.practice.repositories.AuthorRepositoryImpl;

import java.io.IOException;
import java.util.Scanner;

// Слой представления
public class LibraryApplication {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в библиотеку!");

        try {
            AuthorRepository authorRepo = new AuthorRepositoryImpl(
                    "src/Lessons/Lesson_47/practice/db/authors.csv"
            );

            System.out.println("\nТекущий список авторов:");
            System.out.println(authorRepo.findAllAuthors());
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("\nВведите имя (или 'выход' для завершения): ");
                String firstName = scanner.nextLine().trim();

                if (firstName.equalsIgnoreCase("выход")) {
                    break;
                }

                if (firstName.equalsIgnoreCase("vyxod")) {
                    break;
                }

                if (firstName.equalsIgnoreCase("0")) {
                    break;
                }

                System.out.print("Введите фамилию: ");
                String lastName = scanner.nextLine().trim();

                int birthYear = readBirthYear(scanner);

                Author author = new Author(firstName, lastName, birthYear);
                authorRepo.addAuthor(author);
                System.out.println("✅ Автор успешно добавлен!");
            }
        }  catch (IOException e) {
            System.err.println("Ошибка файловой системы: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }

    private static int readBirthYear(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите год рождения: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Некорректный формат года. Используйте цифры.");
            }
        }
    }
}

