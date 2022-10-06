import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner doubleInput = new Scanner(System.in); //Define new Scanner object

        //Prompts user to enter number with digits after decimal place
        System.out.print("Enter number with digits after decimal place: ");
        double value = doubleInput.nextDouble(); //Get user input and store in value

        double intPart = (int) value; //Remove anything after the decimal point and store in intPart
        
        System.out.println(intPart); //Output everything before the decimal place
        System.out.println(value-intPart); //Output everything after the decimal place
    }
}
