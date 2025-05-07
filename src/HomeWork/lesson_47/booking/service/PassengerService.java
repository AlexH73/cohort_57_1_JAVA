package Homework.lesson_47.booking.service;

import Homework.lesson_47.booking.model.Passenger;

public interface PassengerService {
    void registerPassenger(Passenger passenger);
    Passenger findPassengerByPassport(String passportNumber);
}
