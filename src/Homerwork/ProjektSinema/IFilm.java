package Homerwork.ProjektSinema;

/**
 * Интерфейс IFilm предоставляет контракт для класса, представляющего фильм в системе управления кинотеатром.
 */
public interface IFilm {


    void setName(String name);

    String getName();

    int getDuration();

    void setDuration(int duration);

    void setGenre(String genre);

    String getRating();

    void setRating(String rating);

    String getGenre();

    String getDescription();

    void setDescription(String description);

    String getLanguage();

    void setLanguage(String language);

    boolean isEmpty();

    void add(IFilm film);

    int size();

    void remove(int i);

    int get(int i);
}
