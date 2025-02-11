package Homework.lesson_22;

public class OrderTest {
    public static void main(String[] args) {
//Создаем несколько заказов с разными суммами
        Order order1 = new Order("1234", 1400.0);
        Order order2 = new Order("1235", 750.0);
        Order order3 = new Order("1236", 400.0);


        //Отображаем информацию о заказах с налогами и скидками
        order1.displayOrder(20, 5); //Налог 20%, скидка 5%
        order2.displayOrder(25, 8); //Налог 25%, скидка 8%
        order3.displayOrder(15, 10); //Налог 15%, скидка 10%
    }
}
