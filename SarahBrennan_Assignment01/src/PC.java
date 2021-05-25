//Sarah Brennan 2962279
public class PC {

	//PC Attributes
	private String pcMake;
	private String processor;
	private int ram;
	private int hardDrive;
	private double price;
	
	/*Getters for retrieving information on current state of class*/
	public String getPCMake(){ return this.pcMake; }
	public String getProcessor(){ return this.processor; }
	public int getRAM(){ return this.ram; }
	public int getHardDrive(){ return this.hardDrive; }
	public double getPrice(){ return this.price; }
	
	/*display method to display the */
	public void display()
	{
		System.out.println("Make of PC: " + pcMake + "\nProcessor: " + processor + 
			"\nRAM: " + ram + " GB\nHard Drive: " + hardDrive + " GB\nPrice: €" + price);
	}
	
	/*setter method set the price and changes if modified*/
	private void setPrice(double price)
	{
		this.price = price;
	}
	
	/*main constructor, takes in each parameter from the test class*/
	public PC(String pcMake, String processor, int ram, int hardDrive, double price)
	{
		//sets pcMake attribute in this class to pcMake values coming from test class
		this.pcMake = pcMake;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		//calls setPrice method
		this.setPrice(price);
	}
	
}
