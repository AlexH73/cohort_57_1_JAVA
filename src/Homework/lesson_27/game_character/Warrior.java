package Homework.lesson_27.game_character;

/**
 * Класс Воина (Warrior)
 */
public class Warrior extends BaseGameCharacter implements Skill {
    public Warrior(String name) {
        super(name);
        System.out.println("⚔️ Воин " + name + " вступает в бой!");
    }

    @Override
    public void performAction() {
        System.out.println("\n▶ " + name + " размахивает мечом!");
        attack(null); // В реальной игре должна быть цель
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = 25;
        System.out.println("🗡️ " + name + " наносит рубящий удар!");
        if (target != null) {
            target.takeDamage(damage);
        }
    }
}
