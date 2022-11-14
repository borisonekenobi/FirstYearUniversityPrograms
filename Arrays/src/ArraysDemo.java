public class ArraysDemo {
	public static void main (String[] args) {
//		int lab1 = 10;
//		int lab2 = 10;
//		int lab3 = 10;
//		int lab4 = 8;
//		int lab5 = 6;
		int[] lab = new int[8];
		lab[0] = 10;
		lab[1] = 10;
		lab[2] = 10;
		lab[3] = 8;
		lab[4] = 6;
		lab[5] = 10;
		lab[6] = 10;
		lab[7] = 10;

		int total = 0;
		for (int i = 0; i < lab.length; i++) {
			total += lab[i];
		}
		System.out.println("The average is " + total / 8);
	}
}
