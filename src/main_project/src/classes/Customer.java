package main_project.src.classes;
import main_project.src.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer {
    private String name;
    private List<IOrder> orderHistory; // История покупок
    private List<ITicket> bookingHistory; // История бронирований

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
        this.bookingHistory = new ArrayList<>();
    }

    @Override
    public ITicket bookTicket(ISession session) {
        // Проверка доступности билетов
        for (ITicket ticket : session.getTickets()) {
            if ("Свободен".equalsIgnoreCase(ticket.getStatus())) {
                ticket.setStatus("Забронировано");
                bookingHistory.add(ticket); // Добавить билет в историю бронирований
                System.out.println("Билет успешно забронирован: " + ticket);
                return ticket; // Возвратить забронированный билет
            }
        }
        throw new RuntimeException("Нет доступных билетов на этот сеанс."); // Исключение
    }

    @Override
    public IOrder purchaseProduct(IProduct product, int quantity) {
        // Проверка доступности продукта
        if (product.getStockQuantity() >= quantity) {
            product.setStockQuantity(product.getStockQuantity() - quantity); // Обновить остаток продукта
            IOrder order = new Order(product, quantity); // Создать заказ
            orderHistory.add(order); // Добавить заказ в историю покупок
            System.out.println("Продукт успешно куплен: " + order);
            return order;
        }
        throw new RuntimeException("Недостаточно продукта на складе."); // Исключение
    }

    @Override
    public List<IOrder> getOrderHistory() {
        return orderHistory;
    }

    @Override
    public List<ITicket> getBookingHistory() {
        return bookingHistory;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + '\'' +
                ", orderHistory=" + orderHistory +
                ", bookingHistory=" + bookingHistory +
                '}';
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword(String password) {

    }
}

