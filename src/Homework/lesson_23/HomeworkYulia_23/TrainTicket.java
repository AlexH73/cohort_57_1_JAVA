// // TODO: Реализовать геттеры и сеттеры с валидацией.
/// / 1. `seatsAvailable` не может быть отрицательным.
/// / 2. `destination` не может быть пустым.


package Homework.lesson_23.HomeworkYulia_23;

public class TrainTicket {
    private String destination;
    private int seatsAvailable;

    public String getDestination() {
        return destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }


    public void setDestination(String destination) {
        if (destination != null && !destination.isEmpty()) {
            this.destination = destination;
        }
        else {
            System.out.println("Пожалуйста не вводите пустое назначение");
        }
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable >= 0) {
            this.seatsAvailable = seatsAvailable;
        }
        else {
            System.out.println("Пожалуйста не вводите отрицательные числа");
        }

    }
}

