public class ProductionWorker extends Employee { // Java class named Employee which inherits from the Employee class
	private int shift; // Field to hold shift (an integer)
	private double payRate; // Field to hold hourly pay rate (a double)
	public static final int DAY_SHIFT = 1; // integer value representing the day shift
	public static final int NIGHT_SHIFT = 2; // integer value representing the night shift

	public ProductionWorker (String n, String num, String date, int sh, double rate) { // multi-args constructor
		super(n, num, date);
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);
		setShift(sh);
		setPayRate(rate);
	}

	public ProductionWorker () { // default constructor

	}

	public void setShift (int s) { // setter method to set the value of the shift field
		shift = s;
	}

	public void setPayRate (double p) { // setter method to set the value of the payRate field
		payRate = p;
	}

	public int getShift () { // getter method to get the value of the shift field
		return shift;
	}

	public double getPayRate () { // getter method to get the value of the payRate field
		return payRate;
	}

	public String toString () { // toString() method developed to produce the expected output
		return super.toString() + String.format("\n%s: %s\n%s: %f",
				"Shift", getShift() == 0 ? "Day" : "Night",
				"Hourly Pay Rate", getPayRate());
	}
}
