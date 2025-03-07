package Hausaufgaben.Hausaufgaben_28.Untericht_28_1;

public class Programmer {
    private String name;
    private String language;

    public Programmer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
