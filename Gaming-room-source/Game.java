package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

/**
 * Represents a game with a unique id and name.
 * Inherits common entity attributes from the Entity class.
 * Contains a list of teams participating in the game
 * 
 * <p>
 * Ensures that team names are unique within the game.
 * </p>
 * 
 */
public class Game extends Entity{
	
	// List of teams associated with this game
	private List<Team> teams = new ArrayList<>();
	
	/**
	 * Constructor to initialize a game with an id and name
	 * 
	 * @param id     Unique game identifier
	 * @param name   Unique game name
	 */
	public Game(long id, String name) {
		super(id, name);
	}
	
	/**
	 * Adds a new team to the game if the name is unique
	 * 
	 * @param name    The name of the new team
	 * @return        The newly added Team, or null if the team is already taken
	 */
	public Team addTeam(String name) {
		for (Team team : teams) {
			if (team.getName().equalsIgnoreCase(name)) {
				return null; // Duplicate name, return null
			}
		}
		
		Team newTeam = new Team(GameService.getInstance().getNextTeamId(), name);
		teams.add(newTeam);
		return newTeam;
	}
	
	/**
	 * Returns the list of teams in the game.
	 * 
	 * @return   List of Team objects
	 */
	public List<Team> getTeams() {
		return teams;
	}
	
	/**
	 * Returns a string representation of the game,
	 * including its id and name (inherited from Entity).
	 */
	
	@Override
	public String toString() {
		return super.toString();
	}

}
