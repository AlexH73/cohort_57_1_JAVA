package Homework.lesson_29.comparator_products;

import java.util.Comparator;

public class ComparatorProductByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        // Исправлено с использованием Integer.compare()
        return Integer.compare(o1.getRating(), o2.getRating());
    }
}
