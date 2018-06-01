package br.com.abelcorreadias.rsturismo.data;

public class Party {

    private String name;
    private String description;
    private int resourceIdImage;
    private String phone;
    private String neighborhood;

    public Party(){

    }

    public Party(String name){
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

    public int getResourceIdImage() {
        return resourceIdImage;
    }

    public void setResourceIdImage(int resourceIdImage) {
        this.resourceIdImage = resourceIdImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
