package Lessons.Lesson_25.students.transport;

public class Train extends Transport{
    private String wagonType;

    public Train(int transportNumber, String departureTime, String arrivalTime, double price, String wagonType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.wagonType = wagonType;
    }

    @Override
    public void book() {
        System.out.println(wagonType);
    }

    public void selectCarriageType(String плацкарт) {

    }
}
