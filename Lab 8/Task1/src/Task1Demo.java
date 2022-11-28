public class Task1Demo {
	public static void main (String[] args) {
		ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", ProductionWorker.DAY_SHIFT, 16.50);
		ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", ProductionWorker.NIGHT_SHIFT, 18.50);

		System.out.println(workerOne);
		System.out.println(workerTwo);
	}
}
