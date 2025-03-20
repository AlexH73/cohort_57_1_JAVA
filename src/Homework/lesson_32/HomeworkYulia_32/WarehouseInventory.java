package Homework.lesson_32.HomeworkYulia_32;

import java.util.Map;

public interface WarehouseInventory {
    boolean addItem(String itemName, int quantity);

    int getQuantity(String itemName);

    boolean updateQuantity(String itemName, int newQuantity);

    boolean removeItem(String itemName);

    boolean containsItem(String itemName);

    Map<String, Integer> getAllItems();

    void clearInventory();

    boolean isInventoryEmpty();
}
