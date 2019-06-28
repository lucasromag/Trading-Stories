package Controller;

import java.util.List;

import Model.Book;
import Model.OwlSpot;
import Model.Transaction;
import Model.User;
import View.UIpageSellection;

public class UIcontroller {

	private int currentState;

	private User currentUser = null;
	
	private UIpageSellection pageSellection;
	
	public UIcontroller(UIpageSellection entry)
	{
		pageSellection = entry;
	}

	// Needs specific code for different states
	public void callCancel() {
		currentUser = null;
		pageSellection.callLandingPage();
	}

	public void callNewAccount() {
		pageSellection.callAccountCreationPage();
	}

	public void callUserLogin() {
		pageSellection.callLoginPage();
	}

	public User callLogin(String Username, String Password) {
		return null;
	}

	public void callCreateUserAccount(String username, String password, String fullname, char gender, String adress, String phoneNumber, String email, String nickname) {

	}

	public void callManageCollection() {

	}

	public void callAddBook() {

	}

	public void callSearchUser() {

	}

	public void callSearchBook() {

	}

	public void callTransactionProposals() {

	}

	public void callTransactionInProgress() {

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

	public void callProposeTransaction(User user, Book book, List<OwlSpot> owlspots) {

	}

	public void callProposedTransactionChoice(Book bookWanted, Book bookOffered, OwlSpot owlspot) {

	}

	public void callUserProfile(User user) {

	}

	public void callAcceptTransactionProposal(User user, Transaction transaction) {

	}

	public void callRejectTransactionProposal(User user, Transaction transaction) {

	}

	public void callFinalizeTransaction(User user, Transaction transaction, int owlscore) {

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
