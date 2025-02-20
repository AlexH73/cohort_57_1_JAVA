package Practice.Practice_26.veterinary_clinic;

class VetClinic {
    private Client[] clients;
    private Veterinarian[] veterinarians;
    private Appointment[] appointments;
    private int clientCount;
    private int vetCount;
    private int appointmentCount;
    private static final int MAX_CLIENTS = 100;
    private static final int MAX_VETS = 10;
    private static final int MAX_APPOINTMENTS = 200;

    public VetClinic() {
        this.clients = new Client[MAX_CLIENTS];
        this.veterinarians = new Veterinarian[MAX_VETS];
        this.appointments = new Appointment[MAX_APPOINTMENTS];
        this.clientCount = 0;
        this.vetCount = 0;
        this.appointmentCount = 0;
    }

    public boolean registerClient(Client client) {
        if (clientCount < MAX_CLIENTS) {
            clients[clientCount++] = client;
            return true;
        } else {
            System.out.println("Невозможно добавить больше клиентов.");
            return false;
        }
    }

    public boolean addVeterinarian(Veterinarian veterinarian) {
        if (vetCount < MAX_VETS) {
            veterinarians[vetCount++] = veterinarian;
            return true;
        } else {
            System.out.println("Невозможно добавить больше ветеринаров.");
            return false;
        }
    }

    public boolean scheduleAppointment(Animal animal, Veterinarian veterinarian, String date) {
        if (appointmentCount < MAX_APPOINTMENTS) {
            appointments[appointmentCount++] = new Appointment(date, animal, veterinarian);
            return true;
        } else {
            System.out.println("Невозможно добавить больше приемов.");
            return false;
        }
    }

    public void showAllAppointments() {
        for (int i = 0; i < appointmentCount; i++) {
            System.out.println(appointments[i]);
        }
    }
}
