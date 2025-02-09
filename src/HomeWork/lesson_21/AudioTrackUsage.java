package HomeWork.lesson_21;

import javax.sound.midi.Track;

public class AudioTrackUsage {
    public static void main(String[] args) {
        AudioTrack track = new AudioTrack();

        track.artist = "Louis Armstrong";
        track.title = "Hello Dolly";
        track.durationInSeconds = 368;
        track.genre = "Jazz";

        AudioTrack track1 = new AudioTrack();

        track1.artist = "Madonna";
        track1.title = " La Isla Bonita";
        track1.durationInSeconds = 240;
        track1.genre = "Pop";

        AudioTrack track2 = new AudioTrack();

        track2.artist = "Eminem";
        track2.title = "Lose Yourself";
        track2.durationInSeconds = 323;
        track2.genre ="Hip-Hop/Rap";

        System.out.println("Artist = " + track.artist);
        System.out.println("Title = " + track.title);
        System.out.println("Track length =  " + track.durationInSeconds);
        System.out.println("Genre = " + track.genre);


        System.out.println("ShowInfo Track = " + track.showInfo());

        System.out.println("Track length = " + track.isLongTrack());

        System.out.println("Display info = " + track.displayTrackInfo());

        System.out.println("-------Track 1-------");

        System.out.println("Artist = " + track1.artist);
        System.out.println("Title = " + track1.title);
        System.out.println("Track length =  " + track1.durationInSeconds);
        System.out.println("Genre = " + track1.genre);

        System.out.println("ShowInfo Track = " + track1.showInfo());

        System.out.println("Track length = " + track1.isLongTrack());

        System.out.println("Display info = " + track1.displayTrackInfo());

        System.out.println("-------Track 2--------");

        System.out.println("Artist = " + track2.artist);
        System.out.println("Title = " + track2.title);
        System.out.println("track length =  " + track2.durationInSeconds);
        System.out.println("Genre = " + track2.genre);

        System.out.println("ShowInfo Track = " + track2.showInfo());

        System.out.println("Track length = " + track2.isLongTrack());

        System.out.println("Display info = " + track1.displayTrackInfo());



    }
}
