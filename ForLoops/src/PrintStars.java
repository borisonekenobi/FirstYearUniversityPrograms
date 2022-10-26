public class PrintStars {
	private static final int MAX = 5;

	// let us practice the for loops
	public static void main (String[] args) {

		/* these loops print

		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *

		 */
		for (int i = 0; i < MAX; i++) { // outer loop
			for (int j = 0; j < MAX; j++) { // inner loop
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		/* these loops print

		 * * * * *
		 *       *
		 *       *
		 *       *
		 * * * * *

		 */
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				if (i > 0 && i < MAX - 1 && j > 0 && j < MAX - 1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();

		/* these loops print

		 *
		 * *
		 * * *
		 * * * *
		 * * * * *

		 */
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		System.out.println();
//
//		/* these loops print
//
//		 * * * * *
//		 * * * *
//		 * * *
//		 * *
//		 *
//
//		 */
//		for (int i = 0; i < MAX; i++) {
//			for (int j = 0; j < MAX - i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
}
