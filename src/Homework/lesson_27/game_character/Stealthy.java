package Homework.lesson_27.game_character;

/**
 * Интерфейс для скрытных атак
 */
public interface Stealthy {
    /**
     * Специальная скрытная атака
     *
     * @param target цель атаки
     */
    public void stealthyAttack(GameCharacter target);
}
