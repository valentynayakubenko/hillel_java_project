package homework10;

import homework9.Person;
import homework9.PersonException;

public class Main extends Person {

    public Main(String name, int age, Profession profession) throws PersonException {
        super(name, age, profession);
    }

        public static void main(String[] args) throws PersonException {

        Woman woman = new Woman("John", 30, Profession.DOCTOR, false);
        Man man = new Man("Jim", 45, Profession.ENGINEER, false);
        Man man2 = new Man("Jack", 0, Profession.ENGINEER, true);
        Woman woman2 = new Woman(null, 25, Profession.TEACHER, true);

        man.setMarried(true);
        woman.displayInformation();
        man.displayInformation();
    }

}
