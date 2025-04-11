package Library.Transcations;

import Library.book.*;

import java.time.LocalDate;

import Library.Member.*;


public class Transaction {
	
	
	Book book;
	Member member;
	LocalDate issuseDate;
	
	
	public Transaction(Book book , Member member){
		
		
		this.book=book;
		this.member=member;
		issuseDate=LocalDate.now();
		
		
	}
	
	
	public void displayTransaction() {
		
		book.Display();
		member.MemberDisplay();
	    System.out.println("issuseDate "+issuseDate);
		
	}
	
	
	
	
	

}
