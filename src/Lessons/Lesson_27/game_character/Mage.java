package Lessons.Lesson_27.game_character;

public class Mage implements GameCharacter, Skill, Healable {
    private String name;
    private int health;

    public Mage(String name) {
        this.name = name;
        this.health = 100;
    }

    @Override
    public void performAction() {
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
    public  void  attack(GameCharacter target) {
        target.takeDamage(5);
    }
    @Override
    public void heal(GameCharacter target) {
        target.takeDamage(-5);
    }
}

