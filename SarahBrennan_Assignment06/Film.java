/**
 * Name: MuttableFilm
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 */

//Created muttable Film class to use in netflix so can update the director and budget as stated in assignment word doc
class Film{
	private String title, director;
	private double budget;
	
	public Film(String title, String director, double budget){
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
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDirector(String director){
		this.director = director;
	} 
	
	public void setBudget(double budget){
		this.budget = budget;
	}
	
	public String toString(){
		return "Title: "+title+"    Director: "
				+director+"    Budget: "+ String.format("%.2f", budget);
	}
}