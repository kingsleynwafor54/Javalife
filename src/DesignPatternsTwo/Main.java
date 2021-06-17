package DesignPatternsTwo;

public class Main {
    public static void main(String[] args) {
        Ignition jumpStart=new JumpStart();
        Car car=new Car(jumpStart);
        car.ignitionBelt();
        Acceleration acceleration=new MediumAcceleration();
        Car car1=new Car(jumpStart,acceleration);
        car1.accelerate();
    }
}
