import java.util.Objects;

public class CoinTossSimulator {
	public static void main (String[] args) { // main method
		Coin coin = new Coin(); // defines a new Coin object
		System.out.println("The side initially facing up: " + coin.getSideUp()); // prints the initially facing direction of the coin
		System.out.println("Now I will toss the coin 10 times."); // tells user that it will now toss the coin 10 times
		int countHeads = 0; // defines and initializes a head-counting variable countHeads to 0
		int countTails = 0; // defines and initializes a tail-counting variable countHeads to 0
		for (int i = 0; i < 10; i++) { // for loop that continues to loop until i is greater than or equal to 10
			coin.toss(); // calls the toss method from the Coin class
			if (Objects.equals(coin.getSideUp(), "heads")) countHeads++; // increases countHeads if the call to the getSideUp method from the Coin class return "heads"
			else countTails++; // increases countTails if the call to the getSideUp method from the Coin class does not return "heads"
			System.out.println("Toss:   " + coin.getSideUp()); // prints what is returned from the getSideUp method from the Coin class
		}
		System.out.println("Total Heads: " + countHeads); // prints countHeads value
		System.out.println("Total Tails: " + countTails); // prints countTails value
	}
}
