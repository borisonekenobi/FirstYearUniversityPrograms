import java.util.Scanner;

public class IntroduceMyself {
    public static void main(String[] args) {
        final String MY_NAME;
        int yearOfBirth;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fName;
        String lName;
        fName = keyboard.next();
        lName = keyboard.next();
        MY_NAME = lName + ", " + fName;

        System.out.print("Enter your year of birth: ");
        yearOfBirth = keyboard.nextInt();

        age = 2022 - yearOfBirth;

        System.out.println("My name is " + MY_NAME + ", I am " + age + " years old.");
        System.out.printf("%15s %-15s\n%15s %-15d\n", "My Name:", MY_NAME, "My age:",  age);

        System.out.println(Math.pow(5, 3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.cbrt(125));

    }
}
