package Hausaufgaben.Hausaufgaben_21.AudioTrack;


    // TODO: Доработать класс AudioTrack
// 1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// 2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

class AudioTrack {
    String title;
    String artist;
    String genre;
    int durationInSeconds;

    public String displayTrackInfo() {
        String info = "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Genre: " + genre + "\n" +
               "TrackLenght" + durationInSeconds;

        return info;
    }

        // TODO: Добавить поле `genre`

        // TODO: Реализовать метод `displayTrackInfo()`
}

