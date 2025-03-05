package Lessons.Lesson_27.game_character;

public class Assassin implements GameCharacter, Skill, Stealthy, Ranged{
    private String name;
    private int health;

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
    public int getHealth() {
        return this.health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public void attack(GameCharacter target) {
        target.takeDamage(2);
    }

    @Override
    public void stealthyAttack(GameCharacter target) {
        target.takeDamage(6);
    }

    @Override
    public void rangedAttack(GameCharacter target) {
         target.takeDamage(1);
    }
}
