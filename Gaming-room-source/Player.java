package com.gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends Entity {
	/**
	 * Constructor to initialize a Player with a unique id and name.
	 * 
	 * @param id    Unique identifier for the player
	 * @param name  Unique name for the player
	 */
	public Player(long id, String name) {
		super(id, name);
	}
	
	/**
	 * Returns a string representation of the player
	 */
	@Override
	public String toString() {
		return super.toString();
	}
}
