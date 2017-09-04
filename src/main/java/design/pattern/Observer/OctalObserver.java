package design.pattern.Observer;

/**
 * Created by sky on 2017/9/1.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver");
    }
}
