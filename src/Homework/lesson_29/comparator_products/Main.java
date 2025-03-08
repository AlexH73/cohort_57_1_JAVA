package Homework.lesson_29.comparator_products;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        // Добавлено новое поле в конструкторы
        products.add(new Product("LapTop Lenovo", 1566.00, 87, 5, 120));
        products.add(new Product("Apple Macbook", 1890.00, 81, 2, 95));
        products.add(new Product("Asus ZenPro", 999.00, 65, 8, 75));
        products.add(new Product("MSI", 2200.00, 91, 10, 200));
        products.add(new Product("Dell XPS 15", 1999.99, 92, 7, 180));
        products.add(new Product("HP Spectre x360", 1499.50, 88, 3, 110));
        products.add(new Product("Samsung Galaxy S24", 899.99, 85, 15, 250));
        products.add(new Product("Xiaomi Mi Pad 6", 450.00, 82, 12, 90));
        products.add(new Product("Sony WH-1000XM5", 349.99, 94, 9, 300));
        products.add(new Product("Logitech MX Keys", 129.99, 89, 20, 150));
        products.add(new Product("Apple iPad Pro", 1099.00, 90, 6, 80));
        products.add(new Product("Razer Blade 17", 2599.99, 91, 4, 65));
        products.add(new Product("Huawei MateBook D15", 799.00, 84, 11, 130));
        products.add(new Product("Canon EOS R6", 2499.00, 93, 2, 45));
        products.add(new Product("JBL Flip 6", 129.95, 87, 18, 220));
        products.add(new Product("Microsoft Surface Pro 9", 1299.00, 89, 5, 95));
        // Для проверки комбинированной сортировки:
        products.add(new Product("Dell XPS 13", 1599.99, 92, 5, 170));  // одинаковый рейтинг с Dell XPS 15
        products.add(new Product("Dell XPS 13", 1499.99, 90, 8, 160));  // одинаковое название, разные хар-ки
        // Для проверки числовых полей:
        products.add(new Product("Battery Pack", 49.99, 75, 0, 500));   // нулевое количество
        products.add(new Product("USB-C Cable", 9.99, 72, 1000, 1000));  // экстремальные значения

        Comparator<Product> comparator = buildComplexComparator();
        List<Product> sortedProducts = sort(products, comparator);
        prettyPrint(sortedProducts);
    }

    // Новый метод для построения комплексного компаратора
    private static Comparator<Product> buildComplexComparator() {
        Scanner scanner = new Scanner(System.in);
        List<Comparator<Product>> comparators = new ArrayList<>();

        while (true) {
            System.out.println("\nВыберите критерий сортировки:");
            System.out.println("1. По названию");
            System.out.println("2. По цене");
            System.out.println("3. По рейтингу");
            System.out.println("4. По количеству");
            System.out.println("5. По количеству продаж");
            System.out.println("0. Закончить выбор");

            int choice = getIntInput(scanner, "Введите номер пункта: ", 0, 5);
            if (choice == 0) break;

            // Выбор порядка сортировки
            int order = getIntInput(scanner, "Порядок (1 - возр., 2 - убыв.): ", 1, 2);

            Comparator<Product> comp = switch (choice) {
//                case 1 -> Comparator.comparing(Product::getTitle);
//                case 2 -> Comparator.comparingDouble(Product::getPrice);
//                case 3 -> Comparator.comparingInt(Product::getRating);
//                case 4 -> Comparator.comparingInt(Product::getQuantity);
//                case 5 -> Comparator.comparingInt(Product::getSoldPerMonth);
//                default -> throw new IllegalStateException();
                case 1 -> new ComparatorProductByTitle();
                case 2 -> new ComparatorProductsByPrice();
                case 3 -> new ComparatorProductByRating();
                case 4 -> new ComparatorProductByQuantity();
                case 5 -> new ComparatorProductsSoldPerMonth();
                default -> throw new IllegalStateException();
            };

            if (order == 2) comp = comp.reversed();
            comparators.add(comp);
        }

        // Комбинируем все выбранные компараторы
        if (comparators.isEmpty()) return (p1, p2) -> 0;

        Comparator<Product> result = comparators.get(0);
        for (int i = 1; i < comparators.size(); i++) {
            result = result.thenComparing(comparators.get(i));
        }

        return result;
    }

    // Улучшенный метод для безопасного ввода чисел
    private static int getIntInput(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = scanner.nextInt();
                if (input >= min && input <= max) return input;
                System.out.printf("Введите число от %d до %d!%n", min, max);
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат ввода!");
                scanner.nextLine();
            }
        }
    }

    // Новый метод для красивого вывода
    private static void prettyPrint(List<Product> products) {
        System.out.println("\nРезультаты сортировки:");
        System.out.println("\u001B[34m+--------------------------+-----------+--------+----------+---------------+");
        System.out.println("| Название                 | Цена ($)  | Рейтинг | Наличие | Продажи/месяц |");
        System.out.println("+--------------------------+-----------+--------+----------+---------------+\u001B[0m");

        for (Product p : products) {
            System.out.printf("\u001B[34m| \u001B[0m%-24s\u001B[34m | \u001B[0m%9.2f\u001B[34m | \u001B[0m%6d\u001B[34m | \u001B[0m%8d\u001B[34m | \u001B[0m%13d\u001B[34m |\u001B[0m%n",
                    p.getTitle(),
                    p.getPrice(),
                    p.getRating(),
                    p.getQuantity(),
                    p.getSoldPerMonth());
        }

        System.out.println("\u001B[34m+--------------------------+-----------+--------+----------+---------------+\u001B[0m");
        System.out.printf("\u001B[34m| \u001B[0m Всего товаров: %55d \u001B[34m |\u001B[0m%n", products.size());
        System.out.println("\u001B[34m+" + "-".repeat(74) + "+\u001B[0m");
    }

    // Метод сортировки (без изменений)
    public static List<Product> sort(List<Product> list, Comparator<Product> comparator) {
        List<Product> result = new ArrayList<>(list);
        Collections.sort(result, comparator);
        return result;
    }
}
