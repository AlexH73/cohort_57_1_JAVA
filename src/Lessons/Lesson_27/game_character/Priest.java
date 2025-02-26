package Lessons.Lesson_27.game_character;

public class Priest implements GameCharacter, Healable{
    private String name;
    private int health;

    public Priest(String name) {
        this.name = name;
        this.health = 100;
    }

    @Override
    public void performAction() {
        heal(null);
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
    public void heal(GameCharacter target) {
        target.takeDamage(-7);
    }
}
