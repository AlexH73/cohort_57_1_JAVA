package main_project.src.interfaces;

/**
 * Интерфейс IAdministrator предоставляет контракт для класса, представляющего администратора в системе управления кинотеатром.
 */
public interface IAdministrator extends IUser {

    /**
     * Создать новый фильм в системе.
     *
     * @param name Название фильма.
     * @param duration Продолжительность фильма.
     * @return Информация о созданном фильме.
     */
    IFilm createFilm(String name, int duration);

    /**
     * Создать новый сеанс в системе.
     *
     * @param film Фильм для сеанса.
     * @param hall Кинозал для сеанса.
     * @param dateTime Дата и время сеанса.
     * @return Информация о созданном сеансе.
     */
    ISession createSession(IFilm film, ICinemaHall hall, String dateTime);

    /**
     * Создать новый продукт в системе.
     *
     * @param name Название продукта.
     * @param price Цена продукта.
     * @param description Описание продукта.
     * @param stockQuantity Количество продукта на складе.
     * @return Информация о созданном продукте.
     */
    IProduct createProduct(String name, double price, String description, int stockQuantity);

    /**
     * Удалить фильм из системы.
     *
     * @param film Фильм для удаления.
     */
    void deleteFilm(IFilm film);

    /**
     * Удалить сеанс из системы.
     *
     * @param session Сеанс для удаления.
     */
    void deleteSession(ISession session);

    /**
     * Удалить продукт из системы.
     *
     * @param product Продукт для удаления.
     */
    void deleteProduct(IProduct product);

    /**
     * Генерировать отчет о продажах билетов за указанный период времени.
     *
     * @param startDate Начальная дата периода.
     * @param endDate Конечная дата периода.
     * @return Отчет о продажах билетов.
     */
    String generateTicketSalesReport(String startDate, String endDate);

    /**
     * Генерировать отчет о продажах продуктов за указанный период времени.
     *
     * @param startDate Начальная дата периода.
     * @param endDate Конечная дата периода.
     * @return Отчет о продажах продуктов.
     */
    String generateProductSalesReport(String startDate, String endDate);
}
