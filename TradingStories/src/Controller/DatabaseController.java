package Controller;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Model.Administrator;
import Model.Client;
import Model.OwlSpot;

public class DatabaseController {

	private final Map<String,Client> clientAccounts;

	private final Map<String,Administrator> adminAccounts;

	private final Map<String,OwlSpot> owlSpots;

	public DatabaseController() {
		clientAccounts = new HashMap<>();
		adminAccounts = new HashMap<>();
		owlSpots = new HashMap<>();
		
	
		//String user, String password, String completeName, char gender, String address, long telephoneNum, String email) {
			//super(user,password,completeName,gender,address,telephoneNum,email);
			//String user, String password, String completeName, char gender, String address, long telephoneNum, String nickname, String email)
		Administrator admin1 = new Administrator("ronaldinho","1234","Ronald Dickson",'M',"Rua Joao Mendes 1040","992323232","sweetpotato@gmail.com");
		Client client1 = new Client("silva","1234","Dick Ronaldson",'M',"Rua Joao Mendes 1040","323232432","sweetey","sweetpotato@gmail.com");
		
	
		add(client1);
		Date today = new Date();
		Book b1 = new Book("A crise de 1942","Jose Fagundes","Nintendo",)
		//client1.addBook();
		
		
		add(admin1);
		
	}

	public Collection<Client> getAllClientAccounts() {
		return clientAccounts.values();
	}

	public Client getClient(String user) {
		return clientAccounts.get(user);
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
	
	public OwlSpot getOwlSpot(String name) {
		return owlSpots.get(name);
	}

	public void add(OwlSpot owlspot) {
		this.owlSpots.put(owlspot.getName(), owlspot);
	}

	public void add(Client client) {
		this.clientAccounts.put(client.getUsername(), client);
	}

	public void add(Administrator administrator) {
		this.adminAccounts.put(administrator.getUsername(),administrator);
	}
		
	public void delete(Client client) {
		this.clientAccounts.remove(client.getUsername());
	}
	
}
