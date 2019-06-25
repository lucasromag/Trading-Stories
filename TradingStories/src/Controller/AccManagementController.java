package Controller;
import Model.Client;
import Model.Database;

public class AccManagementController {

	private Database database;

	public void clientSignup(String user, String password, String completeName, char gender, String address, long telephoneNum, String nickname, String email) {
		Client client = new Client(user,password,completeName,gender,address,telephoneNum,nickname,email);
		database.add(client);
	}

	public boolean clientLogin(String user, String password) {
		Client client = database.getClient(user);
		return client.validateCredentials(password);
	}

	public AccManagementController(Database database) {
		this.database = database;
	}

}
