package Homework.lesson_21;
/*Задание 1: Доработка класса AudioTrack
Добавить новый метод isLongTrack(), который возвращает true, если длительность трека больше 300 секунд (5 минут), и false в противном случае.
Изменить метод displayTrackInfo(), чтобы он также выводил результат метода isLongTrack().
Протестировать класс, создав несколько объектов AudioTrack и вызвав все методы.*/

public class AudioTrack {
    String title;
    String artist;
    int durationInSeconds;  //Длительность в секундах

    //Конструктор
    public AudioTrack(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
    //Метод проверки длительности трека
    public boolean isLongTrack() {
        return durationInSeconds > 300;
    }
    //Метод вывода информации о треке
    public void displayTrackInfo() {
        System.out.println("Название: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Длительность трека: " + durationInSeconds + "секунд");
        System.out.println( "-----------------------");
    }
}
