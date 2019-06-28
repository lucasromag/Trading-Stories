package Model;

public class User {

	private String username;

	private String password;

	private String completeName;
	
	private String email;

	private char gender;

	private String address;

	private String telephoneNum;

	public boolean validateCredentials(String password) {
		return this.password.contentEquals(password);
	}

	public User(String user, String password, String completeName, char gender, String address, String telephoneNum, String email) {
		this.username = user;
		this.password = password;
		this.completeName = completeName;
		this.gender = gender;
		this.address = address;
		this.telephoneNum = telephoneNum;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getCompleteName() {
		return completeName;
	}

	public char getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephoneNum;
	}
	
	public String getEmail() {
		return email;
	}

}
