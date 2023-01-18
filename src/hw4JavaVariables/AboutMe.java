package hw4JavaVariables;

public class AboutMe {

	// Here variable declared.
	public String name;
	public byte age;
	public short myCarPayment;
	public int myYearlyHouseRent;
	public int myHouseNumber;
	public long ourBankBalance;
	public float myWeight;
	public double myGrade;
	public char mySex;
	public boolean myUsGreenCard;

	// Here Constructor declared.
	public AboutMe() {
		System.out.println("This is all about me: ");

	}

	// Here method implemented.
	public void aboutMe() {
		System.out.println("My name: " + name + "\nMy age: " + age + "\nMy monthely car payment: " + myCarPayment
				+ "\nMy yearly house rent: " + myYearlyHouseRent + "\nMy house number: " + myHouseNumber
				+ "\nOur bank balance: " + ourBankBalance + "\nMy weight: " + myWeight + "\nMy grade: " + myGrade
				+ "\nMy sex: " + mySex + "\nMy US green card: " + myUsGreenCard);
	}

}
