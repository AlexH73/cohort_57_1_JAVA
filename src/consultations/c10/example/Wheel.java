package consultations.c10.example;

public class Wheel {
    String location;

    public Wheel(String location) {
        this.location = location;
    }

    void rotate() {
        System.out.printf("%s колесо начало крутиться\n", this.location);
    }

    void stop() {
        System.out.printf("%s колесо перестало крутиться\n", this.location);
    }
}
