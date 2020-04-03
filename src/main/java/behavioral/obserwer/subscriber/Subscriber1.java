package behavioral.obserwer.subscriber;

public class Subscriber1 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println("Subscriber 1 got message " + message);
    }
}
