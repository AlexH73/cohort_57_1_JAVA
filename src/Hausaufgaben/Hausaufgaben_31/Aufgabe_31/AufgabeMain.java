package Hausaufgaben.Hausaufgaben_31.Aufgabe_31;

import java.util.List;

public class AufgabeMain {
    public static void main(String[] args) {
        CollectionOperationsHomeworkImpl operations = new CollectionOperationsHomeworkImpl();

        // Beispiel: Testen mit Zahlen
        List<Integer> list1 = List.of(1, 2, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        System.out.println("Anzahl der Duplikate: " + operations.countDuplicatesInteger(list1));
        System.out.println("Vereinigung: " + operations.unionOfIntegerLists(list1, list2));
        System.out.println("Schnittmenge: " + operations.intersectionOfIntegerLists(list1, list2));
        System.out.println("Differenz: " + operations.differenceOfIntegerLists(list1, list2));
        System.out.println("Eindeutig?: " + operations.areIntegerElementsUnique(list1));
    }

}
