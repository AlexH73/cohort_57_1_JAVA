package Homework.lesson_21;

public class AudioTrackTest {
    public static void main(String[] args) {
        //Создадим объекты AudioTrack
        AudioTrack track1 = new AudioTrack("Yesterday", "The Beatles", 125);
        AudioTrack track2 = new AudioTrack("Stairway to Heaven","Led Zeppelin", 482);
        AudioTrack track3 = new AudioTrack("Bohemian Rhapsody","Queen", 354);

        //Вызываем метод и проверяем вывод
        track1.displayTrackInfo();
        track2.displayTrackInfo();
        track3.displayTrackInfo();

    }
}
