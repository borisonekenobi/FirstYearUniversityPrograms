import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three integer values: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println(rightmostSame(a, b, c) ? "True" : "False");
	}

	private static boolean rightmostSame(int a, int b, int c) {
		a = a % 10;
		b = b % 10;
		c = c % 10;

		return (a == b) || (a == c) || (b == c);
	}
}
