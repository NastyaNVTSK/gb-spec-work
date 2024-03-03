package models;

public class Camel extends Animal {
    public Camel(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Верблюд";
    }
}
