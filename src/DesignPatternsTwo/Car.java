package DesignPatternsTwo;

public class Car {
    private  Acceleration acceleration;
    private Door door;
    private Transmission transmission;
    private Ignition ignition;
    //door
    //acceleration
    //ignition
    //transmission
public Car(Ignition ignition){
    this.ignition=ignition;
}
  public Car(Ignition ignition ,Acceleration acceleration) {
        this.acceleration = acceleration;
//        this.door = door;
//        this.transmission = transmission;
        this.ignition = ignition;
    }

    void shiftGears(){
        transmission.shiftGears();
    }
void accelerate(){
        acceleration.accelerate();
}
void ignitionBelt(){
        ignition.ignition();
}
void door(){
        door.door();
    }

}
