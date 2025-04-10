package main_project.src.interfaces;

/**
 * Абстрактный класс AbstractUser предоставляет базовую реализацию и хранение данных для пользователя.
 */
public abstract class AbstractUser implements IUser {

    protected String username;
    protected String password;

    /**
     * Получить имя пользователя.
     *
     * @return Имя пользователя.
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Установить новое имя пользователя.
     *
     * @param username Новое имя пользователя.
     */
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Получить пароль пользователя.
     *
     * @return Пароль пользователя.
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Установить новый пароль пользователя.
     *
     * @param password Новый пароль пользователя.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
