package Lessons.Lesson_27.game_character;

/**
 * Класс Разбойника (Rogue)
 */
public class Rogue extends BaseGameCharacter implements Skill, Stealthy {
    private boolean isHidden = true;

    public Rogue(String name) {
        super(name);
        System.out.println("🥷 Разбойник " + name + " скрывается в тени!");
    }

    @Override
    public void performAction() {
        if (isHidden) {
            stealthyAttack(null);
            isHidden = false;
        } else {
            attack(null);
            isHidden = true;
        }
    }

    @Override
    public void stealthyAttack(GameCharacter target) {
        int damage = 35;
        System.out.println("🔪 " + name + " наносит коварный удар из тени!");
        if (target != null) {
            target.takeDamage(damage);
        }
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = 20;
        System.out.println("⚔️ " + name + " атакует коротким мечом!");
        if (target != null) {
            target.takeDamage(damage);
        }
    }
}
