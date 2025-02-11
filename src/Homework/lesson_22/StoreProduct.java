/*package Homework.lesson_22;
//Обновленный класс Product (добавлены геттеры)
public class StoreProduct {

    String name;    //Название товара
    double price;   // Цена товара
    int stock;      // Количество товара на складе
    double percentage; //Процент скидки
    int quantity;  //Количество товара для продажи


    // Конструктор для инициализации товара
    public StoreProduct(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //(добавлены геттеры)

    public double getPrice() {
        return price;
    }

    //метод applyDiscount(double percentage), который уменьшает цену товара на заданный процент
    //Процент скидки (например, 10 для 10%)
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
            System.out.println("Скидка: " + percentage + "% применена. Новая цена: " + price);
        } else {
            System.out.println("Ошибка: скидка должна быть  от 0 до 100%");
        }
    }

    //метод sell(int quantity), чтобы он проверял наличие нужного количества товара;
//если товара недостаточно, продавать только доступное количество и выводить сообщение
//Метод уменьшает количество товара на складе при продаже.
    public void sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("Ошибка: количество для продажи должно быть больше нуля.");
            return;
        }
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println(quantity + " шт.товара \" " + name + "\" продано. Остаток на складе: " + stock);
        } else {
            System.out.println("На складе не достаточно товара \" " + name + "\". Продано только " + stock + " шт.");
            stock = 0; //Все товары проданы
        }
    }

    // Метод  displayInfo() выводит информацию о товаре
    public void displayInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Цена: " + price);
        System.out.println("В наличии: " + stock + " шт.");
        System.out.println("------------------------------");
    }

}
*/
