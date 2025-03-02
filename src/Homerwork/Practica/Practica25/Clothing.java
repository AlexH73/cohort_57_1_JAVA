package Homerwork.Practica.Practica25;
//✔ Clothing – добавляет size (размер) и color (цвет).
// ✔ У Clothing метод applyDiscount() снижает цену на 20%, если сезон распродаж.
public class Clothing extends Product{
    private String size;
    private  String color;
    private boolean isSaleSeason = false;  //Идет ли сезон распродаж

    public Clothing(String name, double price, String size, String color, boolean isSaleSeason) {
        super(name, price);  //Конструктор: Вызывает super(), добавляя размер и цвет.
        this.size = size;
        this.color = color;
        this.isSaleSeason = isSaleSeason;
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
        if (isSaleSeason) {
            price *= 0.8; //20% скидка,если сезон распродаж (isSaleSeason == true)
            System.out.println("Сезонная распродажа! Новая цена: " + price);
        }
    }
}
