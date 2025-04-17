package Homework.lesson_23;

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
        // в предыдущем варианте destination сравнивалось исключительно с конкретным значением пробелов,
        // я мог бы закинуть "       " и уже не попал бы в блок if
        if (destination == null || destination.isBlank()) {
            System.out.println("Ошибка! destination не может быть пустым.");
            // следует не просто выводить сообщение, но валидировать действие
            return;
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
            return;
        }
        this.seatsAvailable = seatsAvailable;
    }
}

