package Lessons.Lesson_47.booking;

import java.util.List;

public interface FlightService {
    List<Flight> searchFlights(String fromCity, String toCity);
    void updateAvailableSeats(String flightNumber, int newAvailableSeats);
}
