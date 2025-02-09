package HomeWork.lesson_21;

public class AudioTrack {
    String artist;
    String title;
    int durationInSeconds;
    String genre;

    public String showInfo() {
        String info = "Artist: " + artist + "\n" +
                "Title: " + title + "\n" +
                "Duration Track: " + durationInSeconds + "\n" +
                "Genre. " + genre;

        return info;
    }

    public String toString() {
        return "Audio Track = " + "Artist: " + artist +
                "Title: " + title +
                "Duration Track: " + durationInSeconds +
                "Genre: " + genre;
    }

    public Boolean isLongTrack() {
        return durationInSeconds < 300;
    }

    public Boolean displayTrackInfo() {
         return durationInSeconds < 300;
    }

}





