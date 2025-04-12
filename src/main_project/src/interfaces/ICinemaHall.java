package main_project.src.interfaces;

/**
 * Интерфейс ICinemaHall предоставляет контракт для класса, представляющего кинозал в системе управления кинотеатром.
 */
public interface ICinemaHall {

    /**
     * Получить номер кинозала.
     *
     * @return Номер кинозала.
     */
    int getHallNumber();

    /**
     * Установить новый номер кинозала.
     *
     * @param hallNumber Новый номер кинозала.
     */
    void setHallNumber(int hallNumber);

    /**
     * Получить вместимость кинозала.
     *
     * @return Вместимость кинозала.
     */
    int getCapacity();

    /**
     * Установить новую вместимость кинозала.
     *
     * @param capacity Новая вместимость кинозала.
     */
    void setCapacity(int capacity);

    /**
     * Получить тип кинозала.
     *
     * @return Тип кинозала (например, 2D, 3D, IMAX).
     */
    // enum getHallType();

    /**
     * Установить новый тип кинозала.
     *
     * @param hallType Новый тип кинозала.
     */
    // void setHallType(enum hallType);
}
