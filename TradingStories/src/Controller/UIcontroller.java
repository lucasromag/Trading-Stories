package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Administrator;
import Model.Book;
import Model.Client;
import Model.OwlSpot;
import Model.Transaction;
import Model.User;
import View.UIpageSellection;

public class UIcontroller {

	private int currentState;

	private User currentUser = null;
	
	private UIpageSellection pageSellection;
	private AccManagementController acccontroller;
	private ClientOperationController clientOpController;
	
	public UIcontroller(UIpageSellection pagemanag, AccManagementController accmanagcontroller, ClientOperationController clientopcontrol)
	{
		pageSellection = pagemanag;
		acccontroller = accmanagcontroller;
		clientOpController = clientopcontrol;
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
		currentUser = acccontroller.login(Username, Password);
		if (currentUser != null)
		{
			if (currentUser instanceof Client)
			{
				pageSellection.callUserMainPage(currentUser);
			}
			else if (currentUser instanceof Administrator)
			{
				pageSellection.callAdminMainPage(currentUser);
			}
		}
		else
		{
			pageSellection.callLandingPage();
		}
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
		List<Book> listAllBooks = new ArrayList<Book>(clientOpController.listAllBooks());
		pageSellection.callSearchBookPage(listAllBooks);
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
		List<Book> listResultBooks = new ArrayList<Book>(clientOpController.filterByTitle(query));
		pageSellection.callSearchBookPage(listResultBooks);
		return null;
	}

	public void callProposeTransaction(Book book) {

	}

	public void callProposedTransactionChoice(Book bookWanted, Book bookOffered, OwlSpot owlspot) {

	}

	public void callUserProfile(User user) {

	}

	public void callAcceptTransactionProposal(Transaction transaction) {

	}

	public void callRejectTransactionProposal(Transaction transaction) {

	}

	public void callFinalizeTransaction(Transaction transaction, int owlscore) {

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
	
	public void callViewTransactionProposal(Transaction transaction) {
		
	}

}
