package models;

public class Horse extends Animal {
    public Horse(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Лошадка";
    }
}
