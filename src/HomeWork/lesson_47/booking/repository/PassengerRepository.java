package Homework.lesson_47.booking.repository;

import Homework.lesson_47.booking.model.Passenger;

public interface PassengerRepository {
    Passenger findByPassport(String passportNumber);
    void save(Passenger passenger);
}
