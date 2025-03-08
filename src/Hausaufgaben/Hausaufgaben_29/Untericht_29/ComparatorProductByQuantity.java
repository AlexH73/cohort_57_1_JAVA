package Hausaufgaben.Hausaufgaben_29.Untericht_29;

import java.util.Comparator;

public class ComparatorProductByQuantity implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getQuantity()-o2.getQuantity();
    }
}
