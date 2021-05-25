//Sarah Brennan 2962279
class Pentagon extends Shape {

	private double side, perpHeight;
	//Pentagon constructor
	public Pentagon(String n, double s, double h)
	{
		super(n);
		side = s;
		perpHeight = h;
	}
	//Area of pentagon
	public double area() {
		return 2.5 * side * perpHeight;
	}
	//Perimeter of pentagon
	public double perimeter() {
		return 5*side;
	}
}
