public class Triangle {
	private double base;
	private double height;
	private double leftSide;
	private double rightSide;

	public Triangle(double base, double height, double leftSide, double rightSide) {
		this.base = base;
		this.height = height;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	public void setBase (double base) {
		this.base = base;
	}

	public double getBase () {
		return base;
	}

	public double getArea() {
		return 0.5 * base * height;
	}

	public double getPerimeter() {
		return leftSide + base + rightSide;
	}
}
