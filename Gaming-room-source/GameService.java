package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */

/**
 * Singleton service class that manages active games in memory.
 * Provides methods to add and retrieve games while ensuring uniqueness.
 * 
 * <p>
 * This class uses the Singleton and Iterator design patterns.
 * Only one instance of GameService can exist at a time.
 * </p>
 * 
 */
public class GameService {

	// List to store all active games
	private static List<Game> games = new ArrayList<>();

	 // Static ID counters for games, teams, and players
	private static long nextGameId = 1;
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;

	// Singleton instance
	
	private static GameService instance = null;
	
	/**
	 *  Private constructor to enforce singleton pattern
	 */
	private GameService() {
		// Prevent external instantiation
	
	}
	
	/**
	 * Returns the singleton instance of GameService.
	 * If none exist, one is created.
	 * 
	 * @return GameService instance
	 */
	
	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
		}
		return instance;
	}

	/**
	 * Adds a new game if the name is unique (case-insensitive).
	 * Uses the iterator pattern to check for existing games.
	 * 
	 * @param name   Unique name for the game
	 * @return       The new or existing Game instance
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		for (Game existingGame : games) {
			if (existingGame.getName().equalsIgnoreCase(name)) {
				game = existingGame;
				break;
			}
		}
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}
	
	/**
	 * Returns the number of active games.
	 * 
	 * @return   Total game count
	 * 
	 */
	
	public int getGameCount() {
		return games.size();
	}
	
	
	/**
	 * Returns the game instance at the specified index.
	 * 
	 * @param index  Index position in the list to return
	 * @return       Requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		for (Game game : games) {
			if (game.getId() == id) {
				return game;
			}
		}
		
		return null;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name   Unique name of game to search for
	 * @return       Requested game instance
	 */
	public Game getGame(String name) {

		for (Game game : games) {
			if (game.getName().equalsIgnoreCase(name)) {
				return game;
			}
		}
		
		return null;
	}
	
	/**
	 * returns the next unique team ID
	 * 
	 * @return   Next team ID
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}
	
	/**
	 * Returns the next unique player ID.
	 * 
	 * @return   Next player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
	
}
