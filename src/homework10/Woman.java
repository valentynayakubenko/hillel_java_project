package homework10;

import homework9.Person;
import homework9.PersonException;

public class Woman extends Person {

    private boolean hasChildren;

    public Woman(String name, int age, Profession profession, boolean hasChildren) throws PersonException {
        super(name, age, profession);
        this.hasChildren = hasChildren;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public static final String gender = "Female";

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession.getValue() + ", Gender: " + gender
                + ", Has Children: " + (hasChildren ? "Yes" : "No"));
    }

}
