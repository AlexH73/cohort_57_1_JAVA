//Задание 1: Доработка класса AudioTrack
//добавить новый метод isLongTrack(), который возвращает true, если длительность трека больше 300 секунд (5 минут), и false в противном случае.
//Изменить метод displayTrackInfo(), чтобы он также выводил результат метода isLongTrack().
//Протестировать класс, создав несколько объектов AudioTrack и вызвав все

package Homework.lesson_21.HomeworkYulia_21;

public class AudioTrack {

    String title;
    String artist;
    int durationInSeconds;
    String genre;// Duration in seconds


    public AudioTrack(String title, String artist, int durationInSeconds, String genre) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
    }

    public boolean isLongTrack() {
        return durationInSeconds > 300;
    }

    public void displayTrackInfo() {
        System.out.println("Название трека: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Жанр: " + genre);
        System.out.println("Длительность: " + durationInSeconds + " секунд");
        System.out.println("Длинный трек: " + (isLongTrack() ? "Да" : "Нет"));
        System.out.println("---------------------------");
    }
}

