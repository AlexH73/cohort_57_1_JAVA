package Homework.Homework_21;

// TODO: Доработать класс AudioTrack
// [х]1. Добавить новое поле `genre` (String) для хранения музыкального жанра.
// [х]2. Создать метод `displayTrackInfo()`, который выводит всю информацию о треке.

class AudioTrack {
    // Поля класса для хранения информации о треке
    String title;  // Название трека
    String artist; // Исполнитель трека
    String genre;  // Жанр трека
    int durationInSeconds; // Длительность трека в секундах

    // Метод для проверки, является ли трек длинным (более 300 секунд)
    public boolean isLongTrack() {
        return durationInSeconds > 300;
    }

    // Метод для отображения информации о треке
    public String displayTrackInfo() {
        // Формируем строку с информацией о треке
        String tracksInfo = "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Genre: " + genre + "\n" +
                "Duration: " + durationInSeconds + "s\n" +
                "Long track: " + isLongTrack();

        // Возвращаем сформированную строку
        return tracksInfo;

    }

    // Переопределение метода toString() для удобного вывода информации о треке
    @Override
    public String toString() {
        // Формируем строку с информацией о треке
        return "AudioTrack{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + durationInSeconds + "s" +
                ", long=" + isLongTrack() +
                "}";

    }
}


