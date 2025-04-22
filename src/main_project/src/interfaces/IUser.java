package main_project.src.interfaces;

/**
 * Интерфейс IUser предоставляет контракт для класса, представляющего пользователя в системе управления кинотеатром.
 */
public interface IUser {

    /**
     * Получить имя пользователя.
     *
     * @return Имя пользователя.
     */
    String getUsername();

    /**
     * Установить новое имя пользователя.
     *
     * @param username Новое имя пользователя.
     */
    void setUsername(String username);

    /**
     * Получить пароль пользователя.
     *
     * @return Пароль пользователя.
     */
    String getPassword();

    /**
     * Установить новый пароль пользователя.
     *
     * @param password Новый пароль пользователя.
     */
    void setPassword(String password);

}
