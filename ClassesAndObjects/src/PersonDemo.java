public class PersonDemo {
	public static void main (String[] args) {
		Person me = new Person(); //Person is a class, me is an object
		//me is also an instance of the class Person

		Person you = new Person("Mike", "Smith"); //this is another instance of the class Person

		me.setFirstName("Boris"); //called a method call
		me.setLastName("Vasilev");
		me.setYearOfBirth(2004);

		//you.setFirstName("Mike");
		//you.setLastName("Smith");
		you.setYearOfBirth(2000);

		System.out.println(me.getFirstName() + " is a " + me.getAgeStage());
		if (me.getAge() > you.getAge()) {
			System.out.println(me.getFirstName() + " is older than " + you.getFirstName());
		} else if (me.getAge() < you.getAge()) {
			System.out.println(you.getFirstName() + " is older than " + me.getFirstName());
		} else {
			System.out.println(me.getFirstName() + " and " + you.getFirstName() + " have the same age");
		}
		//System.out.println("Welcome " + you.getFullName() + "\nIt's me " + me.getFirstName());
	}
}
