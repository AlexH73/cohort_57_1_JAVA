package Lessons.Lesson_27.game_character;

public class CharactersMain {
    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Archer(null),
                new Assassin(null),
                new Mage(null),
                new Rogue(null),
                new Warrior(null),
                new Priest(null)
        };
        for (GameCharacter character : characters) {
            character.getName();
            character.getHealth();
            character.takeDamage(0);
            character.getHealth();
            System.out.println();
        }

    }
}
