public class Person {
    // Define the class fields
    private String firstName;
    private String lastName;

    // Define the class constructor - constructor with arguments.
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return firstName +" "+lastName;
    }
}
