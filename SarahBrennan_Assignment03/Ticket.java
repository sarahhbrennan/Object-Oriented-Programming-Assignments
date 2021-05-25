/*
 * Class: Ticket
 *
 * DO NOT EDIT!
 */

class Ticket{
	private final int a,b;

	Ticket(int a1, int b1){
		a = a1; b = b1;
	}

	public int a(){
		return a;
	}

	public int b(){
		return b;
	}

	public String toString(){
		return "["+a+","+b+"]";
	}
}