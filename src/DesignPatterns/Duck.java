package DesignPatterns;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;

    }
void fly(){
        flyBehaviour.fly();
}

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
