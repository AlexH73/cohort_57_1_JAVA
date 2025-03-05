package Lessons.Lesson_27.game_character;

public class Priest extends BaseGameCharacter implements Healable {
    private static final int HEAL_POWER = 30;

    public Priest(String name) {
        super(name);
        System.out.println("✝️ Жрец " + name + " присоединился к группе!");
    }

    @Override
    public void performAction() {
        System.out.println("\n▶ " + name + " возносит молитву!");
        heal(null); // В реальном сценарии должна быть цель
    }

    @Override
    public void heal(GameCharacter target) {
        System.out.println("✨ " + name + " вызывает божественное исцеление!");
        if (target != null) {
            target.takeDamage(-HEAL_POWER);
        } else {
            System.out.println("⛔ Нет цели для исцеления!");
        }
    }
}
