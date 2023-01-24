package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		Computer appleComputer = new Computer();
		appleComputer.brandName = "Apple.";
		appleComputer.modelName = "MacBook Air.";
		appleComputer.operatingSystem = "MacOS Mojave.";
		appleComputer.price = 800;
		appleComputer.grade = 'A';
		appleComputer.madeInUsa = false;
		appleComputer.computer();
	}

}
