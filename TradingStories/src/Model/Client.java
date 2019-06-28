package Model;

import java.util.Calendar;
import java.util.Collection;
import java.util.function.Predicate;

public class Client extends User {

	private String nickname;

	private float owlStars = 0;
	
	private int amountEval = 0;

	private Collection<Transaction> transactions;

	private Collection<Complaint> complaints;

	public String getNickname() {
		return nickname;
	}

	public Client(String user, String password, String completeName, char gender, String address, String telephoneNum, String nickname, String email) {
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
	
	public updateComplaintStatus(Complaint compl)
	{
		
		public static Predicate<Complaints> isSameComplain(){
			return p -> p.
		}
		
		complaints.removeIf()
		complaints.remove(com)
		
	}

	public void addTransaction(Transaction trans) {
		transactions.add(trans);
	}
		
	public void addComplaint(Complaint compl) {
		complaints.add(compl);
	}
	
	public void updateOwlStars(int score) {
		owlStars *= amountEval;
		amountEval += 1;
		owlStars = (owlStars + score)/ amountEval;
	}
	

}
