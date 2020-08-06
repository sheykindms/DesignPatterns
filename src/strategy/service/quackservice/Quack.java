package strategy.service.quackservice;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Simple quack");
    }
}
