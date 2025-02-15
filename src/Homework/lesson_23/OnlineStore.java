package Homework.lesson_23;

public class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;

    //Конструктор
    public OnlineStore(String productName, double price, int discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    //Геттеры (название продукта не изменяется после инициализации)
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
    //Сеттер для цены с валидацией
    public void setPrice(double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException("Цена не может быть отрицательной.");
        }
        this.price = price;
    }
    //Сеттер для скидки, использующий приватный метод валидации
    public void setDiscountPercentage(int discountPercentage) {
        this.validateDiscount(discountPercentage);
        this.discountPercentage = discountPercentage;
    }
    //Приватный метод для валидации скидки
    private void validateDiscount(int discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 50) {
            throw new IllegalArgumentException("Скидка должна быть в диапазоне от 0 до 50%.");
        }
    }
    //Метод для вычисления финальной цены с учетом скидки
    public double getFinalPrice() {
        return price * (1 - discountPercentage / 100.0);
    }
    //Метод для отображения информации о продукте
    public void displayProductInfo() {
        System.out.println("Продукт: " + productName);
        System.out.println("Цена: " + price + " $");
        System.out.println("Скидка: " + discountPercentage + " %");
        System.out.println("Итоговая цена: " + getFinalPrice() + " $");
    }
}
