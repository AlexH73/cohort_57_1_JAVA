package Lessons.Lesson_27.game_character;

public class Archer implements GameCharacter, Skill, Ranged{

    private String name;
    private int health;

    public Archer(String name) {
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
    public void rangedAttack(GameCharacter target) {
      ///  target.takeDamage(1);
    }
}
