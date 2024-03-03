package models;

public class Cat extends Animal {
    public Cat(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Кошка";
    }
}
