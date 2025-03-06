package Hausaufgaben.Hausaufgaben_28.Untericht_28_1;

import java.util.Arrays;

public class Manager {
    private String name;
    private int capacity=3;
    private int size=0;
    private Programmer[] team = new Programmer[capacity];

    public Manager(String name) {
        this.name = name;
    }

    public void add(Programmer programmer){
        // enlarge array
        if(size>=team.length){
            team= Arrays.copyOf(team,team.length*2);
        }
        team[size] = programmer;
        size++;
    }

    public int size(){
        return size;
    }

    public Programmer get(int index){
        if(index<size && index>=0){
            return team[index];
        } else {
            return null;
        }
    }




    public String getName() {
        return name;
    }

    public Programmer[] getTeam() {
        return team;
    }

    @Override
    public String toString(){
        String programmers="";
        for(Programmer programmer:team){
            programmers+=programmer+System.lineSeparator();
        }
        return "Manager " + name + System.lineSeparator()+programmers;
    }

}
