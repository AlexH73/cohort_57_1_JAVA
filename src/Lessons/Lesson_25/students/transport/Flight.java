package Lessons.Lesson_25.students.transport;

public class Flight extends Transport {
    private String classType;

    public Flight(int transportNumber, String departureTime, String arrivalTime, double price, String classType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.classType = classType;
    }

    @Override
    public void book(){
        System.out.println(classType);
    }
}
