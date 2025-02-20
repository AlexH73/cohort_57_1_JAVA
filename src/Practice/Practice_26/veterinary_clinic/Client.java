package Practice.Practice_26.veterinary_clinic;

class Client extends Person {
    private Animal[] pets;
    private static final int MAX_PETS = 5;
    private int petCount;

    public Client(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.pets = new Animal[MAX_PETS];
        this.petCount = 0;
    }

    public boolean addPet(Animal pet) {
        if (petCount < MAX_PETS) {
            pets[petCount++] = pet;
            return true;
        } else {
            System.out.println("Невозможно добавить больше питомцев.");
            return false;
        }
    }
}
