//Sarah Brennan 2962279
public class EngineTest {

	public static void main(String[] args) {
		//create new engine object
		Engine e = new Engine(1400);
		//create new car object
		Car c1 = new Car("","",e);
		//create reference to c1 and get engine details
		Engine e2 = c1.getEngine();
		//print engine size of e
		System.out.println(e.toString());
		//change e2 size engine
		e2.edit(300);
		//print out engine size of e again, if encapsulation then the size of the engine should still be 1400, but as it's not the size has changed to 300
		System.out.println(e.toString());
		//prnt out engine size of e2 should be 300
		System.out.println(e2.toString());
		/* There is a problem here because the user can change the value of the engine for a completely different object, this is because encapsulation is not present.
		// To fix this will need to make sure every object gets a new object*/ 
		
		
		
		//To prove that class vehicle has now enabled encapsulation have repeated the above to show this
		//create new engine object
		Engine e3 = new Engine(1200);
		//create new vehicle object
		Vehicle v1 = new Vehicle("","",e);
		//create reference to v1 and get engine details
		Engine e4 = v1.getEngine();
		//print engine size of e3
		System.out.println(e3.toString());
		//change e4 size engine
		e4.edit(500);
		//print out engine size of e3 again, if encapsulation then the size of the engine should still be 1200, which it is
		System.out.println(e3.toString());
		//print out engine size of e4, should be 500
		System.out.println(e4.toString());
		//As encapsulation is now in place, the size engine for e3 does not change as there is now a new engine object created for e4 so anything edited for e4 will only affect e4		
	}

}
