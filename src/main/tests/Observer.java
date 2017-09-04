import design.pattern.Observer.BinaryObserver;
import design.pattern.Observer.HexaObserver;
import design.pattern.Observer.OctalObserver;
import design.pattern.Observer.Subject;

/**
 * Created by sky on 2017/9/1.
 */
public class Observer {

    public static void main(String[] agra){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        subject.setState(10);
    }
}
