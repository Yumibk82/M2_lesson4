public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setOn(boolean on){
        this.on=true;
    }
    public int getSpeed(){
        return this.speed;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getOn(){
        return this.on;
    }
    public String toString() {
        if (getOn()) {
            return "Information of Fan" + this.speed + this.color + this.radius + "fan is on";
        } else
            return "Information of Fan" + this.speed + this.color + this.radius + "fan is off";
    }
}
