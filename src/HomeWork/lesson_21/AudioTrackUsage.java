package HomeWork.lesson_21;

import javax.sound.midi.Track;

public class AudioTrackUsage {
    public static void main(String[] args) {
        AudioTrack track = new AudioTrack();

        track.artist = "Louis Armstrong";
        track.title = "Hello Dolly";
        track.durationInSeconds = 368;
        track.genre = "Jazz";

        AudioTrack track3 = new AudioTrack();

        track3.artist = "Madonna";
        track3.title = "La Isla Bonita";
        track3.durationInSeconds = 240;
        track3.genre = "Pop";

        AudioTrack track4 =new AudioTrack();

        track4.artist = "Eminem";
        track4.title = "Lose Yourself";
        track4.durationInSeconds = 323;
        track4.genre = "Hip-Hop/Rap";

        System.out.println("Track -- " + track);

        System.out.println("Artist: " + track.artist);
        System.out.println("Title: " + track.title);
        System.out.println("Track length:" + track.durationInSeconds);
        System.out.println("Genre: " + track.genre);


        System.out.println("Track showInfo: " + track.showInfo());

        System.out.println("Track toString: " + track.toString());

        System.out.println("Track length -- " + track.isLongTrack());

        System.out.println("Track length -- " + track.displayTrackInfo());

        System.out.println("-----Track 3-----");

        System.out.println("Artist: " + track3.artist);
        System.out.println("Title: " + track3.title);
        System.out.println("Track length: " + track3.durationInSeconds);
        System.out.println("Genre: " + track3.genre);

        System.out.println("Track showInfo: " + track3.showInfo());

        System.out.println("Track toString: " + track3.toString());

        System.out.println("Track length -- " + track3.isLongTrack());

        System.out.println("Track length -- " + track3.displayTrackInfo());

        System.out.println("-----Track 4-----");

        System.out.println("Artist: " + track4.artist);
        System.out.println("Title: " + track4.title);
        System.out.println("Track length: " + track4.durationInSeconds);
        System.out.println("Genre: " + track4.genre);

        System.out.println("Track showInfo: " + track4.showInfo());

        System.out.println("Track toString: " + track4.toString());

        System.out.println("Track length -- " + track4.isLongTrack());

        System.out.println("Track length -- " + track4.displayTrackInfo());

    }

}
