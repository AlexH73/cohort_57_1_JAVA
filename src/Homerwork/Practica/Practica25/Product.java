package Homerwork.Practica.Practica25;
//✔ Метод applyDiscount(), который выводит "Скидка пока не применяется."
// Метод displayInfo(): Выводит информацию о товаре.(для себя)
public class Product {
    protected String name; //Позволяет подклассам напрямую обращаться к name и price.
    protected double price; //Если бы price был private, пришлось бы использовать
                            // getPrice() и setPrice(), что немного усложнило бы код.

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount() {
        System.out.println("Скидка пока не применяется.");
    }

    public void displayInfo() {
        System.out.println("Товар: " + name + ", Цена: " + price);
    }
}
