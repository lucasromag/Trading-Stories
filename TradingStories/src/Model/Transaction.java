package Model;

import java.util.Calendar;

public class Transaction {

	private String status;

	private Client user;

	private OwlSpot location;

	private Calendar date;

	private Book bookGiven;

	private Book bookReceived;

	public Calendar getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public Client getUser() {
		return user;
	}

	public Transaction(String status, Client user, OwlSpot location, Calendar date, Book bookGiven, Book bookReceived) {
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
