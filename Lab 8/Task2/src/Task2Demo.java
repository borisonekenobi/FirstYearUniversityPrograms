public class Task2Demo { // class called Task2Demo
	public static void main (String[] args) { // main method
		Animal cat = new Cat(); // creates instance of class Cat called cat
		Animal dog = new Dog(); // creates instance of class Dog called dog
		Animal duck = new Duck(); // creates instance of class Duck called duck

		System.out.println("Cat says:\n" + cat.say() + '\n'); //invoke the method say() and prints the return value using System.out.println
		System.out.println("Dog says:\n" + dog.say() + '\n'); //invoke the method say() and prints the return value using System.out.println
		System.out.println("Duck says:\n" + duck.say()); //invoke the method say() and prints the return value using System.out.println
	}
}
