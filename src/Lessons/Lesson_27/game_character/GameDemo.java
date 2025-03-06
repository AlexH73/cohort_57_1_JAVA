package Lessons.Lesson_27.game_character;

/**
 * Пример использования полиморфизма
 */
public class GameDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Конан");
        Mage mage = new Mage("Мерлин");
        Archer archer = new Archer("Леголас");
        Priest priest = new Priest("Андора");

        // Устанавливаем цели
        warrior.setTarget(mage);
        mage.setTarget(warrior);
        archer.setTarget(priest);
        priest.setTarget(warrior);

        GameCharacter[] characters = {warrior, mage, archer, priest};

        for (int round = 1; round <= 3; round++) {
            System.out.println("\n=== Раунд " + round + " ===");
            for (GameCharacter c : characters) {
                if (c.getHealth() > 0) {
                    c.performAction();
                }
            }
        }
    }
}