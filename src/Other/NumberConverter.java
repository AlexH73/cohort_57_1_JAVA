package Other;
import java.util.Scanner;

public class NumberConverter {

    // Метод для перевода десятичного числа в бинарное представление
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) return "0";

        boolean isNegative = decimalNumber < 0;
        decimalNumber = Math.abs(decimalNumber);

        StringBuilder binaryNumber = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber.insert(0, remainder);
            decimalNumber /= 2;
        }

        if (isNegative) {
            while (binaryNumber.length() < 8) {
                binaryNumber.insert(0, '0');
            }
            String inverted = binaryNumber.toString().chars()
                    .mapToObj(c -> c == '0' ? '1' : '0')
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            int incremented = Integer.parseInt(inverted, 2) + 1;
            binaryNumber = new StringBuilder(Integer.toBinaryString(incremented));
            binaryNumber = new StringBuilder(binaryNumber.substring(binaryNumber.length() - 8));
        }

        return binaryNumber.toString();
    }

    // Разбивает бинарное число на группы по 8 бит
    public static String splitBinaryByBytes(String binaryString) {
        while (binaryString.length() % 8 != 0) {
            binaryString = "0" + binaryString;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 8) {
            if (i > 0) result.append(" | ");
            result.append(binaryString, i, i + 8);
        }

        return result.toString();
    }

    // Разделяет строку на группы по 3 символа (восьмеричная система)
    public static String splitOctal(String octalString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < octalString.length(); i += 3) {
            if (i > 0) result.append(" | ");
            result.append(octalString, i, Math.min(i + 3, octalString.length()));
        }
        return result.toString();
    }

    // Разделяет строку на группы по 2 символа (шестнадцатеричная система)
    public static String splitHexadecimal(String hexString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexString.length(); i += 2) {
            if (i > 0) result.append(" | ");
            result.append(hexString, i, Math.min(i + 2, hexString.length()));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число: ");
        int decimalNumber = scanner.nextInt();

        // Перевод в бинарную систему
        String binaryNumber = decimalToBinary(decimalNumber);
        String binaryWithDelimiter = splitBinaryByBytes(binaryNumber);

        // Перевод в восьмеричную и шестнадцатеричную системы
        String octalNumber = Integer.toOctalString(decimalNumber);
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        // Разделяем восьмеричное и шестнадцатеричное представления
        String octalWithDelimiter = splitOctal(octalNumber);
        String hexadecimalWithDelimiter = splitHexadecimal(hexadecimalNumber);

        // Вывод результатов
        System.out.println("Десятичное число: " + decimalNumber);
        System.out.println("Бинарное число (по байтам): " + binaryWithDelimiter);
        System.out.println("Восьмеричное число (по группам по 3): " + octalWithDelimiter);
        System.out.println("Шестнадцатеричное число (по группам по 2): " + hexadecimalWithDelimiter);
    }
}

