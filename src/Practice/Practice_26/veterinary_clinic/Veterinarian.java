package Practice.Practice_26.veterinary_clinic;

class Veterinarian extends Person {
    private String specialization;

    public Veterinarian(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}