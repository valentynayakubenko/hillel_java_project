package homework9;

public class Main extends Person {

    public Main(String name, int age, String profession) {
        super(name, age, profession);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Doctor");
        Person person2 = new Person("Jane", 25, "Teacher");
        Person person3 = new Person("Jack", 40, "Engineer");

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Profession: " + person1.getProfession());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Profession: " + person2.getProfession());
        System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Profession: " + person3.getProfession());

        person1.setProfession("Designer");
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Profession: " + person1.getProfession());
    }

}
