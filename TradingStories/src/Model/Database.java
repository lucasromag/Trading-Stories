package Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Database {

	private final Map<String,Client> clientAccounts;

	private final Map<String,Administrator> adminAccounts;

	private final Map<String,OwlSpot> owlSpots;

	public Database() {
		clientAccounts = new HashMap<>();
		adminAccounts = new HashMap<>();
		owlSpots = new HashMap<>();
	}

	public Collection<Client> getAllClientAccounts() {
		return clientAccounts.values();
	}

	public Collection<Administrator> getAllAdminAccounts() {
		return adminAccounts.values();
	}
	
	public Collection<OwlSpot> getAllOwlSpots() {
		return owlSpots.values();
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
