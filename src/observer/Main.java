package observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String game;

        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Tommy Vercetti", "I want to pre-order", rockstarGames);
        Gamer peter = new Gamer("Gay Tony", "Pinch me...", rockstarGames);
        Gamer helen = new Gamer("Nico Belic", "Jesus Christ, it's new game from Rockstar!", rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        //you know i mean GTA6
        game = scanner.nextLine();
        System.out.println("It's happened! RockstarGames releases new game - " + game + "!");

        rockstarGames.release(game);

        rockstarGames.removeObserver(garry);
        rockstarGames.removeObserver(peter);
        rockstarGames.removeObserver(helen);

        scanner.close();
    }
}
