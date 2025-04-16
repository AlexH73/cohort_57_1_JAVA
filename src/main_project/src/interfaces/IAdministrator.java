package main_project.src.interfaces;

import main_project.src.classes.*;



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
    @Override
    public IFilm createFilm(String name, int duration) {
        System.out.println("Film erstellt: " + name);
        return new Film(name, duration);
    }

    /**
     * Создать новый сеанс в системе.
     *
     * @param film Фильм для сеанса.
     * @param hall Кинозал для сеанса.
     * @param dateTime Дата и время сеанса.
     * @return Информация о созданном сеансе.
     */
    @Override
    public ISession createSession(IFilm film, ICinemaHall hall, String dateTime) {
        System.out.println("Session erstellt für Film: " + film);
        return new Session(film, hall, dateTime);
    }

    /**
     * Создать новый продукт в системе.
     *
     * @param name Название продукта.
     * @param price Цена продукта.
     * @param description Описание продукта.
     * @param stockQuantity Количество продукта на складе.
     * @return Информация о созданном продукте.
     */
    @Override
    public IProduct createProduct(String name, double price, String description, int stockQuantity) {
        System.out.println("Produkt erstellt: " + name);
        return new Product(name, price, description, stockQuantity);
    }

    /**
     * Удалить фильм из системы.
     *
     * @param film Фильм для удаления.
     */
    @Override
    public void deleteFilm(IFilm film) {
        System.out.println("Film gelöscht: " + film);
    }

    /**
     * Удалить сеанс из системы.
     *
     * @param session Сеанс для удаления.
     */
    @Override
    public void deleteSession(ISession session) {
        System.out.println("Session gelöscht: " + session);
    }

    /**
     * Удалить продукт из системы.
     *
     * @param product Продукт для удаления.
     */
    @Override
    public void deleteProduct(IProduct product) {
        System.out.println("Produkt gelöscht: " + product);
    }

    /**
     * Генерировать отчет о продажах билетов за указанный период времени.
     *
     * @param startDate Начальная дата периода.
     * @param endDate Конечная дата периода.
     * @return Отчет о продажах билетов.
     */
    @Override
    public String generateTicketSalesReport(String startDate, String endDate) {
        return "Ticket Sales Report vom " + startDate + " bis " + endDate;
    }

    /**
     * Генерировать отчет о продажах продуктов за указанный период времени.
     *
     * @param startDate Начальная дата периода.
     * @param endDate Конечная дата периода.
     * @return Отчет о продажах продуктов.
     */
    @Override
    public String generateProductSalesReport(String startDate, String endDate) {
        return "Product Sales Report vom " + startDate + " bis " + endDate;
    }
}
