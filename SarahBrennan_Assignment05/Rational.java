//Sarah Brennan 2962279
class Rational implements Operations{
	private int num,den;
	public Rational(int n, int d){//assume d != 0
		if(n < 0 && d < 0){
			n = -n; d = -d;
		} else if(d < 0){
			n = -n; d = -d;
		}
		//ensures that d never negative and n positive e.g. 1/-2 is changed to -1/2
		int g = gcd(Math.abs(n), Math.abs(d));
		num = n/g;		
		den = d/g;
	}
	public Rational(int n)
	{//d == 1  ...
		//If d is 1, it will never be negative so do not need if statement here
		int g = gcd(Math.abs(n), Math.abs(1));
		num = n/g;
		den = 1/g;
	}
	
	public int num(){return num;}
	
	public int den(){return den;}
	
	public String toString()
	{
		//if den is 1, the number is a full number so do not need to print den
		if (den == 1) 
			return num + "";
		//if the number is a fraction, print both numerator and denominator
        else
        	return num + "/" + den;
	}
	
	private int gcd(int a, int b){
		if(b == 0) return a;
		else return gcd(b,a%b);
	}

	public Rational add(Rational q) {
		//Create new rational q
		q = new Rational (q.num(), q.den());
		//this is the rational number that q is being added to
		Rational r = this;
		//Encapsulate r
		Rational s = new Rational(r.num, r.den);
		
		//get the greatest common divisor of both the numerator and denominator of rational numbers
		int a = gcd(q.num, s.num);
		int b = gcd(q.den, s.den);
		//add rational numbers together
		Rational rational = new Rational((q.num / a) * (r.den / b) + (r.num / a) * (q.den / b), q.den * (r.den / gcd(q.den, r.den)));
		//return the numbers that are added together
		return rational;
	}

	public Rational sub(Rational q) {
		//Change the rational number to negative rational number
		q = new Rational(-q.num, q.den);
		//number to be subtracted from
		Rational r = this;
		Rational s = new Rational(r.num, r.den);
		//add negative of q to s
		return s.add(q);
	}

	public Rational mult(Rational q) {
		//new rational q
		q = new Rational(q.num, q.den);
		Rational r = this;
		//new rational s from r
		Rational s = new Rational(r.num, r.den);
		//multiply the numerator of both and denominator of both
		Rational multiply = new Rational(q.num * s.num, q.den * s.den);
		//return the multiplication
		return multiply;
	}

	public Rational multBy(int k) {
		Rational r = this;
		//create new rational q from r
		Rational q = new Rational(r.num, r.den);
		//multiply the rational number by integer
		Rational multiply = new Rational(q.num * k, q.den);
		//return answer
		return multiply;
	}

	public Rational div(Rational q) {
		q = new Rational(q.num, q.den);
		Rational r = this;
		Rational s = new Rational(r.num, r.den);
		//to divide rational number, cross multiply so numerator of first number multiplied by denominator of second and vice versa
		Rational divide = new Rational(q.den * s.num, q.num * s.den);
		//return answer
		return divide;
	}

	public Rational divBy(int k) {
		Rational r = this;
		Rational q = new Rational(r.num, r.den);
		//divide the rational number with integer
		Rational divide = new Rational(q.num, k * q.den);
		//return answer
		return divide;
	}

	public boolean eq(Rational q) {
		q = new Rational(q.num, q.den);
		Rational r = this;
		Rational s = new Rational(r.num, r.den);
		//check that the numerator and denominator of both numbers are the same
		if(s.num == q.num && s.den == q.den)
			//if equal return true
			return true;
		else
			//otherwise false
			return false;
	}
}

