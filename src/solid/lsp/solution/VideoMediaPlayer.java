package solid.lsp.solution;
//Класс-прослойка для создания метода просмотра видео. Т.о. наследники будут иметь поведение MediaPlayer и VideoMediaPlayer
public class VideoMediaPlayer extends MediaPlayer {
    public void playVideo() {
        System.out.println("Playing video");
    }
}
