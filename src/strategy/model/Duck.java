package strategy.model;

import strategy.service.flyservice.FlyBehaviour;
import strategy.service.quackservice.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSwim() {
        System.out.println("Even decoy duck can swim");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
