public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double getArea () {
		return length * width;
	}

	public String toString () {
		return String.format("I am a rectangle shape of area: %.2f", getArea());
	}
}
