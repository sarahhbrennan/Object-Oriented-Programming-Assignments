//Sarah Brennan 2962279
public class Employee extends Person{
	
	//Attributes needed
	private int employeeID;
	private String department;
	
	//constructor that gets all details needed for employee
	public Employee(String name, int phoneNum, char gender, int employeeID, String department)
	{
		super(name, phoneNum, gender);
		this.employeeID = employeeID;
		this.department = department;
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
	
	//retrieves employee ID
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	//retrieves department
	public String getDepartment()
	{
		return department;
	}
	
	//converts everything into a readable string when printed in the test class
	public String toString()
	{
		return "********Employee********" + super.toString() + "\nEmployee ID: " + employeeID + "\nDepartment: " + department + "\n************************" + "\n";
	}
}
