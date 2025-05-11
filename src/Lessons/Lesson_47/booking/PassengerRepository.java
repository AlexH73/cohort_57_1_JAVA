package Lessons.Lesson_47.booking;

public interface PassengerRepository {
    Passenger findByPassportNumber(String passportNumber);
    void save(Passenger passenger);
}
