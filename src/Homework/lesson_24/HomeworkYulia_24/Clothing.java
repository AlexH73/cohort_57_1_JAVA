package Homework.lesson_24.HomeworkYulia_24;

public class Clothing extends Product {

    private boolean isSeasonSale;

    public Clothing(String name, double price, boolean isSeasonSale) {
        super(name, price);
        this.isSeasonSale = isSeasonSale;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (isSeasonSale) {
            super.applyDiscount(20); // Скидка 20%
        } else {
            super.applyDiscount(percentage);
        }
    }
}
