package Lessons.Lesson_25.students.transport;

public class Bus extends Transport {
    private int availableSeats;

    public Bus(int transportNumber, String departureTime, String arrivalTime, double price, int availableSeats) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.availableSeats = availableSeats;
    }

    @Override
    public void book() {
        if (checkAvailableSeats()) {
            System.out.println("Билет на автобус " + getTransportNumber() + " забронирован.");
            availableSeats--;
        } else {
            System.out.println("В автобусе нет свободных мест.");
        }
    }

    // Перегруженная версия book для бронирования нескольких мест
    public void book(int passengers) {
        if (passengers <= availableSeats) {
            System.out.println("Забронировано " + passengers + " мест(а) на автобус " + getTransportNumber());
            availableSeats -= passengers;
        } else {
            System.out.println("Недостаточно мест в автобусе.");
        }
    }

    public boolean checkAvailableSeats() {
        return availableSeats > 0;
    }

    @Override
    public void cancelBooking() {
        System.out.println("Отмена бронирования на автобус " + getTransportNumber());
        availableSeats++;
    }
}
