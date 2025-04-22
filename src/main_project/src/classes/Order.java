package main_project.src.classes;
import main_project.src.interfaces.*;

import java.util.List;


public class Order implements IOrder {
    private IProduct product;
    private int quantity;

    public Order(IProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public List<ITicket> getTickets() {
        return List.of();
    }

    @Override
    public void addTicket(ITicket ticket) {

    }

    @Override
    public void removeTicket(ITicket ticket) {

    }

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void setStatus(String status) {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public void pay() {

    }

    @Override
    public IProduct getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}

