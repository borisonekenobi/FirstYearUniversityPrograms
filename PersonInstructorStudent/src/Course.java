public class Course {
    // Define the class fields
    private String code;
    private String number;
    private String name;

    // define the class constructor
    public Course(String code, String number, String name){
        this.code = code;
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return "  - " + code + " " + number + " " + name +"\n";
    }
}
