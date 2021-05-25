//Sarah Brennan 2962279
public class Person {

	//Attibutes needed
	private String name;
	private int phoneNum;
	private char gender;
	
	//all argument constructor
	public Person (String name, int phoneNum, char gender)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}
	
	//retrieve name
	public String getName()
	{
		return name;
	}

	//retrieve phone number
	public int getPhoneNum()
	{
		return phoneNum;
	}

	//retrieve gender
	public char getGender()
	{
		return gender;
	}
	
	//converts everything into a readable string when printed in the test class
	public String toString()
	{
		return "\nName: " + name + "\nPhone Number: " + phoneNum + "\nGender: " + gender;
	}
}
