//Sarah Brennan 2962279
public class Converter {
	private static double inches, cm, miles, kilometers;
		
	//static method that converts cm to inches
	public static double convertToInches(double cm)
	{
		inches = cm * 2.54; 
		return inches;
	}
	
	//static method that converts inches to cm
	public static double convertToCM(double inches)
	{
		cm = inches / 2.54; 
		return cm;
	}
	
	//static method that converts kilometers to miles
	public static double convertToMiles(double kilometers)
	{
		miles = kilometers / 1.609; 
		return miles;
	}
	
	//static method that converts miles to kilometers
	public static double convertToKilometers(double miles)
	{
		kilometers = miles * 1.609; 
		return kilometers;
	}
	
	
}
