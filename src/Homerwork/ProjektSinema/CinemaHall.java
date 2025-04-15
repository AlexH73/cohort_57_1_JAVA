package Homerwork.ProjektSinema;

public class CinemaHall implements ICinemaHall {
    private int hallNumber;
    private int hallCapacity;
    private String hallType;

    public CinemaHall(int hallNumber, int hallCapacity, String hallType) {
        this.hallNumber = hallNumber;
        this.hallCapacity = hallCapacity;
        this.hallType = hallType;
    }

    /**
     * Получить номер кинозала.
     * @return Номер кинозала.
     */
    @Override
    public int getHallNumber() {
        return hallNumber;
    }
    /**
     * Получить вместимость кинозала.
     *
     * @return Вместимость кинозала.
     */
    @Override
    public int getCapacity() {
        return hallCapacity;
    }

    /**
     * Получить тип кинозала.
     *
     * @return Тип кинозала (например, 2D, 3D, IMAX).
     */
    @Override
    public String gethallType() {
        return hallType;
    }
    /**
     * Установить новый номер кинозала.
     * @param hallNumber Новый номер кинозала.
     */
    @Override
    public void setHallNumber(int hallNumber){

    }

    /**
     * Установить новую вместимость кинозала.
     *
     * @param capacity Новая вместимость кинозала.
     */
    @Override
    public void setCapacity(int hallCapacity) {

    }
    /**
     * Установить новый тип кинозала.
     *
     * @param hallType Новый тип кинозала.
     */
    @Override
    public void setHallType(String hallType) {

    }
}
