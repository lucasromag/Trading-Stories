package Model;

import java.util.Calendar;
import java.util.Date;

public class Book {

	private String title;

	private String author;

	private String publisher;

	private Date releaseDate;

	private String state;

	private String genre;
	
	private Client owner;

	public String getTitle() {
		return title;
	}

	public Book(String title, String author, String publisher, Date releaseDate, String state, String genre,Client owner) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.releaseDate = releaseDate;
		this.state = state;
		this.genre = genre;
		this.owner = owner;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public Date getreleaseDate() {
		return releaseDate;
	}

	public String getState() {
		return state;
	}

	public String getGenre() {
		return genre;
	}

	public Client getOwner() {
		return owner;
	}
	public void setOwner(Client owner) {
		this.owner = owner;
		
	}
	
}
