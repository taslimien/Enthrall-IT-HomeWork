package hw5Q2Constructor;

public class Computer {
	public String brandName;
	public String modelName;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {

		System.out.println("This is from the default Constructor of Computer class.");

	}

	public void computer() {
		System.out.println("My Brand Name: " + brandName + "\nModel Name: " + modelName + "\nOperating System:"
				+ operatingSystem + "\nPrice: " + price + "\nGrade: " + grade + "\nMade in the USA? Ans: " + madeInUsa);
	}
}
