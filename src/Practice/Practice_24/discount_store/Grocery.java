package Practice.Practice_24.discount_store;

import java.time.LocalDate;

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

public class Grocery extends Product {
    private LocalDate expirationDate;

    // Конструктор
    public Grocery(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    // Геттеры и сеттеры
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Переопределение метода applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();
        if (expirationDate.isBefore(LocalDate.now().plusDays(7))) {
            double discountedPrice = getPrice() * 0.5;
            setPrice(discountedPrice);
            System.out.println("Цена снижена на 50% из-за близкого срока годности. Новая цена: " + getPrice() + currency);
        } else {
            System.out.println("Срок годности в порядке. Цена остается прежней: " + getPrice() + currency);
        }
    }
}
