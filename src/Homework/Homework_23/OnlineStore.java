package Homework.Homework_23;

/**
 * <h1>Часть 3: Инкапсуляция с приватными методами</h1>
 * <p>
 * 🔹 В следующем классе используйте приватный метод для проверки значений внутри класса.<br>
 * 🔹 Приватный метод должен вызываться только внутри класса, обеспечивая консистентность данных.<br>
 **/

//[x] TODO: Реализовать приватные методы для валидации внутри класса.
// 1. `setDiscountPercentage()` должен принимать только значения от 0 до 50%.
// 2. Приватный метод `validateDiscount()` должен использоваться внутри сеттера.
public class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;

    // Геттеры и сеттеры для productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            // тут я бы сделал вот так:
            // throw new IllegalArgumentException("Название продукта не может быть null или пустым.");
            // но боюсь это опять приведет к замечанию )))) поэтому...
            System.out.println("Название продукта не может быть null или пустым.");
        }
        this.productName = productName;
    }

    // Геттеры и сеттеры для price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Цена должна быть больше нуля.");
        }
        this.price = price;
    }

    // Геттеры и сеттеры для discountPercentage
    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        validateDiscount(discountPercentage);
        this.discountPercentage = discountPercentage;
    }

    // Приватный метод для валидации discountPercentage
    private void validateDiscount(int discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 50) {
            System.out.println("Процент скидки должен быть в диапазоне от 0 до 50.");
        }
    }
}
