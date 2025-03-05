package Lessons.Lesson_27.game_character;

public class Assassin implements GameCharacter, Skill, Stealthy, Ranged{
    private String name;
    private int health;

    public Assassin(String name) {
        super();
        System.out.println("🗡️ Ассасин " + name + " вышел на охоту!");
    }

    @Override
    public void performAction() {
        if (shouldUseStealthAttack()) {
            stealthyAttack();
        } else {
            rangedAttack();
        }
    }

    private void stealthyAttack() {
        System.out.println("Performing a stealthy attack!");
    }

    private void rangedAttack() {
        System.out.println("Performing a ranged attack!");
    }

    private boolean shouldUseStealthAttack() {
        return Math.random() < 0.5;
    }

    @Override
    public String getName() {
        return "";
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
