package Homerwork.Practica.Practica25;
//✔ Grocery – добавляет expirationDate (срок годности).
//✔ У Grocery метод applyDiscount() снижает цену на 50%, если срок годности скоро истекает.
public class Grocery extends Product{
    private boolean expirationDate = false;

    public Grocery(String name, double price, boolean expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount(); //Вызываем super.applyDiscount(), чтобы сохранить базовое поведение.
        if (expirationDate) {
            price *= 0.5;   // Скидка 50%, если срок годности истекает
            System.out.println("Срок годности скоро истекает! Новая цена: " + price);
        }
    }
}
