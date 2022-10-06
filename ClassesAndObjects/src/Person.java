public class Person {
    //Define the class variables
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;

    //Define the class accessors and mutators (getters and setters)
    //These are the class setter methods (mutators)
    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setEmailAddress(String email) {
        emailAddress = email;
    }

    public void setYearOfBirth(int yBirth) {
        yearOfBirth = yBirth;
    }

    //These are the class getter methods (accessors)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }
}
