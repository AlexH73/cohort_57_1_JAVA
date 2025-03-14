package Hausaufgaben.Hausaufgaben_30.Aufgabe_3;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Mustermann","Maxx",23));
        person.add(new Person("Muster","Mani",49));
        person.add(new Person("Mausi","Mini",21));
        person.add(new Person("Duck","Deisy",35));

        System.out.println(person);

        String searchName = "Мuster";
        int index = person.indexOf(searchName);
        if (index != -1) {
            System.out.println("Person " + searchName + " gefunden " + index);
        } else {
            System.out.println("Person " + searchName + " nicht gefunden");
        }
        if (index != -1) {
            person.add(index,"lück","Lacki",32);
            System.out.println("Имя пользователя на индексе " + index + "обновлено на "  + person.get(index));
        }
    }
}
