import java.util.Scanner;

public class ArraysDemo {
	public static int[] arrayExpand(int[] oldArray, int newSize) {
		// create a new array with the larger size equal to newSize
		int[] newArray = new int[newSize];

		// copy all elements from old array to the new array
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}

		// return the new array
		return newArray;
	}

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Enter the number of labs: ");
//		int noOfLabs = keyboard.nextInt();
//
//		int[] lab = new int[noOfLabs];
//
//		for (int i = 0; i < noOfLabs; i++) {
//			System.out.println("Enter grade for lab #" + (i + 1) + ": ");
//			lab[i] = keyboard.nextInt();
//		}

		int[] lab = {10, 10};

		int total = 0;

		for (int i = 0; i < lab.length; i++) {
			total += lab[i];
		}
		System.out.println("The average is " + total / lab.length);

		int[] moreLabs = arrayExpand(lab, lab.length + 3);

		for (int i = 0; i < moreLabs.length; i++) {
			System.out.println(moreLabs[i]);
		}
	}
}
