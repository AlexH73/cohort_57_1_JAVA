package Homerwork.Practica.Practica25.OnlineStore;

//✔ Создать массив Product[], добавить туда товары разных типов и применить к ним скидки
public class ProductTest {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics("Ноутбук", 500.0, 2),
                new Clothing("Платье", 30.0, "S","красное",true),
                new Grocery("Масло", 10.0, true)
        };

        for (Product product : products) {
            System.out.println("\nПрименяем скидку для: " + product.name);
            product.applyDiscount();
        }
    }
}
