package com.gamingroom;

public class Entity {
	
	// Private unique identifier for the entity
	private long id;
	
	// Private name of the entity (must be unique in context)
	private String name;
	
	/**
	 * Default constructor
	 * Typically used when no initial values provided
	 */
	public Entity() {
		// No initialization
	}
	
	/**
	 * Constructor with parameters to set entity's id and name
	 * @param id     Unique identifier
	 * @param name   Name of the entity
	 */
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	/**
	 * Gets the unique identifier of the entity
	 * 
	 * @return id of the entity
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Gets the name of the entity
	 * 
	 * @return name of the entity
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Returns a string representation of the entity
	 * Includes the class name, id, and name for clarity
	 * 
	 * @return string description of the entity
	 */	
	@Override
	public String toString() {
		return String.format("%s [id=%d, name=%s]", this.getClass().getSimpleName(), id, name);
	}

}
