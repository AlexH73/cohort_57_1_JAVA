package Homework.lesson_27.game_character;

/**
 * Класс ассасина с комбинированными способностями
 */
public class Assassin extends BaseGameCharacter implements Skill, Stealthy, Ranged {
    private boolean isStealthMode = true;

    public Assassin(String name) {
        super(name);
        System.out.println("🗡️ Ассасин " + name + " вышел на охоту!");
    }

    @Override
    public void performAction() {
        if (isStealthMode) {
            stealthyAttack(null);
        } else {
            rangedAttack(null);
        }
        isStealthMode = !isStealthMode;
    }

    @Override
    public void stealthyAttack(GameCharacter target) {
        System.out.println("👤️ " + name + " наносит смертоносный удар из тени!");
        if (target != null) {
            target.takeDamage(40);
        }
    }

    @Override
    public void rangedAttack(GameCharacter target) {
        System.out.println("🎯 " + name + " бросает отравленный клинок!");
        if (target != null) {
            target.takeDamage(25);
        }
    }

    @Override
    public void attack(GameCharacter target) {
        if (Math.random() < 0.7) {
            stealthyAttack(target);
        } else {
            rangedAttack(target);
        }
    }
}
