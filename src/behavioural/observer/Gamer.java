package behavioural.observer;

import java.util.HashSet;
import java.util.Set;

public class Gamer implements Observer {
    private String name;
    private String reaction;
    Observable observable;

    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction, Observable observable) {
        this.reaction = reaction;
        this.observable = observable;
        this.name = name;
    }

    @Override
    public void update(String game) {
        buyGame(game);
    }

    public void buyGame(String game) {
        games.add(game);
        System.out.println(name + " says: " + reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
