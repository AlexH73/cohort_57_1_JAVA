package Practice.ThirdParty;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {
        String str;

        // Используем try-with-resources для автоматического закрытия ресурсов
        try (FileReader fin = new FileReader("src\\Practice\\ThirdParty\\Files\\input.txt");
             Scanner sc = new Scanner(fin);
             FileWriter countStepFinish = new FileWriter("src\\Practice\\ThirdParty\\Files\\output.txt")) {

            // Проверяем наличие следующей строки перед чтением
            if (sc.hasNextLine()) {
                str = sc.nextLine();
                countStepFinish.write(str);
            } else {
                System.out.println("No line found in the input file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
