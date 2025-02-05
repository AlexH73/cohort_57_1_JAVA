package Practice.Practice_21;

public class AudioTrackUsage {
    public static void main(String[] args) {
        AudioTrack audioTrack1 = new AudioTrack();
        AudioTrack audioTrack2 = new AudioTrack();

        audioTrack1.artist = "Michael Jackson";
        audioTrack1.genre = "Pop";
        audioTrack1.title = "Thriller";
        audioTrack1.durationInSeconds = 350;

        audioTrack2.title = "Thunderstruck";
        audioTrack2.artist = "AC/DC";
        audioTrack2.genre = "Hard Rock, Bluesrock, Rock ’n’ Roll";
        audioTrack2.durationInSeconds = 292;

        System.out.println("Track 1:");
        System.out.println(audioTrack1);
        System.out.println(audioTrack1.displayTrackInfo());
        System.out.println("Track 2:");
        System.out.println(audioTrack2);
        System.out.println(audioTrack2.displayTrackInfo());

    }
}
