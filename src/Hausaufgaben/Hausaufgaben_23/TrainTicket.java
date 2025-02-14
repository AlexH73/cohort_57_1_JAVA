package Hausaufgaben.Hausaufgaben_23;

public class TrainTicket {
    private String destination;
    private int seatsAvailable;

    public TrainTicket(String destination, int seatsAvailable) {
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }
    // 1. `seatsAvailable` не может быть отрицательным.
    public String setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable >= 0) {
            this.seatsAvailable = seatsAvailable;
    }
/*
    public String getDestination() {
            return destination;
    }
    // 2. `destination` не может быть пустым.
    public void setDestination(String destination) {
            if (destination == null || destination.equals("   ")) {
                System.out.println(" *destination* не может быть *null* или *пустым*.");
            }
                this.destination = destination;
            }
        }

 */
        return "";
    }
    }
