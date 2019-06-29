package View;

import java.util.List;

import Model.Book;
import Model.OwlSpot;
import Model.Transaction;
import Model.User;

public class UIpageSellection {

	private gui window;
	
	public void setGUI(gui entry)
	{
		window = entry;
	}
	
	public void callLandingPage() {
		window.changePage("landing");
	}

	public void callAccountCreationPage() {
		window.changePage("account_creation");
	}

	public void callLoginPage() {
		window.changePage("user_login");
	}

	public void callUserMainPage(User user) {
		window.setWelcomeName(user);
		window.changePage("main_page");
	}

	public void callAddBookPage() {
		window.changePage("add_book");
	}

	public void callManageCollectionPage(User user) {
		window.changePage("manage_collection");
	}

	public void callSearchBookPage(List<Book> books) {
		window.clearListBookSearch();
		window.setListBookSearch(books);
		window.changePage("search_book");
	}

	public void callTransactionPage(Book book, User user, List<OwlSpot> owlspots) {
		window.changePage("transaction_start");
	}

	public void callTransactionAcceptPage(Transaction transaction, User user) {
		window.changePage("transaction_proposal");
	}

	public void callTransactionInProgressPage(Transaction transaction, User user) {
		window.changePage("transaction_in_progress");
	}

	public void callUserProfilePage(User user) {
		window.changePage("user_profile");
	}

	public void callSearchUserPage() {
		window.changePage("search_user");
	}

	public void callTransactionProposalsPage(User user) {
		window.changePage("transaction_proposals");
	}

	public void callAdminMainPage(User user) {
		window.changePage("main_page_admin");
	}

	public void callAdminAccountCreationPage() {
		window.changePage("account_creation_admin");
	}

	public void callManageOwlspotsPage() {
		window.changePage("manage_owlspots");
	}

	public void callAddOwlspotPage() {
		window.changePage("add_owlspots");
	}

	public void callUserProfileAdminPage(User user) {
		window.changePage("user_profile_admin");
	}

}
