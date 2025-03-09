package homework10;

import homework9.Person;

public class Man extends Person {

    public Man(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public static final String gender = "Male";

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession.getValue() + ", Gender: " + gender);
    }

}
