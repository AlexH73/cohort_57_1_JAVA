package Homerwork.ProjektSinema;

import java.util.Scanner;

public class Administrator extends AbstractUser implements IAdministrator {
    private static IFilm film;
    private Scanner scanner = new Scanner(System.in);
    /**
            * Создать новый фильм в системе.
     * @param name     Название фильма.
     * @param duration Продолжительность фильма.
     * @return Информация о созданном фильме.yyy
     */
    private void addFilm() {
        System.out.println("Введите название фильма: ");
        String name = scanner.nextLine();
        System.out.println("Введите продолжительность (в минутах): ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        Administrator admin = new Administrator();
        IFilm film = admin.createFilm(name, duration);
        if (film != null) {
            film.add(film);
            System.out.println("Фильм успешно добавлен!");
        }
    }
    /**
     * Создать новый продукт в системе.
     *
     * @param price         Цена продукта.
     * @param description   Описание продукта.
     * @param stockQuantity Количество продукта на складе.
     * @param name          Название продукта.
     * @return Информация о созданном продукте.
     */
    public IFilm createFilm(String name, int duration) {

        System.out.println("Введите жанр: ");
        String genre = scanner.nextLine();
        System.out.println("Введите рейтинг: ");
        String rating = scanner.nextLine();
        System.out.println("Введите описание: ");
        String description = scanner.nextLine();
        System.out.println("Введите язык: ");
        String language = scanner.nextLine();

        return new Film(name, duration, genre, rating, description, language);
    }

    @Override
    public main_project.src.interfaces.ISession createSession(IFilm film, main_project.src.interfaces.ICinemaHall hall, String dateTime) {
        return null;
    }

    /**
         * Удалить фильм из системы.
         * @param film Фильм для удаления.
         */
        private void deleteFilm(IFilm film) {
            viewFilms();
                if (film.isEmpty())
                        return;
            System.out.println("Введите номер фильма для удаления: ");
            int index = scanner.nextInt();
            scanner.nextLine();

            if (index > 0 && index <= film.size()) {
                film.remove(index - 1);
                System.out.println("Фильм удален.");
            } else {
                System.out.println("Неверный индекс.");
            }
        }
    private static void viewFilms() {
        if (film.isEmpty()) {
            System.out.println("Список фильмов пуст.");
            return;
        }

        System.out.println("\nСписок фильмов:");
        for (int i = 0; i < film.size(); i++) {
            System.out.println((i + 1) + ". " + film.get(i));
        }
    }

    /**
     * Создать новый сеанс в системе.
     * @param film Фильм для сеанса.
     * @param hall Кинозал для сеанса.
     * @param dateTime Дата и время сеанса.
     * @return Информация о созданном сеансе.
     */
    //ISession createSession(IFilm film, ICinemaHall hall, String dateTime);





    /**
         * Удалить сеанс из системы.
         * @param session Сеанс для удаления.
         */
        //void deleteSession(ISession session);

        /**
         * Удалить продукт из системы.
         * @param product Продукт для удаления.
         */
       // void deleteProduct(IProduct product);

        /**
         * Генерировать отчет о продажах билетов за указанный период времени.
         * @param startDate Начальная дата периода.
         * @param endDate Конечная дата периода.
         * @return Отчет о продажах билетов.
         */
        //String generateTicketSalesReport(String startDate, String endDate);

        /**
         * Генерировать отчет о продажах продуктов за указанный период времени.
         * @param startDate Начальная дата периода.
         * @param endDate Конечная дата периода.
         * @return Отчет о продажах продуктов.
         */
       // String generateProductSalesReport(String startDate, String endDate);





        @Override
        public String getUsername() {
                return "";
        }

        @Override
        public void setUsername(String username) {

        }

        @Override
        public String getPassword() {
                return "";
        }

        @Override
        public void setPassword(String password) {

        }
}
