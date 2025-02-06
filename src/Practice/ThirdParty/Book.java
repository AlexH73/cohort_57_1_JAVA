package Practice.ThirdParty;

public class Book {
    private String name;  // Название книги
    private String autor;  // Автор книги

    // Конструктор для инициализации названия и автора книги
    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    // Геттер для получения названия книги
    public String getName(){
        return name;
    }

    // Геттер для получения автора книги
    public String getAutor() {
        return autor;
    }

    // Переопределение метода toString для удобного вывода информации о книге
    @Override
    public String toString() {
        return name + " (" + autor + ")";
    }
}
