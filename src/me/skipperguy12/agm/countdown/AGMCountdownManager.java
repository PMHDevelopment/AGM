package me.skipperguy12.agm.countdown;

import java.util.Collection;

public interface AGMCountdownManager {
    public void start(AGMCountdown cd, int time);
    
    public void cancel(Class<?> cd);
    
    public Collection<AGMCountdown> getAll();
    
    public void cancelAll();
}
