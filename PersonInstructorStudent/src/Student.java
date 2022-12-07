public class Student extends Person{
    // Define the class fields
    private String sNumber;
    private int noOfCourses;
    private Course[] courses;

    // The class constructor must call the superclass constructor first
    public Student(String fistName, String lastName, String sNumber){
        super(fistName, lastName);
        this.sNumber = sNumber;
        noOfCourses = 0; // to hold the actual number of courses
        courses = new Course[7]; // We assume that the maximum number of courses is 7
    }

    // create a method to add a new course into the courses array
    public void addCourse (Course aCourse){
        courses[noOfCourses++] = aCourse;
    }

    public String toString(){
        String info = sNumber + " " + super.toString() +"\n";
        for (int i = 0; i < noOfCourses; i++) {
            info += courses[i];
        }
        return info;
    }
}
