package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		// Constructor is initialized here
		Computer appleComputer = new Computer();
		// variables are initialized here
		appleComputer.brandName = "Apple.";
		appleComputer.modelName = "MacBook Air.";
		appleComputer.operatingSystem = "MacOS Mojave.";
		appleComputer.price = 800;
		appleComputer.grade = 'A';
		appleComputer.madeInUsa = false;
		appleComputer.computer(); // Method is initialized here
		
		System.out.println("\n----------------------------------------------\n");
		
		Computer hpComputer = new Computer();
		hpComputer.brandName = "HP";
		hpComputer.modelName = "HP ProBook x360 440 G1";
		hpComputer.operatingSystem = "Windows 10 Pro";
		hpComputer.price = 1250;
		hpComputer.grade = 'B';
		hpComputer.madeInUsa = false;
		hpComputer.computer();
		
		System.out.println("\n-----------------------------------------------\n");
		
		Computer dellComputer = new Computer();
		dellComputer.brandName = "Dell";
		dellComputer.modelName = "XPS 15 Laptop";
		dellComputer.operatingSystem = "Windows 11 Pro";
		dellComputer.price = 1959;
		dellComputer.grade = 'A';
		dellComputer.madeInUsa = false;
		dellComputer.computer();
	}

}
