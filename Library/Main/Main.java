package Library.Main;
import Library.book.*;
import Library.Member.*;
import Library.Transcations.*;
public class Main {

	
	public static void main(String...arg) {
		
		
		Book b1 = new Book ("Thamaraisan","s24","java" );
		
		
		Member m1 = new Member("003","bala");
		
		
		Transaction first = new Transaction(b1,m1);
		
		first.displayTransaction();
		
	}
	
}
