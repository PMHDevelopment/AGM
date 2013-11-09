package me.skipperguy12.agm.maps;

import java.util.List;

import org.bukkit.Difficulty;
import org.bukkit.World.Environment;

/**
 * Provides Context for an AGMMap
 * @author skipperguy12
 * 
 */
public interface AGMMapInfo {
    /**
     * Gets the AGMMap display name
     * 
     * @return The display name
     */
    public String getDisplayName();
    
    /**
     * Gets the map version
     * @return the map version
     */
    public String getVersion();
    
    /**
     * Gets the objective specified in the XML
     * @return the objective
     */
    public String getObjective();
    
    /**
     * Gets a list of every author
     * @return the list of authors
     */
    public List<AGMContributor> getAuthors();
    
    /**
     * Gets a list of every contributor
     * @return the list of contributors
     */
    public List<AGMContributor> getContributors();
    
    /**
     * Gets a list of rules specified in the XML
     * @return the rules
     */
    public List<String> getRules();
    
    /**
     * Gets the difficulty of the world. NORMAL if not specified
     * @return the difficulty
     */
    public Difficulty getDifficulty();
    
    /**
     * Gets the dimension of the world. OVERWORLD if not specified
     * @return the dimension
     */
    public Environment getDimension();
    
    /**
     * Gets if the map allows friendly fire, false if not specified
     * @return friendly fire supported
     */
    public boolean allowsFriendlyFire();
}
