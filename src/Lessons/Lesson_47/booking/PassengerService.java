package Lessons.Lesson_47.booking;

public interface PassengerService {
    void PassengerCheckIn (Passenger passenger );
    Passenger findPassengerByPassport(String passportNumber);
}
