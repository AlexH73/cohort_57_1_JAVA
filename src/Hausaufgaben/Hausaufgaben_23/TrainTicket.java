package Hausaufgaben.Hausaufgaben_23;

// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `seatsAvailable` не может быть отрицательным.
// 2. `destination` не может быть пустым.
public class TrainTicket {
    private String destination;
    private int seatsAvailable;

    public TrainTicket(String destination, int seatsAvailable) {
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable >= 0) {
            this.seatsAvailable = seatsAvailable;
        }
    }

    public String getDestination() {
        return destination;
    }

    // 2. `destination` не может быть пустым.
    public void setDestination(String destination) {
        // испрвлена узкая проверка
        if (destination == null && destination.isBlank()) {
            System.out.println(" *destination* не может быть *null* или *пустым*.");
            return;
        }
        this.destination = destination;

    }
}

