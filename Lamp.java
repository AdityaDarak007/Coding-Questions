package aditya;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRate;

    public Lamp(String style, boolean battery, int globRate) {
        this.style = style;
        this.battery = battery;
        this.globRate = globRate;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRate() {
        return globRate;
    }
    public void turnOn(){
        System.out.println("Lamp ->Turning Onn");
    }
}
