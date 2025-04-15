package Homerwork.ProjektSinema;

/**
 * Интерфейс ICinemaHall предоставляет контракт для класса, представляющего кинозал в системе управления кинотеатром.
 */
public interface ICinemaHall {

    int getHallNumber();

    int getCapacity();

    String gethallType();

    void setHallNumber(int hallNumber);

    void setCapacity(int capacity);

    void setHallType(String hallType);
}
