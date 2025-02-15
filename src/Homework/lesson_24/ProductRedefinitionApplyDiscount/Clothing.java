package Homework.lesson_24.ProductRedefinitionApplyDiscount;
// 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если это сезонная распродажа.

//Подкласс Clothing, наследуется от Product
public class Clothing extends Product {
    private boolean isSeasonSale;

    //Конструктор
    public Clothing(String name, double price, boolean isSeasonSale) {
        super(name, price);
        this.isSeasonSale = isSeasonSale;
    }
    //Переопределенный метод applyDiscount()
    @Override
    public void applyDiscount() {
        if (isSeasonSale) {
            super.applyDiscount();     //Вызывает метод из родительского класса
            price *= 0.8;              //снижаем цену на 20%
            System.out.println("Сезонная скидка на одежду: 20 %.");
        } else {
            System.out.println("Сезонная скидка не применяется.");
        }

    }
}
