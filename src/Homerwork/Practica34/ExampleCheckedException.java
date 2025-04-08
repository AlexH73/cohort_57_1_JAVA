package Homerwork.Practica34;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleCheckedException {
    public static void main(String[] args) {
            String path = "src/Homerwork/Practica34/example.txt";
            Scanner scanner = null;
            File file = new File(path);

            // ошибка потенциально возникнет тут:
            try {
                scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException exception) {
                System.out.printf("Файл %s не был найден. Сообщение об ошибке:\n" +
                        "%s\n", file.getPath(), exception.getMessage());

                System.out.println("Ниже будет распечатано сообщение из ошибки:");
                exception.printStackTrace();
            } finally {
                System.out.println("код из блока finally выполняется всегда! Если есть исключение и если его нет");
            }

            System.out.println("\n\nзакончил свою работу благополучно");


    }
}
