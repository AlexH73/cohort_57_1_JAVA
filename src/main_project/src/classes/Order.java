package main_project.src.classes;
import main_project.src.interfaces.*;


public class Order implements IOrder {
    private IProduct product;
    private int quantity;

    public Order(IProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
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

