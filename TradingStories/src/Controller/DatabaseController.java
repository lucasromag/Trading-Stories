package Controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import Model.Administrator;
import Model.Book;
import Model.Client;
import Model.OwlSpot;

public class DatabaseController {

	private final Map<String,Client> clientAccounts;

	private final Map<String,Administrator> adminAccounts;

	private final Map<String,OwlSpot> owlSpots;
	
	private final Map<String,Book> books;

	public DatabaseController() {
		clientAccounts = new HashMap<>();
		adminAccounts = new HashMap<>();
		owlSpots = new HashMap<>();
		books = new HashMap<>();
	
		//String user, String password, String completeName, char gender, String address, long telephoneNum, String email) {
			//super(user,password,completeName,gender,address,telephoneNum,email);
			//String user, String password, String completeName, char gender, String address, long telephoneNum, String nickname, String email)
		Administrator admin1 = new Administrator("ronaldinho","1234","Ronald Dickson",'M',"Rua Joao Mendes 1040","992323232","sweetpotato@gmail.com");
		Client client1 = new Client("silva","1234","Dick Ronaldson",'M',"Rua Joao Mendes 1040","323232432","sweetey","sweetpotato@gmail.com");
		Client client2 = new Client("silvinho","1234","Dick Ronaldson",'M',"Rua Joao Mendes 1040","323232432","sweetey","sweetpotato@gmail.com");
		
	
		add(client1);
		add(client2);
		Date today = new Date();
		Book b1 = new Book("A crise de 1942","Jose Fagundes","Nintendo",today,"Destroyed","Horror",client1);
		Book b2 = new Book("A crise de 1943","Jose Fagundes","Nintendo",today,"Destroyed","Horror",client2);
		//client1.addBook();
		add(b1);
		add(b2);
		add(admin1);
		
	}

	public Collection<Client> getAllClientAccounts() {
		return clientAccounts.values();
	}

	public Client getClient(String user) {
		return clientAccounts.get(user);
	}
	
	public Book getBookbyTitle(String book)
	{
		return books.get(book);
	}
	
	
	public Collection<Administrator> getAllAdminAccounts() {
		return adminAccounts.values();
	}
	
	public Administrator getAdministrator(String user) {
		return adminAccounts.get(user);
	}
	
	public Collection<OwlSpot> getAllOwlSpots() {
		return owlSpots.values();
	}
	
	public Collection<Book> getAllBooks() {
		return books.values();
	}
	
	
	public OwlSpot getOwlSpot(String name) {
		return owlSpots.get(name);
	}

	public void add(OwlSpot owlspot) {
		this.owlSpots.put(owlspot.getName(), owlspot);
	}

	public void add(Client client) {
		this.clientAccounts.put(client.getUsername(), client);
	}
	
	public void add(Book book) {
		this.books.put(book.getTitle(),book);
	}

	public void add(Administrator administrator) {
		this.adminAccounts.put(administrator.getUsername(),administrator);
	}
	
	public Collection<Book> getBooksByOwner(Client owner){
		
		Collection<Book> booksOwned = new ArrayList<Book>();
		
		Collection<Book> books = getAllBooks();
		for(Book b : books) 
		{
			if(b.getOwner() == owner)
				booksOwned.add(b);
		}
		
		return booksOwned;
	}
	
	public void delete(Book book) {
		books.remove(book.getTitle(),book);
	}
	
	public void delete(Client client) {
		
		Collection<Book> ownedBooks = getBooksByOwner(client);
		
		for(Book b : ownedBooks) {
			delete(b);
		}

		this.clientAccounts.remove(client.getUsername());
	}
	
}
