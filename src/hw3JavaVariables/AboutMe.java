package hw3JavaVariables;

public class AboutMe {

	// Here variable declared.
	public int my_house_number;

	// Here variable initialized.
	public String name = "Mohammad Taslim Uddin";
	public byte age = 38;
	public short myCarPayment = 600;
	public int myYearlyHouseRent = 36600;
	public long ourBankBalance = 9223372036854775807l;
	public float myWeight = 183.1415927f;
	public double myGrade = 3.1415927410125732;
	public char mySex = 'M';
	public boolean myUsGreenCard = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.myWeight);
		System.out.println(aboutMe.myCarPayment);
		System.out.println(aboutMe.myYearlyHouseRent);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.myUsGreenCard);

		System.out.println("My Name: " + aboutMe.name + "\nMy Age: " + aboutMe.age);
		System.out.println("My waight: " + aboutMe.myWeight + "\nMy Car Payment: " + aboutMe.myCarPayment);
		System.out.println(
				"My yearly house rent: " + aboutMe.myYearlyHouseRent + "\nMy bank balace: " + aboutMe.ourBankBalance);

	}

}
