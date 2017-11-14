package ceci.viafitnessapp;

/**
 * Created by Asus on 4.11.2017 г..
 */

public class Exercise {
    private String name;
    private int resourseID;

    public Exercise(String name,int resourseID){
        this.name=name;
        this.resourseID=resourseID;
    }
    public String getName() {
        return name;
    }

    public int getResourseID() {
        return resourseID;
    }
}
