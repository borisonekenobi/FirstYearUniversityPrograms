import java.util.Scanner;

public class MultipleArgs {
	public static void main (String[] args) {
		double boxLength,
				boxWidth;

		Scanner keyboard = new Scanner(System.in);

		Rectangle box = new Rectangle();

		System.out.print("What is the box's length? ");
		boxLength = keyboard.nextDouble();

		System.out.print("What is the box's width? ");
		boxWidth = keyboard.nextDouble();

		box.set(boxLength, boxWidth);

		System.out.println("The box's area is " + box.getArea());
	}
}
