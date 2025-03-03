package Homerwork.Practica.Practica25.CorporateSystem;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Lena", 2000.0, 3);
        Developer developer = new Developer("Iryna", 3000.0, "Java");
        Intern intern = new Intern("Katy", 1000.0, 3);

        manager.work();
        manager.conductMeeting();
        System.out.println("==============================");

        developer.work();
        System.out.println("==============================");

        intern.work();
        System.out.println("==============================");



    }

}
