public class SequenceOperations {
	public static double getTotal(double[] nums) { // will return the total sum of the provided array
		double sum = 0; // double variable to store the sum
		for (double num : nums) { // loop through all values in the array
			sum += num; // add value to the sum variable
		}
		return sum; // return the total sum
	}

	public static double getAverage(double[] nums) { // will return the average value of the provided array
		double sum = 0; // double variable to store the sum
		for (double num : nums) { // loop through all values in the array
			sum += num; // add value to the sum variable
		}
		return Double.parseDouble(String.format("%.2f", sum / nums.length)); // return the average value
	}

	public static double getHighest(double[] nums) { // will return the highest value of the provided array
		double max = nums[0]; // double variable to store the highest value
		for (double num : nums) { // loop through all values in the array
			max = Math.max(max, num); // compare the current value to the previously known highest value of the array
		}
		return max; // return the max value
	}

	public static double[] getReverse(double[] nums) { // will return the reverse of the provided array
		double[] reversed = new double[nums.length]; // create a new double array to store the reversed array
		for (int i = nums.length - 1; i >= 0; i--) { // loop through all indexes of the array backwards
			reversed[nums.length - i - 1] = nums[i]; // set the current index of the array (from back to front) to the current index of reversed array
		}
		return  reversed; // return the revered array
	}
}
