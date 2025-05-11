package Lessons.Lesson_47.booking;

import java.util.List;

public interface BookingService {
    Ticket bookTicket(String passengerPassport, String flightNumber);
    void cancelTicket(String ticketId);
    List<Ticket> getTicketsByPassenger(String passportNumber);
}

