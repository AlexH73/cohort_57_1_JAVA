package main_project.src.classes;

import main_project.src.interfaces.*;

public class Film implements IFilm {
    private String name;
    private int duration;

    public Film(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Film{name='" + name + "', duration=" + duration + "}";
    }
}

