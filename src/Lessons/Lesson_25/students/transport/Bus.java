package Lessons.Lesson_25.students.transport;

public class Bus extends Transport{
    public Bus(int transportNumber, String departureTime, String arrivalTime, double price, boolean checkAvailableSeats) {
        super(transportNumber, departureTime, arrivalTime, price);
    }

    @Override
    public void book() {
        if (checkAvailableSeats()) {
            System.out.println("В автобусе есть свободные места");
        } else {
            System.out.println("В автобусе свободных мест нет");
        }
    }
    public boolean checkAvailableSeats() {
        return true;
    }
}
