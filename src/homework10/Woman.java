package homework10;

import homework9.Person;

public class Woman extends Person {

    public Woman(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public static final String gender = "Female";

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession.getValue() + ", Gender: " + gender);
    }

}
