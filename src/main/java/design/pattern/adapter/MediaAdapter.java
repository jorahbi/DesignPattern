package design.pattern.adapter;

/**
 * Created by sky on 2017/8/31.
 */
public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer amp;

    public MediaAdapter(String type){
        if("vlc".equalsIgnoreCase(type)){
            this.amp = new VlcPlay();
        }else if("mp4".equalsIgnoreCase(type)){
            this.amp = new Mp4Play();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if("vlc".equalsIgnoreCase(type)){
            this.amp.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(type)){
            this.amp.playMp4(fileName);
        }
    }
}
