import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	private static final int MAX = 5;
	private static final String fileName = "myOutput.txt";

	public static void main (String[] args) throws IOException {
		// let us practice file IO

		// open text file
		FileWriter fw = new FileWriter(fileName, true); // default is false

		PrintWriter output = new PrintWriter(fileName);


		/* these loops print

		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *

		 */
		for (int i = 0; i < MAX; i++) { // outer loop
			for (int j = 0; j < MAX; j++) { // inner loop
				output.print("* ");
			}
			output.println();
		}

		// close file
		output.close();
	}
}
