package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

public class Team extends Entity {
	private List<Player> players = new ArrayList<>();
	
	/**
	 * Constructor to initialize a team with an id and name
	 * 
	 * @param id     Unique team identifier
	 * @param name   Unique team name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/**
	 * Adds a new player to the team if the name is unique
	 * 
	 * @param name    The name of the new player
	 * @return        Returns the newly added player, or null if the player already exists
	 */
	public Player addPlayer(String name) {
		for (Player player : players) {
			if (player.getName().equalsIgnoreCase(name)) {
				return null; // Duplicate name, return null
			}
		}
		
		Player newPlayer = new Player(GameService.getInstance().getNextPlayerId(), name);
		players.add(newPlayer);
		return newPlayer;
	}
	
	/**
	 * Returns the list of players in the team
	 * 
	 * @return   List of Player objects
	 */
	public List<Player> getPlayers() {
		return players;
	}
	
	/**
	 * Returns a string representation of the team,
	 * including its id and name (inherited from Entity)
	 */
	@Override
	public String toString() {
		return super.toString();
	}
}
