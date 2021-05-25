import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class MyStackTest {

	Book b = new Book("Happy Days","Beckett","Fiction");
	Book b1 = new Book("Ulysses","Joyce","Fiction");
	Book b2 = new Book("To Kill a Mocking Bird","Lee","Fiction");
	
	MyStack<Book> s1 = new MyStack<Book>(b);
	MyStack<Book> s2 = new MyStack<Book>(b);
	MyStack<Book> s3 = new MyStack<Book>(b1);
	
	/*Test for push*/
	@Test
	public void testPush() {
		//Create new list with books that are expected and add the books expected to the list
		LinkedList<Book> expected = new LinkedList<Book>();
		expected.add(b);
		expected.add(b1);
		expected.add(b2);
		//push new books to the mystack list
		s1.push(b1);
		s1.push(b2);
		//compare the two lists
		assertEquals(s1.getMyStackList(), expected);
	}
	
	/*Test for pop*/
	@Test
	public void testPop() {
		//Create new list with books that are expected and add the books expected to the list
		LinkedList<Book> expected = new LinkedList<Book>();
		expected.add(b);		
		expected.add(b1);
		//push books onto stack
		s1.push(b1);
		s1.push(b2);
		//pop top book from stack
		s1.pop();
		//compare two lists
		assertEquals(s1.getMyStackList(), expected);
	}
	
	/*Test search*/
	@Test
	public void testSearch() {
		//create boolean for result expected
		boolean res = true;
		//compare the list with result
		assertEquals(s1.search(b),res);
	}
	
	/*Test expected to be equals*/
	@Test
	public void testEquals() {
		//create boolean for result expected
		boolean res = true;
		//compare two lists with result
	    assertEquals(s1.equals(s2), res);
	}
	
	/*Test expected to not be equals*/
	@Test
	public void testNotEquals() {
		//create boolean for result expected
		boolean res = false;
		//compare two lists with result
	    assertEquals(s1.equals(s3), res);
	}

	/*Test tostring*/
	@Test
	public void testtoString() {
		//string that the list is compared to
		String stringCompare = "[BOOK: Happy Days BY Beckett IN Fiction CATEGORY]";
	    assertEquals(s1.toString(), stringCompare);
	}
	
	/*Test stack empty*/
	@Test
	public void testStackEmpty() { 
		boolean res = true;
	    assertEquals(s1.stackEmpty(), res);
	}
	
	/*Test stack not empty*/
	@Test
	public void testStackNotEmpty() { 
		boolean res = false;
		s1.push(b1);
	    assertEquals(s1.stackEmpty(), res);
	}
	
	/*Test stack full*/
	@Test
	public void testStackFull() { 
		//stack cannot be full as using linkedlists
		boolean res = false;
	    assertEquals(s1.stackFull(), res);
	}
	
	/*Test size of list*/
	@Test
	public void testSize() {
		int size = 3;
		//add books to stack
		s1.push(b1);
		s1.push(b2);
		//compare size of stack to 3
	    assertEquals(s1.size(), size);
	}

	/*Test top of list*/
	@Test
	public void testTop() { 
		//add books to both stacks
		s1.push(b1);
		s1.push(b2);
		s3.push(b);
		s3.push(b2);
	    assertEquals(s1.top(), s3.top());
	}
	
	/*Test frequency of list*/
	@Test
	public void testFreq() { 
		//number of books in stack should be 3
		int frequency = 3;
		//add the same book so 3 appear in the stack
		s1.push(b);
		s1.push(b);
		//compare frequency of book
	    assertEquals(s1.freq(b), frequency);
	}
}
