package me.skipperguy12.agm;

import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import me.skipperguy12.agm.maps.AGMMap;

import org.bukkit.World;
import org.bukkit.command.CommandSender;

/**
 * Represents a Match manager
 * 
 * @author skipperguy12
 * 
 */
public interface AGMMatchManager {
    /**
     * Gets the Match map
     * 
     * @return The Match map
     */
    public Map<World, AGMMatch> getMatches();

    /**
     * Gets the Match playing on World
     * 
     * @param world
     *            World
     * @return Match playing on world
     */
    public AGMMatch getMatch(@Nonnull World world);

    /**
     * Gets the World match is playing on
     * 
     * @param match
     *            Match
     * @return World match is playing on
     */
    public World getWorld(@Nonnull AGMMatch match);
    
    /**
     * Gets the current match id. Used for determining the world folder name (match-ID)
     * @return the current id
     */
    public int getCurrentId();
    
    /**
     * Gets the current match, if only one is playing. Otherwise, it returns the first
     * @return the match
     */
    public AGMMatch getCurrentMatch();
    
    /**
     * Gets the current match in the world the sender is in. Returns null if the sender is a console or if the match is not found.
     * @param sender the user to find a match for
     * @return the match
     */
    public @Nullable AGMMatch getCurrentMatch(CommandSender sender);
    
    /**
     * Cycles the specified match.
     * @param oldMatch The old match
     */
    public void cycle(AGMMatch oldMatch);
    
    /**
     * Gets the next map in the rotation
     */
    public AGMMap getNextMap();
}
