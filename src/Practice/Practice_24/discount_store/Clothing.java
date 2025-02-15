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

public class Clothing extends Product {
    private String size;
    private String color;
    private boolean seasonalSale; // флаг сезонной распродажи

    // Конструктор
    public Clothing(String name, double price, String size, String color, boolean seasonalSale) {
        super(name, price);
        this.size = size;
        this.color = color;
        this.seasonalSale = seasonalSale;
    }

    // Геттеры и сеттеры
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeasonalSale() {
        return seasonalSale;
    }

    public void setSeasonalSale(boolean seasonalSale) {
        this.seasonalSale = seasonalSale;
    }

    // Переопределение метода applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();
        if (seasonalSale) {
            double discountedPrice = getPrice() * 0.8;
            setPrice(discountedPrice);
            System.out.println("Цена снижена на 20% из-за сезонной распродажи. Новая цена: " + getPrice());
        } else {
            System.out.println("Сезонной распродажи нет. Цена остается прежней: " + getPrice());
        }
    }
}
