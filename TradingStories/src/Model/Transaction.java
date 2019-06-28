package Model;

import java.util.Date;

public class Transaction {

	private String status;

	private Client user;

	private OwlSpot location;

	private Date date;

	private Book bookGiven;

	private Book bookReceived;

	public Date getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public Client getUser() {
		return user;
	}

	public Transaction(String status, Client user, OwlSpot location, Date date, Book bookGiven, Book bookReceived) {
		this.status = status;
		this.user = user;
		this.location = location;
		this.date = date;
		this.bookGiven = bookGiven;
		this.bookReceived = bookReceived;
	}

	public Book getReceivedBook() {
		return bookReceived;
	}

	public Book getBookGiven() {
		return bookGiven;
	}
	
	public OwlSpot getLocation() {
		return location;
	}
	
	

}
