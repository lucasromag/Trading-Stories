import Model.Database;


import Controller.AccManagementController;

public class TradingStories {

	public static void main(String[] args) {
		
		Database database = new Database();
		
		AccManagementController accManagementController = new AccManagementController(database);
		
		System.out.print(accManagementController.clientLogin("silva", "1234")); //should print true
		
	}

}

