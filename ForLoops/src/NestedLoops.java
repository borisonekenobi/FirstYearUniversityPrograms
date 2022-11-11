public class NestedLoops {
	public static void main (String[] args) {
		for (int i = 0, k = 1; i < 5; i++, k+=2) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("-");
			}
			for (int j = 0; j < k; j++) {
				System.out.print(k);
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
