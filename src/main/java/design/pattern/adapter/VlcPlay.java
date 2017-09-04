package design.pattern.adapter;

/**
 * Created by sky on 2017/8/31.
 */
public class VlcPlay implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("media vlc" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
