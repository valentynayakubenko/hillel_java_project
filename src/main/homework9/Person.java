package homework9;

import homework10.Displayable;
import homework10.Profession;

public abstract class Person implements Displayable {

    protected String name;
    protected int age;
    protected Profession profession;

    public Person(String name, int age, Profession profession) throws PersonException {
        if (name == null || name.isEmpty()) {
            throw new PersonException("Name cannot be null or empty");
        }
        this.name = name;
        if (age <= 0) {
            throw new PersonException("Age cannot be negative or 0");
        }
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PersonException {
        if (name == null || name.isEmpty()) {
            throw new PersonException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonException {
        if (age < 0) {
            throw new PersonException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getProfession() {
        return profession.getValue();
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession.getValue());
    }
}
