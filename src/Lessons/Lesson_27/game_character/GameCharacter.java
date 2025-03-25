package Lessons.Lesson_27.game_character;

/**
 * Базовый интерфейс для всех игровых персонажей.
 * Определяет основные характеристики и поведение.
 */
public interface GameCharacter {
    /**
     * @return Имя персонажа
     */
    public String getName();

    /**
     * @return Текущий уровень здоровья
     */
    public int getHealth();

    /**
     * Обработка получения урона
     * @param damage количество получаемого урона
     */
    public void takeDamage(int damage);

    /**
     * Основное действие персонажа в раунде
     */
    public void performAction();
}
