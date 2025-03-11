package Homework.lesson_29;
//Сортировка по количеству проданных за месяц (по возрастанию)

import java.util.Comparator;

public class ComparatorProductsBySoldPerMonth implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getSoldPerMonth(), o2.getSoldPerMonth()); //Integer.compare(), чтобы сравнивать целые числа.
    }
}
