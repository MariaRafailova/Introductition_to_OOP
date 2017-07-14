package Task1;
public class Task1 {
	public static void main(String[] args) {

		Computer asus = new Computer();
		asus.brand = "Asus";
		asus.year = 2015;
		asus.price = 999;
		// asus.isNotebook = true;
		asus.hardDiskMemory = 500; // GB
		asus.freeMemory = 200;
		asus.operationSystem = "Windows 10";

		Computer dell = new Computer();
		dell.brand = "Dell";
		dell.year = 2016;
		dell.price = 1_249;
		dell.isNotebook = false;
		dell.hardDiskMemory = 1_000;// GB
		dell.freeMemory = 500;
		dell.operationSystem = "Windows 10";

		int memory = 100;
		asus.useMemory(memory);

		String newOperationSystem = "Linux";
		dell.changeOperationSystem(newOperationSystem);

		printFields(asus);
		printFields(dell);

	}

	public static void printFields(Computer comp) {
		
		System.out.println(comp.brand + '\n' +
				"Year: " + comp.year + '\n' +
				"Price: " + comp.price + '\n' + 
				"Hard disk memory: " + comp.hardDiskMemory +'\n' + 
				"Free memory: " + comp.freeMemory + '\n'+
				"Operation system: " + comp.operationSystem);

		System.out.println(comp.isNotebook ? "Laptop" : "Desktop");
		System.out.println();
	}
}
