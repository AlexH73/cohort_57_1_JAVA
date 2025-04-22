package main_project.src.classes;

import main_project.src.interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Session implements ISession {
    private IFilm film;              // Фильм, который показывается во время сеанса
    private ICinemaHall cinemaHall;  // Кинозал, в котором проводится сеанс
    private String startTime;        // Время начала сеанса
    private String endTime;          // Время окончания сеанса
    private List<ITicket> tickets;   // Список билетов для этого сеанса

    // Конструктор
    public Session(IFilm film, ICinemaHall cinemaHall, String startTime) {
        this.film = film;
        this.cinemaHall = cinemaHall;
        this.startTime = startTime;
        this.endTime = endTime;
        this.tickets = new ArrayList<>();
    }

    @Override
    public IFilm getFilm() {
        return film;
    }

    @Override
    public void setFilm(IFilm film) {
        this.film = film;
    }

    @Override
    public ICinemaHall getCinemaHall() {
        return cinemaHall;
    }

    @Override
    public void setCinemaHall(ICinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    @Override
    public String getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public List<ITicket> getTickets() {
        return tickets;
    }

    @Override
    public void addTicket(ITicket ticket) {
        tickets.add(ticket);
    }

    @Override
    public void removeTicket(ITicket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public String toString() {
        return "Session{" +
                "film=" + film +
                ", cinemaHall=" + cinemaHall +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
