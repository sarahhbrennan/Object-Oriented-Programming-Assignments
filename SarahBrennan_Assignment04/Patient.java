//Sarah Brennan 2962279
public class Patient extends Person {

	//Attributes needed
	private int patientID;
	private String bloodType;
	
	//constructor that gets all details needed for patient
	public Patient(String name, int phoneNum, char gender, int patientID, String bloodType)
	{
		super(name, phoneNum, gender);
		this.patientID = patientID;
		this.bloodType = bloodType;
	}
	
	//retrieves name from Person
	public String getName()
	{
		return super.getName();
	}
	
	//retrieves phone number from Person
	public int getPhoneNum()
	{
		return super.getPhoneNum();
	}
	
	//retrieves gender from Person
	public char getGender()
	{
		return super.getGender();
	}
	
	//retrieves patient ID
	public int getPatientID()
	{
		return patientID;
	}
	
	//retrieves blood type for patient
	public String getBloodType()
	{
		return bloodType;
	}
	
	//converts everything into a readable string when printed in the test class
	public String toString()
	{
		return "********Patient********" + super.toString() + "\nPatient ID: " + patientID + "\nBlood Type: " + bloodType + "\n***********************" + "\n";
	}
}
