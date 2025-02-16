package Hausaufgaben.Hausaufgaben_21.AudioTrack;
/*
Задание 1: Доработка класса AudioTrack.
Добавить новый метод isLongTrack(), который возвращает true, если длительность трека больше 300 секунд (5 минут), и false в противном случае.
Изменить метод displayTrackInfo(), чтобы он также выводил результат метода isLongTrack().
Протестировать класс, создав несколько объектов AudioTrack и вызвав все методы.
 */
public class AutioTrackUsage {
    public static void main(String[] args) {
        AudioTrack track1 = new AudioTrack();

        track1.artist = "Michael Jackson";
        track1.title = "Thriller";
        track1.genre = "Pop";
        track1.durationInSeconds =  350 ;
        System.out.println("track1 = " + track1);

        AudioTrack track2 = new AudioTrack();

        track2.artist = "Michael Jackson";
        track2.title = "Ghost";
        track2.genre = "Pop";
        track2.durationInSeconds = 312;
        System.out.println("track2 = " + track2);

        String track1Info = track1.displayTrackInfo();
        String track2Info = track2.displayTrackInfo();
        System.out.println("track1 =" + track1Info);
        System.out.println("track2 =" + track2Info);
    }

//    public static String displayTrackInfo(AudioTrack randomAudioTrack) {
//        String info = "Title: " + randomAudioTrack.title + "\n" +
//                "Artist: " + randomAudioTrack.artist + "\n" +
//                "Genre: " + randomAudioTrack.genre + "\n" +
//                "TrackLenght" + randomAudioTrack.durationInSeconds +
//                randomAudioTrack.isLongTrack();
//
//        return info;
//    }
}

