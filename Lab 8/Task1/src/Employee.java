public class Employee { // Java class named Employee
	private String name; // Field to hold employee name
	private String employeeNumber; // Field to hold employee number
	private String hireDate; // Field to hold hire date

	public Employee(String n, String num, String date) { // multi-args constructor
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);
	}

	public Employee() { // default constructor

	}

	public void setName (String n) { // setter method to set the value of the name field
		name = n;
	}

	public void setEmployeeNumber (String e) { // setter method to set the value of the employeeNumber field
		employeeNumber = e;
	}

	public void setHireDate (String h) { // setter method to set the value of the hireDate field
		hireDate = h;
	}

	public String getName() { // getter method to get the value of the name field
		return name;
	}

	public String getEmployeeNumber () { // getter method to get the value of the employeeNumber field
		return employeeNumber;
	}

	public String getHireDate () { // getter method to get the value of the hireDate field
		return hireDate;
	}

	private boolean isValidEmpNum(String e) { // method with no usage and unknown body
		return true; // default return type (for no compilation error)
	}

	public String toString () { // toString() method developed to produce the expected output
		return String.format("%s: %s\n%s: %s\n%s: %s",
				"Name", getName(),
				"Employee Number", getEmployeeNumber(),
				"Hire Date", getHireDate());
	}
}
