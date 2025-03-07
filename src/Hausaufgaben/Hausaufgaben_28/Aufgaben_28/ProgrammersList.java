package Hausaufgaben.Hausaufgaben_28.Aufgaben_28;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersList {
    private List<Programmer> team;

    public ProgrammersList() {
        this.team = new ArrayList<>();
    }

    public void addProgrammer(Programmer programmer){
        team.add(programmer);
    }
    public int teamSize(){
        return team.size();
    }

    @Override
    public String toString() {
        return "ProgrammersList{" + team + '}';
    }
}
