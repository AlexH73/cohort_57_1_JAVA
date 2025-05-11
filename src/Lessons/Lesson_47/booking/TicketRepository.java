package Lessons.Lesson_47.booking;

import java.util.List;

public interface TicketRepository {
    Ticket findById(String ticketId);
    List<Ticket> findByPassenger(Passenger passenger);
    void save(Ticket ticket);
    void delete(String ticketId);
}
