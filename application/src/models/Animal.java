package models;

public abstract class Animal {
    private final String name;
    private String skills;

    public Animal(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return this.name;
    }

    public String getSkills() {
        return this.skills;
    }

    public void emplaceSkills(String skills, Boolean replace) {
        if(replace) {
            this.skills = skills;
        } else {
            this.skills += ", " + skills;
        }
    }

    public void emplaceSkills(String skills) {
        this.emplaceSkills(skills, false);
    }

    public abstract String type();

    public void commands() {
        String message = "Животное - " + this.type()
                + ", по имени " + this.getName()
                + " умеет выполнять команды " + this.getSkills();

        System.out.println(message);
    }

    public void teach(String command) {
        this.emplaceSkills(command);
        System.out.println(this.getName() + "(" + this.type() + ") начилась: " + command);
    }
}
