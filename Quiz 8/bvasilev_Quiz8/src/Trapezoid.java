public class Trapezoid extends Shape {
	private double lowerBase;
	private double upperBase;
	private double height;

	public Trapezoid(double b1, double b2, double h) {
		lowerBase = b1;
		upperBase = b2;
		height = h;
	}

	public double getArea() {
		return 0.5 * (lowerBase + upperBase) * height;
	}

	public String toString() {
		return String.format("I am a trapezoid shape of area: %.2f", getArea());
	}
}
