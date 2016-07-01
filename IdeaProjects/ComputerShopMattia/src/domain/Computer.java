package domain;

/**
 * Created by student on 01-Jul-16.
 */
public abstract class Computer {

    private String make;
    private Ram ram;
    private String cpu;
    private int cpuSpeed;
    private String hardDrive;
    private int hardDriveCapacity;
    private String graphicCard;

    public Computer(String make, Ram ram, String cpu, int cpuSpeed, String hardDrive, int hardDriveCapacity, String graphicCard) {
        this.make = make;
        this.ram = ram;
        this.cpu = cpu;
        this.cpuSpeed = cpuSpeed;
        this.hardDrive = hardDrive;
        this.hardDriveCapacity = hardDriveCapacity;
        this.graphicCard = graphicCard;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Ram getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
}