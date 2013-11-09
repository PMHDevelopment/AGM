package me.skipperguy12.agm.maps;

import java.io.File;

import me.skipperguy12.agm.module.AGMModuleContainer;

/**
 * Represents a Map
 * 
 * @author skipperguy12
 * 
 */
public interface AGMMap {
    /**
     * Gets the map information
     * 
     * @return The map information
     */
    public AGMMapInfo getInformation();

    /**
     * Gets the location of the map
     * @return the location
     */
    public File getLocation();
    
    /**
     * Gets the module container
     * @return the module container
     */
    public AGMModuleContainer getModuleContainer();
    
}
