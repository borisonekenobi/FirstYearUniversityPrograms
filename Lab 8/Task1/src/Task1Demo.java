public class Task1Demo { // class called Task1Demo
	public static void main (String[] args) { // The main method of this class
		// creates two objects of type ProductionWorker named workerOne
		ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", ProductionWorker.DAY_SHIFT, 16.50);
		// and workerTwo
		ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", ProductionWorker.NIGHT_SHIFT, 18.50);

		// it prints these objects information using the statements: System.out.println(workerOne) and System.out.println(workerTwo)
		System.out.println("The first production worker");
		System.out.println(workerOne);
		System.out.println();
		System.out.println("The second production worker");
		System.out.println(workerTwo);
	}
}
