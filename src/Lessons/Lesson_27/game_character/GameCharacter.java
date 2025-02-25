package Lessons.Lesson_27.game_character;

public interface GameCharacter {

    public String getName();

    public int getHealth();

    public void takeDamage(int damage);

    public void performAction();
}
