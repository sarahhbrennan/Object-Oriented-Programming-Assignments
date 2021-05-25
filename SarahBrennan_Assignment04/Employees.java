//Sarah Brennan 2962279
public class Employees{
	
	//attributes needed
	private Employee[] employees;
	int maxEmployees = 20;
	int amountEmployees = 0;
	
	//creates new employee array object
	public Employees()
	{
		this.employees = new Employee[maxEmployees];
	}
	
	//adds employees to the array
	public void addEmployee(Employee e)
	{
		//so long as the array is not full, can add to the array
		if(amountEmployees < employees.length)
		{
			e = new Employee(e.getName(), e.getPhoneNum(), e.getGender(), e.getEmployeeID(), e.getDepartment());
			employees[amountEmployees] = e;
			amountEmployees++;
		}
	}
	
	//finds employees name based on their gender
	public String[] findEmployeesGender(char gender)
	{
		//create temporary string array with the same size as the whole employees array
		String [] tmp = new String[amountEmployees];
		int i = 0;
		int j = 0;
		//set character inputted to the test to upper case so will match the genders in employees array
		char upperCaseGender = Character.toUpperCase(gender);
		//so long as i and j are less than the array size, will go into while loop
		while(i < amountEmployees && j < amountEmployees)
		{
			//if the gender in the employees array matches the gender in test class, add this to the temporary array
			if(employees[i].getGender() == upperCaseGender) 
			{
				tmp[j] = "\n" + employees[i].getName() + "\n";
				//something added to temp so now need to do to next index
				j++;
			}
			//go to next employee in employees array to check for gender
			i++;
		}
		//create string array with correct size for the array
		String[] genderedEmployees = new String[j];
		//add the names in temp into the new string array
		for(int k = 0; k < j; k++)
		{
			genderedEmployees[k] = tmp[k];
		}
		//string printed in test class if no employee is found of that gender
		String[] noEmployeesFound = new String[] {"\n" + "No employees found who are " + gender + "\n"};
		//if no employee is gender given, return none, else return string array
		if(j == 0)
			return noEmployeesFound;
		else
			return genderedEmployees;
	}
	
	//this method uses the same stuff as findGender method in order to get the department and print off the employees names of that department
	public String[] findEmployeeDepartment(String department)
	{
		String[] tmp = new String[amountEmployees];
		int i = 0;
		int j = 0;
		while(i < amountEmployees && j < amountEmployees)
		{
			if(employees[i].getDepartment() == department)
			{
				tmp[j] = "\n" + employees[i].getName() + "\n";
				j++;
			}
			i++;
		}
		String[] employeesDepartment = new String[j];
		for(int k = 0; k < j; k++)
			employeesDepartment[k] = tmp[k];
		String[] noEmployeesFound = new String[] {"\n" + "No employees found in " + department + "\n"};
		if(j > 0)
			return employeesDepartment;
		else
			return noEmployeesFound;
	}
	
	//similar to findgender and finddepartment but uses these details to get the name with correct employee ID
	public String[] findEmployeeByID(int employeeID)
	{
		String tmp[] = new String[amountEmployees];
		int i = 0;
		int j = 0;
		while(i < amountEmployees && j < amountEmployees)
		{
			if(employees[i].getEmployeeID() == employeeID)
			{
				tmp[j] = "\nName: " + employees[i].getName() + ", ID: " + employees[i].getEmployeeID() + "\n";
				j++;
			}
			i++;
		}
		String[] employeesByID = new String[j];
		for(int k = 0; k < j; k++)
			employeesByID[k] = tmp[k];
		String[] noEmployeesFound = new String[] {"\n" + "No employees found with ID " + employeeID + "\n"};
		if(j > 0)
			return employeesByID;
		else
			return noEmployeesFound;
	}
}
