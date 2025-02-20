package Practice.Practice_26.veterinary_clinic;

class Appointment {
    private String date;
    private Animal animal;
    private Veterinarian veterinarian;
    private String diagnosis;

    public Appointment(String date, Animal animal, Veterinarian veterinarian) {
        this.date = date;
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.diagnosis = "Не установлен";
    }

    public void conductCheckup(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Дата: " + date + ", Животное: " + animal.getName() + ", Врач: " + veterinarian.getName() + ", Диагноз: " + diagnosis;
    }
}
