package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {
	
	/**
	 * Method to demonstrate access to the singleton GameService instance
	 * It prints all existing games in memory to confirm shared state
	 */
	public void testSingleton() {
		
		System.out.println("\n=== Testing Singleton Instance ===");
		
		// Obtain the singleton instance of GameService
		GameService service = GameService.getInstance();
		
		// Print all active games to confirm shared data
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
