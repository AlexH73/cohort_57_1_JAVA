package Hausaufgaben.Hausaufgaben_28.Untericht_28_3;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private List<Programmer> team;

    public Manager(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addProgrammer(Programmer programmer){
        team.add(programmer);
    }
    public int teamSize(){
        return team.size();
    }

    public void removeProgrammerFromTeam(Programmer programmer){
        team.remove(programmer);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}
