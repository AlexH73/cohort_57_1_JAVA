package Homework.lesson_29.HomeworkYulia_29;

import java.util.Comparator;

class ComparatorProductBySalesPerMonth implements Comparator<Product> {
    private boolean ascending;

    ComparatorProductBySalesPerMonth(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Product p1, Product p2) {
        return ascending ? Integer.compare(p1.salesPerMonth, p2.salesPerMonth)
                : Integer.compare(p2.salesPerMonth, p1.salesPerMonth);
    }
}
