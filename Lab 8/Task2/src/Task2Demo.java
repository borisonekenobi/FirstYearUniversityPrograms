public class Task2Demo {
	public static void main (String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();

		System.out.println("Cat says:\n" + cat.say() + '\n');
		System.out.println("Dog says:\n" + dog.say() + '\n');
		System.out.println("Duck says:\n" + duck.say());
	}
}
