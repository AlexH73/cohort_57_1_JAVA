package Hausaufgaben.Hausaufgaben_30.Aufgabe_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WordsMain {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Apfel");
        words.add("Bannane");
        words.add("Birne");
        words.add("Orange");
        words.add("Trauben");
        words.add("Limette");

        System.out.println("Suche dier ein wort aus :");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String searchString = "Orange";
        if (words.contains(searchString)) {
            System.out.println("\n Wort \"" + searchString + "\" wurde gefunden.");
            words.remove(searchString);
            System.out.println(" Wort \"" + searchString + "\" wurde entfernt.");
        } else {
            System.out.println("\n Wort \"" + searchString + "\" nicht gefunden.");
        }

        Collections.sort(words);

        System.out.println("\n Alles sortiert:");
        for (String s : words) {
            System.out.println(s);
        }

    }
}

