public class Parallelogram extends Shape {
	private double base;
	private double height;

	public Parallelogram(double b, double h) {
		base = b;
		height = h;
	}

	public double getArea () {
		return base * height;
	}

	public String toString() {
		return String.format("I am a parallelogram shape of area: %.2f", getArea());
	}
}
