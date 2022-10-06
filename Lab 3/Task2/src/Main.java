import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Define new Scanner object

        System.out.print("Enter number: "); //Prompt user to enter number
        int n = input.nextInt(); //Get integer from input and store in variable n

        System.out.println(((n + 1) * n + 2) * n + 3); //Output equation ((𝑛 + 1) ∗ 𝑛 + 2) ∗ 𝑛 + 3
    }
}
