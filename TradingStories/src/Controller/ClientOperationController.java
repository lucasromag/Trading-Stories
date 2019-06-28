package Controller;

import Model.Client;

import java.util.ArrayList;
import java.util.Collection;

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
		for(Book b : books) {
			if(b.getOwner() == client)
				books.remove(b);
			}
		return books;
		}
	
	public Collection<Book> filterByTitle(String titlefilter) {
			Collection<Book> books = listAllBooks();
			for(Book b : books) {
				String title = b.getTitle();
				if(!(title.startsWith(titlefilter)))
					books.remove(b);
			}
				return books;
		}
	
}
