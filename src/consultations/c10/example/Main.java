package consultations.c10.example;

public class Main {
    public static void main(String[] args) {
        // мотор
        // колеса
        // свойства машины

        Wheel leftFront = new Wheel("left-front");
        Wheel rightFront = new Wheel("right-front");
        Wheel rightBack = new Wheel("right-back");
        Wheel leftBack = new Wheel("left-back");

        Wheel[] wheels = {leftFront, rightFront, rightBack, leftBack};

        Engine engine = new Engine("3145377e913");
        Car car = new Car(
                "BMW",
                "M5",
                "87283892839",
                engine,
                wheels
        );

        car.go();
        car.stop();
    }
}
