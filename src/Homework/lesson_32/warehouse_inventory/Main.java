package Homework.lesson_32.warehouse_inventory;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WarehouseInventory warehouse = new WarehouseInventoryImpl();

        // Добавление товаров
        warehouse.addItem("Монитор", 25);
        warehouse.addItem("Клавиатура", 40);
        warehouse.addItem("Мышь", 30);

        // Обновление количества
        warehouse.updateQuantity("Клавиатура", 50);

        // Проверка наличия
        System.out.println("Есть ли мышь? " + (warehouse.containsItem("Мышь")? "Да" : "Нет")); // true

        // Удаление товара
        warehouse.removeItem("Мышь");

        // Вывод всех товаров
        Map<String, Integer> items = warehouse.getAllItems();
        System.out.println("Товары на складе: " + items); // {Монитор=25, Клавиатура=50}
    }
}
