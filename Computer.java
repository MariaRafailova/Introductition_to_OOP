package Task1;

public class Computer {
	String brand;
	int year;
	double price;
	boolean isNotebook = true;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;			
		}

	}
}
