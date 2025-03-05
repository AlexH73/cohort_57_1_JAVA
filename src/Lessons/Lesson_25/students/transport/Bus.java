package Lessons.Lesson_25.students.transport;

public class Bus extends Transport {
    private int classType;

    public Bus(int transportNumber, String departureTime, String arrivalTime, double price,int classType) {
        super(transportNumber, departureTime, arrivalTime, price);
        this.classType = classType;
    }
    @Override
    public void book(){
        if(checkAvailableSeats()){
            System.out.println("В автобусе есть свободные места");
        } else {
            System.out.println("В автобусе свободных мест нет");
        }

    }

    public boolean checkAvailableSeats(){
        return true;
    }
}
