package Homework.lesson_47.booking.model;

import java.time.LocalDateTime;

public class Flight {
    private String flightNumber;      // номер рейса
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime departureTime; // дата и время вылета
    private int totalSeats;
    private int availableSeats;       // доступные места

    // getters, setters, equals, hashCode, toString
}
