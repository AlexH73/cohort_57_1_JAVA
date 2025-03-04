package Lessons.Lesson_27.game_character;

public class CharactersMain {
    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Archer(),
                new Assassin(),
                new Mage(),
                new Rogue(),
                new Warrior(),
                new Priest()
        };
        for (GameCharacter character : characters) {
            character.getName();
            character.getHealth();
            character.takeDamage();
            character.getHealth();
            System.out.println();
        }

    }
}
