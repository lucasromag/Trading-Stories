package Model;

import java.util.Calendar;

public class Book {

	private String title;

	private String author;

	private String publisher;

	private Calendar releaseDate;

	private String state;

	private String genre;

	public String getTitle() {
		return title;
	}

	public Book(String title, String author, String publisher, Calendar releaseDate, String state, String genre) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.releaseDate = releaseDate;
		this.state = state;
		this.genre = genre;
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

}
