package Homework.lesson_27.game_character;

/**
 * Абстрактный класс для базовой реализации персонажа.
 * Устраняет дублирование кода в наследниках.
 */
public abstract class BaseGameCharacter implements GameCharacter, Targetable {
    protected String name;
    protected int health;
    protected GameCharacter target;
    protected static final int MAX_HEALTH = 100;  // Максимальное здоровье

    public BaseGameCharacter(String name) {
        this.health = MAX_HEALTH; // Стартовое здоровье
        this.name = name;
    }

    /**
     * Получение текущего уровня здоровья
     * @return Текущее значение здоровья (0-100)
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Получение имени персонажа
     * @return Строка с именем персонажа
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Обработка получения урона/лечения
     * @param damage Значение урона (положительное) или лечения (отрицательное)
     */
    @Override
    public void takeDamage(int damage) {
        // Защита от отрицательного здоровья
        health = Math.max(0, health - damage);

        // Проверка на смерть персонажа
        if (health == 0) {
            System.out.println("💀 " + name + " погиб!");
        }
    }

    /**
     * Установка цели для взаимодействия
     * @param target Целевой игровой персонаж
     * (может быть как противником для атаки, так и союзником для лечения)
     */
    @Override
    public void setTarget(GameCharacter target) {
        this.target = target;
    }

    /**
     * Получение текущей цели
     * @return Текущий целевой персонаж или null, если цель не установлена
     */
    @Override
    public GameCharacter getTarget() {
        return target;
    }

    /**
     * Основное действие персонажа в раунде (должно быть реализовано в наследниках)
     * В базовом классе объявлен как абстрактный для обязательной реализации
     */
    @Override
    public abstract void performAction();
}
