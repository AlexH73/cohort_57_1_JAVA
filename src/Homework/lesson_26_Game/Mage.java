package Homework.lesson_26_Game;

public class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana = mana;
    }

    public void castSpell(){
        System.out.println(getName() + " использует заклинание! Осталось маны: " + mana);
    }

    @Override
    public void attack() {
        System.out.println("Маг " + getName() + " выпускает магический снаряд!");
    }
    public void heal(){
        int healAmount =  20;
        int newHealth = this.getHealth() + healAmount;

        if ( newHealth > 100){
            newHealth = 100;
        }
        System.out.println("Маг" + getName() + " исцеляет себя!");
    }
}
