package main_project.src.interfaces;

/**
 * Интерфейс ITicket предоставляет контракт для класса, представляющего билет в системе управления кинотеатром.
 */
public interface ITicket {

    /**
     * Получить сеанс, на который предназначен этот билет.
     *
     * @return Сеанс этого билета.
     */
    ISession getSession();

    /**
     * Установить сеанс для этого билета.
     *
     * @param session Сеанс для этого билета.
     */
    void setSession(ISession session);

    /**
     * Получить номер места, которое занимает этот билет.
     *
     * @return Номер места этого билета.
     */
    int getSeatNumber();

    /**
     * Установить номер места для этого билета.
     *
     * @param seatNumber Номер места для этого билета.
     */
    void setSeatNumber(int seatNumber);

    /**
     * Получить стоимость этого билета.
     *
     * @return Стоимость билета.
     */
    double getPrice();

    /**
     * Установить стоимость для этого билета.
     *
     * @param price Стоимость этого билета.
     */
    void setPrice(double price);

    /**
     * Получить статус этого билета (продано/не продано).
     *
     * @return Статус этого билета.
     */
    String getStatus();

    /**
     * Установить статус для этого билета.
     *
     * @param status Статус для этого билета.
     */
    void setStatus(String status);
}
