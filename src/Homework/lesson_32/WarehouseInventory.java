package Homework.lesson_32;

import java.util.Map;

public interface WarehouseInventory {

    boolean addItem(String itemName, int quantity);

    boolean updateQuantity(String itemName, int newQuantity);

    boolean removeItem(String itemName);

    boolean containsItem(String itemName);

    Map<String, Integer> getAllItems();

    void clearInventory();

    boolean isInventoryEmpty();
}
