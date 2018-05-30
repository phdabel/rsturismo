package br.com.abelcorreadias.rsturismo.data;

public class Place {

    private String name;
    private String description;
    private int resourceIdPlace;

    public Place(){

    }

    public Place(String name){
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

    public int getResourceIdPlace() {
        return resourceIdPlace;
    }

    public void setResourceIdPlace(int resourceIdPlace) {
        this.resourceIdPlace = resourceIdPlace;
    }
}
