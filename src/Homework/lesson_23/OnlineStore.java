package Homework.lesson_23;

// TODO: Реализовать приватные методы для валидации внутри класса.
// 1. `setDiscountPercentage()` должен принимать только значения от 0 до 50%.
// 2. Приватный метод `validateDiscount()` должен использоваться внутри сеттера.
class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            return;
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            return;
        }
        this.price = price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        if (validateDiscount(discountPercentage)) {
            this.discountPercentage = discountPercentage;
        }
    }

    private boolean validateDiscount(int discountPercentage) {
        return discountPercentage >= 0 && discountPercentage <= 50;
    }
}
