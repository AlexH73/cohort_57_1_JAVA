package Homework.lesson_47.booking.service;

import Homework.lesson_47.booking.model.Ticket;
import Homework.lesson_47.booking.model.Passenger;
import Homework.lesson_47.booking.model.Flight;
import java.util.List;

public interface BookingService {
    Ticket bookTicket(Passenger passenger, Flight flight);
    void cancelTicket(String ticketId);
    List<Ticket> getTicketsByPassenger(Passenger passenger);
}
