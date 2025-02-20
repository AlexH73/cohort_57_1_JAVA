package Lessons.Lesson_21.teachers_code;

public class Book {
    String title;
    String author;
    int pages;

    public Book() {
    }

    public Book(String title) {
        if (title == null || title.isBlank()) {
            System.err.println("название не может быть пустым!!");
        }
        this.title = title;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String showInfo() {
        String info = "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Pages: " + pages;

        return info;
    }

    @Override
    public String toString() {
        return "Book{" + "Title: " + title +
                " Author: " + author +
                "}";
    }
}
