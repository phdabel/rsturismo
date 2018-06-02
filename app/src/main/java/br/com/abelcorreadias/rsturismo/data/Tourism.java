package br.com.abelcorreadias.rsturismo.data;

public class Tourism {

    private String name;
    private String description;
    private int resourceIdSite;

    public Tourism(){

    }

    public Tourism(String name){
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

    public int getResourceIdSite() {
        return resourceIdSite;
    }

    public void setResourceIdSite(int resourceIdSite) {
        this.resourceIdSite = resourceIdSite;
    }
}
