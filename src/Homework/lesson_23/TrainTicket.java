package Homework.lesson_23;

public class TrainTicket {
    private String destination;
    private int seatsAvailable;

    //Конструктор
    public TrainTicket(String destination, int seatsAvailable) {
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }
    //Геттеры
    public String getDestination() {
        return destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    //Сеттеры с валидацией
    public void setDestination(String destination) {
        if(destination == null || destination.trim().isEmpty()) {
            throw new IllegalArgumentException("Пункт назначения не может быть пустым.");
        }
        this.destination = destination;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if(seatsAvailable < 0 ) {
            throw new IllegalArgumentException("Количество доступных мест не может быть отрицательным.");

        }
        this.seatsAvailable = seatsAvailable;
    }
}
