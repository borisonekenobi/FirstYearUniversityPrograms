public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;

	public ProductionWorker (String n, String num, String date, int sh, double rate) {
		super(n, num, date);
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);
		setShift(sh);
		setPayRate(rate);
	}

	public ProductionWorker () {

	}

	public void setShift (int s) {
		shift = s;
	}

	public void setPayRate (double p) {
		payRate = p;
	}

	public int getShift () {
		return shift;
	}

	public double getPayRate () {
		return payRate;
	}

	public String toString () {
		return super.toString() + String.format("\n%s: %s\n%s: %f",
				"Shift", getShift() == 0 ? "Day" : "Night",
				"Hourly Pay Rate", getPayRate());
	}
}
