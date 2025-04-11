package Library.book;

public class Book {

	String title;
	String author;
	String isbn;
	
  public Book (String title, String author, String isbn) {
	  
	  this.author=author;
	  this.isbn=isbn;
	  this.title=title;
	  
	 
  }
  
  public void Display() {
	  
	  
	  System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("ISBN: " + isbn);
	  
  }
  
  public String isbn() {
	  
	  
	  
	  return isbn;
  }
	
	
}
