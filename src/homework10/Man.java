package homework10;

import homework9.Person;

public class Man extends Person {

    private boolean isMarried;

    public Man(String name, int age, Profession profession, boolean isMarried) {
        super(name, age, profession);
        this.isMarried = isMarried;
    }

    public static final String gender = "Male";


    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession.getValue() + ", Gender: " + gender
               + ", Married: " + (isMarried ? "Yes" : "No"));
    }

}
