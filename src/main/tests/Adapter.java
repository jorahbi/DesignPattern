import design.pattern.adapter.AudioPlayer;

/**
 * Created by sky on 2017/8/31.
 */
public class Adapter {

    public static void main(String[] args){
        new AudioPlayer().play("vlc", "filename");
    }

}
