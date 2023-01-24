package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char stSex;
	public boolean isProgrammer;
	public float stGrade;

	public Student() {
		System.out.println("This is from the default Constructor of Student class.");
	}

	public Student(String stName, int stID, char stSex, boolean isProgrammer, float stGrade) {

		this.stName = stName;
		this.stID = stID;
		this.stSex = stSex;
		this.isProgrammer = isProgrammer;
		this.stGrade = stGrade;

		System.out.println("Student Name: " + stName + " ID: " + stID + " Sex: " + stSex + " Is Programmer: "
				+ isProgrammer + " Grade: " + stGrade);
	}

}
