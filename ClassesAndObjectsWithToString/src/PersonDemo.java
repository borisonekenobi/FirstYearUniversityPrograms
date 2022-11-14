import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PersonDemo {
	public static void main (String[] args) throws FileNotFoundException {
		Person me = new Person();
		Person you = new Person();
		Address address = new Address();
		PrintWriter pw = new PrintWriter("oFile.txt");

		me.setFirstName("Jane");
		me.setLastName("Doe");
		me.setYearOfBirth(2004);

		you.setFirstName("John");
		you.setLastName("Doe");
		me.setYearOfBirth(2004);

		me.setEmailAddress("abc@uwo.ca");

		address.setProvince("Ontario");
		address.setCity("London");

		me.setPersonAddress(address);

		//System.out.println(me);

		pw.println(me);
		//pw.println();
		pw.println(you);

		pw.close();

		// open the file for input
		File iFile = new File("oFile.txt"); // Creates the existing file to read from it as input to the program
		Scanner input = new Scanner(iFile);

		int counter = 0;
		while (input.hasNext()) {
			counter++;
			String line = input.nextLine();
			if (counter == 1 || counter == 8) {
				System.out.println(line);
			}
		}

		//System.out.println(me.equals(you));
	}
}
