package Practice.Practice_21;

public class AutioTrackUsage {
    public static void main(String[] args) {
        AudioTrack track1 = new AudioTrack();
        track1.artist = "Michael Jackson";
        track1.title = "Thriller";
        track1.genre = "Pop";
        track1.durationInSeconds =  350 ;

        AudioTrack track2 = new AudioTrack();
        track1.artist = "Michael Jackson";
        track1.title = "Ghost";
        track1.genre = "Pop";
        track1.durationInSeconds = 312;

       // String track1Info = displayTrackInfo(track1) ;
       // String track2Info = displayTrackInfo(track2) ;
       // System.out.println("track1 =" + track1Info);
       // System.out.println("track2 =" + track2Info);
    }
    public static void displayTrackInfo(AudioTrack randomAudioTrack) {
        String info = "Title: " + randomAudioTrack.title + "\n" +
                "Artist: " + randomAudioTrack.artist + "\n" +
                "Genre: " + randomAudioTrack.genre + "\n" +
                "TrackLenght" + randomAudioTrack.durationInSeconds;

        //return info;

    }


}
