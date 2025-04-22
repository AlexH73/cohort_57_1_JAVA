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
    public String getGenre() {
        return "";
    }

    @Override
    public void setGenre(String genre) {

    }

    @Override
    public String getRating() {
        return "";
    }

    @Override
    public void setRating(String rating) {

    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public String getLanguage() {
        return "";
    }

    @Override
    public void setLanguage(String language) {

    }

    @Override
    public String toString() {
        return "Film{name='" + name + "', duration=" + duration + "}";
    }
}

