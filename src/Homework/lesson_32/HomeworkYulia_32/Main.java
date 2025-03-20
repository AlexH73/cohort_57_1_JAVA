package Homework.lesson_32.HomeworkYulia_32;

import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        MapOperationsHomework mapOps = new MapOperationsHomeworkImpl();


        Map<String, String> stringMap = new LinkedHashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        stringMap.put("C", "Apple");

        mapOps.removeSameValues(stringMap);
        System.out.println(stringMap); // Ожидаемый результат: {B=Banana}


        Map<Integer, Integer> intMap = new LinkedHashMap<>();
        intMap.put(1, 10);
        intMap.put(2, 30);
        intMap.put(3, 50);
        intMap.put(4, 50);

        mapOps.removeSameValuesAnyTypes(intMap);
        System.out.println(intMap);



        WarehouseInventory warehouse = new WarehouseInventoryImpl();

        // Добавление товаров
        warehouse.addItem("Монитор", 25);
        warehouse.addItem("Клавиатура", 40);
        warehouse.addItem("Мышь", 30);

        // Проверка получения количества
        System.out.println("Количество мониторов: " + warehouse.getQuantity("Монитор"));

        // Проверка обновления количества
        warehouse.updateQuantity("Монитор", 20);
        System.out.println("Обновленное количество мониторов: " + warehouse.getQuantity("Монитор"));

        // Проверка удаления товара
        warehouse.removeItem("Клавиатура");
        System.out.println("Содержит ли склад клавиатуру? " + warehouse.containsItem("Клавиатура"));

        // Проверка наличия товара
        System.out.println("Есть ли мыши на складе? " + warehouse.containsItem("Мышь"));

        // Проверка на пустоту
        System.out.println("Склад пуст? " + warehouse.isInventoryEmpty());

        // Вывод всех товаров
        System.out.println("Все товары на складе: " + warehouse.getAllItems());

        // Очистка инвентаря
        warehouse.clearInventory();
        System.out.println("После очистки склад пуст? " + warehouse.isInventoryEmpty());
    }
}

