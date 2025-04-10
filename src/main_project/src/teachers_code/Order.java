package main_project.src.teachers_code;

import interfaces.IOrder;
import interfaces.ITicket;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
    private List<ITicket> tickets = new ArrayList<>();

    @Override
    public List<ITicket> getTickets() {
        return tickets;
    }

    @Override
    public void addTicket(ITicket ticket) {
        // предварительная логика
        tickets.add(ticket);
    }

    @Override
    public void removeTicket(ITicket ticket) {

    }

    /**
     * метод должен возвращать статус заказа.
     * В случае, если возникают ошибки...
     * логика такова: ...
     * В случае корректной работы, ожидается: ....
     * @return
     */
    @Override
    public String getStatus() {
        // какова логика данной операции? что именно клиент хотел бы увидеть, запрашива статус?
        // что именно системе было бы полезно знать, запрашива статус?
        // возможно тип данных String - не подходит и логично сделать свой собственный, возможно enum?
        return null;
    }

    @Override
    public void setStatus(String status) {

    }

    @Override
    public double getTotalPrice() {
        // считает цену
        return 0;
    }

    @Override
    public void pay() {

    }
}
