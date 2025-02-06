package Practice.ThirdParty;

import java.util.Date;

public class BookLibrary {
    public static void main(String[] args) {
        // Создание массива объектов класса BookReader
        BookReader[] readers = {
                new BookReader("Петров В. В.", 12345, "Факультет информационных технологий", new Date(), "123-456-7890"),
                new BookReader("Иванов И. И.", 67890, "Факультет прикладной математики", new Date(), "098-765-4321"),
                new BookReader("Сидоров А. А.", 11223, "Факультет физики", new Date(), "234-567-8901"),
                new BookReader("Кузнецов М. М.", 44556, "Факультет химии", new Date(), "345-678-9012")
        };

        // Создание массива объектов класса Book
        Book[] books = {
                new Book("Приключения", "Автор 1"),
                new Book("Словарь", "Автор 2"),
                new Book("Энциклопедия", "Автор 3"),
                new Book("Роман", "Автор 4"),
                new Book("Научная фантастика", "Автор 5")
        };

        // Вызов перегруженных методов takeBook для каждого объекта Reader
        for (BookReader reader : readers) {
            reader.takeBook(3);  // Взятие 3 книг
            reader.takeBook("Приключения", "Словарь", "Энциклопедия");  // Взятие книг по названиям
            reader.takeBook(books);  // Взятие книг по объектам класса Book
        }

        // Вызов перегруженных методов returnBook для каждого объекта Reader
        for (BookReader reader : readers) {
            reader.returnBook(3);  // Возврат 3 книг
            reader.returnBook("Приключения", "Словарь", "Энциклопедия");  // Возврат книг по названиям
            reader.returnBook(books);  // Возврат книг по объектам класса Book
        }

    }
}
