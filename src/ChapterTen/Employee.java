package ChapterTen;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String SocialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        SocialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                '}';
    }
    public abstract double earnings();
}
