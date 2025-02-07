package Practice.ThirdParty.Allicen;

import java.io.PrintWriter;
import java.util.Scanner;

public class Glutton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // Имена для значений
        String[] names = {"Всеволод", "Кирилл", "Дмитрий", "Николай", "Виктор"};

        // Ввод данных
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите значение для " + names[i] + ": ");
            values[i] = in.nextInt();
        }

        // Поиск первого значения, равного 1
        boolean found = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 1) {
                System.out.println(names[i]);
                found = true;
                break;
            }
        }

        // Если ни одно значение не равно 1
        if (!found) {
            System.out.println("Марина");
        }

        out.flush();
    }
}