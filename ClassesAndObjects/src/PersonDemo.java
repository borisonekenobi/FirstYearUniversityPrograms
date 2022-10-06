public class PersonDemo {
    public static void main(String[] args) {
        Person me = new Person(); //Person is a class, me is an object
        //me is also an instance of the class Person

        Person you = new Person(); //this is another instance of the class Person

        me.setFirstName("Boris"); //called a method call
        me.setLastName("Vasilev");

        you.setFirstName("Mike");
        you.setLastName("Smith");

        System.out.println("Welcome " + you.getFullName() + "\nIt's me " + me.getFirstName());
    }
}
