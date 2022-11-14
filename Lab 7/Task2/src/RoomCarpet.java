public class RoomCarpet {
	private RoomDimension size; // RoomDimension variable to store the dimensions of the room
	private double carpetCost; // double variable to store the cost of the carpet per square foot

	public RoomCarpet(RoomDimension dim, double cost) { // constructor with parameters for the room dimensions and the cost of the carpet
		size = dim; // set the size to the provided variable
		carpetCost = cost; // set the cost to the provided variable
	}

	public double getTotalCost() { // will return the total cost of the carpet to cover the floor
		return size.getArea() * carpetCost; // return the area of the room multiplied by the cost of the carpet
	}

	public String toString() { // Override method toString will return a String representing the object
		return size.toString() + "\nCarpet cost: $" + String.format("%.2f", getTotalCost()); // returns a string showing the size dimension and the total carpet cost
	}
}
