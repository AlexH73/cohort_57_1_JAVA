package Homework.lesson_29;

import java.util.Comparator;

public class ComparatorProductsByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 100;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
