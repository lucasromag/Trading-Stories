package Model;

import java.util.Collection;

public class Client extends User {

	private String nickname;

	private float owlStars = 0;

	private Collection<Transaction> transactions;

	private Collection<Book> books;

	private Collection<Complaint> complaints;

	public String getNickname() {
		return nickname;
	}

	public Client(String user, String password, String completeName, char gender, String address, long telephoneNum, String nickname, String email) {

	super(user,password,completeName,gender,address,telephoneNum,email);
	this.nickname = nickname;
	}
	
	public float getOwlStars() {
		return owlStars;
	}

	public Collection<Transaction> getTransactions() {
		return transactions;
	}

	public Collection<Complaint> getComplaints() {
		return complaints;
	}

	public Collection<Book> getBooks() {
		return books;
	}


}
