package Homerwork.Practica35;

import java.io.File;
import java.io.IOException;

public class StudentCode35 {
    public static void main(String[] args) throws IOException {
        File dir = new File("src/Homerwork/Practica34/example.txt");
        System.out.println(dir.isFile());
        System.out.println(dir.isDirectory());
        System.out.println(dir.exists());

        File fileThatNotExist = new File("src/Homerwork/Practica34/example_not_exist.txt");
        System.out.println(fileThatNotExist.exists());
        System.out.println(fileThatNotExist.isDirectory());
        System.out.println(fileThatNotExist.createNewFile());

    }

}
