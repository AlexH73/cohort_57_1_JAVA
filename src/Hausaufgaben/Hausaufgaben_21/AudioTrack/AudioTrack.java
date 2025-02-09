package Hausaufgaben.Hausaufgaben_21.AudioTrack;


    // TODO: Доработать класс AudioTrack
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
                "TrackLenght" + durationInSeconds;

        return info;
    }

    boolean isLongTrack() {
        if (durationInSeconds >= 300) {
            return true;
        } else {
            System.out.println("DieserTrack ist nur %d lang!");
        }
        return false;
    }
}


        // TODO: Добавить поле `genre`

        // TODO: Реализовать метод `displayTrackInfo()`


