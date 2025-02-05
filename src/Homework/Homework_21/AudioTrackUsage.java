package Homework.Homework_21;


public class AudioTrackUsage {
    /**
     Добавить новый метод isLongTrack(), который возвращает true,
     если длительность трека больше 300 секунд (5 минут), и false в противном случае.
     Изменить метод displayTrackInfo(), чтобы он также выводил результат метода isLongTrack().
     Протестировать класс, создав несколько объектов AudioTrack и вызвав все методы.
     */
    public static void main(String[] args) {
        // Создаем объект audioTrack1 и устанавливаем значения для его полей
        AudioTrack audioTrack1 = new AudioTrack();
        audioTrack1.title = "Deutschland";
        audioTrack1.artist = "Rammstein";
        audioTrack1.genre = "Neue Deutsche Härte";
        audioTrack1.durationInSeconds = 323; // 5m 23s

        // Создаем объект audioTrack2 и устанавливаем значения для его полей
        AudioTrack audioTrack2 = new AudioTrack();
        audioTrack2.title = "Thunderstruck";
        audioTrack2.artist = "AC/DC";
        audioTrack2.genre = "Hard Rock, Bluesrock, Rock ’n’ Roll";
        audioTrack2.durationInSeconds = 292; // Короткий трек

        // Создаем объект audioTrack3 и устанавливаем значения для его полей
        AudioTrack audioTrack3 = new AudioTrack();
        audioTrack3.title = "Bohemian Rhapsody";
        audioTrack3.artist = "Queen";
        audioTrack3.genre = "Rock";
        audioTrack3.durationInSeconds = 354; // 5m 54s

        // Создаем объект audioTrack4 и устанавливаем значения для его полей
        AudioTrack audioTrack4 = new AudioTrack();
        audioTrack4.title = "Smells Like Teen Spirit";
        audioTrack4.artist = "Nirvana";
        audioTrack4.genre = "Grunge";
        audioTrack4.durationInSeconds = 301; // Пограничное значение

        // Создаем объект audioTrack5 и устанавливаем значения для его полей
        AudioTrack audioTrack5 = new AudioTrack();
        audioTrack5.title = "Happy";
        audioTrack5.artist = "Pharrell Williams";
        audioTrack5.genre = "Pop";
        audioTrack5.durationInSeconds = 233; // Короткий трек

        // Создаем объект audioTrack6 и устанавливаем значения для его полей
        AudioTrack audioTrack6 = new AudioTrack();
        audioTrack6.title = "November Rain";
        audioTrack6.artist = "Guns N' Roses";
        audioTrack6.genre = "Rock Ballad";
        audioTrack6.durationInSeconds = 300; // Ровно 5 минут

        // Создаем объект audioTrack7 и устанавливаем значения для его полей
        AudioTrack audioTrack7 = new AudioTrack();
        audioTrack7.title = "Around the World";
        audioTrack7.artist = "Daft Punk";
        audioTrack7.genre = "Electronic";
        audioTrack7.durationInSeconds = 425; // Длинный трек

        // Выводим информацию обо всех треках
        System.out.println("\nВсе треки:");
        AudioTrack[] testTracks = {audioTrack1, audioTrack2, audioTrack3, audioTrack4, audioTrack5, audioTrack6, audioTrack7};

        // Используем цикл для вывода информации о каждом треке
        for (int i = 0; i < testTracks.length; i++) {
            System.out.println("\nТрек " + (i + 1) + ":");
            // Вызываем метод displayTrackInfo() для вывода информации о треке
            System.out.println(testTracks[i].displayTrackInfo());
            // Закомментированная строка, которая выводила информацию о том, является ли трек длинным
            // System.out.println("Длинный трек? " + testTracks[i].isLongTrack());
            // Вызываем метод toString() для вывода информации о треке
            System.out.println("toString: " + testTracks[i]);
        }
    }
}