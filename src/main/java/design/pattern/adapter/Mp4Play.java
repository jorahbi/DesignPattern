package design.pattern.adapter;

/**
 * Created by sky on 2017/8/31.
 */
public class Mp4Play implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("media mp4" + fileName);
    }
}
