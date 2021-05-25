//Sarah Brennan 2962279
public class Assignment05Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ----------------Q1-------------------- */
		
		System.out.println("Question 1");
		/*Create new square*/
		Square sq1 = new Square("Square", 4);
		/*Create new pentagon*/
		Pentagon p1 = new Pentagon("Pentagon", 7, 5);
		/*Create new circle*/
		Circle c1 = new Circle("Circle", 5);
		/*Print square details*/
		sq1.put();
		/*Print pentagon details*/
		p1.put();
		/*Print circle details*/
		c1.put();
		

		/* ----------------Q2-------------------- */
		System.out.println("\n\n\n");
		System.out.println("Question 2");
		Rational r1, r2, r3;
        Boolean equals;
        
        /*Add*/
		r1 = new Rational(5, 8);
        r2 = new Rational(1);
        r3 = r1.add(r2);
        System.out.println("\n" + r1 + " + " + r2 +" = " + r3);
        
        /*Subtract*/
		r1 = new Rational(6, 10);
        r2 = new Rational(2, 5);
        r3 = r1.sub(r2);
        System.out.println("\n" + r1 + " - " + r2 +" = "  + r3);
        
        /*Multiply 2 rational nums*/
		r1 = new Rational(2, 3);
        r2 = new Rational(4, 5);
        r3 = r1.mult(r2);
        System.out.println("\n" + r1 + " x " + r2 +" = "  + r3);
        
        /*Multiply 1 rational and 1 whole num*/
		r1 = new Rational(3, 8);
        r3 = r1.multBy(6);
        System.out.println("\n" + r1 + " x 6 = "  + r3);
        
        /*Divide 2 rational nums*/
		r1 = new Rational(2, 5);
        r2 = new Rational(3, 7);
        r3 = r1.div(r2);
        System.out.println("\n" + r1 + " / " + r2 +" = "  + r3);
        
        /*divide 1 rational and 1 whole num*/
		r1 = new Rational(4, 8);
        r3 = r1.divBy(3);
        System.out.println("\n" + r1 + " / 3 = "  + r3);
        
        /*Check if numbers are equal to each other*/
		r1 = new Rational(6, 8);
        r2 = new Rational(6, 8);
        equals = r1.eq(r2);
        System.out.println("\nDoes " + r1 + " equal " + r2 + "? " + equals);
	}

}
