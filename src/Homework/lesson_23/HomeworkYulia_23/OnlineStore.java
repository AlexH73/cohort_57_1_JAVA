// Часть 3: Инкапсуляция с приватными методами
//🔹 В следующем классе используйте приватный метод для проверки значений внутри класса.
//🔹 Приватный метод должен вызываться только внутри класса, обеспечивая консистентность данных.
//
/// / TODO: Реализовать приватные методы для валидации внутри класса.
/// / 1. `setDiscountPercentage()` должен принимать только значения от 0 до 50%.
/// / 2. Приватный метод `validateDiscount()` должен использоваться внутри сеттера.


package Homework.lesson_23.HomeworkYulia_23;

public class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private boolean validateDiscount(int discountPercentage) {
        return discountPercentage >= 0 && discountPercentage <= 50;
    }

    public void setDiscountPercentage(int discountPercentage) {
        if (validateDiscount(discountPercentage)) {
            this.discountPercentage = discountPercentage;
        }
        else {
            System.out.println("Ошибка: скидка должна быть от 0% до 50%!");
        }
    }
}
