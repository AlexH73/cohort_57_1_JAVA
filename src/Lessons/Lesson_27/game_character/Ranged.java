package Lessons.Lesson_27.game_character;

/**
 * Интерфейс для дальнобойных атак
 */
public interface Ranged {
    /**
     * Атака на расстоянии
     *
     * @param target цель атаки
     */
    void rangedAttack(GameCharacter target);
}
