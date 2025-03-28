package homework10;

public enum Profession {

    DOCTOR("Doctor"),
    TEACHER("Teacher"),
    ENGINEER("Engineer"),
    DESIGNER("Designer");

    private final String value;

    Profession(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
