package Lessons.Lesson_27.game_character;

/**
 * Интерфейс Skill - базовая способность к атаке
 */
public interface Skill {
    /**
     * Базовая атака персонажа
     * @param target цель атаки
     */
    void attack(GameCharacter target);
}
