package Homework.lesson_29.comparator_products;

import java.util.Comparator;

public class ComparatorProductByTitle implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle()); // Сортировка без учета регистра
    }
}
