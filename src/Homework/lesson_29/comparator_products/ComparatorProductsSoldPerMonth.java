package Homework.lesson_29.comparator_products;

import java.util.Comparator;

public class ComparatorProductsSoldPerMonth implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getSoldPerMonth(), o2.getSoldPerMonth());
    }
}
