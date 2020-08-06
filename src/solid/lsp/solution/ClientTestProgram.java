package solid.lsp.solution;

import java.util.ArrayList;
import java.util.List;

//Мы создаём 2 класса для разграничения поведения: AudioMediaPlayer и VideoMediaPlayer
//Т.к. WinampMediaPlayer не являлся правильным подтипом MediaPlayer и не может использовать метод playVideo(), то мы отделим его
//как сабкласс AudioMediaPlayer и лишим его метода playVideo()
public class ClientTestProgram {
    public static void main(String[] args) {
        List<VideoMediaPlayer> players = new ArrayList<>();

        players.add(new VlcMediaPlayer());
        players.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(players);

        System.out.println("-------------------------");
    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> players) {
        for (VideoMediaPlayer player : players) {
            player.playVideo();
        }
    }
}
