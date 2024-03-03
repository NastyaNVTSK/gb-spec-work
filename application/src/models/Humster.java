package models;

public class Humster extends Animal {
    public Humster(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Хомяк";
    }
}
