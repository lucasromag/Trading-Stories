package Controller;

import java.util.List;

import Model.Book;
import Model.OwlSpot;
import Model.User;

public class UIcontroller {

	private int currentState;

	private User currentUser;

	public void callCancel() {

	}

	public void callNewAccount() {

	}

	public void callUserLogin() {

	}

	public User callLogin(String Username, String Password) {
		return null;
	}

	public void callCreateUserAccount(String username, String password, char gender, String adress, String phoneNumber, String email, String nickname) {

	}

	public void callManageCollection() {

	}

	public void callAddBook() {

	}

	public void callSearchUser() {

	}

	public void callSearchBook() {

	}

	public void callExchangeProposals() {

	}

	public void callExchangeInProgress() {

	}

	public void callSugestOwlspot() {

	}

	public void callAddBookToCollection(String title, String author, String publisher, String releaseDate, String genre, String stateOfConservation) {

	}

	public List<Book> callRemoveBook(Book book) {
		return null;
	}

	public List<Book> callSearchBookEntry(String query) {
		return null;
	}

	public void callProposeExchange(User user, Book book, List<OwlSpot> owlspots) {

	}

	public void callProposedExchangeChoice(Book bookWanted, Book bookOffered, OwlSpot owlspot) {

	}

	public void callUserProfile(User user) {

	}

	public void callAcceptExchangeProposal(User user, Exchange exchange) {

	}

	public void callRejectExchangeProposal(User user, Exchange exchange) {

	}

	public void callFinalizeExchange(User user, Exchange exchange, int owlscore) {

	}

	public List<User> callSearchUserEntry(String query) {
		return null;
	}

	public void callManageOwlspots() {

	}

	public void callCreateAdmin() {

	}

	public void callViewComplaints() {

	}

	public void callCreateAdminAccount(String username, String password, char gender, String adress, String phoneNumber, String email) {

	}

}
