package Hausaufgaben.Hausaufgaben_29.Untericht_29;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop Lenovo",1566.00, 87,5, "Linux" ));
        products.add(new Product("Apple Macbook",1890.00, 81,2, "IOS" ));
        products.add(new Product("Asus ZenPro",999.00, 65,8, "Windows 10" ));
        products.add(new Product("MSI",2200.00, 91,10, "Windows 11" ));

        Comparator<Product> comparator = menu();
        List<Product> sortedProduct = sort(products, comparator);
        print(sortedProduct);
    }

    public static Comparator<Product> menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите как вы хотите сортировать:");
        System.out.println("1. По название");
        System.out.println("2. По цене");
        System.out.println("3. По рейтингу");
        System.out.println("4. По количеству");
        System.out.println("5. По рейтингу, наоборот");
        System.out.println("6. По Операционная система, наоборот");
        System.out.println("7. По Операционная система");
        int select = scanner.nextInt();
        switch (select){
            case 1:return new ComparatorProductByTitle();
            case 2: return new ComparatorProductsByPrice();
            case 3: return new ComparatorProductByRating();
            case 4: return new ComparatorProductByQuantity();
            case 5: return (p1,p2)-> p2.getRating()-p1.getRating();
            case 6: return (p1,p2)-> p2.getOperatingSystem().compareTo(p1.getOperatingSystem());
            case 7: return (p1,p2)-> p1.getOperatingSystem().compareTo(p2.getOperatingSystem());
            default: return (p1,p2)-> p2.getTitle().compareTo(p1.getTitle());
        }
    }

    public static void print(List<Product> list){
        for (Product product:list){
            System.out.println(product);
        }
    }
    public static List<Product> sort(List<Product> list, Comparator<Product> comparator){
        List<Product> result = new ArrayList<>(list); // создаем копию листа list
        Collections.sort(result,comparator); // сортируем result c помощью comparator
        return result;
    }

}

