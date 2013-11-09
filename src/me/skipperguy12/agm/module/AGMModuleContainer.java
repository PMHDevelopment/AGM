package me.skipperguy12.agm.module;

import java.util.Collection;

import javax.annotation.Nullable;

import me.skipperguy12.pmh.module.ModuleInfo;

import org.jdom2.Document;

public interface AGMModuleContainer {
    /**
     * Tries to load (or parse) the specified ModuleInfo, returning false if it fails.
     * @param info The Module to be parsed 
     * @param doc The XML document, used for parsing
     * @return true if successful, false if unsuccessful
     */
    public boolean loadModule(ModuleInfo info, Document doc);
    
    /**
     * Returns whether the container has the specified module loaded
     * @param info the module to look for
     * @return if the module is loaded
     */
    public boolean hasModule(ModuleInfo info);
    
    /**
     * Returns whether the container has the specified module loaded
     * @param info the module to look for
     * @return if the module is loaded
     */
    public boolean hasModule(Class<?> info);
    
    /**
     * Returns the instance of the module specified, or null if not loaded
     * @param module The Module class
     * @return the module, or null if not loaded
     */
    public @Nullable <T extends AGMModule> T getModule(Class<T> module);
    
    public Collection<AGMModule> getLoadedModules();
}
