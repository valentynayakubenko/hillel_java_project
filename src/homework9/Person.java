package homework9;

import homework10.Displayable;
import homework10.Profession;

public class Person implements Displayable {

    public String name;
    public int age;
    public Profession profession;

    public Person(String name, int age, Profession profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
