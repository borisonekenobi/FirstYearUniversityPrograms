import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws FileNotFoundException {
		String fileName = "data.txt";
		PrintWriter printWriter = new PrintWriter(fileName);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randInt = random.nextInt(1, 100);
			printWriter.append(String.valueOf(randInt)).append("\n");
		}
		printWriter.close();

		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		int count = 0;
		while (scanner.hasNext()) {
			if (Integer.parseInt(scanner.nextLine()) < 10) count++;
		}
		System.out.println(count);
	}
}
