package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// Obtain the singleton instance of GameService
		GameService service = GameService.getInstance();
		
		System.out.println("\n=== Initializing game data ===");
		
		// Add games
		Game game1 = service.addGame("Guess That Drawing");
		System.out.println(game1);
		
		Game game2 = service.addGame("Draw & Win");
		System.out.println(game2);
		
		// Attempt to add a duplicate game [should return the existing one]
		Game dupeGame = service.addGame("Guess That Drawing");
		System.out.println("Duplicate attempt: " + dupeGame);
		
		// Add teams to game1
		Team teamA = game1.addTeam("A Team");
		Team teamB = game1.addTeam("B Team");
		System.out.println("Teams added to " + game1.getName() + ":");
		System.out.println(teamA);
		System.out.println(teamB);
		
		// Attempt to add a duplicate team
		Team dupeTeam = game1.addTeam("A Team");
		System.out.println("Duplicate team attempt: " + dupeTeam);
		
		// Add players to A Team
		Player player1 = teamA.addPlayer("Alice");
		Player player2 = teamA.addPlayer("Bob");
		
		// Add players to B team
		Player player3 = teamB.addPlayer("Frank");
		
		System.out.println("Players in Team A:");
		for (Player player : teamA.getPlayers()) {
			System.out.println(player);
		}
		
		System.out.println("Players in Team B:");
		for (Player player : teamB.getPlayers()) {
			System.out.println(player);
		}
		
		// Confirm singleton pattern by testing with SingletonTester
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
