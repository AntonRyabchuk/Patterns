package behavioral.obserwer.subscriber;

public class Subscriber2 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println("Subscriber 2 got message " + message);
    }
}
