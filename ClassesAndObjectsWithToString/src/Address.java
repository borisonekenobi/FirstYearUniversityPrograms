public class Address {
	private String country;
	private String province;
	private String city;
	private String streetName;
	private int houseNumber;
	private String postalCode;

	public Address () {
		country = "Canada";
	}

	public void setCountry (String country) {
		this.country = country;
	}

	public void setProvince (String province) {
		this.province = province;
	}

	public void setCity (String city) {
		this.city = city;
	}

	public void setStreetName (String streetName) {
		this.streetName = streetName;
	}

	public void setHouseNumber (int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setPostalCode (String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry () {
		return country;
	}

	public String getProvince () {
		return province;
	}

	public String getCity () {
		return city;
	}

	public String getStreetName () {
		return streetName;
	}

	public int getHouseNumber () {
		return houseNumber;
	}

	public String getPostalCode () {
		return postalCode;
	}

	public String toString () {
		return String.format("\n%20s %s\n%20s %s\n%20s %s",
				"Country:", country,
				"Province:", province,
				"City:", city);
	}
}
