import Controller.DatabaseController;


import Controller.AccManagementController;

public class TradingStories {

	public static void main(String[] args) {
		
		DatabaseController database = new DatabaseController();
		
		AccManagementController accManagementController = new AccManagementController(database);
		
		
	}

}

