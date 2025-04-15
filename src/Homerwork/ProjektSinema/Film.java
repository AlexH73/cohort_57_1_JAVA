package Homerwork.ProjektSinema;
//Реализация Film

public class Film implements IFilm {
    private String name;
    private int duration;
    private String genre;
    private String rating;
    private String description;
    private String language;

    public Film(String name, int duration, String genre, String rating, String description, String language) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.language = language;
    }

    /**
     * Получить название фильма.
     * @return Название фильма.
     */
    @Override
    public String getName() {
        return "";
    }
    /**
     * Получить продолжительность фильма в минутах.
     * @return Продолжительность фильма.
     */
    @Override
    public int getDuration() {
        return duration;
    }
    /**
     * Получить жанр фильма.
     * @return Жанр фильма.
     */
    @Override
    public String getGenre() {
        return genre;
    }

    /**
     * Получить рейтинг фильма.
     * @return Рейтинг фильма.
     */
    @Override
    public String getRating() {
        return rating;
    }

    /**
     * @return Описание фильма.
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * Получить язык фильма.
     * @return Язык фильма.
     */
    @Override
    public String getLanguage() {
        return language;
    }

    /**
     * Установить новое название фильма.
     * @param name Новое название фильма.
     */
    @Override
    public void setName(String name) {
    }
    /**
     * Установить новую продолжительность фильма.
     * @param duration Продолжительность фильма в минутах.
     */
    @Override
    public void setDuration(int duration) {

    }

    /**
     * Установить новый жанр фильма.
     * @param genre Новый жанр фильма.
     */
    @Override
    public void setGenre(String genre) {

    }

    /**
     * Установить новый рейтинг фильма.
     * @param rating Новый рейтинг фильма.
     */
    @Override
    public void setRating(String rating) {

    }

    /**
     * Установить новое описание фильма.
     * @param description Новое описание фильма.
     */
    @Override
    public void setDescription(String description) {

    }

    /**
     * Установить новый язык фильма.
     * @param language Новый язык фильма.
     */
    @Override
    public void setLanguage(String language) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(IFilm film) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int get(int i) {
        return 0;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}




