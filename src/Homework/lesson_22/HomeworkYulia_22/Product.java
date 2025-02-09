// Задание 3: Расширение класса Product
//Добавить метод applyDiscount(double percentage), который уменьшает цену товара на заданный процент.
//Изменить метод sell(int quantity), чтобы он проверял наличие нужного количества товара; если товара недостаточно, продавать только доступное количество и выводить сообщение.
//Протестировать класс, создав несколько объектов Product и применив скидки и продажи.

package Homework.lesson_22.HomeworkYulia_22;

public class Product {
    String goodsName;
    double price;
    int quantity;

    public Product(String goodsName, double price, int quantity) {
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
            System.out.println("Использованна скидка " + percentage + "%. Новая цена: " + price);
        } else {
            System.out.println("Ошибка: некорректный процент скидки.");
        }
    }

    public void sell(int requestedQuantity) {
        if (requestedQuantity <= 0) {
            System.out.println("Ошибка: количество товара для продажи должно быть положительным.");
            return;
        }

        if (requestedQuantity > quantity) {
            System.out.println("Недостаточно товара! Продаем только " + quantity + " шт.");
            quantity = 0;
        } else {
            quantity -= requestedQuantity;
            System.out.println("Продано " + requestedQuantity + " шт. Осталось на складе: " + quantity);
        }
    }

    public void displayProductInfo() {
        System.out.println("Название: " + goodsName + ", Цена: " + price + ", Количество: " + quantity);
    }
}

