package Lessons.Lesson_47.booking;

import java.util.List;

public interface FlightRepository {
    Flight findByFlightNumber(String flightNumber);
    List<Flight> findAvailableFlights(String fromCity, String toCity);
    void updateAvailableSeats(String flightNumber, int newAvailableSeats);
}
