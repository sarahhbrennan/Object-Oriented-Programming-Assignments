//Sarah Brennan 2962279
class Square extends Shape {

	private double side;
	//Square constructor
	public Square(String n, double s)
	{
		super(n);
		side = s;
	}
	//Area of square
	public double area() {
		return side*side;
	}
	//Perimeter of square
	public double perimeter() {
		return 4*side;
	}
}
