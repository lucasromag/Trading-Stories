import Controller.DatabaseController;
import Controller.UIcontroller;
import Model.Book;
import Model.Client;
import View.UIpageSellection;
import View.gui;

import java.awt.EventQueue;
import java.util.Collection;

import javax.swing.UIManager;

import Controller.AccManagementController;
import Controller.ClientOperationController;

public class TradingStories {

	public static void main(String[] args) {
		
		DatabaseController database = new DatabaseController();
		
		AccManagementController accManagementController = new AccManagementController(database);

		
		Client client = (Client) accManagementController.login("silva","1234");
		
		ClientOperationController clientOperationController = new ClientOperationController(database,client);
		
		Collection<Book> books = clientOperationController.filterByTitle("A crise");
		UIpageSellection uipagesellection = new UIpageSellection();
		
		UIcontroller uicontroller = new UIcontroller(uipagesellection, accManagementController, clientOperationController);		
		
		for(Book b : books) {
			System.out.println(b.getTitle());
		}
		
		// GUI Call
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui(uicontroller);
					uipagesellection.setGUI(window);
					window.setVisible();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

