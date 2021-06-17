package DesignPatterns;

public class Main {
    public static void main(String[] args) {
        FlyBehaviour flyBehaviour=new CannotFly();
        Duck duck=new Duck(flyBehaviour);
        duck.setFlyBehaviour(flyBehaviour);
        duck.fly();

    }
}
