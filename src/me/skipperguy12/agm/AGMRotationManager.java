package me.skipperguy12.agm;

import java.util.Collection;

import me.skipperguy12.agm.maps.AGMMap;

import org.bukkit.plugin.Plugin;

public interface AGMRotationManager {
    /**
     * Loads the rotation.
     * @param plugin The instance loading the rotation
     */
    public void load(Plugin plugin);
    
    /**
     * Gets the next map in the rotation
     */
    public AGMMap getNextMap();
    
    /**
     * Gets the next map, and increments the counter. (Meaning that getNextMap will also update)
     */
    public AGMMap getNextMapAndIncrement();
    
    /**
     * Gets the rotation
     * @return the rotation
     */
    public Collection<AGMMap> getRotation();
    
    /**
     * Appends a map to the rotation
     * @param map the map to append
     */
    public void append(AGMMap map);
    
    /**
     * Removes all instances of the provided map
     * @param map the map to remove
     */
    public void remove(AGMMap map);
    
    /**
     * Removes the map at the specified index
     * @param index the index to remove the map at
     */
    public void removeAt(int index);
    
    /**
     * Inserts a map at a certain index
     * @param index the index to insert the map at
     * @param map
     */
    public void insertAt(int index, AGMMap map);
}
