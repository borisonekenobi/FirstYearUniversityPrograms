public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;

	public Employee(String n, String num, String date) {
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);
	}

	public Employee() {

	}

	public void setName (String n) {
		name = n;
	}

	public void setEmployeeNumber (String e) {
		employeeNumber = e;
	}

	public void setHireDate (String h) {
		hireDate = h;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeNumber () {
		return employeeNumber;
	}

	public String getHireDate () {
		return hireDate;
	}

	private boolean isValidEmpNum(String e) {
		return true;
	}

	public String toString () {
		return String.format("%s: %s\n%s: %s\n%s: %s",
				"Name", getName(),
				"Employee Number", getEmployeeNumber(),
				"Hire Date", getHireDate());
	}
}
