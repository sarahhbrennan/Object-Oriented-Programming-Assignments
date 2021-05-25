/**
 * Name: Assignment06
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 */

import java.util.*;
public class Assignment06{
	public static void main(String args[]){
	  //Q1 Testing ===================================

		System.out.println("-----------Q1-----------\n");
		//create new details for film
		String filmTitle = "Avatar", filmDirector = "James Cameron";
		double filmBudget = 237000000;
		//create new immutable object
		Immutable_Film f = new Immutable_Film(filmTitle, filmDirector, filmBudget);
		//print out immutable object
		System.out.println(f);
		//try and change the details of the immutable object
		filmTitle = ("The Godfather");
		filmDirector = "Francis Ford Coppola";
		filmBudget = 6000000;
		//when printed, the object details should not have been updated
		System.out.println("\n" + f);
		
	  
		
		
		//==============================================
	  //Q2 Testing ===================================
		
		System.out.println("\n\n\n-----------Q2-----------");
		Netflix netflix = new Netflix();
		
		/*Create new films to add to Netflix list*/
		Film f1 = new Film("Casanova","Lasse Hallström", 5000);	
		Film f2 = new Film("The Blair Witch Project","Daniel Myrick", 35000);
		Film f3 = new Film("Jaws","Steven Spielberg", 7000000);
		Film f4 = new Film("Jurassic Park","Steven Spielberg", 63000000);
		Film f5 = new Film("Schindler's List","Steven Spielberg", 25000000);
		Film f6 = new Film("Casanova","Lasse", 5000);	
		
		/*add films to list and print if they can be added or not, if the title is the same, the film should not be added*/
		System.out.println("\nAdded Casanova: " + netflix.add(f1));
		System.out.println("Added The Blair Witch Project: " + netflix.add(f2));
		System.out.println("Added Jaws: " + netflix.add(f3));
		System.out.println("Added Jurassic Park: " + netflix.add(f4));
		System.out.println("Added Schindler's List: " + netflix.add(f5));
		System.out.println("Added Casanova: " + netflix.add(f6));
				
		/*getFilm based on title and print out all the details if they are found, otherwise null*/
		System.out.println("\nAvatar details: " + netflix.getFilm("Avatar"));
		System.out.println("James Bond details: " + netflix.getFilm("James Bond"));
		System.out.println("Casanova details: " + netflix.getFilm("Casanova"));
		
		/*get films by director and print out list of films by that director, otherwise null*/
		System.out.println("\nList of films by director Lasse Hallström: " + netflix.getDirector("Lasse Hallström"));
		System.out.println("List of films by director Steven Spielberg: " + netflix.getDirector("Steven Spielberg"));
		System.out.println("List of films by director Martin Scorsese: " + netflix.getDirector("Martin Scorsese"));
		
		/*get total budget for all films in list*/
		System.out.println("\nTotal budget for all films in list: " + String.format("%.2f",netflix.totalBudget()));
		
		/*Change director based on the title given, otherwise false*/
		System.out.println("\nDirector changed for The Blair Witch Project: " + netflix.changeDirector("The Blair Witch Project", "Eduardo Sánchez"));
		System.out.println("Director changed: " + netflix.getDirector("Eduardo Sánchez"));
		System.out.println("Director changed for Jaws 2: " + netflix.changeDirector("Jaws 2", "Steven Spielberg"));
		
		/*Change budget based on title given, otherwise false*/
		System.out.println("\nBudget changed for Jurassic Park: " + netflix.changeBudget("Jurassic Park", 50000000));
		System.out.println("Budget changed: " + netflix.getFilm("Jurassic Park"));		
		System.out.println("Budget changed for About A Boy: " + netflix.changeBudget("About A Boy", 40500000));
		
		/* increaseBudgetBy percentage for all films in the list */
		netflix.increaseBudgetBy(25);
		System.out.println("\nUpdated budget total based on 25% increase: " + String.format("%.2f",netflix.totalBudget()));

	  //=============================================
	}
}