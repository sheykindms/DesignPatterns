package behavioural.strategy.model;

import behavioural.strategy.service.flyservice.FlyWithWings;
import behavioural.strategy.service.quackservice.Quack;

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
