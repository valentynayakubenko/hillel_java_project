package homework10;

import homework9.Person;

public class Main extends Person {

    public Main(String name, int age, Profession profession) {
        super(name, age, profession);
    }

        public static void main(String[] args) {

        Woman woman = new Woman("John", 30, Profession.DOCTOR, false);
        Man man = new Man("Jim", 45, Profession.ENGINEER, false);

        man.setMarried(true);
        woman.displayInformation();
        man.displayInformation();
    }

}
