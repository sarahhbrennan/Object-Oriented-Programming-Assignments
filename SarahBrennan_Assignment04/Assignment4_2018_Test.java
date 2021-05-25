//Sarah Brennan 2962279
public class Assignment4_2018_Test {

	public static void main(String[] args) {

		/*Testing for Q1*/
		
		
		//create new employees
		Employee e1 = new Employee("Joe Murphy", 41235689, 'M', 1234, "Outpatients");
		Employee e2 = new Employee("John Jones", 47896523, 'M', 5678, "IT");
		Employee e3 = new Employee("Anna Winters", 41258796, 'F', 1023, "HR");
		Employee e4 = new Employee("Kirsty Roberts", 45896321, 'F', 5412, "Orthopaedic");
		Employee e5 = new Employee("Jennifer Foley", 48759632, 'F', 9658, "Pharmacy");
		Employee e6 = new Employee("Mark Walsh", 42356987, 'M', 7745, "Outpatients");
		Employee e7 = new Employee("Julie Sanders", 48597123, 'F', 1254, "X-Ray");
		Employee e8 = new Employee("Jake Martin", 46589321, 'M', 4521, "HR");
		Employee e9 = new Employee("Jade Michaels", 46597852, 'F', 1025, "Nutrition");
		Employee e10 = new Employee("Eoin McCarthy", 41234567, 'M', 3256, "Outpatients");
		Employee e11 = new Employee("Annette Lynch", 45897563, 'F', 8965, "Catering");
		Employee e12 = new Employee("Mark Jacobs", 49856745, 'M', 4521, "Maternity");
		
		//create new patients
		Patient p1 = new Patient("Jenny Cole", 40123658, 'F', 101, "A Negative");
		Patient p2 = new Patient("Matthew O'Sullivan", 45896320, 'M', 203, "B Positive");
		Patient p3 = new Patient("Conor Barry", 42015230, 'M', 356, "A Positive");
		Patient p4 = new Patient("Susan D'Ydewalle", 44412035, 'F', 125, "B Negative");
		
		//print out employees
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println(e9);
		System.out.println(e10);
		System.out.println(e11);
		System.out.println(e12);
		
		//print out patients
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		
		/*Testing for Q2*/
		
		
		
		//create new employees object
		Employees emps = new Employees();
		
		//create new employee
		Employee em1 = new Employee("Sarah Brennan", 4789652, 'F', 3256, "IT");
		
		//add all employees to employees array
		emps.addEmployee(em1);
		emps.addEmployee(e1);
		emps.addEmployee(e2);
		emps.addEmployee(e3);
		emps.addEmployee(e4);
		emps.addEmployee(e5);
		emps.addEmployee(e6);
		emps.addEmployee(e7);
		emps.addEmployee(e8);
		emps.addEmployee(e9);
		emps.addEmployee(e10);
		emps.addEmployee(e11);
		emps.addEmployee(e12);
		
		//print out em1
		System.out.println(em1);
		
		//find all employees who are female and print out their names
		String[] getFemale = emps.findEmployeesGender('f');
		for(int i = 0; i < getFemale.length; i++)
		{
			System.out.println("Employees who are female: " + getFemale[i]);
		}
		
		//find all employees who are male and print out their names
		String[] getMale = emps.findEmployeesGender('M');
		for(int i = 0; i < getMale.length; i++)
		{
			System.out.println("Employees who are male: " + getMale[i]);
		}
		
		//find all employees who are in IT and print their names
		String[] getDepartment = emps.findEmployeeDepartment("IT");
		for(int i = 0; i < getDepartment.length; i++)
		{
			System.out.println("Employees who are in IT department: " + getDepartment[i]);
		}
		
		//find all employees who are in outpatients and print their names
		String[] getDepartment2 = emps.findEmployeeDepartment("Outpatients");
		for(int i = 0; i < getDepartment2.length; i++)
		{
			System.out.println("Employees who are in Outpatients department: " + getDepartment2[i]);
		}
		
		//there are no employees in ER so testing that the correct message shows with no employees in the array having that department
		String[] getDepartment3 = emps.findEmployeeDepartment("ER");
		for(int i = 0; i < getDepartment3.length; i++)
		{
			System.out.println("Employees who are in ER department: " + getDepartment3[i]);
		}
		
		//find employees by their IDs and print out their names and employee numbers
		String[] getEmployeeID = emps.findEmployeeByID(1234);
		for(int i = 0; i < getEmployeeID.length; i++)
		{
			System.out.println("Employee with ID 1234: " + getEmployeeID[i]);
		}
		
		//no employees with this ID so testing for correct message
		String[] getEmployeeID2 = emps.findEmployeeByID(1258);
		for(int i = 0; i < getEmployeeID2.length; i++)
		{
			System.out.println("Employee with ID 1258: " + getEmployeeID2[i]);
		}
	}

}
