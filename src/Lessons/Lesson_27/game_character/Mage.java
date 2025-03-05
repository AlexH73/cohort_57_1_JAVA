package Lessons.Lesson_27.game_character;

/**
 * Класс мага с лечением и магическими атаками
 */
public class Mage extends BaseGameCharacter implements Healable, Skill {
    private boolean hasMana = true; // Пример дополнительного параметра
    private GameCharacter currentTarget; // Добавляем поле для цели

    public Mage(String name) {
        super(name);
        System.out.println("🔮 Маг " + name + " вступает в битву!");
    }

    // Добавляем метод для установки цели
    public void setTarget(GameCharacter target) {
        this.currentTarget = target;
    }

    /**
     * Логика выбора действия в зависимости от состояния
     */
    @Override
    public void performAction() {
        System.out.println("\n▶ " + name + " концентрирует магию...");
        if (currentTarget == null) {
            System.out.println("⛔ " + name + " не имеет цели!");
            return;
        }

        if (health < 50 && hasMana) {
            heal(this); // Самолечение
        } else {
            attack(currentTarget); // Атакуем текущую цель
        }
    }

    /**
     * Магическая атака
     *
     * @param target цель атаки
     */
    @Override
    public void attack(GameCharacter target) {
        if (target == null) {
            System.out.println("⛔ Нет цели для атаки!");
            return;
        }

        if (hasMana) {
            System.out.println("🔥 " + name + " бросает огненный шар в " + target.getName());
            target.takeDamage(20);
            hasMana = false;
        } else {
            System.out.println("⛔ У " + name + " закончилась мана!");
        }
    }

    /**
     * Реализация лечения
     *
     * @param target цель лечения
     */
    @Override
    public void heal(GameCharacter target) {
        if (target == null) {
            System.out.println("⛔ Нет цели для исцеления!");
            return;
        }

        int healAmount = 25;
        target.takeDamage(-healAmount);
        System.out.println("💚 " + name + " исцеляет " + target.getName() + " на " + healAmount + " HP!");
        hasMana = false;
    }
}

