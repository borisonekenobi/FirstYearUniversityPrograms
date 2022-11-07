import java.util.Random;

public class Coin { // Coin class
	private String sideUp; // creates a new variable sideUp

	public Coin(){ // default constructor
		toss(); // toss method call
	}

	public void toss() { // toss method
		Random random = new Random(); // defines a new Random object
		sideUp = random.nextInt(0, 2) == 0 ? "heads" : "tails"; // sets sideUp equal to "heads" if the next random integer is 0, otherwise it sets it to "tails"
	}

	public String getSideUp() { // getSideUp method
		return sideUp; // returns sideUp variable
	}
}
