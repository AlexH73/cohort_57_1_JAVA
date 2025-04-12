package main_project.src.interfaces;

/**
 * Интерфейс IFilm предоставляет контракт для класса, представляющего фильм в системе управления кинотеатром.
 */
public interface IFilm {

    /**
     * Получить название фильма.
     *
     * @return Название фильма.
     */
    String getName();

    /**
     * Установить новое название фильма.
     *
     * @param name Новое название фильма.
     */
    void setName(String name);

    /**
     * Получить продолжительность фильма в минутах.
     *
     * @return Продолжительность фильма.
     */
    int getDuration();

    /**
     * Установить новую продолжительность фильма.
     *
     * @param duration Продолжительность фильма в минутах.
     */
    void setDuration(int duration);

    /**
     * Получить жанр фильма.
     *
     * @return Жанр фильма.
     */
    String getGenre();

    /**
     * Установить новый жанр фильма.
     *
     * @param genre Новый жанр фильма.
     */
    void setGenre(String genre);

    /**
     * Получить рейтинг фильма.
     *
     * @return Рейтинг фильма.
     */
    String getRating();

    /**
     * Установить новый рейтинг фильма.
     *
     * @param rating Новый рейтинг фильма.
     */
    void setRating(String rating);

    /**
     * Получить описание фильма.
     *
     * @return Описание фильма.
     */
    String getDescription();

    /**
     * Установить новое описание фильма.
     *
     * @param description Новое описание фильма.
     */
    void setDescription(String description);

    /**
     * Получить язык фильма.
     *
     * @return Язык фильма.
     */
    String getLanguage();

    /**
     * Установить новый язык фильма.
     *
     * @param language Новый язык фильма.
     */
    void setLanguage(String language);
}
