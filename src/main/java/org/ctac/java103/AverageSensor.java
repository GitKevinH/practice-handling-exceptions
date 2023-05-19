package org.ctac.java103;

import java.util.ArrayList;
import java.util.List;


//Example code/testing done in Main.java class

public class AverageSensor implements Sensor {
    public List<Sensor> sensors;
    public List<Integer> readings;

    public AverageSensor() {

        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }



    @Override
    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {

        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {

        if (!sensors.isEmpty()) {
            sensors.get(0).setOff();
        }
    }

    @Override
    public int read() {

        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("no sensors added, or they are all off.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd) {

        this.sensors.add(toAdd);
    }

    //Part 4 Add on

    public List<Integer> readings() {
        return this.readings;
    }


}
