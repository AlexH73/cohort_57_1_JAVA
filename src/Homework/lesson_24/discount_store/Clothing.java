package Homework.lesson_24.discount_store;

// Clothing - не является частью электроники,
// так что не корректно расширять класс Electronics и наследоваться от него
public class Clothing extends Product {
    private boolean seasonalSale;

    // Конструктор
    public Clothing(String name, double price, boolean seasonalSale) {
        super(name, price);
        this.seasonalSale = seasonalSale;
    }

    // Переопределение метода applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();
        if (seasonalSale) {
            double  discountedPrice = getPrice() * 0.8;
            setPrice(discountedPrice);
            System.out.println("Цена снижена на 20% из-за сезонной распродажи. Новая цена: " + getPrice());
        } else {
            System.out.println("Сезонной распродажи нет. Цена остается прежней: " + getPrice());
        }
    }
}
