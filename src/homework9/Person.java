package homework9;

public class Person {

    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
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
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    static Person person1 = new Person("John", 30, "Doctor");
    static Person person2 = new Person("Jane", 25, "Teacher");
    static Person person3 = new Person("Jack", 40, "Engineer");

    public static void main(String[] args) {
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Profession: " + person1.getProfession());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Profession: " + person2.getProfession());
        System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Profession: " + person3.getProfession());

        person1.setProfession("Designer");
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Profession: " + person1.getProfession());
    }

}
