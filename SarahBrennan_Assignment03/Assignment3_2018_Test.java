/*
 * Class: Assignment3_2017
 *
 * Test class for Assignment 3 2017
 *
 * Sarah Brennan 2962279 
 */

import java.util.*;
public class Assignment3_2018_Test{
	public static void main(String args[]){
		// Q1  ==============================================
    	/*
    	Employee e1 = new Employee(...
    	Department d1 = new Department(...
		*/
		
		//set values for new employee object
		Employee employee = new Employee("4077252U", "Sarah Brennan", 20000);
		//set values for new department object
		Department department = new Department("IT", employee);
		//display employee
		employee.display();
		//display department
		department.display();
		//change value of employee name
		employee.setName("Mark O'Sullivan");
		//change value of employee ppsn
		employee.setPPSNum("1234567K");
		//change value of employee salary
		employee.setSalary(18000);
		//proves that department display does not change as encapsulation is being used
		department.display();
		//shows that employee has changed it's details for new employee details
		employee.display();






		// Q2  ==============================================
		// This code is a sample test for Q2. You will need to add more tests to test all methods
		
		TicketManager tm = new TicketManager();
     	System.out.println(tm);
     	//create new random ticket
     	Ticket t1 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	//add ticket to the array
     	tm.buy(t1);
     	//print out the list of tickets bought
     	System.out.println(tm);
     	Ticket t2 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	tm.buy(t2);
     	System.out.println(tm);
     	//buy a quick pick
     	tm.buy();
     	System.out.println(tm);
     	//create 200 more tickets to be bought
     	for(int j = 0; j < 200; j++) {
     		tm.buy(new Ticket((int)(Math.random()*5),(int)(Math.random()*5)));
     	}
     	//print out full list of bought tickets
     	System.out.println(tm);
     	//print amount of sold tickets
     	System.out.println("How many tickets are sold: " + tm.sold());
     	//print if all tickets allowed were sold or not
     	System.out.println(tm.allsold());
     	//draw winning ticket
     	Ticket draw = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	//print out winning ticket
     	System.out.println("Winning ticket: " + draw);
     	//search list to see if any of the tickets match the winning ticket
     	System.out.println("Are there any winning tickets in the list: " + tm.search(draw));
     	//count the amount of winning tickets
     	System.out.println("Amount of winning tickets: " + tm.freqWinner(draw));
		
	}
}