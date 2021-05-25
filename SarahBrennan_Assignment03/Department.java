//Sarah Brennan 2962279
public class Department {
	
	private String deptName;
	private Employee manager;
	private int officeNum;
	
	//constructor to set the attributes where all attributes have a value
	public Department(String dept, Employee manager, int offNum)
	{
		this.deptName = dept;
		//create new manager object so does not break encapsulation
		this.manager = new Employee(manager.getPPSNum(),manager.getName(),manager.getSalary());
		//ges the name, ppsn and salary from the employee class and sets it to the new manager object
		this.manager.setName(manager.getName());
		this.manager.setPPSNum(manager.getPPSNum());
		this.manager.setSalary(manager.getSalary());
		this.officeNum = offNum;
	}

	//constructor to set the attributes where deptName and manager attributes have a value
	public Department(String dept, Employee manager)
	{
		this.deptName = dept;
		//create new manager object so does not break encapsulation
		this.manager = new Employee(manager.getPPSNum(),manager.getName(),manager.getSalary());
		//ges the name, ppsn and salary from the employee class and sets it to the new manager object
		this.manager.setName(manager.getName());
		this.manager.setPPSNum(manager.getPPSNum());
		this.manager.setSalary(manager.getSalary());
		this.officeNum = '-';
	}
	
	public Employee emp()
	{
		return new Employee(manager.getName(), manager.getPPSNum(), manager.getSalary());
	}
	
	//sets the value for deptName
	public void setDeptName(String dept)
	{
		this.deptName = dept;
	}

	//sets the value for manager
	public void setManager(Employee manager)
	{
		//create new manager object so does not break encapsulation
		this.manager = new Employee(manager.getPPSNum(),manager.getName(),manager.getSalary());
		//ges the name, ppsn and salary from the employee class and sets it to the new manager object
		this.manager.setName(manager.getName());
		this.manager.setPPSNum(manager.getPPSNum());
		this.manager.setSalary(manager.getSalary());
	}

	//sets the value for officeNum
	public void setOfficeNum(int officeNum)
	{
		this.officeNum = officeNum;
	}
	
	//displays details about the department
	public void display()
	{
		System.out.println("Department Details\n");
		System.out.println("Department Name: " + deptName + "\nManager Details " + "\nName: " + manager.getName() + "\nPPSN: " + manager.getPPSNum() + "\nSalary: " + manager.getSalary() + "\nOffice Number: " + officeNum + "\n\n");
	}
	
}
