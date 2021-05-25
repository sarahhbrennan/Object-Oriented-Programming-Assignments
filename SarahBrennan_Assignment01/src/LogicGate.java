//Sarah Brennan 2962279
public class LogicGate {
	/*Attributes*/
	private boolean state;
	
	/*Main constructor that sets the value of state and then calls different methods*/
	public LogicGate(boolean state)
	{
		//sets the state
		this.state = state;
		//calls display method
		this.display();
		//calls not method
		this.not();
		//calls set method
		this.set();
		//calls negate method
		this.negate();
	}
	
	/*not method*/
	public void not()
	{
		//checks if state is true or false
		if(this.state == true)
		{
			//if state is true, change to false
			this.state = false;
		}
		else
		{
			//if state is false, change to true
			this.state = true;
		}
		//display the changes state
		this.display();
	}
	
	//checks the real time state of the class
	public boolean state()
	{
		return this.state;
	}
	
	//sets the state automatically to true, no matter what it is originally
	public void set()
	{
		this.state = true;
		this.display();
	}

	//sets the state automatically to false, no matter what it is originally
	public void negate()
	{
		this.state = false;
		this.display();
	}
	
	//displays the current state of the logic gate
	public void display() 
	{
		System.out.println("State is: " + state);
	}
}
