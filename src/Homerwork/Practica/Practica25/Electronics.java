package Homerwork.Practica.Practica25;
//✔ Electronics – добавляет warranty (гарантия в годах).
//✔ У Electronics метод applyDiscount() снижает цену на 10%.
public class Electronics extends Product {
    private int warranty;   //Добавлено поле warranty (гарантия в годах).

    public Electronics(String name, double price, int warranty) {
        super(name, price);  //Конструктор: Вызывает конструктор Product через super(), добавляя гарантию.
        this.warranty = warranty;
    }

    @Override
    public void applyDiscount() {  //Переопределение applyDiscount(): Уменьшает цену на 10%
        super.applyDiscount(); // и вызывает super.applyDiscount(), чтобы сначала вызывался метод родительского класса.
        price *= 0.9;         //10% скидка
        System.out.println("Новая цена после скидки: " + price);
    }

}
