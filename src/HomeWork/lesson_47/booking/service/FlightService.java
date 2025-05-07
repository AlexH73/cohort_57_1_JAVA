package Homework.lesson_47.booking.service;

import Homework.lesson_47.booking.model.Flight;
import java.util.List;

public interface FlightService {
    List<Flight> findAvailableFlights(String departureCity, String arrivalCity);
    void updateAvailableSeats(String flightNumber, int newAvailableSeats);
}
