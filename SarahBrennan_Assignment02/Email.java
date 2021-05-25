//Sarah Brennan 2962279
public class Email {
	
	//String attributes
	private String home, work;
	
	//Main Constructor
	public Email (String h, String w)
	{
		//call set home and work email address from here
		setHomeEmail(h);
		setWorkEmail(w);
	}
	
	//retrieves home email
	public String getHomeEmail()
	{
		return home;
	}
	
	//changes home email
	public void setHomeEmail(String h)
	{
		home = h;
	}
	
	//retrieves work email
	public String getWorkEmail()
	{
		return work;
	}
	
	//changes work email
	public void setWorkEmail(String w)
	{
		work = w;
	}	
}
