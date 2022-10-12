import java.util.Scanner;

public class TemperatureDemo {
	// Main method
	public static void main (String[] args) {
		// Define new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get user input for Fahrenheit
		System.out.print("Enter the Fahrenheit temperature: ");
		double ftemp = scanner.nextDouble();

		// Define new Temperature object
		Temperature temperature = new Temperature(ftemp);

		// Output
		System.out.println("Celsius: " + temperature.getCelsius());
		System.out.println("Kelvin: " + temperature.getKelvin());
	}
}
