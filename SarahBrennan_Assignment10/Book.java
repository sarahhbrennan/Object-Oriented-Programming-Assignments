/**
 * @(#)Book.java
 *
 *
 * @author
 * @version 1.00
 */


public class Book {
	private String title, author, category;
	
	public Book(String title, String author, String category) {
		this.title = title;
		this.author = author;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this. author = author;
	}
	public void setCategory(String category) {
		this. category = category;
	}
	public boolean equals(Object o) {
		if(!(o instanceof Book))
			return false;
			
		Book b =(Book)o;
		if (b.getTitle().equals(title) && b.getAuthor().equals(author))
			return true;
		
		return false;
	}
	public String toString() {
		return "BOOK: " + title + " BY " + author + " IN " + category + " CATEGORY";
	}
}
