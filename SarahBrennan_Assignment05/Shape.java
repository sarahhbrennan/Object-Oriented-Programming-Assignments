//Sarah Brennan 2962279
abstract class Shape {
	private String name;
	//Shape constructor
	public Shape(String n)
	{
		name = n;
	}
	//Abstract area method to be used in classes extending shape
	public abstract double area();
	//Abstract perimeter method to be used in classes extending shape
	public abstract double perimeter();
	//Print out the name, area and perimeter of shape being extended
	public void put() {
		System.out.printf("%s with area %6.2f and perimeter %6.2f\n", name, area(), perimeter());
	}
}
