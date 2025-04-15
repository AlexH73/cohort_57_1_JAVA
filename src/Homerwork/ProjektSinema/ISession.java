package Homerwork.ProjektSinema;

import java.util.Date;
import java.util.List;

/**
 * Интерфейс ISession предоставляет контракт для класса, представляющего сеанс в системе управления кинотеатром.
 */
public interface ISession {

    List<ITicket> getTickets();

    IFilm getFilm();

    ICinemaHall getCinemaHall();

    Date getStartTime();

    Date getEndTime();

    void setFilm(IFilm film);

    void setCinemaHall(ICinemaHall cinemaHall);

    void setStartTime(String startTime);

    void setEndTime(String endTime);
}
