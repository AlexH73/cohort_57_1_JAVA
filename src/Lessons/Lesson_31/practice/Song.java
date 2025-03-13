package Lessons.Lesson_31.practice;

/**
 * Создайте класс Song с такими полями, как title (название песни) и artist (исполнитель).
 * При желании можно добавить дополнительные поля, например, album или duration.
 *
 * Переопределите методы equals() и hashCode() таким образом, чтобы две песни
 * считались одинаковыми, если у них совпадают основные характеристики (например, название и исполнитель).
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song =(Song) o;
        boolean isTitelEquals = this.getTitle().equals(song.getTitle());
        boolean isArtistEquals = this.getArtist().equals(song.getArtist());
        return isTitelEquals && isArtistEquals;
    }

    @Override
    public int hashCode() {
        int x = title.hashCode();
        int y = artist.hashCode();
        int songHash = x * y * 31;
        return  songHash;
    }
}
