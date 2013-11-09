package me.skipperguy12.agm.maps;

import javax.annotation.Nullable;

public class AGMContributor {
    private String name;
    private @Nullable String contribution;
    
    public AGMContributor(String name, @Nullable String contribution) {
        this.name = name;
        this.contribution = contribution;
    }
    
    /**
     * Gets the contributor
     * @return the contributor, usually a mc username
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the contribution, or null if not specified
     * @return the contribution
     */
    public @Nullable String getContribution() {
        return contribution;
    }
}
