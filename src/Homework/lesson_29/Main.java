package Homework.lesson_29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("LapTop Lenovo", 1500.00, 87, 5, 6));
        products.add(new Product("Apple Macbook", 1800.00, 80, 2, 15));
        products.add(new Product("Asus ZenPro", 999.00, 65, 8, 25));
        products.add(new Product("MSI", 2500.00, 91, 10, 2));

        System.out.println("Выберите способ сортировки:");
        Comparator<Product> comparator = menu();
        List<Product> sortedProducts = sort(products, comparator);
        print(sortedProducts);
    }

    public static Comparator<Product> menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. По названию");
        System.out.println("2. По цене");
        System.out.println("3. По рейтингу");
        System.out.println("4. По количеству");
        System.out.println("5. По количеству проданных за месяц штук (по возрастанию): ");
        System.out.println("6. По количеству проданных за месяц штук (по убываннию): ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                return new ComparatorProductsByName();
            case 2:
                return new ComparatorProductsByPrice();
            case 3:
                return new ComparatorProductsByRating();
            case 4:
                return new ComparatorProductsByQuantity();
            case 5:
                return new ComparatorProductsBySoldPerMonth();
            case 6:
                return new ComparatorProductsBySoldPerMonthDesc();
            default:
                System.out.println("Некорректный ввод, сортировка по названию");
                return new ComparatorProductsByName();
        }

    }

    public static List<Product> sort(List<Product> list, Comparator<Product> comparator) {
        List<Product> result = new ArrayList<>(list); //создаем копию листа list
        Collections.sort(result, comparator);   //сортируем result с помощью comparator
        return result;
    }

    public static void print(List<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
