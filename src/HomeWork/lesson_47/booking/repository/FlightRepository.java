package Homework.lesson_47.booking.repository;

import Homework.lesson_47.booking.model.Flight;
import java.util.List;

public interface FlightRepository {
    Flight findByFlightNumber(String flightNumber);
    List<Flight> findAvailableFlights(String departureCity, String arrivalCity);
    void updateAvailableSeats(String flightNumber, int newAvailableSeats);
}
