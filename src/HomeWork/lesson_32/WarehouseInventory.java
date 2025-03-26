package Homework.lesson_32;

import java.util.HashMap;
import java.util.Map;

public class WarehouseInventory implements WarehouseInventoryInterface {
    private Map<String, Integer> warenInventory;

    public WarehouseInventory() {
        this.warenInventory = new HashMap<>();
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
        if (warenInventory.containsKey(itemName)) {
            return false;
        }
        this.warenInventory.put(itemName, quantity) ;
        return true;
    }


    /**
     * Получает текущее количество товара по его названию.
     *
     * @param itemName название товара
     * @return количество товара, если он найден, иначе -1
     */
    int getQuantity(String itemName);

    /**
     * Обновляет количество товара на складе.
     * Если товар не найден, метод ничего не делает.
     *
     * @param itemName название товара
     * @param newQuantity новое количество товара
     * @return true, если количество товара было обновлено, иначе false
     */
    boolean updateQuantity(String itemName, int newQuantity);

    /**
     * Удаляет товар со склада.
     *
     * @param itemName название товара
     * @return true, если товар был удалён, иначе false
     */
    boolean removeItem(String itemName);

    /**
     * Проверяет, содержится ли товар на складе.
     *
     * @param itemName название товара
     * @return true, если товар найден, иначе false
     */
    boolean containsItem(String itemName);

    /**
     * Выводит список всех товаров и их количества.
     *
     * @return `Map` со всеми товарами
     */
    Map<String, Integer> getAllItems();

    /**
     * Очищает склад, удаляя все товары.
     */
    void clearInventory();

    /**
     * Проверяет, пуст ли склад.
     *
     * @return true, если склад не содержит товаров, иначе false
     */
    boolean isInventoryEmpty();

}
