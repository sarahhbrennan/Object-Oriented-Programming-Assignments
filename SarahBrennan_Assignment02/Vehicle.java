//Sarah Brennan 2962279
public class Vehicle {
	
	private String make, model;
	
	private Engine engine;
	
	public Vehicle(String mk, String mdl, Engine e){
		make = mk; 
		model = mdl; 
		//create new object and enter in size as constructor in Engine will only work with an int
		engine = new Engine(1400); 
		//make sure new object is set to Engine parameter the is called in this method
		engine.edit(e.get());
	}
	
	public Engine getEngine(){
		return engine;
	}

}
