package Lessons.Lesson_25.students.transport;

public class Train extends Transport {
    private int wagonType;

    public Train(int transportNumber, String departureTime, String arrivalTime, double price, int wagonType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.wagonType = wagonType;
    }

    @Override
    public void book() {
        if (selectCarriageType()) {
            System.out.println("Первый класс." + wagonType);
        } else {
            System.out.println("Вторй класс." + wagonType);
        }
    }

    public boolean selectCarriageType(){
        return true;
    }


}

