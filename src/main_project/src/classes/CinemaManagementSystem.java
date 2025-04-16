package main_project.src.classes;
import main_project.src.interfaces.*;


public class CinemaManagementSystem {
    public static void main(String[] args) {
        // Initialisierung und Aktivierung
        IFilm film = new Film("Inception", 148);
        ICinemaHall hall = new CinemaHall(1, 150, "IMAX");

        ISession session = new Session(film, hall, "18:00", "20:30");
        ITicket ticket1 = new Ticket(session, 1, 12.50, "Verfügbar");
        ITicket ticket2 = new Ticket(session, 2, 12.50, "Verfügbar");

        session.addTicket(ticket1);
        session.addTicket(ticket2);

        hall.reserveSeats(2);

        System.out.println(session);
        System.out.println(hall);
    }
}

