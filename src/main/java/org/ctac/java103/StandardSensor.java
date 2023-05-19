package org.ctac.java103;


//Example code/testing done in Main.java class


public class StandardSensor implements Sensor{
    int temp;
    public StandardSensor(int para) {
        this.temp = para;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return temp;
    }
}
