package Lessons.Lesson_47.booking;

import java.util.Date;

public class Ticket {

    private String ticketId;
    private Passenger passenger;
    private Flight flight;
    private Status status;

    public enum Status {
        ACTIVE,
        CANCELED
    }

}