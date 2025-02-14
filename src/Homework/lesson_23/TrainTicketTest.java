package Homework.lesson_23;

public class TrainTicketTest {
    public static void main(String[] args) {
        //Тестируем TrainTicket
        TrainTicket ticket = new TrainTicket("Paris", 20);
        System.out.println("\nПункт назначения: " + ticket.getDestination());
        System.out.println("Доступные места: " + ticket.getSeatsAvailable());

    }
}
