import java.util.Arrays;

public class Task3Demo {
	public static void main (String[] args) { // main method
		double[] nums = new double[] {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2}; // double array to store double values
		System.out.println("Processing the array: " + Arrays.toString(nums)); // print the array
		System.out.println("Total: " + SequenceOperations.getTotal(nums)); // print the total sum of the array
		System.out.println("Average: " + SequenceOperations.getAverage(nums)); // print the average of the array
		System.out.println("Highest value: " + SequenceOperations.getHighest(nums)); // print the highest value in the array
		System.out.println("Array Reverse: " + Arrays.toString(SequenceOperations.getReverse(nums))); // print the array backwards
	}
}
