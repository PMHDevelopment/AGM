package me.skipperguy12.agm.module;

import me.skipperguy12.agm.AGMMatch;
import me.skipperguy12.pmh.module.ModuleListener;

public class AGMModule {
    private AGMMatch match;
    public ModuleListener<?> moduleListener;

    public void setMatch(AGMMatch m) {
        this.match = m;
    }

    protected AGMMatch getMatch() {
        return match;
    }
}
