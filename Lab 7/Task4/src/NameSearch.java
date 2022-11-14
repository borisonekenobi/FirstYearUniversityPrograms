import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch {
	public static void main (String[] args) throws FileNotFoundException { // main method (throws FileNotFoundException)
		KidsPopularName boyNames = new KidsPopularName("BoyNames.txt"); // create a KidsPopularName object
		KidsPopularName girlNames = new KidsPopularName("GirlNames.txt"); // create a KidsPopularName object

		Scanner scanner = new Scanner(System.in); // create a Scanner object
		System.out.print("Enter a kid name: "); // prompt user for a kid name
		String input = scanner.nextLine(); // String variable to store the user input

		if (boyNames.isPopularName(input)) System.out.println("It is one of the most popular boy's names"); // print "It is one of the most popular boy's names" if the input is in the array of boy's names
		else if (girlNames.isPopularName(input)) System.out.println("It is one of the most popular girl's names"); // print "It is one of the most popular girl's names" if the input is in the array of girl's names
		else System.out.println("It is not one of the most popular kid's names"); // otherwise prints "It is not one of the most popular kid's names"
	}
}
