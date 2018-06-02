package br.com.abelcorreadias.rsturismo.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Location implements Serializable {

    private static final String TAG = Location.class.getSimpleName();

    // Name of the city
    private String name;
    // Description of the city
    private String description;
    // Date of foundation of the city
    private Date foundation;
    // Logo/Flag of the city
    private int resourceIdLogo;
    // Soccer teams (if they exist) of the city
    private ArrayList<SoccerTeam> teams;
    // historical sites
    private ArrayList<Tourism> sites;
    // parties
    private ArrayList<Party> party;
    // night life neighborhood
    private ArrayList<Nightlife> nightlife;

    public Location(){
        this.teams = new ArrayList<>();
    }

    public Location(String name){
        this.teams = new ArrayList<>();
        this.sites = new ArrayList<>();
        this.party = new ArrayList<>();
        this.nightlife = new ArrayList<>();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFoundation() {
        return foundation;
    }

    public void setFoundation(Date foundation) {
        this.foundation = foundation;
    }

    public int getResourceIdLogo() {
        return resourceIdLogo;
    }

    public void setResourceIdLogo(int resourceIdLogo) {
        this.resourceIdLogo = resourceIdLogo;
    }

    public ArrayList<SoccerTeam> getTeams(){
        return this.teams;
    }

    public void setTeams(ArrayList<SoccerTeam> teams){
        this.teams = teams;
    }

    public void addTeam(SoccerTeam team){
        this.teams.add(team);
    }

    public ArrayList<Tourism> getSites(){
        return this.sites;
    }

    public void setHistoricalSites(ArrayList<Tourism> sites){
        this.sites = sites;
    }

    public void addPlace(Tourism place){
        this.sites.add(place);
    }

    public ArrayList<Party> getParty(){
        return this.party;
    }

    public void setParty(ArrayList<Party> party){
        this.party = party;
    }

    public void addNightLife(Party party){
        this.party.add(party);
    }

    public ArrayList<Nightlife> getNightlife(){
        return this.nightlife;
    }

    public void setNightlife(ArrayList<Nightlife> nightlife){
        this.nightlife = nightlife;
    }

    public void addNightlife(Nightlife nightlife){
        this.nightlife.add(nightlife);
    }

    public String toString(){
        return TAG+"{"+"name='"+ this.name + "'" +"}";
    }

}
