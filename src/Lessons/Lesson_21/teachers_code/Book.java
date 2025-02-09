package Lessons.Lesson_21.teachers_code;

public class Book {
    String title;
    String author;
    int pages;

    public String showInfo() {
        String info = "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Pages: " + pages;

        return info;
    }

    @Override
    public String toString() {
        return "Book{" + "Title: " + title  +
                " Author: " + author  +
                 "}";
    }
}
