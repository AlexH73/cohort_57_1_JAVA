package Lessons.Lesson_25.students.transport;

public class Train extends Transport{
    private int wagonType;

    public Train(int transportNumber, String departureTime, String arrivalTime, double price, int wagonType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.wagonType = wagonType;
    }

    @Override
    public void book() {
        //if (wagonType != 1 || wagonType != 2 || wagonType != 3) {
        //}
        super.book();
        System.out.println(wagonType);
    }
}
