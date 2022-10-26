import java.util.Scanner;

public class PetDemo {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of your pet: ");
		String name = scanner.nextLine();

		System.out.print("Enter the type of your pet: ");
		String type = scanner.nextLine();

		System.out.print("Enter the age of your pet: ");
		int age = scanner.nextInt();

		Pet pet = new Pet();
		pet.setName(name);
		pet.setType(type);
		pet.setAge(age);

		System.out.println();
		System.out.println("Here is the information you entered: ");
		System.out.println("123456789012345678901234567890");
		System.out.printf("%15s %s\n", "Pet Name:", pet.getName());
		System.out.printf("%15s %s\n", "Pet Type:", pet.getType());
		System.out.printf("%15s %d\n", "Pet Age:", pet.getAge());
	}
}
