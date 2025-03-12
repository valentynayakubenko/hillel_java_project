package additionalTask2;

public class Employee {

    public String firstName;
    public String lastName;
    public String position;
    public String salaryPerHour;

    public Employee(String firstName, String lastName, String position, String salaryPerHour) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(String salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

}
