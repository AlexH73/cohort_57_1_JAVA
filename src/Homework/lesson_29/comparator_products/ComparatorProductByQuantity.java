package Homework.lesson_29.comparator_products;

import java.util.Comparator;

public class ComparatorProductByQuantity implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
