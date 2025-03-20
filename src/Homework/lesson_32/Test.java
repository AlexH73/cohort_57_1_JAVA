package Homework.lesson_32;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        WarehouseInventory warehouse = new WarehouseInventoryImpl();

        //добавление товаров
        warehouse.addItem("Монитор", 25);
        warehouse.addItem("Клавиатура", 40);
        warehouse.addItem("Мышь", 30);

        //Вывод всех товаров
        Map<String, Integer> items = warehouse.getAllItems();
        System.out.println("Товары на складе: " + items);


        //Обновление количества товара
        warehouse.updateQuantity("Монитор", 100);
        System.out.println("Обновленное количество мониторов: " + warehouse.updateQuantity("Монитор", 100));

        //Проверка наличия товара
        System.out.println("Есть ли клавиатура на складе? " + warehouse.containsItem("Клавиатура"));
        System.out.println("Есть ли принтер на складе? " + warehouse.containsItem("Принтер"));
        // Удаление товара
        warehouse.removeItem("Мышь");
        System.out.println("Товары после удаления мыши: " + warehouse.getAllItems());
        // Проверка, пуст ли склад
        System.out.println("Склад пуст? " + warehouse.isInventoryEmpty());
        // Очистка склада
        warehouse.clearInventory();
        System.out.println("Склад после очистки: " + warehouse.isInventoryEmpty());
        System.out.println("Склад пуст? " + warehouse.isInventoryEmpty());


    }
}
