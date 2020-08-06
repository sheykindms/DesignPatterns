package solid.lsp.violation;

import java.util.ArrayList;
import java.util.List;
//Поведение классов реализаций должно быть предсказуемым, в данном случае мы нарушаем lsp, т.к WinampMediaPlayer throws Ex()
public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> players = new ArrayList<>();

        players.add(new VlcMediaPlayer());
        players.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(players);

        System.out.println("-------------------------");

        players.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(players);
    }

    public static void playVideoInAllMediaPlayers(List<MediaPlayer> players) {
        for (MediaPlayer player : players) {
            player.playVideo();
        }
    }
}
