package comp.comp152;

public class Car extends Automobile {
    public String make;
    public String model;
    public Car (String maker, String modelx, int speed) {
        super(speed);
        make = maker;
        model = modelx;
    }
    public void beep() {
        System.out.println(make + " "+ model + " is moving at "+ speed +"mph!");
    }
}
