package me.skipperguy12.agm;

import java.util.Collection;

import me.skipperguy12.agm.countdown.AGMCountdownManager;
import me.skipperguy12.agm.maps.AGMMap;
import me.skipperguy12.agm.teams.AGMTeam;

import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Represents a Match
 * 
 * @author skipperguy12
 * 
 */
public interface AGMMatch {
    /**
     * Gets the participating teams of this match
     * 
     * @return Collection of participating teams
     */
    public Collection<AGMTeam> getParticipatingTeams();

    /**
     * Gets the default team
     */
    public AGMTeam getDefaultTeam();

    /**
     * Gets the AGMMap
     * 
     * @return The map
     */
    public AGMMap getMap();

    /**
     * Gets the World this Match is playing in
     * 
     * @return The world
     */
    public World getWorld();

    /**
     * Gets the state the match is in
     * @return the state
     */
    public AGMMatchState getState();
    
    /**
     * Sets the state of the match
     * @param state the state
     */ 
    public void setState(AGMMatchState state);
    
    /**
     * Gets the countdown manager for this match. 
     * @return the manager
     */
    public AGMCountdownManager getCountdownManager();
    
    /**
     * Adds the provided player to the match, putting him on the default team
     * @param p the player
     */
    public void addPlayer(Player p);
    
    /**
     * Starts the match
     */
    public void start();
    
    /**
     * Ends the match
     * @param winner the winner, null if a tie
     */
    public void end(AGMTeam winner);
    
    public enum AGMMatchState {
        LOADED, STARTING, PLAYING, ENDED;
    }
}
