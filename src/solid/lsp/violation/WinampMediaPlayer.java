package solid.lsp.violation;
//Класс не соответствует общему шаблону поведения наследников MediaPlayer
public class WinampMediaPlayer extends MediaPlayer {
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
