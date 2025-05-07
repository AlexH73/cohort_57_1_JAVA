package Homework.lesson_47.booking.repository;

import Homework.lesson_47.booking.model.Ticket;
import Homework.lesson_47.booking.model.Passenger;
import java.util.List;

public interface TicketRepository {
    Ticket findById(String ticketId);
    List<Ticket> findByPassenger(Passenger passenger);
    void save(Ticket ticket);
    void delete(String ticketId);
}
