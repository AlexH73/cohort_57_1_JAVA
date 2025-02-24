package Homerwork.Practica.Practica21;
// 1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// 2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

public class AudioTrack {
    String title;
    String artist;
    int durationInSeconds;
    String genre;       //Новое поле для хранения музыкального жанра

    //Конструктор
    public AudioTrack(String title, String artist, int durationInSeconds, String genre) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
    }

    //Метод для отображения информации о треке
    public void displayTrackInfo() {
        System.out.println("Название: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Длительность: " + durationInSeconds + "секунд");
        System.out.println("Жанр: " + genre);
    }
}
