package ceci.viafitnessapp;

/**
 * Created by Konstantin Ralev on 09/11/2017.
 */

// Will listen to step alerts
public interface StepListener {

    public void step(long timeNs);

}