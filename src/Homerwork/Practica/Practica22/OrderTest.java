package Homerwork.Practica.Practica22;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(100, "Ivan Petrov", 2558.56);
        order1.displayOrder();

        order1.updateStatus("Отправлен");
        order1.displayOrder();

        order1.updateStatus(" Доставлен");
        order1.displayOrder();
    }
}
