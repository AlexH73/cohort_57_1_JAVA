package Homework.lesson_27.game_character;

/**
 * Интерфейс для целительных способностей
 */
public interface Healable {
    /**
     * Лечение целевого персонажа
     * @param target цель лечения
     */
    public void heal(GameCharacter target);
}
