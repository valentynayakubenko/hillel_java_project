package additionalTask2;

public class Main extends Employee{

    public Main(String lastName, String firstName, String position, String salaryPerHour) {
        super(lastName, firstName, position, salaryPerHour);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sade", "West", "Manager", "1000");
        Employee employee2 = new Employee("Mary", "Beier", "Developer", "500");
        Employee employee3 = new Employee("John", "Doe", "QA", "1500");

        employee1.setPosition("Senior Manager");
        employee2.setSalaryPerHour("600");
        employee3.setLastName("Smith");

        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getPosition() +
                " " + employee1.getSalaryPerHour());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getPosition() +
                " " + employee2.getSalaryPerHour());
        System.out.println(employee3.getFirstName() + " " + employee3.getLastName() + " " + employee3.getPosition() +
                " " + employee3.getSalaryPerHour());
    }
}
