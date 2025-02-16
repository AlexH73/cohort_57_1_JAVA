package Hausaufgaben.Hausaufgaben_21.AudioTrack;

// TODO: Доработать класс AudioTrack
// TODO: Добавить поле `genre`
// TODO: Реализовать метод `displayTrackInfo()`

// 1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// 2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

class AudioTrack {
    String title;
    String artist;
    String genre;
    double durationInSeconds;

    public String displayTrackInfo() {
        String info = "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Genre: " + genre + "\n" +
                "Track Length" + durationInSeconds;
        return info;
    }

    boolean isLongTrack() {
        if (durationInSeconds >= 300) {
            return true;
        } else {
            System.out.println("Dieser Track ist nur %d lang!");
        }
        return false;
    }
}


