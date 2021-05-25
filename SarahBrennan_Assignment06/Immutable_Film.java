/**
 * Name: Film
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 */

//create final class to become immutable
final class Immutable_Film{
	//make attributes final to become immutable
	private final String title, director;
	private final double budget;
	
	public Immutable_Film(String title, String director, double budget){
		this.title = title;
		this.director = director;
		this.budget = budget; 
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDirector(){
		return director;
	}
	
	public double getBudget(){
		return budget;
	}
	
	/* need to remove set methods as only can be set in the constructor
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDirector(String director){
		this.director = director;
	} 
	
	public void setBudget(double budget){
		this.budget = budget;
	}*/
	
	public String toString(){
		return "Title: "+title+"    Director: "
				+director+"    Budget: "+ String.format("%.2f", budget);
	}
}