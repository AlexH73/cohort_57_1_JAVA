package Homework.Homework_23;

//[x] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `seatsAvailable` не может быть отрицательным.
// 2. `destination` не может быть пустым.
public class TrainTicket {
    private String destination;
    private int seatsAvailable;

    // Геттер для destination
    public String getDestination() {
        return destination;
    }

    // Сеттер для destination с валидацией
    public void setDestination(String destination) {
        if (destination == null || destination.equals(" ")) {
            System.out.println("Ошибка! destination не может быть пустым.");
        }
        this.destination = destination;
    }

    // Геттер для seatsAvailable
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Сеттер для seatsAvailable с валидацией
    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable < 0) {
            System.out.println("Значение свободные места не может быть отрицательным.");
        }
        this.seatsAvailable = seatsAvailable;
    }
}

