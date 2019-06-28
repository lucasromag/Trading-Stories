package Controller;
import Model.Administrator;
import Model.Client;
import Model.User;

public class AccManagementController {

	private DatabaseController database;

	public void clientSignup(String user, String password, String completeName, char gender, String address, String telephoneNum, String nickname, String email) {
		Client client = new Client(user,password,completeName,gender,address,telephoneNum,nickname,email);
		database.add(client);
	}

	public User login(String user, String password) {
		Client client = database.getClient(user);
		if(client != null)
			return client;
		Administrator admin = database.getAdministrator(user);
		if(admin != null)
			return admin;
		return null;
	}

	public AccManagementController(DatabaseController database) {
		this.database = database;
	}

}
