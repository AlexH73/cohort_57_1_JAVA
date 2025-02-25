package Homerwork.Practica.Practica22;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //Метод для продажи товара
    public boolean sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println("Продано: " + quantity + " шт. | Остаток на складе: " + stock);
            return true;
        } else {
            System.out.println("Ошибка: недостаточно товара на складе или некорректное количество.");
            return false;
        }
    }

    //Метод для пополнения склада
    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println("Пополнение: +" + quantity + " шт. | Новый запас: " + stock);
        } else {
            System.out.println("Ошибка: количество пополнения должно быть больше нуля.");
        }
    }

    //Метод для отображения информации о товаре
    public void displayProductInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество на складе: " + stock);
    }
}
