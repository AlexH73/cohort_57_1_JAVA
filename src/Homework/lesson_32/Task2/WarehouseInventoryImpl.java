package Homework.lesson_32.Task2;

import java.util.HashMap;
import java.util.Map;

public class WarehouseInventoryImpl implements WarehouseInventory {
    private Map<String, Integer> inventory;

    public WarehouseInventoryImpl() {
        this.inventory = new HashMap<>();
    }

    /**
     * Добавляет новый товар на склад.
     * Если товар уже существует, увеличивает его количество.
     *
     * @param itemName название товара
     * @param quantity количество товара
     * @return true, если товар был успешно добавлен или обновлён, иначе false
     */
    @Override
    public boolean addItem(String itemName, int quantity) {
        if (itemName == null || quantity <= 0) {
            return false;
        }
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
        return true;
    }

    /**
     * Получает текущее количество товара по его названию.
     *
     * @param itemName название товара
     * @return количество товара, если он найден, иначе -1
     */
    public int getQuantity(String itemName) {
        return inventory.getOrDefault(itemName, -1);
    }

    /**
     * Обновляет количество товара на складе.
     * Если товар не найден, метод ничего не делает.
     *
     * @param itemName    название товара
     * @param newQuantity новое количество товара
     * @return true, если количество товара было обновлено, иначе false
     */
    @Override
    public boolean updateQuantity(String itemName, int newQuantity) {
        if (!inventory.containsKey(itemName) || newQuantity < 0) {
            return false;
        }
        inventory.put(itemName, newQuantity);
        return true;
    }

    /**
     * Удаляет товар со склада.
     *
     * @param itemName название товара
     * @return true, если товар был удалён, иначе false
     */

    @Override
    public boolean removeItem(String itemName) {
        if (!inventory.containsKey(itemName)) {
            return false;
        }
        inventory.remove(itemName);
        return true;
    }

    /**
     * Проверяет, содержится ли товар на складе.
     *
     * @param itemName название товара
     * @return true, если товар найден, иначе false
     */
    @Override
    public boolean containsItem(String itemName) {
        return inventory.containsKey(itemName);
    }

    /**
     * Выводит список всех товаров и их количества.
     *
     * @return `Map` со всеми товарами
     */

    @Override
    public Map<String, Integer> getAllItems() {
        return new HashMap<>(inventory);
    }


    /**
     * Очищает склад, удаляя все товары.
     */

    @Override
    public void clearInventory() {
        inventory.clear();
    }

    /**
     * Проверяет, пуст ли склад.
     *
     * @return true, если склад не содержит товаров, иначе false
     */

    @Override
    public boolean isInventoryEmpty() {
        return inventory.isEmpty();
    }
}
