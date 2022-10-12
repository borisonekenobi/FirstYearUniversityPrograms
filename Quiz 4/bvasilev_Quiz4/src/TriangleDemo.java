import java.util.Scanner;

public class TriangleDemo {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base of the triangle: ");
		double base = scanner.nextDouble();

		System.out.print("Enter the height of the triangle: ");
		double height = scanner.nextDouble();

		System.out.print("Enter the left side of the triangle: ");
		double leftSide = scanner.nextDouble();

		System.out.print("Enter the right side of the triangle: ");
		double rightSide = scanner.nextDouble();

		Triangle triangle = new Triangle(base, height, leftSide, rightSide);

		System.out.println("The triangle's area is " + triangle.getArea());
		System.out.println("The triangle's perimeter is " + triangle.getPerimeter());
	}
}
