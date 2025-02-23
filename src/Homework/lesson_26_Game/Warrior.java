package Homework.lesson_26_Game;

public class Warrior extends GameCharacter {
    private int strength;

    public Warrior(String name, int level, int health, int srength) {
        super(name, level, health);
        this.strength = srength;
    }

    public void powerStrike(){
        System.out.println(getName() + " наносит мощынй удад с силой" + strength);
    }

    @Override
    public void attack(){
        System.out.println("Воин " + getName() + " атакует мечом");
    }
    public void heaveyAttack(GameCharacter enemy){
        int damage = this.strength * 2;
            System.out.println("Воин " + getName() + " наносит мощный удар по " + enemy.getName() + "!");
        }
    }

