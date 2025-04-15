package Lessons.Lesson_39.src.teacher_code.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *  класс CustomHashTable искользуется для практики и изучения структуры данных хеш-таблиц. <p>
 *  Данный класс должен изучать и показывать, как влияют методы hashCode и equals на функционирование хеш-таблиц,
 *  лежащих в основе таких популярных структур данных, как HashSet и HashMap.
 */
public class CustomHashTable {
    private static int countOfBucket = 16;
    private ArrayList <LinkedList<Movie>> table = new ArrayList<>(countOfBucket);
    private int size = 0;

    public CustomHashTable() {
        // так как при создании, указан лишь capacity для ArrayList, это вовсе не означает,
        // что при попытке получить доступ по индексу, я не получу ошибку.
        // Поэтому для инициализации в кажды бакет кладем пустой LinkedList.
        for (int i = 0; i < countOfBucket; i++) {
            table.add(new LinkedList<Movie>());
        }
    }

    public boolean contains(Movie movie) {
        int movieHash = movie.hashCode();

        // определяем в какой именно корзине должен находиться данный экземпляр,
        // если он все же есть в нашей таблице.
        // Для этого получим остаток от деления хешкода на количество корзин (по умолчанию 16)

        int indexOfBucket = Math.abs(movieHash % countOfBucket);

        LinkedList<Movie> listFromBucket = table.get(indexOfBucket);

        if (listFromBucket.isEmpty()) {
            return false;
        }

        for (int i = 0; i < listFromBucket.size(); i++) {
            if (listFromBucket.get(i).hashCode() == movieHash) {
                if (movie.equals(listFromBucket.get(i))) {
                    return true;
                }
            }
        }

        return false;
    }


    /**
     * @param movie
     * @return true - если фильм был добавлен, false - если запись уже существовала и аргумент не был добавлен
     */
    public boolean add(Movie movie) {
        if (contains(movie)) {
          return false;
        }

        // определяем индекс корзины, в которой должен находиться данный аргумент
        int indexOfBucket = Math.abs(movie.hashCode() % countOfBucket);

        LinkedList<Movie> listFromBucket = table.get(indexOfBucket);

        listFromBucket.add(movie);
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public ArrayList<Movie> toArray() {
        ArrayList<Movie> arrayList = new ArrayList<>();

        for (LinkedList<Movie> movies : table) {
            arrayList.addAll(movies);
        }

        return arrayList;
    }
}
