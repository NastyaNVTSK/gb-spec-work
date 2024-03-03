package models;

public class Donkey extends Animal {
    public Donkey(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Осёл";
    }
}
