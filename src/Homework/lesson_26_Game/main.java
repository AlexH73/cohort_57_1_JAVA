package Homework.lesson_26_Game;

public class main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Tor", 10, 100, 50);
        Mage mage = new Mage("Gendalf", 15, 80, 120);

        warrior.attack();
        warrior.powerStrike();
        warrior.heaveyAttack(mage);

        mage.attack();
        mage.castSpell();
        mage.takeDamage(2);
        mage.heal();



    }
}
