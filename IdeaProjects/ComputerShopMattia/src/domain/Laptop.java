package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 01-Jul-16.
 */
public class Laptop extends Computer {

    private String classification;
    private int sizeMonitor;
    private int weight;
    private int batteryDuration;

    public Laptop(String make, Ram ram, String cpu, int cpuSpeed, String hardDrive,
                  int hardDriveCapacity, String graphicCard, String classification,
                  int sizeMonitor, int weight, int batteryDuration)
    {
        super(make, ram, cpu, cpuSpeed, hardDrive, hardDriveCapacity, graphicCard);
        this.classification = classification;
        this.sizeMonitor = sizeMonitor;
        this.weight = weight;
        this.batteryDuration = batteryDuration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getSizeMonitor() {
        return sizeMonitor;
    }

    public void setSizeMonitor(int sizeMonitor) {
        this.sizeMonitor = sizeMonitor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBatteryDuration() {
        return batteryDuration;
    }

    public void setBatteryDuration(int batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
}