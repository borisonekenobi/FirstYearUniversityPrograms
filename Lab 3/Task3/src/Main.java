import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in); //Define new Scanner object
        
        System.out.print("Enter number: "); //Prompt user to enter number
        int d = numInput.nextInt(); //Get user input and store in variable d

        System.out.println(d%10 + "<->" + d/10); //Output number with required format
    }
}
