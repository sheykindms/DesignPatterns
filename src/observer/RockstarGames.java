package observer;

import java.util.ArrayList;
import java.util.List;

public class RockstarGames implements Observable {
    private String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public void release(String game) {
        this.releaseGame = game;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            System.out.println("Inform message to : " + observer);
            observer.update(releaseGame);
        }
    }
}
