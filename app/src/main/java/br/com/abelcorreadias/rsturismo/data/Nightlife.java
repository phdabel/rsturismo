package br.com.abelcorreadias.rsturismo.data;

public class Nightlife {

    private String name;
    private String description;
    private int resourceId;

    public Nightlife(){

    }

    public Nightlife(String name){
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

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
