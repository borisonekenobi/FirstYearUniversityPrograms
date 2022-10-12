import java.util.Scanner;

public class CylinderDemo {
	// Main method
	public static void main (String[] args) {
		// Define a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get user input for radius
		System.out.print("Enter the radius of a cylinder: ");
		double radius = scanner.nextDouble();

		// Get user input for height
		System.out.print("Enter the height of a cylinder: ");
		double height = scanner.nextDouble();

		// Define a new Cylinder object
		Cylinder cylinder = new Cylinder();

		// Set radius and height of cylinder
		cylinder.setRadius(radius);
		cylinder.setHeight(height);

		//Output
		System.out.println("The cylinder's radius is " + cylinder.getRadius());
		System.out.println("The cylinder's height is " + cylinder.getHeight());
		System.out.println("The cylinder's volume is " + cylinder.getVolume());
		System.out.println("The cylinder's curved surface area is " + cylinder.getCurvedSurfaceArea());
		System.out.println("The cylinder's total surface area is " + cylinder.getTotalSurfaceArea());
	}
}
