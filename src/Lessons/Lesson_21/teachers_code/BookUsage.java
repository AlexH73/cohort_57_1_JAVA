package Lessons.Lesson_21.teachers_code;

public class BookUsage {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.title = "1983";
        book1.author = "George Orwell";
        book1.pages = 328;

        Book book2 = new Book();

        book2.title = "Brave New World";
        book2.author = "Aldous Huxley";
        book2.pages = 311;

        System.out.println("book1.title = " + book1.title);
        System.out.println("book1.author = " + book1.author);
        System.out.println("book1.pages = " + book1.pages);
        System.out.println("book1 = " + book1);

        book1.title = "1984";

        System.out.println("book1.title = " + book1.title);
        System.out.println("book1.author = " + book1.author);
        System.out.println("book1.pages = " + book1.pages);
        System.out.println("book1 = " + book1);

        String book1Info = showBookInfo(book1);

        System.out.println("book1 = " + book1Info);

        System.out.println("book2.showInfo() = " + book2.showInfo());


    }

    public static String showBookInfo(Book randomBook) {
        String info = "Title: " + randomBook.title + "\n" +
                "Author: " + randomBook.author + "\n" +
                "Pages: " + randomBook.pages;

        return info;

    }
}
