package Lessons.Lesson_27.game_character;

public class Rogue implements GameCharacter, Skill, Stealthy {
    private String name;
    private int health;

    public Rogue(String name) {
        this.name = name;
        this.health = 100;
    }

    @Override
    public void  performAction() {
        attack(null);
    }

    @Override
    public String getName() {
        return this.name;
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
        target.takeDamage(3);
    }

    @Override
    public void stealthyAttack(GameCharacter target) {
        target.takeDamage(6);
    }
}
