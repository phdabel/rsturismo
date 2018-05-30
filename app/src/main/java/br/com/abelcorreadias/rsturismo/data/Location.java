package br.com.abelcorreadias.rsturismo.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Location implements Serializable {

    private static final String TAG = Location.class.getSimpleName();

    private String name;
    private String description;
    private Date foundation;
    private int resourceIdLogo;
    private ArrayList<SoccerTeam> teams;
    private ArrayList<Place> places;
    private ArrayList<NightLife> nightLife;

    public Location(){
        this.teams = new ArrayList<>();
    }

    public Location(String name){
        this.teams = new ArrayList<>();
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

    public ArrayList<Place> getPlaces(){
        return this.places;
    }

    public void setPlaces(ArrayList<Place> places){
        this.places = places;
    }

    public void addPlace(Place place){
        this.places.add(place);
    }

    public ArrayList<NightLife> getNightLife(){
        return this.nightLife;
    }

    public void setNightLife(ArrayList<NightLife> nightLife){
        this.nightLife = nightLife;
    }

    public void addNightLife(NightLife nightLife){
        this.nightLife.add(nightLife);
    }

    public String toString(){
        return TAG+"{"+"name='"+ this.name + "'" +"}";
    }

}
