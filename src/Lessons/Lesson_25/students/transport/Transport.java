package Lessons.Lesson_25.students.transport;

public class Transport {
    private int transportNumber;
    private String departureTime;
    private String arrivalTime;
    private double price;

    public Transport(int transportNumber, String departureTime, String arrivalTime, double price) {
        this.transportNumber = transportNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }
    public void book(){
        System.out.println("Забронирован билет на транспорт");
    }

    public int getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(int transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
