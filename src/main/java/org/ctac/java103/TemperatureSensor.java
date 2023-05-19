package org.ctac.java103;

import java.util.Random;

//Example code/testing done in Main.java class

public class TemperatureSensor implements Sensor{

    private boolean set;
    private Random random;;


    public TemperatureSensor() {
        this.set = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return set;
    }

    @Override
    public void setOn() {
        this.set=true;

    }

    @Override
    public void setOff() {
        this.set=false;
    }

    @Override
    public int read() {
        if (!this.set) {
            throw new IllegalStateException("Cannot read, sensor switched to off");
        }
        return (random.nextInt(61) - 30);
    }
}
