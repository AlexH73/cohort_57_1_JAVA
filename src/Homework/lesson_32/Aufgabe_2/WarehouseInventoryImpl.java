package Homework.lesson_32.Aufgabe_2;

import java.util.HashMap;
import java.util.Map;

public class WarehouseInventoryImpl implements WarehouseInventory{

private final Map<String, Integer> ware = new HashMap<>();
    @Override
    public boolean addItem(String itemName, int quantity) {
        if (quantity <= 0) return false;
        ware.put(itemName, ware.getOrDefault(itemName, 0) + quantity);
        return true;
    }

    @Override
    public int getQuantity(String itemName) {
        return ware.getOrDefault(itemName, -1);
    }

    @Override
    public boolean updateQuantity(String itemName, int newQuntity) {
        if (!ware.containsKey(itemName) || newQuntity< 0) return false;
        ware.put(itemName, newQuntity);
        return true;
    }

    @Override
    public boolean removeItem(String itemName) {
        if(!ware.containsKey(itemName)) return false;
        ware.remove(itemName);
        return  true;
    }

    @Override
    public boolean containsItem(String itemName) {
        return ware.containsKey(itemName);
    }

    @Override
    public Map<String, Integer> getAllItems() {
        return new HashMap<>(ware);
    }

    @Override
    public void clearInventory() {
        ware.clear();
    }

    @Override
    public boolean isInventoryEmpty() {
        return ware.isEmpty();
    }
}
