package br.com.abelcorreadias.rsturismo.data;

public class SoccerTeam {

    private String name;
    private int resourceIdLogo;
    private String stadiumName;
    private int resourceIdStadium;
    private String description;

    public SoccerTeam(){

    }

    public SoccerTeam(String name){
        this.setName(name);
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResourceIdLogo() {
        return resourceIdLogo;
    }

    public void setResourceIdLogo(int resourceIdLogo) {
        this.resourceIdLogo = resourceIdLogo;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public int getResourceIdStadium() {
        return resourceIdStadium;
    }

    public void setResourceIdStadium(int resourceIdStadium) {
        this.resourceIdStadium = resourceIdStadium;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
