import java.util.Scanner;

public class CarpetCalculator {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // create a Scanner object
		System.out.print("Enter the price per square foot: $"); // prompt user for the price per square foot of the carpet
		double cost = scanner.nextDouble(); // double variable to store the user input
		System.out.print("Enter the length of the room: "); // prompt user for the length of the room
		double len = scanner.nextDouble(); // double variable to store the user input
		System.out.print("now enter the width of the room: "); // prompt user for the width of the room
		double width = scanner.nextDouble(); // double variable to store the user input

		RoomDimension roomDimension = new RoomDimension(len, width); // create a RoomDimension object
		RoomCarpet roomCarpet = new RoomCarpet(roomDimension, cost); // create a RoomCarpet object

		System.out.println("Room dimensions:"); // print "Room dimensions:"
		System.out.println(roomCarpet); // print the roomCarpet object
	}
}
