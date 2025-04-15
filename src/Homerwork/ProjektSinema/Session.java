package Homerwork.ProjektSinema;

import java.util.Date;
import java.util.List;

public class Session implements ISession {
    private IFilm film;
    private ICinemaHall hall;
    private Date startTime;
    private Date endTime;

    public Session(IFilm film, ICinemaHall hall, Date startTime, Date endTime) {
        this.film = film;
        this.hall = hall;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public List<ITicket> getTickets() {
        return List.of();
    }

    /**
     * Получить фильм, который будет показываться во время этого сеанса.
     *
     * @return Фильм этого сеанса.
     */
    @Override
    public IFilm getFilm() {
        return film;
    }

    /**
     * Получить кинозал, в котором будет проходить сеанс.
     *
     * @return Кинозал этого сеанса.
     */
    @Override
    public ICinemaHall getCinemaHall() {
        return hall;
    }

    /**
     * Получить время начала сеанса.
     *
     * @return Время начала сеанса.
     */
    @Override
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Получить время окончания сеанса.
     *
     * @return Время окончания сеанса.
     */
    @Override
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Установить фильм для этого сеанса.
     *
     * @param film Фильм для показа во время сеанса.
     */
    @Override
    public void setFilm(IFilm film) {

    }

    /**
     * Установить кинозал для этого сеанса.
     *
     * @param cinemaHall Кинозал для проведения сеанса.
     */
    @Override
    public void setCinemaHall(ICinemaHall cinemaHall) {

    }

    /**
     * Установить время начала сеанса.
     *
     * @param startTime Время начала сеанса.
     */
    @Override
    public void setStartTime(String startTime) {

    }

    /**
     * Установить время окончания сеанса.
     *
     * @param endTime Время окончания сеанса.
     */
    @Override
    public void setEndTime(String endTime) {

    }

}