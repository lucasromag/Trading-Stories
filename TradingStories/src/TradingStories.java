import Controller.DatabaseController;
import Model.Book;
import Model.Client;

import java.util.Collection;

import Controller.AccManagementController;
import Controller.ClientOperationController;

public class TradingStories {

	public static void main(String[] args) {
		
		DatabaseController database = new DatabaseController();
		
		AccManagementController accManagementController = new AccManagementController(database);

		
		Client client = (Client) accManagementController.login("silva","1234");
		
		ClientOperationController clientOperationController = new ClientOperationController(database,client);
		
		Collection<Book> books = clientOperationController.filterByTitle("A crise");
		
		
		for(Book b : books) {
			System.out.println(b.getTitle());
		}
		
	}

}

