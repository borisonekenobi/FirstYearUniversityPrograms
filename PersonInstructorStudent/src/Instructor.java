public class Instructor extends Person{
    // define the class fields
    private String officeNumber;
    private String department;

    // define the class constructor
    public Instructor(String firstName, String lastName, String officeNumber, String department){
        super(firstName, lastName);
        this.officeNumber = officeNumber;
        this.department = department;
    }

    // override the toString method
    public String toString(){
        return "Instructor name: " + super.toString() + "\n"
                + "Office number: " + officeNumber + "\n"
                + "Department: " + department + "\n";
    }
}
