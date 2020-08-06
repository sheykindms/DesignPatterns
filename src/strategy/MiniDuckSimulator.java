package strategy;

import strategy.model.Duck;
import strategy.model.MallardDuck;
import strategy.service.flyservice.FlyNoWay;
import strategy.service.quackservice.MuteQuack;

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
