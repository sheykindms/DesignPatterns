package behavioural.strategy.service.quackservice;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
