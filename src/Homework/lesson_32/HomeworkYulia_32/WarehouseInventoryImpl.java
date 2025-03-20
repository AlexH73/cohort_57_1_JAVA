package Homework.lesson_32.HomeworkYulia_32;

import java.util.HashMap;
import java.util.Map;

public class WarehouseInventoryImpl implements WarehouseInventory {
    private Map<String, Integer> inventory;

    public WarehouseInventoryImpl() {
        this.inventory = new HashMap<>();
    }

    @Override
    public boolean addItem(String itemName, int quantity) {
        if (quantity <= 0) {
            return false;
        }
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
        return true;
    }

    @Override
    public int getQuantity(String itemName) {
        return inventory.getOrDefault(itemName, -1);
    }

    @Override
    public boolean updateQuantity(String itemName, int newQuantity) {
        if (newQuantity < 0 || !inventory.containsKey(itemName)) {
            return false;
        }
        inventory.put(itemName, newQuantity);
        return true;
    }

    @Override
    public boolean removeItem(String itemName) {
        if (inventory.containsKey(itemName)) {
            inventory.remove(itemName);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsItem(String itemName) {
        return inventory.containsKey(itemName);
    }

    @Override
    public Map<String, Integer> getAllItems() {
        return new HashMap<>(inventory);
    }

    @Override
    public void clearInventory() {
        inventory.clear();
    }

    @Override
    public boolean isInventoryEmpty() {
        return inventory.isEmpty();
    }
}