package design.pattern.adapter;

/**
 * Created by sky on 2017/8/31.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mp;

    @Override
    public void play(String type, String fileName) {
        if("mp3".equalsIgnoreCase(type)){
            System.out.println("mp3");
        }else if("vlc".equalsIgnoreCase(type) || "mp4".equalsIgnoreCase(type)){
            new MediaAdapter(type).play(type, fileName);
        }
    }
}
