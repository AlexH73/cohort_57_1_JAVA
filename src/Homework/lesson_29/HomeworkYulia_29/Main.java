package Homework.lesson_29.HomeworkYulia_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Lenovo", 1566, 87, 5, 150));
        products.add(new Product("Macbook", 1890, 81, 2, 200));
        products.add(new Product("Asus", 999, 65, 8, 180));
        products.add(new Product("MSI", 2200, 91, 10, 170));

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:");
        System.out.println("1. По продажам (по возрастанию)");
        System.out.println("2. По продажам (по убыванию)");
        int choice = sc.nextInt();
        sc.close(); // Закрываем Scanner

        switch (choice) {
            case 1:
                products.sort(new ComparatorProductBySalesPerMonth(true));
                break;
            case 2:
                products.sort(new ComparatorProductBySalesPerMonth(false));
                break;
            default:
                System.out.println("Некорректный ввод, сортировка не выполнена.");
                return;
        }

        // Вывод отсортированного списка
        System.out.println("\nОтсортированный список продуктов:");
        products.forEach(System.out::println);
    }
}
