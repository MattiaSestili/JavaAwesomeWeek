package domain;

/**
 * Created by student on 01-Jul-16.
 */
public class Desktop extends Computer{

    private String keyboard;
    private String mouse;
    private int screenSize;
    private int box;

    public Desktop(String make, Ram ram, String cpu, int cpuSpeed, String hardDrive,
                   int hardDriveCapacity, String graphicCard, String keyboard, String mouse, int screenSize, int box) {
        super(make, ram, cpu, cpuSpeed, hardDrive, hardDriveCapacity, graphicCard);
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.screenSize = screenSize;
        this.box = box;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }
}
