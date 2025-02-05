package Practice.Practice_21;

// TODO: Доработать класс AudioTrack
// [х]1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// [х]2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

class AudioTrack {
    String title;
    String artist;
    String genre;
    int durationInSeconds;


    public String displayTrackInfo() {
        String tracksInfo = "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Genre: " + genre + "\n" +
                "Duration: " + durationInSeconds + "s\n";

        return tracksInfo;

    }
    @Override
    public String toString() {
        return "AudioTrack{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + durationInSeconds + "s" +
                "}";

    }
}
