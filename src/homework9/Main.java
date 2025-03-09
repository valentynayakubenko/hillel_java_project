package homework9;

import homework10.Man;
import homework10.Profession;
import homework10.Woman;

public class Main extends Person {

    public Main(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public static void main(String[] args) {
        Person person1 = new Man("John", 30, Profession.DOCTOR, false);
        Person person2 = new Woman("Jane", 25, Profession.TEACHER, true);
        Person person3 = new Man("Jack", 40, Profession.ENGINEER, true);

        person1.displayInformation();
        person2.displayInformation();
        person3.displayInformation();

        person1.setProfession(Profession.DESIGNER);
        person1.setAge(35);
        person1.setName("John Doe");
        person1.displayInformation();
    }

}
