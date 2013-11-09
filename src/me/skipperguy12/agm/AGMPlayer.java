package me.skipperguy12.agm;

import me.skipperguy12.agm.teams.AGMTeam;

import org.bukkit.entity.Player;

/**
 * Represents a Player
 * 
 * @author skipperguy12
 * 
 */
public interface AGMPlayer {
  /**
   * Gets the players name
   * 
   * @return The players name
   */
  public String getName();

  /**
   * Gets the org.bukkit.entity.Player
   * 
   * @return The bukkit player
   */
  public Player getBukkit();

  /**
   * Gets the players team
   * 
   * @return The players team
   */
  public AGMTeam getTeam();
  
  /**
   * Gets the match the player is currently in
   * @return The match
   */
  public AGMMatch getMatch();
  
  /**
   * Sets the match the player is currently in
   */
  public void setMatch(AGMMatch match);

  /**
   * Sets the players team
   * 
   * @param newTeam The new team
   * @param force True if the player was forced into newTeam (by a admin or if you are donator)
   */
  public void setTeam(AGMTeam newTeam, boolean force);

}
