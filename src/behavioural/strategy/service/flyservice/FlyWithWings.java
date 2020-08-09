package behavioural.strategy.service.flyservice;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
