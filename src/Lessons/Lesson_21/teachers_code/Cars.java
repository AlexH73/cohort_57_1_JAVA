package Lessons.Lesson_21.teachers_code;

public class Cars {
    public static void main(String[] args) {
        Automobile audi = new Automobile();

        audi.type = "sedan";
        audi.brand = "AUDI";
        audi.model = "A4";

        audi.yearOfProduct = 2025;
        audi.color = "white";
        audi.owners = new String[0]; // {}
        // audi.owners = null; // null


        System.out.println("audi.owners.length = " + audi.owners.length);
        System.out.println("audi.range = " + audi.range);
    }
}
