package ceci.viafitnessapp;

/**
 * Created by lenovo on 04-Nov-17.
 */

public class Diets {
    public String name;
    public String type;
    public int id;
    public int idOfTheImage;
    String theDiet;
    public Diets(String name, int id, String type,int idOfTheImage,String theDiet ){

        this.idOfTheImage = idOfTheImage;
        this.name = name;
        this.id = id;
        this.type = type;
        this.theDiet = theDiet;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOfTheImage() {
        return idOfTheImage;
    }

    public void setIdOfTheImage(int idOfTheImage) {
        this.idOfTheImage = idOfTheImage;
    }

    public void setTheDiet(String theDiet) {
        this.theDiet = theDiet;
    }

    public String getTheDiet() {
        return theDiet;
    }
}
