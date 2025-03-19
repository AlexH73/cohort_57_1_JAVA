package Homework.lesson_23;

// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `seatsAvailable` не может быть отрицательным.
// 2. `destination` не может быть пустым.
class TrainTicket {
    private String destination;
    private int seatsAvailable;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null || destination.isEmpty()) {
            return;
        }
        this.destination = destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable < 0) {
            return;
        }
        this.seatsAvailable = seatsAvailable;
    }
}
