/*
 * Assignment 08
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 *
 */
import java.util.*;
public class Assignment08_2018 {
	public static void main(String[] args) {

		// Q1 Test ======================================

		System.out.println("Question 1");
		double amount = 10;
		//converts from inches to cm
		System.out.println(Converter.convertToCM(amount) + " cm");
		//converts from cm to inches
		System.out.println(Converter.convertToInches(amount) + " inches");
		//converts from kilometers to miles
		System.out.println(Converter.convertToMiles(amount) + " miles");
		//converts from miles to kilometers
		System.out.println(Converter.convertToKilometers(amount) + " Km");
		
		// Q1 end =======================================
		
		//Q2 Test =====================================
		System.out.println("\nQuestion 2");
		//Test array
		Student[] mlst = {
			new Student("A12345","Murphy","Donal"),
			new Student("A12347","Boland","Barry"),
			new Student("A12348","Tynan","Ruairi"),
			new Student("A12350","Tierney","Eoin"),
			new Student("A12349","Power","Paddy"),
			new Student("A12351","Mullins","Tony"),
			new Student("A12352","Power","Paddy"),
			new Student("A12346","Estefan","Faheem"),
			new Student("A11111","Boland","Veronica")
		};
		
		//natural sorting
		for(int j = 0; j < mlst.length; j++)
		{
			int min = j;
			for(int i = j+1; i < mlst.length; i++)
			{
				if(mlst[min].compareTo(mlst[i]) > 0)
					min = i;
				Student temp = mlst[j];
				mlst[j] = mlst[min];
				mlst[min] = temp;				
			}
		}
		System.out.println("Natural sorted list:");
		for(Student s : mlst)
			System.out.println(s);
		
		//sorting by surname
		Arrays.sort(mlst, Student.surnameCompare());
		
		System.out.println("\nSurname sorted list:");
		for(Student s : mlst)
			System.out.println(s);		

		// Q2 end ======================================
		
		
		// Q3 Test ======================================
		
		System.out.println("\nQuestion 3");
		//create chess pieces to test
		ChessPiece cp1 = ChessPiece.BISHOP;
		ChessPiece cp2 = ChessPiece.QUEEN;
		ChessPiece cp3 = ChessPiece.BISHOP;
		
		/*check for ChessPiece equality*/
		if(cp3.equals(cp2))
			System.out.println(cp3 + " is equal to " + cp2);
		else
			System.out.println(cp3 + " is not equal to " + cp2);
		
		if(cp1.equals(cp3))
			System.out.println(cp1 + " is equal to " + cp3);
		else
			System.out.println(cp1 + " is not equal to " + cp3);	
		
		/*compare 2 chess pieces*/
		if(cp2.compareTo(cp1) <= 0)
			System.out.println(cp2.toString() + ", " + cp1.toString());
		else
			System.out.println(cp1.toString() + ", " + cp2.toString());
		
		if(cp1.compareTo(cp3) <= 0)
			System.out.println(cp1.toString() + ", " + cp3.toString());
		else
			System.out.println(cp3.toString() + ", " + cp1.toString());
		// Q3 end ======================================
	}
}
