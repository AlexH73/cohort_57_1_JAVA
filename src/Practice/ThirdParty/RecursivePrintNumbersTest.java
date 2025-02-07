package Practice.ThirdParty;

public class RecursivePrintNumbersTest {
    public static void main(String[] args) {
        RecursivePrintNumbers recursive1 = new RecursivePrintNumbers();
        RecursivePrintNumbers recursive2 = new RecursivePrintNumbers();
        recursive1.a = 0;
        recursive1.b = 10;

        System.out.println("Числа от " + recursive1.a + " до " + recursive1.b + ":");
        recursive1.printNumbers(recursive1.a, recursive1.b);

        recursive2.a = 10;
        recursive2.b = 5;

        System.out.println("Числа от " + recursive2.a + " до " + recursive2.b + ":");
        recursive1.printNumbers(recursive2.a, recursive2.b);
    }
}
