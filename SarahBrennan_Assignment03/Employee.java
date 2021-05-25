//Sarah Brennan 2962279
public class Employee {
	
	private String ppsNum, name;
	private double salary;
	
	//constructor to set the attributes
	public Employee(String pps, String name, double sal)
	{
		this.ppsNum = pps;
		this.name = name;
		this.salary = sal;
	}
	
	//Retrieves value for ppsNum
	public String getPPSNum()
	{
		return this.ppsNum;
	}
	
	//sets value for ppsNum
	public void setPPSNum(String pps)
	{
		this.ppsNum = pps;
	}

	//Retrieves value for name
	public String getName()
	{
		return this.name;
	}

	//sets value for name
	public void setName(String name)
	{
		this.name = name;
	}

	//Retrieves value for salary
	public double getSalary()
	{
		return this.salary;
	}

	//sets value for salary
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//displays all details about the employee
	public void display()
	{
		System.out.println("Employee details\n");
		System.out.println("Name: " + name + "\nPPS Number: " + ppsNum + "\nSalary: " + salary + "\n\n");
	}
}
