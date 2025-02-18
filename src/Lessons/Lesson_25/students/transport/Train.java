package Lessons.Lesson_25.students.transport;

public class Train extends Transport {
    private String carriageType;

    public Train(int transportNumber, String departureTime, String arrivalTime, double price, String carriageType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.carriageType = carriageType;
    }

    @Override
    public void book() {
        System.out.println("Забронирован билет на поезд " + getTransportNumber() + " в вагоне " + carriageType);
    }

    public void selectCarriageType(String carriageType) {
        this.carriageType = carriageType;
        System.out.println("Выбран тип вагона: " + carriageType);
    }

    @Override
    public void cancelBooking() {
        System.out.println("Отмена бронирования на поезд " + getTransportNumber());
    }
}
