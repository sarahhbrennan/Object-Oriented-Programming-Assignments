//Sarah Brennan 2962279
class Circle extends Shape {

	private double radius;
	//Circle constructor
	public Circle(String n, double r)
	{
		super(n);
		radius = r;
	}
	//Area of circle
	public double area()
	{
		return Math.PI * (radius * radius);
	}
	//Circumference of circle
	public double perimeter() 
	{
		return 2 * Math.PI * radius;
	}
	//Diameter of circle
	public double diameter()
	{
		return 2*radius;
	}
}
