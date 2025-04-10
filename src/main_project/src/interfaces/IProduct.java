package main_project.src.interfaces;

/**
 * Интерфейс IProduct предоставляет контракт для класса, представляющего продукт (напиток, еду и т. д.) в системе управления кинотеатром.
 */
public interface IProduct {

    /**
     * Получить название продукта.
     *
     * @return Название продукта.
     */
    String getName();

    /**
     * Установить новое название продукта.
     *
     * @param name Новое название продукта.
     */
    void setName(String name);

    /**
     * Получить цену продукта.
     *
     * @return Цена продукта.
     */
    double getPrice();

    /**
     * Установить новую цену продукта.
     *
     * @param price Новая цена продукта.
     */
    void setPrice(double price);

    /**
     * Получить описание продукта.
     *
     * @return Описание продукта.
     */
    String getDescription();

    /**
     * Установить новое описание продукта.
     *
     * @param description Новое описание продукта.
     */
    void setDescription(String description);

    /**
     * Получить количество продукта на складе.
     *
     * @return Количество продукта на складе.
     */
    int getStockQuantity();

    /**
     * Установить новое количество продукта на складе.
     *
     * @param stockQuantity Новое количество продукта на складе.
     */
    void setStockQuantity(int stockQuantity);

    /**
     * Уменьшить количество продукта на складе на указанное значение.
     *
     * @param quantity Количество продукта, которое следует убрать со склада.
     */
    void reduceStock(int quantity);

    /**
     * Увеличить количество продукта на складе на указанное значение.
     *
     * @param quantity Количество продукта, которое следует добавить на склад.
     */
    void increaseStock(int quantity);
}
