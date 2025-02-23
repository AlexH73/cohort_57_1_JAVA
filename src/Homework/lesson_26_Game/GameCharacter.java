package Homework.lesson_26_Game;

public class GameCharacter {
    private String name;
    private int level;
    private int health;
    private int damage;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(){
        System.out.println("Персонаж "+ name + "атакует!");
    }
    public void takeDamage(int demage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Персонаж " + this.getName() + " погиб!");
        } else {
            System.out.println("Персонаж " + this.getName() + " получил урон " + damage + ". Осталось здоровья: " + this.health);
        }
    }
}
