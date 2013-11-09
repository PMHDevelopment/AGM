package me.skipperguy12.agm.maps;

import java.io.File;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nullable;

import org.bukkit.World;

/**
 * Class that stores every loaded map with its name
 * @author molenzwiebel
 */
public interface AGMMapContext {
    /**
     * Loads all the maps in a certain directory
     * @param directory the directory to find maps in
     */
    public void loadMaps(File directory);
    
    /**
     * Gets every map loaded. Can be empty
     * @return all the maps loaded
     */
    public List<AGMMap> getMaps();
    
    /**
     * Tries to get a map by its exact name, can return null if not found.
     * @param name The map to find
     * @return The map, null if not found
     */
    public @Nullable AGMMap getMapExact(String name);
    
    /**
     * Gets a list of maps which match the provided name. Can be empty
     * @param query The part of the name to search for
     * @return the maps found. Can be empty
     */
    public @Nullable AGMMap matchMap(String query);
    
    /**
     * Tries to match every name in the iterable to a map
     * @param names The names to match
     * @return The maps found
     */
    public Collection<AGMMap> matchMaps(Iterable<String> names);
    
    /**
     * Copies a certain world directory to the defined target.
     * @param from The directory to copy from
     * @param to The directory to copy to
     */
    public void copyWorld(File from, File to);
    
    /**
     * Creates a World object from the specified folder and map info.
     * @param f The world folder to load from
     * @param info The map info, used to set the dimension.
     * @return The world created
     */
    public World createWorld(String f, AGMMapInfo info);
}
