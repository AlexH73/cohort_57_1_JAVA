package Homework.lesson_27.game_character;

/**
 * Класс лучника, реализующий ближние и дальние атаки.
 * Наследует базовую функциональность от BaseGameCharacter,
 * реализует интерфейсы Skill (базовые атаки) и Ranged (дальние атаки).
 *
 * Особенности:
 * - Система ограниченных боеприпасов (стрелы)
 * - Автоматический выбор типа атаки
 * - Разный урон для разных типов атак
 */
public class Archer extends BaseGameCharacter implements Skill, Ranged {
    private int arrows = 5; // Количество доступных стрел

    /**
     * Создает нового лучника
     * @param name Имя персонажа
     */
    public Archer(String name) {
        super(name);
        System.out.println("🏹 Лучник " + name + " присоединился к игре!");
    }

    /**
     * Основное действие в раунде. Автоматически выбирает тип атаки:
     * - Дальняя атака при наличии стрел
     * - Ближняя атака при отсутствии стрел
     */
    @Override
    public void performAction() {
        System.out.println("\n▶ " + name + " выбирает тип атаки...");

        if (target == null) {
            System.out.println("⛔ Нет цели!");
            return;
        }

        if (arrows > 0) {
            rangedAttack(target); // Приоритетная дальняя атака
        } else {
            attack(target); // Резервная ближняя атака
        }
    }

    /**
     * Ближняя атака кинжалом
     * @param target Цель для атаки
     */
    @Override
    public void attack(GameCharacter target) {
        final int meleeDamage = 12;
        System.out.println("🔪 " + name + " атакует " + target.getName() + " кинжалом!");
        target.takeDamage(meleeDamage);
    }

    /**
     * Дальняя атака из лука
     * @param target Цель для атаки
     */
    @Override
    public void rangedAttack(GameCharacter target) {
        final int rangedDamage = 18;
        if (arrows > 0) {
            System.out.println("🎯 " + name + " стреляет в " + target.getName());
            target.takeDamage(rangedDamage);
            arrows--; // Расход одной стрелы

            System.out.println("➹ Осталось стрел: " + arrows);
        }
    }

    /**
     * Пополнение запаса стрел
     * @param quantity Количество добавляемых стрел
     */
    public void addArrows(int quantity) {
        arrows += quantity;
        System.out.println("🔼 " + name + " получил " + quantity + " стрел");
    }
}