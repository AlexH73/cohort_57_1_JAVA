package Practice.Practice_21;

public class AutioTrackUsage {
    public static void main(String[] args) {
        AudioTrack track1 = new AudioTrack();
        track1.artist = "Michael Jackson";
        track1.title = "Thriller";
        track1.genre = "Pop";
        track1.durationInSeconds = " 350 ";
    }
    public static void displayTrackInfo(AudioTrack randomAudioTrack) {
        String info = "Title: " + randomAudioTrack.title + "\n" +
                "Artist: " + randomAudioTrack.artist + "\n" +
                "Genre: " + randomAudioTrack.genre + "\n" +
                "TrackLenght" + randomAudioTrack.durationInSeconds;

        return info;

    }


}
