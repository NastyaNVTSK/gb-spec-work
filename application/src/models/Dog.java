package models;

public class Dog extends Animal {
    public Dog(String name, String skills) {
        super(name, skills);
    }

    @Override
    public String type() {
        return "Собака";
    }
}
