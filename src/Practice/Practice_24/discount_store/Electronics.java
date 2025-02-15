package Practice.Practice_24.discount_store;

/**
 * Шаг 2: Создание подклассов Electronics, Clothing, Grocery
 * <p>
 * ✔ Electronics – добавляет warranty (гарантия в годах).
 * ✔ Clothing – добавляет size (размер) и color (цвет).
 * ✔ Grocery – добавляет expirationDate (срок годности).
 * Шаг 3: Переопределение метода applyDiscount()
 * <p>
 * ✔ У Electronics метод applyDiscount() снижает цену на 10%.
 * ✔ У Clothing метод applyDiscount() снижает цену на 20%, если сезон распродаж.
 * ✔ У Grocery метод applyDiscount() снижает цену на 50%, если срок годности скоро истекает.
 * <p>
 * 🚀 Дополнительно:
 * ✔ Использовать super.applyDiscount(), чтобы сначала вызывался метод родительского класса.
 * ✔ Создать массив Product[], добавить туда товары разных типов и применить к ним скидки.
 */
public class Electronics extends Product {
    private int warranty; // гарантия в годах

    // Конструктор
    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    // Геттеры и сеттеры
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    // Переопределение метода applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();
        double discountedPrice = getPrice() * 0.9;
        setPrice(discountedPrice);
        System.out.println("Цена снижена на 10%. Новая цена: " + getPrice());
    }
}
