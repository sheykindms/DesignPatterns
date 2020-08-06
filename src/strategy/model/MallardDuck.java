package strategy.model;

import strategy.service.flyservice.FlyWithWings;
import strategy.service.quackservice.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard Dcuk");
    }
}
