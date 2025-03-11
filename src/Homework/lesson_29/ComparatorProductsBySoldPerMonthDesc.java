package Homework.lesson_29;
//Сортировка по количеству проданных за месяц (по убыванию)

import java.util.Comparator;

public class ComparatorProductsBySoldPerMonthDesc implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o2.getSoldPerMonth(), o1.getSoldPerMonth()); //Integer.compare(), чтобы сравнивать целые числа.
    }
}
