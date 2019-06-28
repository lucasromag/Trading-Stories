package Controller;

import Model.Client;
import Model.OwlSpot;
import Model.Transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Model.Book;

public class ClientOperationController {
	
	private Client client;
	private DatabaseController database;
	
	public ClientOperationController(DatabaseController db,Client client) {
		this.client = client;
		this.database = db;
	}

	public Collection<Book> listAllBooks() {
		Collection<Book> books = database.getAllBooks();
		
		ArrayList<Book> returnBooks = new ArrayList<Book>();
		
		for(Book b : books) {
			if(b.getOwner() != client)
				returnBooks.add(b);
			}
		return returnBooks;
		}
	
	public Collection<Book> filterByTitle(String titlefilter) {
			Collection<Book> books = listAllBooks();
			ArrayList<Book> returnBooks = new ArrayList<Book>();
			for(Book b : books) {
				String title = b.getTitle();
				if(title.startsWith(titlefilter))
					returnBooks.add(b);
			}
				return returnBooks;
		}
	
	public boolean requestTransaction(Book requestedBook,Book givenBook,OwlSpot spot, Date date) {
		if(requestedBook.getOwner() == client)//check for same owner(shouldn't happen in an ideal situation)
			return false;
		
		Transaction t1 = new Transaction("REQUESTED",requestedBook.getOwner(),spot,date,givenBook,requestedBook);
		Transaction t2 = new Transaction("OPEN",client,spot,date,requestedBook,givenBook);
		
		client.addTransaction(t1);
		requestedBook.getOwner().addTransaction(t2);
		
		return true;
		
	}
	
	
	public void updateTransactions(Transaction trans, String status)
	{
		Client user = trans.getUser();
		Date date = trans.getDate();
		
		client.updateTransaction(status, date, user); //update transaction status for both clients
		user.updateTransaction(status,date,client);
	}
			
	
	public void acceptTransaction(Transaction trans)
	{
		String status = "AWAITING EXCHANGE";
		updateTransactions(trans,status);
	}
	
	public void refuseTransaction(Transaction trans)
	{
		String status = "REFUSED";
		updateTransactions(trans,status);
	}
	
	public void finalizeSuccessTransf(Transaction trans, int OwlRating)
	{
		String status = "SUCCESS";
		Date date = trans.getDate();
		Client user = trans.getUser();
		client.updateTransaction(status, date, user);
		user.updateOwlStars(OwlRating);
		
		Transaction t2 = user.getTransaction(trans.getDate(), client);
		
		if(t2.getStatus() == "SUCCESS")
		{
			database.exchangeBooks(trans.getBookGiven(),trans.getReceivedBook());
			updateTransactions(trans,"SUCCESSFUL EXCHANGE");
		}
	}
	
	
	public void finalizeNotExchanged(Transaction trans, int OwlRating) 
	{
		String status = "FAILED EXCHANGE";
		Client user = trans.getUser();
		updateTransactions(trans,status);
		user.updateOwlStars(OwlRating);	
	}
	
	
	public Collection<Transaction> getTransbyStatus(String status){
		Collection<Transaction> trans = client.getTransactions();
		ArrayList<Transaction> filteredTrans = new ArrayList<Transaction>();
		for(Transaction t : trans)
		{
			if(t.getStatus() == status)
			{
				filteredTrans.add(t);
			}
		}
		return filteredTrans;
	}
	
	
	public Collection<Transaction> listTransfOffers(){
		String status = "OPEN";
		Collection<Transaction> trans = getTransbyStatus(status);
		return trans;
	}
	
	public Collection<Transaction> listPresentTransfs(){
		String status = "AWAITING EXCHANGE";
		Collection<Transaction> trans = getTransbyStatus(status);
		return trans;
	}
	

	
}
