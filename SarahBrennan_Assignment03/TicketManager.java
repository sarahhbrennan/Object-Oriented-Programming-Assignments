/*
 * Class: TicketManager
 *
 * Student Name: Sarah Brennan
 * Student Number: 2962279
 *
 * Please uncomment and fill in the 5 methods below
 */

class TicketManager{
	private Ticket[] tickets;
	private int sold = 0;
	private int maxTickets = 500;

	//constructor that creates an array
	TicketManager()
	{
		tickets = new Ticket[maxTickets];
	}

	//adds ticket to draw so long as it does not go over maxTickets
	public boolean buy(Ticket t){
		// Add the ticket to the next available slot in the list
		//check and make sure the number of tickets sold is not more than the maxTickets
		if(sold < tickets.length)
		{
			//create new ticket object
			t = new Ticket (t.a(), t.b());
			//place that new ticket into tickets array
			tickets[sold] = t;
			//increase number of tickets sold
			sold++;
			//return true that the number of tickets sold is not more that maxTickets
			return true;
		}
		else
			//return false because number of tickets trying to be sold is more than maxTickets
			return false;
	}

	public boolean buy(){
		// Generate and add the ticket to the next available slot in the list
		//check and make sure the number of tickets sold is not more than the maxTickets
		if(sold < tickets.length)
		{
			//create new ticket and randomly select numbers to generate ticket
			Ticket t = new Ticket ((int)(Math.random()*5),(int)(Math.random()*5));
			//place new ticket into tickets array
			tickets[sold] = t;
			//increase number of tickets sold
			sold++;
			//return true that the number of tickets sold is not more that maxTickets
			return true;
		}
		else
			//return false because number of tickets trying to be sold is more than maxTickets
			return false;
	}

	public int freqWinner(Ticket t){
		// Count how many tickets match the winning ticket drawn
		//create frequency counter
		int freq = 0;
		//make sure to create new object for ticket
		t = new Ticket(t.a(), t.b());
		//for loop to go through each sold ticket
		for(int j = 0; j < sold; j++)
		{
			//compare array with drawn ticket but need to compare the string in each to see if they are the same
			if(tickets[j].toString().equals(t.toString()))
			{
				//increase frequency if it is
				freq++;
			}
		}
		//return number of winning tickets
		return freq;
	}

	//No Winner class was given in the question so did not do this 
	/*public Winner[] getWinners(Ticket t){
		// Return a list of all tickets that match the winning ticket drawn
		// Do not break encapsulation!
	}*/

	public boolean search(Ticket t){
		// return true if a matching ticket is in the list
		//boolean to check if the ticket is found
		boolean found = false;
		//int to go through each ticket in array
		int j = 0;
		//create new object for ticket drawn
		t = new Ticket(t.a(), t.b());
		//go into while until j > sold and the ticket has not been found in the array
		while(j < sold && !found)
		{
			//compare array with drawn ticket but need to compare the string in each to see if they are the same
			if(tickets[j].toString().equals(t.toString()))
			{
				//found if tickets[j] and t are equal
				found = true;
			}
			//go to next ticket in array until end or have found the ticket
			else
				j++;
			
		}
		//return if found or not, will be true if found and false if not found
		return found;
	}

	public int sold(){
		// The number of tickets sold
		return sold;
	}

	public boolean allsold(){
		// Return true if all tickets have been sold
		//confirm that the amount sold is the same as max value, if it is then all are sold
		if(sold == maxTickets)
		{
			return true;
		}
		//if not the same number then there are more tickets to sell
		else
			return false;
	}

	public String toString(){
		if(sold == 0)
			return "[]";

		String s = "[";
		for(int j = 0; j < sold - 1; j++) {
			s = s + tickets[j] + ",";
		}
		return s+tickets[sold-1]+"]";
	}
}