public class Cylinder {
	// Define field variables
	private double radius;
	private double height;
	private final double PI = 3.14159;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public Cylinder () {

	}

	// Setter methods
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeight (double height) {
		this.height = height;
	}

	// Getter methods
	public double getRadius () {
		return radius;
	}

	public double getHeight () {
		return height;
	}

	public double getVolume() {
		return PI * radius * radius * height;
	}

	public double getCurvedSurfaceArea() {
		return 2 * PI * radius * height;
	}

	public double getTotalSurfaceArea() {
		return 2 * PI * radius * (height + radius);
	}
}
