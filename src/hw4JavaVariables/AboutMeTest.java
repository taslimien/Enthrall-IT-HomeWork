package hw4JavaVariables;

public class AboutMeTest {

public static void main(String[] args) {
		
		// Here constructor is initialized.
		AboutMe taslim = new AboutMe();
		
		// Here variables are initialized.
		taslim.name ="Mohammad Taslim Uddin.";
		taslim.age = 38;
		taslim.myCarPayment = 600;
		taslim.myYearlyHouseRent = 36000;
		taslim.myHouseNumber = 349;
		taslim.ourBankBalance = 9223372036854775807l;
		taslim.myWeight = 183.1415927f;
		taslim.myGrade = 3.1415927410125732;
		taslim.mySex = 'M';
		taslim.myUsGreenCard = false;
		
		//Here method is initialized.
		taslim.aboutMe();
		
		System.out.println("\n------------------------------------------------------------\n");
		
		AboutMe alex =new AboutMe();
		alex.name = "Alex";
		alex.age = 40;
		alex.myCarPayment = 500;
		alex.myYearlyHouseRent = 35000;
		alex.myHouseNumber = 607;
		alex.ourBankBalance = 8223372036854775807l;
		alex.myWeight = 193.1415927f;
		alex.myGrade = 2.9415927410125732;
		alex.mySex = 'M';
		alex.myUsGreenCard = true;
		alex.aboutMe();

	}
}
