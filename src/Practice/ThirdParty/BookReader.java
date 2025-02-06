package Practice.ThirdParty;

import java.util.Date;

public class BookReader {
    private String fullName;  // Полное имя читателя
    private int libraryCardNumber;  // Номер читательского билета
    private String faculty;  // Факультет
    private Date birthDate;  // Дата рождения
    private String phone;  // Телефон

    // Конструктор для инициализации всех полей
    public BookReader(String fullName, int libraryCardNumber, String faculty, Date birthDate, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
    }

    // Метод для взятия книг по количеству
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книг(и)");
    }

    // Метод для взятия книг по названиям
    public void takeBook(String... bookTitles) {
        System.out.println(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.println(title + ", ");
        }
        System.out.println();
    }

    // Метод для взятия книг по объектам класса Book
    public void takeBook(Book... books) {
        for (Book book : books) {
            System.out.println(book.getName() + ", ");
        }
        System.out.println();
    }

    // Метод для возврата книг по количеству
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книг(и)");
    }

    // Метод для возврата книг по названиям
    public void returnBook(String... bookTitles) {
        System.out.println(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.println(title + ", ");
        }
        System.out.println();
    }

    // Метод для возврата книг по объектам класса Book
    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.getName() + ", ");
        }
        System.out.println();
    }
}
