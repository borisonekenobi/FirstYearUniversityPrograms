public class Temperature {
	// Define field variables
	private double ftemp;

	// Constructor
	public Temperature(double ftemp) {
		this.ftemp = ftemp;
	}

	// Setter methods
	public void setFahrenheit(double fahrenheit) {
		ftemp = fahrenheit;
	}

	// Getter methods
	public double getFahrenheit() {
		return ftemp;
	}

	public double getCelsius() {
		return (5d/9) * (ftemp - 32);
	}

	public double getKelvin() {
		return ((5d/9) * (ftemp - 32)) + 273;
	}
}
