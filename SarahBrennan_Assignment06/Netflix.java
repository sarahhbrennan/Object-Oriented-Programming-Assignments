import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Name: Netflix
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 */

class Netflix implements MovieStream{

	private List<Film> films;
	
	
	//main constructor
	public Netflix()
	{
		//need this for add method as need to implement mutative operations
		this.films = new CopyOnWriteArrayList<Film>();
	}
	
	//add film to the film list
	public boolean add(Film f) {
		boolean addFilm = false;
		//create new film object
		f = new Film(f.getTitle(), f.getDirector(), f.getBudget());
		//if there are no films in the list already, then dont need to check if it's unique
		if(films.size() == 0)
		{
			//add film to list
			films.add(f);
			//leave add as nothing further needed, return that could add film because it is unique
			return addFilm = true;
		}
		else
		{
			//for loop to go through each film in the list to see if the title already appears
			for(Film film : films) 
			{
				//the film is already in the list, do not add and return that the film has not been added
				if(film.getTitle() == (f.getTitle()))
				{
					addFilm = false;
					return addFilm = false;
				}
			}
			//if the film's title does not already appear in list, add it
			films.add(f);
			//could be added, so addFilm becomes true
			addFilm = true;
		}
		return addFilm;
	}

	//search film list for title
	public Film getFilm(String title) {
		//for loop to go through each film in the list and see if the title appears
		for(Film film : films) {
			//if the title is there, return the film details
			if (film.getTitle().equals(title))
			{
				return film;
			}
		}
		//otherwise return nothing
		return null;
	}

	//search film list for all films by certain director
	public List<Film> getDirector(String director) {
		//create new film arraylist
		ArrayList<Film> directorsFilms = new ArrayList<Film>();
		//for loop to go through each film and see if the director is there
		for(Film film : films)
		{
			//if the director appears, put all details about that film in list, then go to next film until all films checked
			if(film.getDirector() == director)
			{
				directorsFilms.add(film);
			}
		}
		//if the director is not in the film list, return nothing
		if(directorsFilms.isEmpty())
		{
			return null;
		}
		//otherwise return all films directed by name given
		else
		{
			return directorsFilms;
		}
	}

	//add the budget for each film together
	public double totalBudget() {
		double total = 0;
		//look at each film for their budget
		for(Film film : films)
		{
			//for each film, add their budget to total
			total += film.getBudget();
		}
		//return the total budget
		return total;
	}

	//update the director details for a certain title
	public boolean changeDirector(String title, String director) {
		boolean titleInList = false;
		//go through for loop to go through all films in list
		for(Film film : films)
		{
			//if the film title is in the list, change the directors name to new given name
			if(film.getTitle() == title)
			{
				film.setDirector(director);
				//return that the title has been found and director name changed true
				return titleInList = true;				
			}
			//title has not been found so director name changed false
			titleInList = false;
		}
		return titleInList;
	}

	//update the budget of a film for certain title
	public boolean changeBudget(String title, double b) {
		boolean titleInList = false;
		//for loop to go through each film
		for(Film film : films)
		{
			//if the title is found, update the budget to what has been specified
			if(film.getTitle() == title)
			{
				film.setBudget(b);
				//return that title found and budget has been updated
				return titleInList = true;				
			}
			//title not found so budget updated is false
			titleInList = false;
		}
		return titleInList;
	}

	//increases the amount of each films budget by a percentage
	public void increaseBudgetBy(double percent) {
		double increase = 0;
		//go through each film
		for(Film film : films)
		{
			//get the amount of money the budget will be going up by
			increase = (film.getBudget()/100) * percent;
			//add this increase to the budget already there for the budget of each film
			film.setBudget(increase + film.getBudget());
		}
	}

}