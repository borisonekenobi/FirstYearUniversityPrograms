public class PersonDemo {
	public static void main (String[] args) {
		Person me = new Person();
		Person you = new Person();
		Address address = new Address();

		me.setFirstName("Jane");
		me.setLastName("Doe");
		me.setYearOfBirth(2004);

		you.setFirstName("Jone");
		you.setLastName("Doe");
		me.setYearOfBirth(2004);

		me.setEmailAddress("abc@uwo.ca");

		address.setProvince("Ontario");
		address.setCity("London");

		me.setPersonAddress(address);

		System.out.println(me);

		System.out.println(me.equals(you));
	}
}
