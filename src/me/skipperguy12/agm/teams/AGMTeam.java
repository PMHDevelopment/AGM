package me.skipperguy12.agm.teams;

import java.util.Collection;

import me.skipperguy12.agm.AGMPlayer;

import org.bukkit.ChatColor;

/**
 * Represents a AGMTeam in the game
 * 
 * @author skipperguy12
 * 
 */
public interface AGMTeam {
    /**
     * Gets the team members
     * @return Collection of team members
     */
    public Collection<AGMPlayer> getMembers();
    /**
     * Gets the name the team started with
     * 
     * @return Initial name
     */
    public String getInitialName();

    /**
     * Gets the name of the team
     * 
     * @return Current name
     */
    public String getName();

    /**
     * Gets the ChatColor the team started with
     * 
     * @return Initial color
     */
    public ChatColor getInitialColor();
    
    /**
     * Gets the ChatColor of the team
     * @return Current color
     */
    public ChatColor getColor();

    /**
     * Sets the current team name
     * 
     * @param newName The new name
     */
    public void setName(String newName);

    /**
     * Sets the current team color
     * 
     * @param newColor The new color
     */
    public void setColor(ChatColor newColor);
    
    /**
     * Gets the type of the team
     * @return the type
     */
    public AGMTeamType getType();
    
    /**
     * Gets how many players fit on this team
     * @return the size of the team
     */
    public int getSize();
    
    public enum AGMTeamType {
        PARTICIPATING, OBSERVING
    }
}
