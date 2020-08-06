package strategy.service.flyservice;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Sry, i cannot fly");
    }
}
