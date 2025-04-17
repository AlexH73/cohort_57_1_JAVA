package Homework.lesson_29.comparator_products;

import java.util.Comparator;

public class ComparatorProductsByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        // Безопасное сравнение double через Double.compare()
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
