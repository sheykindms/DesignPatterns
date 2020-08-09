package behavioural.strategy;

import behavioural.strategy.model.Duck;
import behavioural.strategy.model.MallardDuck;
import behavioural.strategy.service.flyservice.FlyNoWay;
import behavioural.strategy.service.quackservice.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();
        mallard.performSwim();

        mallard.setFlyBehaviour(new FlyNoWay());
        mallard.setQuackBehaviour(new MuteQuack());

        mallard.performFly();
        mallard.performQuack();
        mallard.performSwim();
    }
}
