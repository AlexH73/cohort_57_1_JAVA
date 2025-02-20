package Practice.Practice_26.veterinary_clinic;

class Veterinarian extends Person {
    private String spezialization;

    public Veterinarian(String name, int age, String phoneNumber, String spezialization) {
        super(name, age, phoneNumber);
        this.spezialization = spezialization;
    }
}