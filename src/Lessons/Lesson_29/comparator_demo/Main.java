package Lessons.Lesson_29.comparator_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(-19);
        ints.add(23);
        ints.add(31);
        ints.add(45);
        ints.add(-2);

        System.out.println("До сортировки:");
        System.out.println(ints);

        System.out.println("После сортировки:");
        Collections.sort(ints);
        System.out.println(ints);

        List<Product> products = new ArrayList<>();
        products.add(new Product("LapTop Lenovo",1566.00, 87,5) );
        products.add(new Product("Apple Macbook",1890.00, 81,2) );
        products.add(new Product("Asus ZenPro",999.00, 65,8) );
        products.add(new Product("MSI",2200.00, 91,10) );
        System.out.println("До сортировки:");
        print(products);
        System.out.println("После сортировки:");
        ComparatorProductsByPrice comparatorByPrice = new ComparatorProductsByPrice();
        Collections.sort(products,comparatorByPrice);
        print(products);
        System.out.println("После сортировки по рейтингу:");
        ComparatorProductByRating comparatorProductByRating = new ComparatorProductByRating();
        Collections.sort(products,comparatorProductByRating);
        print(products);
        System.out.println("и наоборот.....");
        Collections.sort(products,comparatorProductByRating.reversed());
        print(products);


        /*
        int compare = comparatorByPrice.compare(products.get(0), products.get(1));
        if (compare>0){
            System.out.println("больше:" +products.get(0));
        } else {
            System.out.println("больше:" +products.get(1));
        }

         */

    }

    public static void print(List<Product> list){
        for (Product product:list){
            System.out.println(product);
        }
    }
}