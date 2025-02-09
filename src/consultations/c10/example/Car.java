package consultations.c10.example;

public class Car {
    String vendor;
    String model;
    String serialNumber;
    Engine engine;
    Wheel[] wheels;

    public Car(
        String vendor, String model,
        String serialNumber, Engine engine,
        Wheel[] wheels
    ) {
        this.vendor = vendor;
        this.model = model;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.wheels = wheels;
    }

    void go() {
        this.engine.start();
        for (Wheel wheel: this.wheels) {
            wheel.rotate();
        }
        System.out.println("Машина поехала");
    }

    void stop() {
        for (Wheel wheel: this.wheels) {
            wheel.stop();
        }
        this.engine.stop();
        System.out.println("Машина остановилась");
    }
}
