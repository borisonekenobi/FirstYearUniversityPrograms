import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Define new Scanner object

        System.out.print("Enter first number: "); //Prompt user to enter first number
        int a = keyboard.nextInt(); //Get first integer

        System.out.print("Enter second number: "); //Prompt user to enter second number
        int b = keyboard.nextInt(); //Get second integer

        System.out.println(a*a+b*b); //Output the sum of the squares of the two integers
    }
}
