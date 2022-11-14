public class RoomDimension {
	private double length; // double variable to store the length of the room
	private double width; // double variable to store the width of the room

	public RoomDimension(double len, double w) { // constructor with parameters for length and width of the room
		length = len; // set the length to the provided variable
		width = w; // set the width to the provided variable
	}

	public double getArea() { // will return the area of the room
		return length * width; // return length multiplied by the width
	}

	public String toString() { // Override method toString will return a String representing the object
		return "Length: " + length + " Width: " + width + " Area: " + getArea(); // returns a string showing the length, width and the area of the room
	}
}
