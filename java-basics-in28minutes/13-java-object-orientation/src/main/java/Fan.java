public class Fan {
    //state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed; //0 to 5

    //creation
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    // Print the State
    public String toString() {
        return String.format("make - %s , radius - %f , color - %s , isOn - %b , speed - %d ", make, radius, color, isOn, speed);
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }


}
