package Lessons.Lesson_29.comparator_demo;

import java.util.Comparator;

public class ComparatorProductByTitle implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
