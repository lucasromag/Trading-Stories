package Model;

import java.util.Calendar;

public class Book {

	private String title;

	private String author;

	private String publisher;

	private Calendar releaseDate;

	private String state;

	private String genre;
	
	private Client owner;

	public String getTitle() {
		return title;
	}

	public Book(String title, String author, String publisher, Calendar releaseDate, String state, String genre,Client owner) {
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

	public Calendar getreleaseDate() {
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
