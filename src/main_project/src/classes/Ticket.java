package main_project.src.classes;
import main_project.src.interfaces.*;

public class Ticket implements ITicket {
    private ISession session;    // Сеанс, к которому относится билет
    private int seatNumber;      // Номер места
    private double price;        // Стоимость билета
    private String status;       // Статус билета (например, "Продано" или "Свободен")

    // Конструктор
    public Ticket(ISession session, int seatNumber, double price, String status) {
        this.session = session;
        this.seatNumber = seatNumber;
        this.price = price;
        this.status = status;
    }

    @Override
    public ISession getSession() {
        return session;
    }

    @Override
    public void setSession(ISession session) {
        this.session = session;
    }

    @Override
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "session=" + session +
                ", seatNumber=" + seatNumber +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}


