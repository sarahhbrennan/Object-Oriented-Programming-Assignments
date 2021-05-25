//Sarah Brennan 2962279
public class Employee {

	//String attributes
	private String surname, firstName;
	
	//Email attributes
	private Email email;
	
	//main constructor
	public Employee(String sn, String fn, Email e){
		//make correct strings equal each other
		surname = sn; 
		firstName = fn; 
		//create new object and enter in email as constructor in Email will only work with 2 Strings
		e = new Email("test@gmail.com","test@griffith.com"); 
		email = e;
	}
	
	public String fullName()
	{
		//create String to return the full name of customer by adding firstname and surname together
		String nameFull = firstName + " " + surname;
		//return fullname
		return nameFull;
	}
	
	//get emails
	public Email getEmails(){		
		return email;
	}
	
	//set homeemail
	public String homeEmail()
	{
		//create new string to be returned
		String home;
		//get the home email from email class
		home = email.getHomeEmail();
		return home;
	}
	
	//set workemail	
	public String workEmail()
	{
		//create new string to be returned
		String work;
		//get the work email from email class
		work = email.getWorkEmail();
		return work;
	}
}
